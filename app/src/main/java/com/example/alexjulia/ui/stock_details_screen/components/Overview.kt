package com.example.alexjulia.ui.stock_details_screen.components

import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.material.Icon
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.alexjulia.domain.model.Company
import com.example.alexjulia.ui.theme.LocalCustomShapes
import com.example.alexjulia.ui.theme.LocalSpacing
import com.example.alexjulia.ui.theme.PrussianBlue
import com.example.alexjulia.R


@Composable
fun Overview(company: Company) {
    val spacing = LocalSpacing.current
    val shapes = LocalCustomShapes.current
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .border(
                width = 0.3.dp,
                color = Color.LightGray,
                shape = shapes.largeShape
            )
            .clip(shapes.largeShape)
            .padding(
                top = spacing.medium,
                bottom = spacing.medium,
                start = spacing.medium,
                end = spacing.medium
            )
    ) {
        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceBetween
        ) {
            Row {
                Icon(
                    painter = painterResource(id = company.iconId),
                    contentDescription = null,
                    modifier = Modifier.padding(spacing.small)
                )
                Text(
                    text = "Overview",
                    fontSize = 14.sp,
                    fontWeight = FontWeight.Bold,
                    modifier = Modifier.padding(spacing.small)
                )
            }
            Icon(
                painter = painterResource(id = R.drawable.ic_question),
                contentDescription = null,
                modifier = Modifier.padding(spacing.small),
                tint = Color.LightGray
            )
        }

        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(top = spacing.medium),
            horizontalArrangement = Arrangement.SpaceBetween
        ) {
            Column {
                Text(
                    text = "Open",
                    style = MaterialTheme.typography.caption,
                    color = Color.LightGray,
                    modifier = Modifier.padding(bottom = spacing.small)
                )
                Text(
                    text = "$${company.open}",
                    fontSize = 14.sp,
                    fontWeight = FontWeight.Bold,
                    color = Color.PrussianBlue
                )
            }

            Column {
                Text(
                    text = "Day Low",
                    style = MaterialTheme.typography.caption,
                    color = Color.LightGray,
                    modifier = Modifier.padding(bottom = spacing.small)
                )
                Text(
                    text = "$${company.dayLow}",
                    fontSize = 14.sp,
                    fontWeight = FontWeight.Bold,
                    color = Color.PrussianBlue
                )
            }

            Column {
                Text(
                    text = "Day High",
                    style = MaterialTheme.typography.caption,
                    color = Color.LightGray,
                    modifier = Modifier.padding(bottom = spacing.small)
                )
                Text(
                    text = "$${company.dayHigh}",
                    fontSize = 14.sp,
                    fontWeight = FontWeight.Bold,
                    color = Color.PrussianBlue
                )
            }
        }
    }
}