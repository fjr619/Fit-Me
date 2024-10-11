package com.fjr.fitme.presentation.util

import androidx.compose.material3.windowsizeclass.WindowSizeClass
import androidx.compose.runtime.staticCompositionLocalOf

val LocalWindowSize = staticCompositionLocalOf<WindowSizeClass> { error("No WindowSizeClass provided") }
