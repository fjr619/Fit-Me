package com.fjr.fitme.presentation.theme

import androidx.compose.runtime.Composable
import androidx.compose.runtime.Immutable
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.res.vectorResource
import com.fjr.fitme.R

@Immutable
class AppDrawable {
    /**
     * example
     *
     *     val iconMusicUnknown: ImageVector
     *         @Composable
     *         get() = ImageVector.vectorResource(id = R.drawable.ic_music_unknown)
     */
    
    val logo: ImageVector
    @Composable
    get() = ImageVector.vectorResource(id = R.drawable.logo)
}