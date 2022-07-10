package com.example.alexjulia.ui.main_screen

import android.annotation.SuppressLint
import androidx.compose.material.FabPosition
import androidx.compose.material.Scaffold
import androidx.compose.material.rememberScaffoldState
import androidx.compose.runtime.Composable
import androidx.navigation.compose.rememberNavController
import com.example.alexjulia.ui.main_screen.AJNavHost
import com.example.alexjulia.ui.main_screen.components.AJBottomBar
import com.example.alexjulia.ui.main_screen.components.AJFloatingActionButton
import com.example.alexjulia.ui.main_screen.components.AJTopAppBar


@SuppressLint("UnusedMaterialScaffoldPaddingParameter")
@Composable
fun MainScreen() {
    val state = rememberScaffoldState()
    val navController = rememberNavController()
    Scaffold(
        scaffoldState = state,
        topBar = { AJTopAppBar(navController) },
        bottomBar = { AJBottomBar(navController = navController) },
        floatingActionButton = { AJFloatingActionButton() },
        floatingActionButtonPosition = FabPosition.Center,
        isFloatingActionButtonDocked = true
    ) {
        AJNavHost(navController)
    }
}