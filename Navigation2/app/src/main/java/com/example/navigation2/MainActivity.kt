package com.example.navigation2

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.navigation2.ui.theme.Navigation2Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Navigation2Theme {
                // A surface container using the 'background' color from the theme
                    MyApp()
            }
        }
    }

}

@Composable
fun MyApp(){
    val controller = rememberNavController()
    NavHost(navController = controller, startDestination = HomeScreen.route ){
        composable(HomeScreen.route){
            HomeScreen(controller)
        }
        composable(MenuList.route){
            MenuList()
        }
    }
}


