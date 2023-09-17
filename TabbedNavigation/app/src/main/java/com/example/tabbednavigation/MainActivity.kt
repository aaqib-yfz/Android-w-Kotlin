package com.example.tabbednavigation

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.ui.Modifier
import androidx.navigation.NavController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.tabbednavigation.ui.theme.TabbedNavigationTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            TabbedNavigationTheme {
                // A surface container using the 'background' color from the theme
                MyApp()
            }
        }
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun MyApp(){
    val navController = rememberNavController()
    Scaffold( 
        bottomBar = { MyBottomNavigation(navController = navController) }
    ) {
        Box(modifier = Modifier.padding(it)){
            NavHost(navController = navController, startDestination = HomeScreen.route ){
                composable(HomeScreen.route){
                    HomeScreen()
                }

                composable(SettingScreen.route){
                    SettingScreen()
                }
            }
        }
    }
}

@Composable
fun MyBottomNavigation(navController: NavController){
    val destinationList = listOf<Destinations>(
        HomeScreen,
        SettingScreen
    )

    val selectedIndex = rememberSaveable {
        mutableStateOf(0)
        
    }
    NavigationBar {
        destinationList.forEachIndexed{index,destination ->
            NavigationBarItem(
                label = { Text(text = destination.title)},
                selected = index == selectedIndex.value ,
                onClick = { selectedIndex.value = index
                            navController.navigate(destinationList[index].route){
                                popUpTo(HomeScreen.route)
                                launchSingleTop = true
                            }
                          },
                icon = { Icon(imageVector = destination.icon, contentDescription = destination.title)})
        }
    }
}
