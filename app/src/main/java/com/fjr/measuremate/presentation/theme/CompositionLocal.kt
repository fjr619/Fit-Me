package com.fjr.measuremate.presentation.theme

import androidx.compose.runtime.ProvidableCompositionLocal
import androidx.compose.runtime.staticCompositionLocalOf

internal val LocalColor: ProvidableCompositionLocal<AppColor> = staticCompositionLocalOf { AppColorLight() }
internal val LocalTypography  = staticCompositionLocalOf { AppTypo }
internal val LocalDimens = staticCompositionLocalOf { AppDimens() }
internal val LocalRadius = staticCompositionLocalOf { AppRadius() }
internal val LocalDrawable = staticCompositionLocalOf { AppDrawable() }