package com.example.composenavigationapplication.basicnavigation

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.example.composenavigationapplication.nestednavigation.navigation.NestedSetupNavGraph
import com.example.composenavigationapplication.ui.theme.ComposeNavigationApplicationTheme

class MainActivityBasic : ComponentActivity() {
    private lateinit var navController: NavHostController
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ComposeNavigationApplicationTheme {
                navController = rememberNavController()
                NestedSetupNavGraph(navHostController = navController)
            }
        }
    }
}