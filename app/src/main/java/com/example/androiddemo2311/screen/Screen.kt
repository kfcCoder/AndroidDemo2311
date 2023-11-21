package com.example.androiddemo2311.screen

const val DETAIL_ARGUMENT_KEY1 = "id"
const val DETAIL_ARGUMENT_KEY2 = "name"

const val HOME_ARGUMENT_KEY1 = "id_home"
const val HOME_ARGUMENT_KEY2 = "name_home"

sealed class Screen(val route: String) {
    object Home: Screen(route = "home_screen?$HOME_ARGUMENT_KEY1={$HOME_ARGUMENT_KEY1}&$HOME_ARGUMENT_KEY2={$HOME_ARGUMENT_KEY2}") { // 前後參數內容要一致
        //fun passId(id: Int = 0): String = "home_screen?$HOME_ARGUMENT_KEY1=$id"
        fun passIdAndName(id: Int = 0, name: String = "a"): String = "home_screen?$HOME_ARGUMENT_KEY1=$id&$HOME_ARGUMENT_KEY2=$name"


    }
    object Detail: Screen(route = "detail_screen/{$DETAIL_ARGUMENT_KEY1}/{$DETAIL_ARGUMENT_KEY2}") { // '{}' for required args
        fun passIdAndName(id: Int, name: String): String = "detail_screen/$id/$name"

    }
}
