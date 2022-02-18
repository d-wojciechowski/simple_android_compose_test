package com.dwojciechowski.simpleandroid1.ui.nav

import androidx.compose.runtime.Composable
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.navArgument
import com.dwojciechowski.simpleandroid1.ui.screen.DetailsScreen
import com.dwojciechowski.simpleandroid1.ui.screen.MainActivityScreen

@Composable
fun Navigation() {
    val navController = rememberNavController()
    NavHost(navController = navController, startDestination = Screen.MainScreen.route) {
        composable(Screen.MainScreen.route) {
            MainActivityScreen(navController = navController)
        }
        composable(
            route = Screen.Details.route + "/{id}",
            arguments = listOf(
                navArgument("id") {
                    type = NavType.LongType
                    defaultValue = 0L
                    nullable = false
                }
            )
        ) { navEntry ->
            DetailsScreen(id = navEntry.arguments?.getLong("id") ?: 0)
        }
    }
}