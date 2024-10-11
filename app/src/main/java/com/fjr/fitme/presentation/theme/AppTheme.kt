package com.fjr.fitme.presentation.theme

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material3.ColorScheme
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Typography
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.runtime.ReadOnlyComposable

object AppTheme {
    val color: AppColor
        @Composable
        @ReadOnlyComposable
        get() = LocalColor.current

    val typography: Typography
        @Composable
        @ReadOnlyComposable
        get() = LocalTypography.current

    val dimens: AppDimens
        @Composable
        @ReadOnlyComposable
        get() = LocalDimens.current

    val radius: AppRadius
        @Composable
        @ReadOnlyComposable
        get() = LocalRadius.current

    val drawable: AppDrawable
        @Composable
        @ReadOnlyComposable
        get() = LocalDrawable.current
}

@Composable
fun FitMeTheme(
    darkTheme: Boolean = isSystemInDarkTheme(),
    // Dynamic color is available on Android 12+
    dynamicColor: Boolean = false,
    content: @Composable () -> Unit
) {
    val colorScheme: ColorScheme
    val appColor: AppColor


    when {
//        dynamicColor && Build.VERSION.SDK_INT >= Build.VERSION_CODES.S -> {
//            val context = LocalContext.current
//            if (darkTheme) dynamicDarkColorScheme(context) else dynamicLightColorScheme(context)
//        }

        darkTheme -> {
            colorScheme = DarkColors
            appColor = AppColorDark()
        }
        else -> {
            colorScheme = LightColors
            appColor = AppColorLight()
        }
    }

    CompositionLocalProvider(
        LocalColor provides appColor,
    ) {
        MaterialTheme(
            colorScheme = colorScheme,
            typography = AppTheme.typography,
            content = content
        )
    }
}