package com.example.alexjulia.ui.markets_screen.components

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.navigation.NavHostController
import com.example.alexjulia.ui.home_screen.components.StockListItem
import com.example.alexjulia.ui.theme.LocalSpacing
import com.example.alexjulia.ui.theme.PrussianBlue
import com.example.alexjulia.util.companies


@Composable
fun MarketMovers(navController: NavHostController) {
    val spacing = LocalSpacing.current
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .padding(spacing.medium)
    ) {
        Text(
            text = "Market Movers",
            color = Color.PrussianBlue,
            style = MaterialTheme.typography.h6,
            modifier = Modifier.padding(bottom = spacing.medium)
        )
        companies.forEach { company ->
            StockListItem(company = company, navController = navController)
            Spacer(modifier = Modifier.padding(top = spacing.medium))
        }
    }
}