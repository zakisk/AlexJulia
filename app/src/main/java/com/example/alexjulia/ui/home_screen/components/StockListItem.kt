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
import com.example.alexjulia.ui.main_screen.Screen
import com.example.alexjulia.ui.theme.*
import com.example.alexjulia.R


@Composable
fun StockListItem(company: Company, navController: NavHostController) {
    val spacing = LocalSpacing.current
    val shapes = LocalCustomShapes.current
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .border(
                width = 0.3.dp,
                color = Color.LightGray,
                shape = shapes.largeShape
            )
            .clip(shapes.largeShape)
            .clickable { navController.navigate(Screen.StockDetailsScreen.route + "/${company.marketName}") }
            .padding(spacing.medium),
        horizontalArrangement = Arrangement.SpaceBetween
    ) {
        Icon(
            painter = painterResource(id = company.iconId),
            contentDescription = null,
            modifier = Modifier
                .background(color = Color.LightGray.copy(0.2f), shape = shapes.ovalShape)
                .padding(spacing.small)
                .size(24.dp)
        )
        Column(modifier = Modifier.padding(start = spacing.small)) {
            Text(text = company.marketName, fontSize = 14.sp, fontWeight = FontWeight.Bold)
            Text(
                text = company.fullName,
                style = MaterialTheme.typography.caption,
                color = Color.LightGray
            )
        }
        Column(modifier = Modifier.padding(start = spacing.small)) {
            Text(
                text = "${company.shareRate}",
                fontSize = 14.sp,
                fontWeight = FontWeight.Bold,
                color = if (company.increment > 0) Color.LightGreen else Color.DecreaseColor
            )
            Text(
                text = if (company.increment > 0) "${stringResource(id = R.string.up_arrow)}${company.increment}"
                       else "${stringResource(id = R.string.down_arrow) + company.decrement}%",
                color = if (company.increment > 0) Color.LightGreen else Color.DecreaseColor,
                style = MaterialTheme.typography.caption
            )
        }
        Column(modifier = Modifier.padding(start = spacing.small)) {
            Text(
                text = "$${"%.2f".format((company.shareRate * company.totalSharesPurchased.toFloat()))}",
                fontSize = 14.sp,
                color = Color.PrussianBlue,
                fontWeight = FontWeight.Bold
            )
            Text(
                text = "${company.totalSharesPurchased} shares",
                style = MaterialTheme.typography.caption,
                color = Color.LightGray
            )
        }
    }
}