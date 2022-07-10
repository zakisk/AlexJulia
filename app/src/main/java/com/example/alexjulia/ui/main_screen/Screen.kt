package com.example.alexjulia.ui.main_screen

import androidx.annotation.DrawableRes
import com.example.alexjulia.R

sealed class Screen(val route: String) {
    object HomeScreen : Screen("Alex Julia")

    object StockDetailsScreen : Screen("Stock Details")

    sealed class BottomScreen(
        val bottomRoute : String,
        @DrawableRes val iconId : Int
    ) : Screen(bottomRoute) {

        object BottomHomeScreen : BottomScreen(HomeScreen.route, R.drawable.ic_home)

        object BottomChartsScreen : BottomScreen("Charts", R.drawable.ic_graph)

        object BottomPurchaseScreen : BottomScreen("Purchase", R.drawable.ic_arrow_left_right)

        object BottomMarketsScreen : BottomScreen("Markets", R.drawable.ic_markets)

        object BottomUserScreen : BottomScreen("User", R.drawable.ic_user)

    }
}
