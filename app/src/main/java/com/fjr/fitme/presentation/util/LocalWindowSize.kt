package com.fjr.fitme.presentation.util

import androidx.compose.material3.windowsizeclass.WindowSizeClass
import androidx.compose.material3.windowsizeclass.WindowWidthSizeClass
import androidx.compose.runtime.staticCompositionLocalOf

val LocalWindowWidthSize = staticCompositionLocalOf<WindowWidthSizeClass> { error("No WindowSizeClass provided") }
