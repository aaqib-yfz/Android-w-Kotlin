package com.example.tabbednavigation

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Settings
import androidx.compose.ui.graphics.vector.ImageVector

interface Destinations{
    val route : String
    val icon : ImageVector
    val title : String
}

object HomeScreen : Destinations{

    override val route = "HomeScreen"
    override val icon = Icons.Filled.Home
    override val title = "Home"
}

object SettingScreen : Destinations{
    override val route = "SettingScreen"
    override val icon = Icons.Filled.Settings
    override val title = "Settings "
}