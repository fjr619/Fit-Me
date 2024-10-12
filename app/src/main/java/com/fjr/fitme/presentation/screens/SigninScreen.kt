package com.fjr.fitme.presentation.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.material3.windowsizeclass.WindowWidthSizeClass
import androidx.compose.runtime.Composable
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.vectorResource
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.unit.dp
import com.fjr.fitme.R
import com.fjr.fitme.presentation.components.AnonymousSignInButton
import com.fjr.fitme.presentation.components.GoogleSignInButton
import com.fjr.fitme.presentation.theme.AppTheme
import com.fjr.fitme.presentation.util.LocalWindowSize

@Composable
fun SigninScreen(
    modifier: Modifier = Modifier
) {
    val windowSize = LocalWindowSize.current

//    when (windowSize.widthSizeClass) {
//        WindowWidthSizeClass.Compact -> {
            Column(
                modifier = modifier.fillMaxSize(),
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.SpaceAround
            ) {
                Column(
                    horizontalAlignment = Alignment.CenterHorizontally,
                ) {
                    Image(
                        imageVector = ImageVector.vectorResource(id = R.drawable.logo),
                        contentDescription = "App Logo",
                        modifier = Modifier
                            .size(150.dp)                 // Limit the container size to 120.dp
                            .clip(CircleShape),           // Clip to circular shape
                        contentScale = ContentScale.FillBounds,
                        colorFilter = ColorFilter.tint(AppTheme.color.primary)


                    )
                    Spacer(modifier = Modifier.height(AppTheme.dimens.space24))
                    Text(
                        text = "Fit Me",
                        style = MaterialTheme.typography.headlineLarge
                    )
                    Text(
                        text = "Aim for better, not perfect",
                        style = MaterialTheme.typography.bodyLarge.copy(fontStyle = FontStyle.Italic),
                    )
                }
                Column(
                    horizontalAlignment = Alignment.CenterHorizontally,
                ) {
                    GoogleSignInButton(
                        onClick = {}
                    )
                    Spacer(modifier = Modifier.height(20.dp))
                    AnonymousSignInButton(
                        onClick = {}
                    )
                }
//            }
//        }
//
//        else -> {

//        }
    }
}