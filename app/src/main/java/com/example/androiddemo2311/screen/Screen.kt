package com.example.androiddemo2311.screen

sealed class Screen(val route: String) {
    object Home: Screen(route = "HomeScreen")
    object Detail: Screen(route = "detail_screen/{id}")
}
