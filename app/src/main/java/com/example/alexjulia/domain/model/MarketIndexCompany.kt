package com.example.alexjulia.domain.model

import com.patrykandpatryk.vico.core.entry.FloatEntry

data class MarketIndexCompany(
    val name: String,
    val marketSummary: Float,
    val increment: Float = 0f,
    val decrement: Float = 0f
)