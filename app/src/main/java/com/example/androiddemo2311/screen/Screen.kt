package com.example.androiddemo2311.screen

const val DETAIL_ARGUMENT_KEY1 = "id"
const val DETAIL_ARGUMENT_KEY2 = "name"

sealed class Screen(val route: String) {
    object Home: Screen(route = "HomeScreen")
    object Detail: Screen(route = "detail_screen/{$DETAIL_ARGUMENT_KEY1}/{$DETAIL_ARGUMENT_KEY2}") { // '{}' for required args
        //fun passId(id: Int): String = this.route.replace(oldValue = "{$DETAIL_ARGUMENT_KEY1}", newValue = "$id")
        fun passIdAndName(id: Int, name: String): String {
            return "detail_screen/$id/$name"
        }
    }
}
