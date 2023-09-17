package com.example.bottomnavigationexercise

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.BottomAppBar
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
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.bottomnavigationexercise.ui.theme.BottomNavigationExerciseTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            BottomNavigationExerciseTheme {
                AppScreen()
            }
        }
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
private fun AppScreen() {
    val navController = rememberNavController()
    Scaffold(
        topBar = {
        TopAppBar()
        },
        bottomBar = {
            BottomAppBar {
                MyBottomNavigation(navController = navController)

            }
        }) {
        Box(
            modifier = Modifier
                .fillMaxSize()
                .padding(it)
        ) {
            NavHost(navController = navController, startDestination = HomeScreen.route ){
                composable(HomeScreen.route){
                    HomeScreen()
                }
                composable(MenuListScreen.route){
                    MenuListScreen()
                }
            }
        }
    }


}


@Preview(showBackground = true)
@Composable
fun AppScreenPreview(){
    AppScreen()
}

@Composable
fun MyBottomNavigation(navController : NavController){

    val destinationList = listOf<Destinations>(
        HomeScreen,
        MenuListScreen
    )

    val selectedIndex = rememberSaveable() {
            mutableStateOf(0)
    }

    NavigationBar {
        destinationList.forEachIndexed{index,destination ->
            NavigationBarItem(
                label = { Text(text = destination.title) },
                selected = index == selectedIndex.value,
                onClick = {
                            selectedIndex.value = index
                            navController.navigate(destinationList[index].route){
                                popUpTo(HomeScreen.route)
                                launchSingleTop = true
                            }
                          },
                icon = { 
                    Icon(
                        painterResource(id =destination.icon ),
                        contentDescription = destination.title)
                })
        }
    }

}