package com.example.jetpackcomposenavigation.nestednavigation.navigation

import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavHostController
import androidx.navigation.compose.composable
import androidx.navigation.navigation
import com.example.jetpackcomposenavigation.nestednavigation.screens.auth.NestedLoginScreen
import com.example.jetpackcomposenavigation.nestednavigation.screens.auth.NestedSignupScreen

fun NavGraphBuilder.authNavGraph(navHostController: NavHostController) {

    navigation(
        startDestination = NestedScreen.Login.route,
        route = AUTHENTICATION_ROUTE
    ) {
        composable(route = NestedScreen.Login.route) {
            NestedLoginScreen(navHostController = navHostController)
        }
        composable(route = NestedScreen.Signup.route) {
            NestedSignupScreen(navHostController = navHostController)
        }

    }
}