package com.example.alexjulia.ui.stock_details_screen.components

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.example.alexjulia.ui.stock_details_screen.components.PeriodTag
import com.example.alexjulia.ui.theme.LocalSpacing


@Composable
fun TagList() {
    val spacing = LocalSpacing.current
    Row(modifier = Modifier
        .fillMaxWidth()
        .padding(vertical = spacing.medium),
        horizontalArrangement = Arrangement.SpaceEvenly
    ) {
        PeriodTag(period = "1D")
        PeriodTag(period = "1W", isSelected = true)
        PeriodTag(period = "1M")
        PeriodTag(period = "1Y")
        PeriodTag(period = "ALL")
    }
}