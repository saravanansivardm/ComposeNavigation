package com.example.jetpackcomposenavigation.basicnavigation.navigation

const val DETAILS_ARGUMENT_KEY = "id"
const val DETAILS_ARGUMENT_KEY_02 = "name"

sealed class Screen(val route: String) {
    object Home : Screen(route = "home_screen")
    object Details :
        Screen(route = "details_screen/{$DETAILS_ARGUMENT_KEY}/{$DETAILS_ARGUMENT_KEY_02}") {
        fun passNameId(id: Int, name: String): String {
            return "details_screen/$id/$name"
        }
    }
}