package com.fjr.fitme.presentation.theme

import androidx.compose.material3.darkColorScheme
import androidx.compose.material3.lightColorScheme
import androidx.compose.runtime.Immutable
import androidx.compose.ui.graphics.Color

@Immutable
abstract class AppColor {
    abstract val primary: Color
    abstract val onPrimary: Color
    abstract val primaryContainer: Color
    abstract val onPrimaryContainer: Color
    abstract val inversePrimary: Color
    abstract val secondary: Color
    abstract val onSecondary: Color
    abstract val secondaryContainer: Color
    abstract val onSecondaryContainer: Color
    abstract val tertiary: Color
    abstract val onTertiary: Color
    abstract val tertiaryContainer: Color
    abstract val onTertiaryContainer: Color
    abstract val background: Color
    abstract val onBackground: Color
    abstract val surface: Color
    abstract val onSurface: Color
    abstract val surfaceVariant: Color
    abstract val onSurfaceVariant: Color
    abstract val inverseSurface: Color
    abstract val inverseOnSurface: Color
    abstract val error: Color
    abstract val onError: Color
    abstract val errorContainer: Color
    abstract val onErrorContainer: Color
    abstract val outline: Color
    abstract val outlineVariant: Color
    abstract val scrim: Color
    abstract val surfaceBright: Color
    abstract val surfaceContainer: Color
    abstract val surfaceContainerHigh: Color
    abstract val surfaceContainerHighest: Color
    abstract val surfaceContainerLow: Color
    abstract val surfaceContainerLowest: Color
    abstract val surfaceDim: Color

    //add custom color in here
}

@Immutable
internal class AppColorLight() : AppColor() {
    override val primary: Color
        get() = Color(0xFF00677C)
    override val onPrimary: Color
        get() = Color(0xFFFFFFFF)
    override val primaryContainer: Color
        get() = Color(0xFFB1ECFF)
    override val onPrimaryContainer: Color
        get() = Color(0xFF001F27)
    override val inversePrimary: Color
        get() = Color(0xFF86D1E9)
    override val secondary: Color
        get() = Color(0xFF48672F)
    override val onSecondary: Color
        get() = Color(0xFFFFFFFF)
    override val secondaryContainer: Color
        get() = Color(0xFFC9EEA7)
    override val onSecondaryContainer: Color
        get() = Color(0xFF0C2000)
    override val tertiary: Color
        get() = Color(0xFF8C4F27)
    override val onTertiary: Color
        get() = Color(0xFFFFFFFF)
    override val tertiaryContainer: Color
        get() = Color(0xFFFFDBC8)
    override val onTertiaryContainer: Color
        get() = Color(0xFF321200)
    override val background: Color
        get() = Color(0xFFF5FAFD)
    override val onBackground: Color
        get() = Color(0xFF171C1E)
    override val surface: Color
        get() = Color(0xFFF5FAFD)
    override val onSurface: Color
        get() = Color(0xFF171C1E)
    override val surfaceVariant: Color
        get() = Color(0xFFDBE4E8)
    override val onSurfaceVariant: Color
        get() = Color(0xFF40484B)
    override val inverseSurface: Color
        get() = Color(0xFF2C3133)
    override val inverseOnSurface: Color
        get() = Color(0xFFECF1F4)
    override val error: Color
        get() = Color(0xFF8F4A4F)
    override val onError: Color
        get() = Color(0xFFFFFFFF)
    override val errorContainer: Color
        get() = Color(0xFFFFDADA)
    override val onErrorContainer: Color
        get() = Color(0xFF3B0810)
    override val outline: Color
        get() = Color(0xFF70787C)
    override val outlineVariant: Color
        get() = Color(0xFFBFC8CC)
    override val scrim: Color
        get() = Color(0xFF000000)
    override val surfaceBright: Color
        get() = Color(0xFFF5FAFD)
    override val surfaceContainer: Color
        get() = Color(0xFFEAEFF1)
    override val surfaceContainerHigh: Color
        get() = Color(0xFFE4E9EB)
    override val surfaceContainerHighest: Color
        get() = Color(0xFFDEE3E6)
    override val surfaceContainerLow: Color
        get() = Color(0xFFEFF4F7)
    override val surfaceContainerLowest: Color
        get() = Color(0xFFFFFFFF)
    override val surfaceDim: Color
        get() = Color(0xFFD6DBDD)
}

