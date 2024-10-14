package com.fjr.fitme.presentation.screens.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.unit.Dp
import com.fjr.fitme.presentation.theme.FitMeTheme

@Composable
fun Logo(modifier: Modifier = Modifier, size: Dp) {
    Image(
        imageVector = FitMeTheme.drawable.logo,
        contentDescription = "App Logo",
        modifier = modifier
            .size(size)
            .clip(CircleShape),
        contentScale = ContentScale.FillBounds,
        colorFilter = ColorFilter.tint(FitMeTheme.color.primary)
    )
}