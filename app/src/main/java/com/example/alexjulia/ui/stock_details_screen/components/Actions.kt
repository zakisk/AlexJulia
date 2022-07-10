package com.example.alexjulia.ui.stock_details_screen.components

import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Button
import androidx.compose.material.ButtonDefaults
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import com.example.alexjulia.ui.theme.LightGreen
import com.example.alexjulia.ui.theme.LocalCustomShapes
import com.example.alexjulia.ui.theme.LocalSpacing
import com.example.alexjulia.ui.theme.PrussianBlue


@Composable
fun Actions() {
    val spacing = LocalSpacing.current
    val shape = LocalCustomShapes.current.buttonShape

    Row(
        modifier = Modifier
            .fillMaxWidth()
    ) {
        Button(
            modifier = Modifier.fillMaxWidth(0.5f)
                .padding(start = spacing.small),
            onClick = { },
            colors = ButtonDefaults.buttonColors(
                backgroundColor = Color.LightGreen,
                contentColor = Color.White
            ),
            shape = shape
        ) {
            Text(
                text = "Buy",
                fontWeight = FontWeight.Bold,
                modifier = Modifier.padding(horizontal = spacing.medium, vertical = spacing.small),
                style = MaterialTheme.typography.caption
            )
        }

        Button(
            modifier = Modifier.fillMaxWidth()
                .padding(start = spacing.small),
            onClick = { },
            colors = ButtonDefaults.buttonColors(
                backgroundColor = Color.PrussianBlue,
                contentColor = Color.White
            ),
            shape = shape
        ) {
            Text(
                text = "Follow",
                fontWeight = FontWeight.Bold,
                modifier = Modifier.padding(horizontal = spacing.medium, vertical = spacing.small),
                style = MaterialTheme.typography.caption
            )
        }
    }
}