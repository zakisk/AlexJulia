package com.example.alexjulia.ui.theme

import androidx.compose.runtime.Composable
import com.example.alexjulia.ui.theme.AlexJuliaTheme


@Composable
fun MyApp(content: @Composable () -> Unit) {
    AlexJuliaTheme {
        content()
    }
}