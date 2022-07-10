package com.example.alexjulia.ui.markets_screen

import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import com.example.alexjulia.ui.markets_screen.components.MarketIndexProfile
import com.example.alexjulia.ui.markets_screen.components.MarketMovers
import com.example.alexjulia.ui.markets_screen.components.SearchTextField
import com.example.alexjulia.ui.theme.LocalSpacing
import com.example.alexjulia.util.marketIndexCompanies
import com.patrykandpatryk.vico.core.entry.FloatEntry


@Composable
fun MarketsScreen(navController: NavHostController) {
    val entries = listOf(
        FloatEntry(1f, 200f), FloatEntry(2f, 250f),
        FloatEntry(3f, 400f), FloatEntry(4f, 500f),
        FloatEntry(5f, 400f), FloatEntry(6f, 500f)
    )
    val spacing = LocalSpacing.current
    LazyColumn(modifier = Modifier.padding(bottom = spacing.listBottomSpacing)) {
        item {
            LazyRow {
                item {
                    MarketIndexProfile(
                        marketIndexCompany = marketIndexCompanies[0],
                        entries = entries,
                        isDark = false,
                        mark = 4f
                    )

                    MarketIndexProfile(
                        marketIndexCompany = marketIndexCompanies[1],
                        entries = entries,
                        isDark = true,
                        mark = 5f
                    )
                }
            }

            SearchTextField()

            MarketMovers(navController = navController)
        }
    }
}
