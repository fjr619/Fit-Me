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
import androidx.core.splashscreen.SplashScreen.Companion.installSplashScreen
import com.fjr.fitme.presentation.screens.SigninScreen
import com.fjr.fitme.presentation.theme.FitMeTheme
import com.fjr.fitme.presentation.util.LocalWindowWidthSize

class MainActivity : ComponentActivity() {
    override fun onStop() {
        super.onStop()
        finish()
    }

    @OptIn(ExperimentalMaterial3WindowSizeClassApi::class)
    override fun onCreate(savedInstanceState: Bundle?) {
        installSplashScreen()
        enableEdgeToEdge()
        super.onCreate(savedInstanceState)
        setContent {
            FitMeTheme {
                val windowSizeClass = calculateWindowSizeClass(activity = this)

                CompositionLocalProvider(
                    LocalWindowWidthSize provides windowSizeClass.widthSizeClass
                ) {
                    Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                        SigninScreen(modifier = Modifier.padding(innerPadding))
                    }
                }

            }
        }
    }
}