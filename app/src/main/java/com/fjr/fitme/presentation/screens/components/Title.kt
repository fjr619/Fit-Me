package com.fjr.fitme.presentation.screens.components

import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontStyle
import com.fjr.fitme.presentation.theme.FitMeTheme

@Composable
fun Title(modifier: Modifier = Modifier) {
    Text(
        text = "Fit Me",
        style = FitMeTheme.typography.headlineLarge.copy(color = FitMeTheme.color.onSurface)
    )
}

@Composable
fun Subtitle(modifier: Modifier = Modifier) {
    Text(
        text = "Aim for better, not perfect",
        style = MaterialTheme.typography.bodyLarge.copy(
            fontStyle = FontStyle.Italic,
            color = FitMeTheme.color.onSurface
        ),
    )
}