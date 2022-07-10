package com.example.alexjulia.ui.main_screen

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.navArgument
import com.example.alexjulia.ui.home_screen.HomeScreen
import com.example.alexjulia.ui.markets_screen.MarketsScreen
import com.example.alexjulia.ui.stock_details_screen.StockDetailsScreen


@Composable
fun AJNavHost(navController: NavHostController) {
    NavHost(
        navController = navController,
        startDestination = Screen.HomeScreen.route
    ) {
        composable(route = Screen.HomeScreen.route) {
            HomeScreen(navController = navController)
        }

        composable(
            route = Screen.StockDetailsScreen.route + "/{companyName}",
            arguments = listOf(navArgument("companyName") { type = NavType.StringType })
        ) {
            it.arguments?.getString("companyName")?.let { name ->
                StockDetailsScreen(name = name)
            }
        }

        composable(route = Screen.BottomScreen.BottomChartsScreen.route) { }

        composable(route = Screen.BottomScreen.BottomMarketsScreen.route) {
            MarketsScreen(navController)
        }

        composable(route = Screen.BottomScreen.BottomUserScreen.route) { }
    }
}