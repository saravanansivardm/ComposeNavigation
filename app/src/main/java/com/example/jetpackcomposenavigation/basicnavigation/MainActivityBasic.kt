package com.example.jetpackcomposenavigation.basicnavigation

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.example.jetpackcomposenavigation.nestednavigation.navigation.NestedSetupNavGraph
import com.example.jetpackcomposenavigation.ui.theme.JetpackComposeNavigationTheme

class MainActivityBasic : ComponentActivity() {
    private lateinit var navController: NavHostController
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            JetpackComposeNavigationTheme {
                navController = rememberNavController()
                NestedSetupNavGraph(navHostController = navController)
            }
        }
    }
}