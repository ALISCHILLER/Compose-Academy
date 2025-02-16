package com.msa.composeacademy.animations

import androidx.compose.animation.AnimatedVisibility
import androidx.compose.animation.fadeIn
import androidx.compose.animation.fadeOut
import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

/**
 * صفحه‌ای برای نمایش نحوه استفاده از AnimatedVisibility در Jetpack Compose
 * این صفحه شامل یک دکمه است که با کلیک بر روی آن، یک متن با انیمیشن نمایش یا پنهان می‌شود.
 */
@Composable
fun AnimatedVisibilityScreen() {
    var isVisible by remember { mutableStateOf(false) }

    Surface(modifier = Modifier.fillMaxSize(), color = MaterialTheme.colorScheme.background) {
        Column(
            modifier = Modifier.fillMaxSize(),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Button(onClick = { isVisible = !isVisible }) {
                Text(text = if (isVisible) "پنهان کردن متن" else "نمایش متن")
            }
            Spacer(modifier = Modifier.height(20.dp))

            // نمایش متن با انیمیشن
            AnimatedVisibility(
                visible = isVisible,
                enter = fadeIn(), // انیمیشن ورودی
                exit = fadeOut() // انیمیشن خروجی
            ) {
                Text(text = "این متن با انیمیشن نمایش یا پنهان می‌شود.")
            }
        }
    }
}

/**
 * پیش‌نمایش صفحه AnimatedVisibilityScreen
 */
@Preview(showBackground = true)
@Composable
fun AnimatedVisibilityScreenPreview() {
    AnimatedVisibilityScreen()
}
