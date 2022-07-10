package com.example.alexjulia.domain.model

import androidx.annotation.DrawableRes

data class Company(
    val marketName: String,
    val fullName: String,
    @DrawableRes val iconId: Int,
    val shareRate: Float,
    val totalSharesPurchased: Int,
    val increment: Float = 0f,
    val decrement: Float = 0f,
    val open: Float,
    val dayLow: Float,
    val dayHigh: Float,
)
