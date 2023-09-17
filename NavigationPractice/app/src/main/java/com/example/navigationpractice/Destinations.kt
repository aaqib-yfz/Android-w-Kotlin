package com.example.navigationpractice

interface Destinations{

    val route:String
}

object Home: Destinations{
    override val route = "Home"
}

object MenuList : Destinations{
    override val route = "Menu"
}