package com.msa.composeacademy.animations


import androidx.compose.animation.core.animateFloatAsState
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

/**
 * صفحه‌ای برای نمایش انیمیشن‌های ساده در Jetpack Compose
 * این صفحه شامل یک دایره است که با کلیک بر روی آن اندازه و رنگش تغییر می‌کند.
 */
@Composable
fun SimpleAnimationScreen() {
    var isExpanded by remember { mutableStateOf(false) }
    // انیمیشن اندازه دایره
    val size by animateFloatAsState(targetValue = if (isExpanded) 200f else 100f)
    // انیمیشن رنگ دایره
    val color by animateFloatAsState(targetValue = if (isExpanded) 1f else 0f)

    // تبدیل مقدار رنگ به رنگ واقعی
    val circleColor = Color(0f, color, 0f) // تغییر رنگ از سبز به قرمز

    Surface(modifier = Modifier.fillMaxSize(), color = MaterialTheme.colorScheme.background) {
        Box(
            modifier = Modifier.fillMaxSize(),
            contentAlignment = Alignment.Center
        ) {
            // دایره که با کلیک بر روی آن اندازه و رنگش تغییر می‌کند
            Box(
                modifier = Modifier
                    .size(size.dp)
                    .background(circleColor)
                    .clickable { isExpanded = !isExpanded }
            )
        }
    }
}

/**
 * پیش‌نمایش صفحه SimpleAnimationScreen
 */
@Preview(showBackground = true)
@Composable
fun SimpleAnimationScreenPreview() {
    SimpleAnimationScreen()
}