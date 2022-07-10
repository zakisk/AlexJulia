package com.example.alexjulia.ui.home_screen.components

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.navigation.NavHostController
import com.example.alexjulia.ui.theme.LightGreen
import com.example.alexjulia.ui.theme.LocalSpacing
import com.example.alexjulia.ui.theme.PrussianBlue
import com.example.alexjulia.util.companies


@Composable
fun WatchList(navController: NavHostController) {
    val spacing = LocalSpacing.current
    Column(modifier = Modifier.fillMaxWidth()) {
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(spacing.medium),
            horizontalArrangement = Arrangement.SpaceBetween
        ) {
            Text(text = "Watchlist", color = Color.PrussianBlue, style = MaterialTheme.typography.h6)
            Text(text = "See All", color = Color.LightGreen, style = MaterialTheme.typography.caption)
        }

        LazyRow {
            items(companies) { company ->
                WatchListItem(company = company, navController = navController)
            }
        }
    }
}