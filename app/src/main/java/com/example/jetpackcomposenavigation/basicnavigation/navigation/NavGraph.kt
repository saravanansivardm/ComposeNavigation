package com.example.jetpackcomposenavigation.basicnavigation.navigation

import android.util.Log
import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.navArgument
import com.example.jetpackcomposenavigation.basicnavigation.screens.DetailsScreen
import com.example.jetpackcomposenavigation.basicnavigation.screens.HomeScreen

@Composable
fun SetupNavGraph(
    navHostController: NavHostController
) {
    NavHost(
        navController = navHostController,
        startDestination = Screen.Home.route
    ) {
        composable(route = Screen.Home.route) {
            HomeScreen(navHostController = navHostController)
        }

        composable(
            route = Screen.Details.route,
            arguments = listOf(
                navArgument(DETAILS_ARGUMENT_KEY) {
                    type = NavType.IntType
                },
                navArgument(DETAILS_ARGUMENT_KEY_02) {
                    type = NavType.StringType
                },
            )

        ) {
            Log.e("nav_arg_log", it.arguments?.getInt(DETAILS_ARGUMENT_KEY).toString())
            Log.e("nav_arg_02_log", it.arguments?.getString(DETAILS_ARGUMENT_KEY_02).toString())
            DetailsScreen()
        }
    }
}