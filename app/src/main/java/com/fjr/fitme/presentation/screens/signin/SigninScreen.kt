package com.fjr.fitme.presentation.screens.signin

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
import com.fjr.fitme.presentation.screens.signin.components.ButtonAnonymousSignIn
import com.fjr.fitme.presentation.screens.signin.components.ButtonGoogleSignIn
import com.fjr.fitme.presentation.screens.signin.components.ImageLogo
import com.fjr.fitme.presentation.screens.signin.components.TextSubtitle
import com.fjr.fitme.presentation.screens.signin.components.TextTitle
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
                    ImageLogo(size = 150.dp)

                    Spacer(modifier = Modifier.height(24.dp))
                    TextTitle()
                    TextSubtitle()
                }
                Column(
                    horizontalAlignment = Alignment.CenterHorizontally,
                ) {
                    ButtonGoogleSignIn(
                        onClick = {}
                    )
                    Spacer(modifier = Modifier.height(16.dp))
                    ButtonAnonymousSignIn(
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
                    ImageLogo(size = 250.dp)

                    Spacer(modifier = Modifier.height(24.dp))
                    TextTitle()
                    TextSubtitle()
                }
                Column(
                    modifier = Modifier
                        .fillMaxHeight()
                        .weight(1f),
                    horizontalAlignment = Alignment.CenterHorizontally,
                    verticalArrangement = Arrangement.Center
                ) {
                    ButtonGoogleSignIn(
                        onClick = {}
                    )
                    Spacer(modifier = Modifier.height(16.dp))
                    ButtonAnonymousSignIn(
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