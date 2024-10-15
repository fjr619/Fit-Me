package com.fjr.fitme

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.windowsizeclass.ExperimentalMaterial3WindowSizeClassApi
import androidx.compose.material3.windowsizeclass.calculateWindowSizeClass
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.ui.Modifier
import androidx.core.splashscreen.SplashScreen.Companion.installSplashScreen
import com.fjr.fitme.presentation.screens.signin.SigninScreen
import com.fjr.fitme.presentation.theme.FitMeTheme
import com.fjr.fitme.presentation.util.LocalWindowWidthSize

class MainActivity : ComponentActivity() {
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