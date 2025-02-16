package com.msa.composeacademy.advancedTopics



import androidx.compose.animation.animateColor
import androidx.compose.animation.core.*
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

/**
 * صفحه‌ای برای توضیح انیمیشن‌های پیچیده در Jetpack Compose
 * این صفحه شامل مثال‌هایی از استفاده از Animatable و transition است.
 */
@Composable
fun ComplexAnimationsScreen() {
    var isExpanded by remember { mutableStateOf(false) }
    val transition = updateTransition(targetState = isExpanded, label = "ExpansionTransition")

    val size by transition.animateDp(label = "Size") { state ->
        if (state) 200.dp else 100.dp
    }

    val color by transition.animateColor(label = "Color") { state ->
        if (state) Color.Red else Color.Blue
    }

    Surface(modifier = Modifier.fillMaxSize(), color = MaterialTheme.colorScheme.background) {
        Column(
            modifier = Modifier.fillMaxSize(),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Box(
                modifier = Modifier
                    .size(size)
                    .background(color)
            )
            Spacer(modifier = Modifier.height(16.dp))
            Button(onClick = { isExpanded = !isExpanded }) {
                Text("تغییر اندازه و رنگ")
            }
        }
    }
}

/**
 * پیش‌نمایش صفحه ComplexAnimationsScreen
 */
@Preview(showBackground = true)
@Composable
fun ComplexAnimationsScreenPreview() {
    ComplexAnimationsScreen()
}