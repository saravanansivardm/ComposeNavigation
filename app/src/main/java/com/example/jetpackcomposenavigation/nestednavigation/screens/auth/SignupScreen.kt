package com.example.jetpackcomposenavigation.nestednavigation.screens.auth

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import com.example.jetpackcomposenavigation.nestednavigation.navigation.HOME_ROUTE
import com.example.jetpackcomposenavigation.nestednavigation.navigation.NestedScreen

@Composable
fun NestedSignupScreen(
    navHostController: NavHostController
) {
    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.Yellow),
        contentAlignment = Alignment.Center
    ) {

        Text(
            text = "SignupScreen",
            modifier = Modifier.clickable {
                navHostController.popBackStack()
                navHostController.navigate(route = HOME_ROUTE) {
                    popUpTo(HOME_ROUTE)
                }
            }, style = TextStyle(
                fontSize = 18.sp,
                fontWeight = FontWeight.ExtraBold,
                color = Color.Black
            )
        )
    }
}