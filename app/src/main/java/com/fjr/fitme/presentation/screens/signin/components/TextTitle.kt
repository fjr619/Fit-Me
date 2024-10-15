package com.fjr.fitme.presentation.screens.signin.components

import androidx.compose.foundation.layout.Column
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.tooling.preview.PreviewLightDark
import com.fjr.fitme.presentation.theme.FitMeTheme

@Composable
fun TextTitle() {
    Text(
        text = "Fit Me",
        style = FitMeTheme.typography.title.copy(color = FitMeTheme.color.onSurface)
    )
}

@Composable
fun TextSubtitle() {
    Text(
        text = "Aim for better, not perfect",
        style = FitMeTheme.typography.subTitle.copy(
            fontStyle = FontStyle.Italic,
            color = FitMeTheme.color.onSurface
        ),
    )
}

@PreviewLightDark
@Composable
fun TextTitlePreview() {
    FitMeTheme {
        Column {
            TextTitle()
            TextSubtitle()
        }

    }
}