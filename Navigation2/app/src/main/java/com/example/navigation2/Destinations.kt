package com.example.navigation2

interface Destinations {
    val route :String
}

object HomeScreen : Destinations{
    override val route = "Home"
}

object MenuList : Destinations{
    override val route = "Menu"
}