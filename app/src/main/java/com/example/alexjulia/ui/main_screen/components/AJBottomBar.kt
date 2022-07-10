package com.example.alexjulia.ui.main_screen.components

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material.BottomNavigation
import androidx.compose.material.BottomNavigationItem
import androidx.compose.material.Icon
import androidx.compose.material.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.navigation.NavDestination.Companion.hierarchy
import androidx.navigation.NavHostController
import androidx.navigation.compose.currentBackStackEntryAsState
import com.example.alexjulia.ui.main_screen.Screen
import com.example.alexjulia.ui.theme.LocalSpacing
import com.example.alexjulia.ui.theme.PrussianBlue


@Composable
fun AJBottomBar(navController: NavHostController) {
    val spacing = LocalSpacing.current

    val items = listOf(
        Screen.BottomScreen.BottomHomeScreen,
        Screen.BottomScreen.BottomChartsScreen,
        Screen.BottomScreen.BottomPurchaseScreen,
        Screen.BottomScreen.BottomMarketsScreen,
        Screen.BottomScreen.BottomUserScreen
    )

    BottomNavigation(
        backgroundColor = MaterialTheme.colors.background,
        modifier = Modifier.fillMaxWidth(),
        elevation = 0.dp
    ) {

        val currentDestination by navController.currentBackStackEntryAsState()
        val currentRoute = currentDestination?.destination

        items.forEachIndexed { index, screen ->
            if (index != 2) {
                BottomNavigationItem(
                    modifier = Modifier.padding(bottom = spacing.medium),
                    label = { },
                    icon = {
                        Icon(
                            painter = painterResource(id = screen.iconId),
                            contentDescription = null
                        )
                    },
                    selected = currentRoute?.hierarchy?.any { it.route == screen.bottomRoute } == true,
                    selectedContentColor = Color.PrussianBlue,
                    unselectedContentColor = Color.Gray,
                    onClick = {
                        if (screen.route == Screen.HomeScreen.route) {
                            navController.popBackStack(Screen.HomeScreen.route, inclusive = false)
                            navController.navigate(Screen.HomeScreen.route)
                        } else {
                            navController.navigate(screen.bottomRoute)
                        }
                    }
                )
            } else {
                BottomNavigationItem(
                    modifier = Modifier.padding(bottom = spacing.medium),
                    label = { },
                    icon = { },
                    selected = false,
                    enabled = false,
                    onClick = { }
                )
            }

        }

    }
}