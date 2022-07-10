package com.example.alexjulia.ui.home_screen.components

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.BoxScope
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material.Card
import androidx.compose.material.Icon
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowDropDown
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.example.alexjulia.R
import com.example.alexjulia.ui.theme.LocalCustomShapes
import com.example.alexjulia.ui.theme.LocalSpacing


@Composable
fun BoxScope.CompaniesList() {
    val shapes = LocalCustomShapes.current
    val spacing = LocalSpacing.current
    Card(
        modifier = Modifier
            .align(Alignment.CenterEnd)
            .padding(top = spacing.extraLarge, end = spacing.extraLarge),
        shape = shapes.barShape
    ) {
        Column(modifier = Modifier.padding(spacing.small)) {
            val modifier = Modifier
                .padding(spacing.small)
                .size(16.dp)
                .background(color = Color.LightGray.copy(0.05f), shape = shapes.ovalShape)

            Icon(
                painter = painterResource(id = R.drawable.ic_apple),
                contentDescription = null,
                modifier = modifier
            )

            Icon(
                painter = painterResource(id = R.drawable.ic_paypal),
                contentDescription = null,
                modifier = modifier
            )

            Icon(
                painter = painterResource(id = R.drawable.ic_axis_bank),
                contentDescription = null,
                modifier = modifier
            )

            Icon(
                imageVector = Icons.Default.ArrowDropDown,
                contentDescription = null,
                modifier = modifier.clickable { }
            )
        }
    }
}