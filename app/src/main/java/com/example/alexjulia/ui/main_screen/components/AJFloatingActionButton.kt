package com.example.alexjulia.ui.main_screen.components

import androidx.compose.foundation.layout.size
import androidx.compose.material.FloatingActionButton
import androidx.compose.material.FloatingActionButtonDefaults
import androidx.compose.material.Icon
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.example.alexjulia.R
import com.example.alexjulia.ui.theme.LightGreen


@Composable
fun AJFloatingActionButton() {
    FloatingActionButton(
        onClick = { },
        backgroundColor = Color.LightGreen,
        elevation = FloatingActionButtonDefaults.elevation(defaultElevation = 2.dp)
    ) {
        Icon(
            painter = painterResource(id = R.drawable.ic_arrow_left_right),
            contentDescription = null,
            modifier = Modifier.size(16.dp),
            tint = Color.Unspecified
        )
    }
}