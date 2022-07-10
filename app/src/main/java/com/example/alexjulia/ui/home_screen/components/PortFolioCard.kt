package com.example.alexjulia.ui.home_screen.components

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.alexjulia.R
import com.example.alexjulia.ui.theme.LightGreen
import com.example.alexjulia.ui.theme.LocalCustomShapes
import com.example.alexjulia.ui.theme.LocalSpacing
import com.example.alexjulia.ui.theme.PrussianBlue

@Composable
fun PortfolioCard() {
    val spacing = LocalSpacing.current
    val shapes = LocalCustomShapes.current
    Box(modifier = Modifier.fillMaxWidth()) {
        Card(
            modifier = Modifier
                .fillMaxWidth()
                .padding(spacing.large),
            elevation = 0.dp,
            backgroundColor = Color.PrussianBlue,
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
                    text = "Portfolio value",
                    color = Color.LightGray,
                    style = MaterialTheme.typography.caption
                )
                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(vertical = spacing.small, horizontal = spacing.medium)
                ) {
                    Text(
                        text = "$15,136.32",
                        color = Color.White,
                        style = MaterialTheme.typography.h6
                    )

                    Text(
                        text = "   2.11%${stringResource(R.string.up_arrow)}",
                        color = Color.LightGreen,
                        fontSize = 8.sp
                    )

                }

                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(vertical = spacing.small, horizontal = spacing.medium)
                ) {
                    Button(
                        onClick = { },
                        colors = ButtonDefaults.buttonColors(
                            backgroundColor = Color.LightGreen,
                            contentColor = Color.White
                        ),
                        shape = shapes.mediumShape
                    ) {
                        Text(text = "Deposit", fontSize = 8.sp)
                    }

                    Button(
                        modifier = Modifier.padding(start = spacing.medium),
                        onClick = { },
                        colors = ButtonDefaults.buttonColors(
                            backgroundColor = Color.PrussianBlue,
                            contentColor = Color.White
                        ),
                        border = BorderStroke(0.3.dp, Color.LightGray),
                        shape = shapes.mediumShape
                    ) {
                        Text(text = "Withdraw", fontSize = 8.sp)
                    }
                }
            }
        }
        CompaniesList()
    }

}