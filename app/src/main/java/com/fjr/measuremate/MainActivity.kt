package com.fjr.measuremate

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.IntrinsicSize
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.Icon
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.fjr.measuremate.presentation.theme.AppTheme
import com.fjr.measuremate.presentation.theme.MeasureMateTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            MeasureMateTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    Greeting(
                        name = "Android",
                        modifier = Modifier.padding(innerPadding)
                    )
                }
            }
        }
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Box(modifier = Modifier.fillMaxWidth(), contentAlignment = Alignment.Center) {
        Row(
            modifier = modifier
                .height(IntrinsicSize.Max)
                .background(
                    AppTheme.color.error,
                    shape = RoundedCornerShape(
                        topStart = AppTheme.radius.extraLarge,
                        topEnd = AppTheme.radius.extraLarge
                    )
                )
                .border(
                    border = BorderStroke(width = AppTheme.dimens.space4, AppTheme.color.primary),
                    shape = RoundedCornerShape(
                        topStart = AppTheme.radius.extraLarge,
                        topEnd = AppTheme.radius.extraLarge
                    )
                )
                .padding(AppTheme.dimens.space24),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.spacedBy(AppTheme.dimens.space8)
        ) {
//            Icon(
//                imageVector = AppTheme.drawable.iconPause,
//                contentDescription = "",
//                tint = AppTheme.color.background
//            )
            Text(
                text = "Hello $name!",
                style = AppTheme.typography.headlineMedium,
                color = AppTheme.color.background,
            )
        }
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    MeasureMateTheme {
        Greeting("Android")
    }
}