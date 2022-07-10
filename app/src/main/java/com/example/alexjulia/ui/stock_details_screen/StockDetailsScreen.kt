package com.example.alexjulia.ui.stock_details_screen

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.Icon
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.alexjulia.util.companies
import com.example.alexjulia.ui.stock_details_screen.components.TagList
import com.example.alexjulia.ui.main_screen.components.AJChart
import com.example.alexjulia.ui.stock_details_screen.components.Actions
import com.example.alexjulia.ui.stock_details_screen.components.Overview
import com.example.alexjulia.ui.theme.*
import com.patrykandpatryk.vico.core.entry.FloatEntry
import com.example.alexjulia.R


@Composable
fun StockDetailsScreen(name: String) {
    val company = companies.find { it.marketName == name }!!
    val spacing = LocalSpacing.current
    val shapes = LocalCustomShapes.current
    val entries = listOf(
        FloatEntry(1f, 200f), FloatEntry(2f, 250f),
        FloatEntry(3f, 400f), FloatEntry(4f, 500f),
        FloatEntry(5f, 750f), FloatEntry(6f, 200f),
        FloatEntry(7f, 400f), FloatEntry(8f, 650f),
        FloatEntry(9f, 1000f)
    )
    Column(modifier = Modifier
        .fillMaxWidth()
        .padding(spacing.medium)
    ) {
        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceBetween
        ) {

            Row {
                Icon(
                    painter = painterResource(id = company.iconId),
                    contentDescription = null,
                    modifier = Modifier
                        .background(color = Color.LightGray.copy(0.2f), shape = shapes.ovalShape)
                        .padding(spacing.small)
                        .size(40.dp)
                )
                Column(modifier = Modifier.padding(start = spacing.medium)) {
                    Text(text = company.marketName, fontSize = 20.sp, fontWeight = FontWeight.Bold)
                    Text(
                        text = company.fullName,
                        style = MaterialTheme.typography.caption,
                        color = Color.LightGray,
                        modifier = Modifier.padding(top = spacing.small)
                    )
                }
            }

            Column {
                Text(text = "$${company.open}", fontSize = 20.sp, fontWeight = FontWeight.Bold, color = Color.PrussianBlue)
                Text(
                    text = if (company.increment > 0) "${stringResource(id = R.string.up_arrow) + company.increment}(+1.75%)"
                           else "${stringResource(id = R.string.down_arrow) + company.decrement}(-1.75%)",
                    style = MaterialTheme.typography.caption,
                    color = if (company.increment > 0) Color.LightGreen else Color.DecreaseColor,
                    modifier = Modifier.padding(top = spacing.small)
                )
            }
        }
        TagList()
        AJChart(modifier = Modifier.fillMaxWidth(), entries)
        Spacer(modifier = Modifier.padding(vertical = spacing.medium))
        Overview(company = company)
        Spacer(modifier = Modifier.padding(vertical = spacing.medium))
        Actions()
    }
}