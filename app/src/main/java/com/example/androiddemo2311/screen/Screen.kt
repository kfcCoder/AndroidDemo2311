package com.example.androiddemo2311.screen

const val DETAIL_ARGUMENT_KEY = "id"

sealed class Screen(val route: String) {
    object Home: Screen(route = "HomeScreen")
    object Detail: Screen(route = "detail_screen/{$DETAIL_ARGUMENT_KEY}") { // '{}' for required args
        fun passId(id: Int): String = "detail_screen/$id"
    }
}
