package com.example.navcontroller3

interface Destinations{
    val route:String
}

object HomeScreen: Destinations{
    override val route = "HomeScreen"
}

object MenuList : Destinations{
    override val route = "MenuList"
}