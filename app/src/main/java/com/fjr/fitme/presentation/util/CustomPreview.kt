package com.fjr.fitme.presentation.util

import android.content.res.Configuration
import androidx.compose.ui.tooling.preview.Preview

@Preview(
    apiLevel = 33,
    name = "LightMode",
    uiMode = Configuration.UI_MODE_NIGHT_NO,
    showBackground = true,
    group = "UIMode"
)
@Preview(
    apiLevel = 33,
    name = "DarkMode",
    uiMode = Configuration.UI_MODE_NIGHT_YES,
    showBackground = true,
    group = "UIMode"
)
annotation class LightAndDarkPreview