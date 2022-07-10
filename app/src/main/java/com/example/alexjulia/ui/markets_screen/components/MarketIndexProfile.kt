package com.example.alexjulia.ui.markets_screen.components

import androidx.compose.foundation.layout.*
import androidx.compose.material.Card
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.alexjulia.domain.model.MarketIndexCompany
import com.example.alexjulia.ui.main_screen.components.AJChart
import com.example.alexjulia.R
import com.example.alexjulia.ui.theme.*
import com.patrykandpatryk.vico.core.entry.FloatEntry


@Composable
fun MarketIndexProfile(
    marketIndexCompany: MarketIndexCompany,
    isDark: Boolean,
    entries: List<FloatEntry>,
    mark: Float
) {
    val spacing = LocalSpacing.current
    val shapes = LocalCustomShapes.current
    Card(
        modifier = Modifier
            .width(280.dp)
            .padding(spacing.medium),
        elevation = 0.dp,
        backgroundColor = if (isDark) Color.PrussianBlue else Color.LightGray.copy(0.2f),
        shape = shapes.largeShape
    ) {
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .padding(spacing.small)
        ) {
            Text(
                modifier = Modifier.padding(
                    horizontal = spacing.medium,
                    vertical = spacing.small
                ),
                text = marketIndexCompany.name,
                color = if (isDark) Color.LightGray else Color.Gray,
                style = MaterialTheme.typography.body1
            )

            Column(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(vertical = spacing.small, horizontal = spacing.medium)
            ) {
                Text(
                    text = "${marketIndexCompany.marketSummary}",
                    color = if (isDark) Color.White else Color.PrussianBlue,
                    style = MaterialTheme.typography.h6
                )

                Text(
                    text = if (marketIndexCompany.increment > 0)
                        "${stringResource(id = R.string.up_arrow) + marketIndexCompany.increment}%"
                    else "${stringResource(id = R.string.down_arrow) + marketIndexCompany.decrement}%",
                    fontSize = 8.sp,
                    color = if (marketIndexCompany.increment > 0) Color.LightGreen else Color.DecreaseColor,
                    modifier = Modifier.padding(top = spacing.small)
                )

            }

            AJChart(
                modifier = Modifier
                    .width(200.dp)
                    .height(100.dp),
                entries = entries,
                mark = mark
            )
        }
    }

}