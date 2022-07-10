package com.example.alexjulia.ui.home_screen.components

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.material.Icon
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import com.example.alexjulia.domain.model.Company
import com.example.alexjulia.ui.theme.LocalCustomShapes
import com.example.alexjulia.ui.theme.LocalSpacing
import com.example.alexjulia.ui.main_screen.Screen
import com.example.alexjulia.ui.theme.DecreaseColor
import com.example.alexjulia.ui.theme.LightGreen
import com.example.alexjulia.R


@Composable
fun WatchListItem(company: Company, navController: NavHostController) {
    val shapes = LocalCustomShapes.current
    val spacing = LocalSpacing.current
    Column(
        modifier = Modifier
            .width(280.dp)
            .height(200.dp)
            .padding(spacing.medium)
            .border(
                width = 0.3.dp,
                color = Color.LightGray,
                shape = shapes.largeShape
            )
            .clip(shapes.largeShape)
            .clickable { navController.navigate(Screen.StockDetailsScreen.route + "/${company.marketName}") },
    ) {
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(spacing.medium),
            horizontalArrangement = Arrangement.SpaceBetween
        ) {
            Row {
                Icon(
                    painter = painterResource(id = company.iconId),
                    contentDescription = null,
                    modifier = Modifier
                        .background(color = Color.LightGray.copy(0.2f), shape = shapes.ovalShape)
                        .padding(spacing.small)
                        .size(24.dp)
                )
                Column(modifier = Modifier.padding(start = spacing.small)) {
                    Text(text = company.marketName, fontSize = 16.sp, fontWeight = FontWeight.Bold)
                    Text(
                        text = company.fullName,
                        style = MaterialTheme.typography.caption,
                        color = Color.LightGray
                    )
                }
            }
            Text(
                text = if (company.increment > 0) stringResource(id = R.string.up_arrow) +
                        "${if (company.increment > 0) company.increment else company.decrement}%"
                else stringResource(id = R.string.down_arrow) +
                        "${if (company.increment > 0) company.increment else company.decrement}%",
                color = if (company.increment > 0) Color.LightGreen else Color.DecreaseColor,
                style = MaterialTheme.typography.caption
            )
        }

        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(start = spacing.medium, top = spacing.medium, bottom = spacing.medium),
            horizontalArrangement = Arrangement.SpaceBetween
        ) {
            Column {
                Text(text = "${company.shareRate}", fontSize = 20.sp, fontWeight = FontWeight.Bold)
                Text(
                    text = "$${"%.2f".format((company.shareRate * company.totalSharesPurchased.toFloat()))}",
                    style = MaterialTheme.typography.caption,
                    color = Color.LightGray
                )
            }
            Icon(
                painter = painterResource(id = R.drawable.ic_graph_sample),
                contentDescription = null,
                modifier = Modifier
                    .width(140.dp)
                    .height(80.dp)
            )
        }
    }
}