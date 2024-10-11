package com.fjr.fitme

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.IntrinsicSize
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.windowsizeclass.ExperimentalMaterial3WindowSizeClassApi
import androidx.compose.material3.windowsizeclass.calculateWindowSizeClass
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.fjr.fitme.presentation.screens.SigninScreen
import com.fjr.fitme.presentation.theme.AppTheme
import com.fjr.fitme.presentation.theme.FitMeTheme
import com.fjr.fitme.presentation.util.LocalWindowSize


class MainActivity : ComponentActivity() {
    @OptIn(ExperimentalMaterial3WindowSizeClassApi::class)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            FitMeTheme {
                val windowSizeClass = calculateWindowSizeClass(activity = this)

                CompositionLocalProvider(
                    LocalWindowSize provides windowSizeClass
                ) {
                    Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                        SigninScreen(modifier = Modifier.padding(innerPadding))
                    }
                }

            }
        }
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Box(modifier = Modifier.fillMaxWidth(), contentAlignment = Alignment.Center) {
        Row(
            modifier = modifier
                .height(IntrinsicSize.Max)
                .background(
                    AppTheme.color.error,
                    shape = RoundedCornerShape(
                        topStart = AppTheme.radius.extraLarge,
                        topEnd = AppTheme.radius.extraLarge
                    )
                )
                .border(
                    border = BorderStroke(width = AppTheme.dimens.space4, AppTheme.color.primary),
                    shape = RoundedCornerShape(
                        topStart = AppTheme.radius.extraLarge,
                        topEnd = AppTheme.radius.extraLarge
                    )
                )
                .padding(AppTheme.dimens.space24),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.spacedBy(AppTheme.dimens.space8)
        ) {
//            Icon(
//                imageVector = AppTheme.drawable.iconPause,
//                contentDescription = "",
//                tint = AppTheme.color.background
//            )
            Text(
                text = "Hello $name! ${LocalWindowSize.current.widthSizeClass}",
                style = AppTheme.typography.headlineMedium,
                color = AppTheme.color.background,
            )
        }
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    FitMeTheme {
        Greeting("Android")
    }
}