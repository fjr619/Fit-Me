package com.fjr.fitme.presentation.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.material3.windowsizeclass.WindowWidthSizeClass
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.PreviewLightDark
import androidx.compose.ui.tooling.preview.PreviewScreenSizes
import androidx.compose.ui.unit.dp
import com.fjr.fitme.presentation.components.AnonymousSignInButton
import com.fjr.fitme.presentation.components.GoogleSignInButton
import com.fjr.fitme.presentation.screens.components.Logo
import com.fjr.fitme.presentation.screens.components.Subtitle
import com.fjr.fitme.presentation.screens.components.Title
import com.fjr.fitme.presentation.theme.FitMeTheme
import com.fjr.fitme.presentation.util.LocalWindowWidthSize


@Composable
fun SigninScreen(
    modifier: Modifier = Modifier,
) {
    val windowSize = LocalWindowWidthSize.current
    when (windowSize) {
        WindowWidthSizeClass.Compact -> {
            Column(
                modifier = modifier
                    .fillMaxSize()
                    .background(FitMeTheme.color.background),
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.SpaceAround
            ) {
                Column(
                    horizontalAlignment = Alignment.CenterHorizontally,
                ) {
                    Logo(size = 150.dp)

                    Spacer(modifier = Modifier.height(24.dp))
                    Title()
                    Subtitle()
                }
                Column(
                    horizontalAlignment = Alignment.CenterHorizontally,
                ) {
                    GoogleSignInButton(
                        onClick = {}
                    )
                    Spacer(modifier = Modifier.height(16.dp))
                    AnonymousSignInButton(
                        onClick = {}
                    )
                }
            }
        }

        else -> {
            Row(
                modifier = Modifier.fillMaxSize(),
            ) {
                Column(
                    modifier = Modifier
                        .fillMaxHeight()
                        .weight(1f)
                        .background(FitMeTheme.color.background),
                    horizontalAlignment = Alignment.CenterHorizontally,
                    verticalArrangement = Arrangement.Center
                ) {
                    Logo(size = 250.dp)

                    Spacer(modifier = Modifier.height(24.dp))
                    Title()
                    Subtitle()
                }
                Column(
                    modifier = Modifier
                        .fillMaxHeight()
                        .weight(1f),
                    horizontalAlignment = Alignment.CenterHorizontally,
                    verticalArrangement = Arrangement.Center
                ) {
                    GoogleSignInButton(
                        onClick = {}
                    )
                    Spacer(modifier = Modifier.height(16.dp))
                    AnonymousSignInButton(
                        onClick = {}
                    )
                }
            }
        }
    }
}

@PreviewLightDark
@PreviewScreenSizes
@Composable
private fun SignInScreenPreview() {
    CompositionLocalProvider(
        LocalWindowWidthSize provides WindowWidthSizeClass.Compact,
    ) {
        FitMeTheme {
            SigninScreen(
            )
        }
    }
}