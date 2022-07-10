package com.example.alexjulia.ui.home_screen

import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import com.example.alexjulia.ui.home_screen.components.PortfolioCard
import com.example.alexjulia.ui.home_screen.components.StockActivity
import com.example.alexjulia.ui.home_screen.components.WatchList
import com.example.alexjulia.ui.theme.LocalSpacing


@Composable
fun HomeScreen(navController: NavHostController) {
    val spacing = LocalSpacing.current
    LazyColumn(modifier = Modifier.padding(bottom = spacing.listBottomSpacing)) {
        item {
            PortfolioCard()
            WatchList(navController)
            StockActivity(navController)
        }
    }
}