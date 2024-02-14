package com.example.composenavigationapplication.nestednavigation.navigation

const val DETAILS_ARGUMENT_KEY = "id"
const val DETAILS_ARGUMENT_KEY_02 = "name"

const val AUTHENTICATION_ROUTE = "authentication_route"
const val ROOT_ROUTE = "root_route"
const val HOME_ROUTE = "profile_verification_route"

sealed class NestedScreen(val route: String) {
    object Profile : NestedScreen(route = "nested_home_screen")
    object Verification :
        NestedScreen(route = "nested_details_screen/{$DETAILS_ARGUMENT_KEY}/{$DETAILS_ARGUMENT_KEY_02}") {
        fun passNameId(id: Int, name: String): String {
            return "nested_details_screen/$id/$name"
        }
    }

    object Login : NestedScreen(route = "nested_login_screen")
    object Signup : NestedScreen(route = "nested_signup_screen")
}