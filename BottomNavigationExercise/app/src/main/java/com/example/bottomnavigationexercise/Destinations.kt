package com.example.bottomnavigationexercise

interface Destinations{
    val route : String
    val icon : Int
    val title : String
}

object HomeScreen : Destinations{
    override val route = "Home"
    override val icon: Int = R.drawable.ic_home
    override val title = "Home"
}

object MenuListScreen : Destinations{
    override val route = "Menu"
    override val icon: Int = R.drawable.ic_menu
    override val title = "Menu"
}