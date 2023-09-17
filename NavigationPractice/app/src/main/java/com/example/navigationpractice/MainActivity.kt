package com.example.navigationpractice

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MyNav()
            }
        }
    }

@Composable
fun MyNav(){
    val controller = rememberNavController()
    NavHost(navController = controller, startDestination = Home.route  ){
        composable(Home.route){
            HomeScreen(controller)
        }
        composable(MenuList.route){
            MenuList(controller)
        }
    }



}


