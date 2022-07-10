package com.example.alexjulia.ui.stock_details_screen.components

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import com.example.alexjulia.ui.theme.LightGreen
import com.example.alexjulia.ui.theme.LocalCustomShapes
import com.example.alexjulia.ui.theme.LocalSpacing


@Composable
fun PeriodTag(period: String, isSelected: Boolean = false) {
    val spacing = LocalSpacing.current
    val shape = LocalCustomShapes.current.mediumShape
    Surface(
        border = BorderStroke(width = 0.3.dp, color = Color.LightGray),
        color = if (isSelected) Color.LightGreen else Color.Transparent,
        shape = shape,
        modifier = Modifier.width(40.dp)
    ) {
        Text(
            text = period,
            modifier = Modifier
                .padding(spacing.small)
                .fillMaxWidth(),
            style = MaterialTheme.typography.caption,
            textAlign = TextAlign.Center,
            color = if (isSelected) Color.White else Color.Black
        )
    }
}