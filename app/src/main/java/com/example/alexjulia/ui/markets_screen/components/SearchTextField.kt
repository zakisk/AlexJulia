package com.example.alexjulia.ui.markets_screen.components

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Icon
import androidx.compose.material.OutlinedTextField
import com.example.alexjulia.R
import androidx.compose.material.Text
import androidx.compose.material.TextFieldDefaults
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import com.example.alexjulia.ui.theme.LocalCustomShapes
import com.example.alexjulia.ui.theme.LocalSpacing
import com.example.alexjulia.ui.theme.PrussianBlue


@Composable
fun SearchTextField() {
    var text by remember { mutableStateOf("") }
    val spacing = LocalSpacing.current
    val shape = LocalCustomShapes.current.largeShape
    val textFieldDefaults = TextFieldDefaults.outlinedTextFieldColors(
        focusedBorderColor = Color.PrussianBlue,
        cursorColor = Color.PrussianBlue,
        unfocusedBorderColor = Color.LightGray,
        unfocusedLabelColor = Color.LightGray,
        trailingIconColor = Color.PrussianBlue,
        disabledTrailingIconColor = Color.PrussianBlue,
        leadingIconColor = Color.PrussianBlue,
        disabledLeadingIconColor = Color.PrussianBlue
    )

    OutlinedTextField(
        value = text,
        onValueChange = { text = it },
        modifier = Modifier
            .fillMaxWidth()
            .padding(spacing.medium),
        placeholder = { Text("Search...") },
        leadingIcon = { LeadingIcon() },
        singleLine = false,
        shape = shape,
        colors = textFieldDefaults,
        trailingIcon = { TrailingIcon() }
    )
}

@Composable
fun LeadingIcon() {
    Icon(
        painter = painterResource(id = R.drawable.ic_search),
        contentDescription = null,
        tint = Color.Unspecified
    )
}

@Composable
fun TrailingIcon() {
    Icon(
        painter = painterResource(id = R.drawable.ic_filter),
        contentDescription = null,
        tint = Color.Unspecified
    )
}