@Immutable
internal class AppColorDark() : AppColor() {
    override val primary: Color
        get() = Color(0xFF86D1E9)
    override val onPrimary: Color
        get() = Color(0xFF003641)
    override val primaryContainer: Color
        get() = Color(0xFF004E5E)
    override val onPrimaryContainer: Color
        get() = Color(0xFFB1ECFF)
    override val inversePrimary: Color
        get() = Color(0xFF00677C)
    override val secondary: Color
        get() = Color(0xFFADD18D)
    override val onSecondary: Color
        get() = Color(0xFF1B3704)
    override val secondaryContainer: Color
        get() = Color(0xFF314E19)
    override val onSecondaryContainer: Color
        get() = Color(0xFFC9EEA7)
    override val tertiary: Color
        get() = Color(0xFFFFB68B)
    override val onTertiary: Color
        get() = Color(0xFFFFB68B)
    override val tertiaryContainer: Color
        get() = Color(0xFF6F3811)
    override val onTertiaryContainer: Color
        get() = Color(0xFFFFDBC8)
    override val background: Color
        get() = Color(0xFF0F1416)
    override val onBackground: Color
        get() = Color(0xFFDEE3E6)
    override val surface: Color
        get() = Color(0xFFDEE3E6)
    override val onSurface: Color
        get() = Color(0xFFDEE3E6)
    override val surfaceVariant: Color
        get() = Color(0xFF40484B)
    override val onSurfaceVariant: Color
        get() = Color(0xFFBFC8CC)
    override val inverseSurface: Color
        get() = Color(0xFFDEE3E6)
    override val inverseOnSurface: Color
        get() = Color(0xFF2C3133)
    override val error: Color
        get() = Color(0xFFFFB3B6)
    override val onError: Color
        get() = Color(0xFF561D23)
    override val errorContainer: Color
        get() = Color(0xFF723338)
    override val onErrorContainer: Color
        get() = Color(0xFFFFDADA)
    override val outline: Color
        get() = Color(0xFF899296)
    override val outlineVariant: Color
        get() = Color(0xFF40484B)
    override val scrim: Color
        get() = Color(0xFF000000)
    override val surfaceBright: Color
        get() = Color(0xFF343A3C)
    override val surfaceContainer: Color
        get() = Color(0xFF1B2022)
    override val surfaceContainerHigh: Color
        get() = Color(0xFF252B2D)
    override val surfaceContainerHighest: Color
        get() = Color(0xFF303638)
    override val surfaceContainerLow: Color
        get() = Color(0xFF171C1E)
    override val surfaceContainerLowest: Color
        get() = Color(0xFF090F11)
    override val surfaceDim: Color
        get() = Color(0xFF0F1416)
}


internal val LightColors = lightColorScheme(
    primary = AppColorLight().primary,
    onPrimary = AppColorLight().onPrimary,
    primaryContainer = AppColorLight().primaryContainer,
    onPrimaryContainer = AppColorLight().onPrimaryContainer,
    secondary = AppColorLight().secondary,
    onSecondary = AppColorLight().onSecondary,
    secondaryContainer = AppColorLight().secondaryContainer,
    onSecondaryContainer = AppColorLight().onSecondaryContainer,
    tertiary = AppColorLight().tertiary,
    onTertiary = AppColorLight().onTertiary,
    tertiaryContainer = AppColorLight().tertiaryContainer,
    onTertiaryContainer = AppColorLight().onTertiaryContainer,
    error = AppColorLight().error,
    onError = AppColorLight().onError,
    errorContainer = AppColorLight().errorContainer,
    onErrorContainer = AppColorLight().onErrorContainer,
    background = AppColorLight().background,
    onBackground = AppColorLight().onBackground,
    surface = AppColorLight().surface,
    onSurface = AppColorLight().onSurface,
    surfaceVariant = AppColorLight().surfaceVariant,
    onSurfaceVariant = AppColorLight().onSurfaceVariant,
    outline = AppColorLight().outline,
    outlineVariant = AppColorLight().outlineVariant,
    scrim = AppColorLight().scrim,
    inverseSurface = AppColorLight().inverseSurface,
    inverseOnSurface = AppColorLight().inverseOnSurface,
    inversePrimary = AppColorLight().inversePrimary,
    surfaceDim = AppColorLight().surfaceDim,
    surfaceBright = AppColorLight().surfaceBright,
    surfaceContainerLowest = AppColorLight().surfaceContainerLowest,
    surfaceContainerLow = AppColorLight().surfaceContainerLow,
    surfaceContainer = AppColorLight().surfaceContainer,
    surfaceContainerHigh = AppColorLight().surfaceContainerHigh,
    surfaceContainerHighest = AppColorLight().surfaceContainerHighest,
)

internal val DarkColors = darkColorScheme(
    primary = AppColorDark().primary,
    onPrimary = AppColorDark().onPrimary,
    primaryContainer = AppColorDark().primaryContainer,
    onPrimaryContainer = AppColorDark().onPrimaryContainer,
    secondary = AppColorDark().secondary,
    onSecondary = AppColorDark().onSecondary,
    secondaryContainer = AppColorDark().secondaryContainer,
    onSecondaryContainer = AppColorDark().onSecondaryContainer,
    tertiary = AppColorDark().tertiary,
    onTertiary = AppColorDark().onTertiary,
    tertiaryContainer = AppColorDark().tertiaryContainer,
    onTertiaryContainer = AppColorDark().onTertiaryContainer,
    error = AppColorDark().error,
    onError = AppColorDark().onError,
    errorContainer = AppColorDark().errorContainer,
    onErrorContainer = AppColorDark().onErrorContainer,
    background = AppColorDark().background,
    onBackground = AppColorDark().onBackground,
    surface = AppColorDark().surface,
    onSurface = AppColorDark().onSurface,
    surfaceVariant = AppColorDark().surfaceVariant,
    onSurfaceVariant = AppColorDark().onSurfaceVariant,
    outline = AppColorDark().outline,
    outlineVariant = AppColorDark().outlineVariant,
    scrim = AppColorDark().scrim,
    inverseSurface = AppColorDark().inverseSurface,
    inverseOnSurface = AppColorDark().inverseOnSurface,
    inversePrimary = AppColorDark().inversePrimary,
    surfaceDim = AppColorDark().surfaceDim,
    surfaceBright = AppColorDark().surfaceBright,
    surfaceContainerLowest = AppColorDark().surfaceContainerLowest,
    surfaceContainerLow = AppColorDark().surfaceContainerLow,
    surfaceContainer = AppColorDark().surfaceContainer,
    surfaceContainerHigh = AppColorDark().surfaceContainerHigh,
    surfaceContainerHighest = AppColorDark().surfaceContainerHighest,
)
