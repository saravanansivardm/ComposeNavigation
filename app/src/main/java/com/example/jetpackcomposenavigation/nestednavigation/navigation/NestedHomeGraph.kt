package com.example.jetpackcomposenavigation.nestednavigation.navigation

import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavHostController
import androidx.navigation.NavType
import androidx.navigation.compose.composable
import androidx.navigation.navArgument
import androidx.navigation.navigation
import com.example.jetpackcomposenavigation.nestednavigation.screens.home.ProfileScreen
import com.example.jetpackcomposenavigation.nestednavigation.screens.home.VerificationScreen


fun NavGraphBuilder.homeGraph(navHostController: NavHostController) {

    navigation(
        startDestination = NestedScreen.Profile.route,
        route = HOME_ROUTE
    ) {
        composable(route = NestedScreen.Profile.route) {
            ProfileScreen(navHostController = navHostController)
        }
        composable(
            route = NestedScreen.Verification.route,
            arguments = listOf(
                navArgument(DETAILS_ARGUMENT_KEY) {
                    type = NavType.IntType
                },
                navArgument(DETAILS_ARGUMENT_KEY_02) {
                    type = NavType.StringType
                },
            )
        ) {
            VerificationScreen(navHostController = navHostController)
        }
    }
}