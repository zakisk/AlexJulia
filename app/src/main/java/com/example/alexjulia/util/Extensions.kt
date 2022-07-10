package com.example.alexjulia.util

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import com.patrykandpatryk.vico.compose.style.ChartStyle
import com.patrykandpatryk.vico.core.DefaultColors


@Composable
internal fun ChartStyle.Companion.fromEntityColors(entityColors: LongArray): ChartStyle {
    val defaultColors = if (isSystemInDarkTheme()) DefaultColors.Dark else DefaultColors.Light
    return fromColors(
        axisLabelColor = Color(defaultColors.axisLabelColor),
        axisGuidelineColor = Color(defaultColors.axisGuidelineColor),
        axisLineColor = Color(defaultColors.axisLineColor),
        entityColors = entityColors.map(::Color),
        elevationOverlayColor = Color(defaultColors.elevationOverlayColor),
    )
}