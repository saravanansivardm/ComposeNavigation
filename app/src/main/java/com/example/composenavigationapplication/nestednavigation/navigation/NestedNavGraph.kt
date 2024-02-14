package com.example.composenavigationapplication.nestednavigation.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost

@Composable
fun NestedSetupNavGraph(
    navHostController: NavHostController
) {
    NavHost(
        navController = navHostController,
        startDestination = AUTHENTICATION_ROUTE,
        route = ROOT_ROUTE
    ) {
        authNavGraph(navHostController = navHostController)
        homeGraph(navHostController = navHostController)
    }
}