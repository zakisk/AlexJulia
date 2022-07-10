package com.example.alexjulia.ui.main_screen.components

import androidx.compose.foundation.clickable
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Icon
import androidx.compose.material.Text
import androidx.compose.material.TopAppBar
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import androidx.navigation.compose.currentBackStackEntryAsState
import com.example.alexjulia.ui.main_screen.Screen
import com.example.alexjulia.R
import com.example.alexjulia.ui.theme.LocalSpacing
import com.example.alexjulia.ui.theme.PrussianBlue


@Composable
fun AJTopAppBar(navController: NavHostController) {
    val spacing = LocalSpacing.current
    val currentDestination by navController.currentBackStackEntryAsState()
    val currentRoute = currentDestination?.destination
    var icon by remember { mutableStateOf(R.drawable.ic_global) }
    val context = LocalContext.current
    val appName = context.getString(R.string.app_name)
    var title by remember { mutableStateOf(appName) }
    if (currentRoute != null) {
        if (currentRoute.route != Screen.HomeScreen.route) {
            icon = R.drawable.ic_back_arrow
            title = if (currentRoute.route == Screen.StockDetailsScreen.route + "/{companyName}") {
                "Stock Details"
            } else {
                currentRoute.route ?: appName
            }
        } else {
            icon = R.drawable.ic_global
            title = appName
        }
    }
    TopAppBar(
        elevation = 0.dp,
        backgroundColor = Color.Transparent
    ) {
        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceBetween
        ) {
            Row {
                Icon(
                    painter = painterResource(id = icon),
                    contentDescription = null,
                    tint = Color.Unspecified,
                    modifier = Modifier
                        .clickable(
                            indication = null,
                            interactionSource = MutableInteractionSource()
                        ) {
                            navController.navigateUp()
                        }
                        .padding(
                            start = spacing.medium,
                            end = spacing.small,
                            top = spacing.small,
                            bottom = spacing.small
                        )
                )
                Text(
                    text = title,
                    fontSize = 20.sp,
                    fontWeight = FontWeight.Bold,
                    color = Color.PrussianBlue,
                    modifier = Modifier.padding(start = spacing.medium, top = spacing.small)
                )
            }

            Row {
                if (currentRoute != null && currentRoute.route == Screen.HomeScreen.route) {
                    Icon(
                        painter = painterResource(id = R.drawable.ic_search),
                        contentDescription = null,
                        modifier = Modifier.padding(end = spacing.medium)
                    )
                }
                if (currentRoute != null) {
                    if (currentRoute.route != Screen.StockDetailsScreen.route + "/{companyName}") {
                        Icon(
                            painter = painterResource(id = R.drawable.ic_notification_bell),
                            contentDescription = null,
                            tint = Color.Unspecified,
                            modifier = Modifier.padding(end = spacing.medium)
                        )
                    } else {
                        Icon(
                            painter = painterResource(id = R.drawable.ic_share),
                            contentDescription = null,
                            tint = Color.Unspecified,
                            modifier = Modifier.padding(end = spacing.medium)
                        )
                    }
                }
            }
        }
    }
}