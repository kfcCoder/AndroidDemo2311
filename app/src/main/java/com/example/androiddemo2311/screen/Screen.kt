package com.example.androiddemo2311.screen

const val DETAIL_ARGUMENT_KEY1 = "id"
const val DETAIL_ARGUMENT_KEY2 = "name"
const val HOME_ARGUMENT_KEY1 = "id"

sealed class Screen(val route: String) {
    object Home: Screen(route = "home_screen?id={id}") {
        fun passId(id: Int = 0): String = "home_screen?id=$id"
    }
    object Detail: Screen(route = "detail_screen/{$DETAIL_ARGUMENT_KEY1}/{$DETAIL_ARGUMENT_KEY2}") { // '{}' for required args
        //fun passId(id: Int): String = this.route.replace(oldValue = "{$DETAIL_ARGUMENT_KEY1}", newValue = "$id")
        fun passIdAndName(id: Int, name: String): String = "detail_screen/$id/$name"

    }
}
