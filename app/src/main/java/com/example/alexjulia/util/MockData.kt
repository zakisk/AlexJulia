package com.example.alexjulia.util


import com.example.alexjulia.R
import com.example.alexjulia.domain.model.Company
import com.example.alexjulia.domain.model.MarketIndexCompany


val companies = listOf(
    Company(marketName = "ADB", fullName = "Adobe Inc", iconId = R.drawable.ic_adobe,
        shareRate = 33.49f, totalSharesPurchased = 20,
        increment = 5.49f, open = 643.58f,
        dayLow = 902.11f, dayHigh = 910.18f
    ),
    Company(marketName = "APPL", fullName = "Apple Inc", iconId = R.drawable.ic_apple,
        shareRate = 29.88f, totalSharesPurchased = 27,
        decrement = 1.82f, open = 1114.68f,
        dayLow = 1090.11f, dayHigh = 1121.18f
    ),
    Company(marketName = "Axis Bank", fullName = "Axis Bank Ltd", iconId = R.drawable.ic_axis_bank,
        shareRate = 20.76f, totalSharesPurchased = 30,
        increment = 2.89f, open = 719.68f,
        dayLow = 699.11f, dayHigh = 720.18f
    ),
    Company(marketName = "TSLA", fullName = "Tesla", iconId = R.drawable.ic_tesla,
        shareRate = 20.76f, totalSharesPurchased = 30,
        increment = 2.89f, open = 719.68f,
        dayLow = 699.11f, dayHigh = 720.18f
    ),
    Company(marketName = "NVDA", fullName = "Nvidia", iconId = R.drawable.ic_nvidia,
        shareRate = 25.94f, totalSharesPurchased = 10,
        increment = 0.14f, open = 300.68f,
        dayLow = 288.11f, dayHigh = 315.18f
    )
)


val marketIndexCompanies = listOf(
    MarketIndexCompany(
        name = "Dow Jones",
        marketSummary = 35819.56f,
        increment = 0.25f
    ),
    MarketIndexCompany(
        name = "S&P 500",
        marketSummary = 4605.38f,
        increment = 0.19f
    )
)