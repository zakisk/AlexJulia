package com.example.alexjulia.ui.main_screen.components

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.example.alexjulia.util.fromEntityColors
import com.example.alexjulia.util.marker
import com.patrykandpatryk.vico.compose.axis.horizontal.bottomAxis
import com.patrykandpatryk.vico.compose.axis.vertical.endAxis
import com.patrykandpatryk.vico.compose.chart.Chart
import com.patrykandpatryk.vico.compose.chart.line.lineChart
import com.patrykandpatryk.vico.compose.style.ChartStyle
import com.patrykandpatryk.vico.compose.style.ProvideChartStyle
import com.patrykandpatryk.vico.core.entry.ChartEntryModelProducer
import com.patrykandpatryk.vico.core.entry.FloatEntry

@Suppress("MagicNumber")
@Composable
fun AJChart(modifier: Modifier, entries: List<FloatEntry>, mark: Float = 10f) {
    val entityColors: LongArray = longArrayOf(0xFF23CA96)

    val startAxis = endAxis()
    val bottomAxis = bottomAxis(guideline = null)
    val chartStyle = ChartStyle.fromEntityColors(entityColors = entityColors)
    ProvideChartStyle(chartStyle = chartStyle) {
        val lineChart = lineChart(persistentMarkers = mapOf(mark to marker()))
        Chart(
            modifier = modifier,
            chart = lineChart,
            chartModelProducer = ChartEntryModelProducer(entries),
            bottomAxis = bottomAxis,
            marker = marker(),
            endAxis = startAxis
        )
    }
}