package com.msa.composeacademy.animations



import androidx.compose.animation.animateColor
import androidx.compose.animation.core.*
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
 * صفحه‌ای برای نمایش انیمیشن‌های پیشرفته در Jetpack Compose
 * این صفحه شامل یک دایره است که رنگ، اندازه و موقعیتش با انیمیشن تغییر می‌کند.
 */
@Composable
fun AdvancedAnimationScreen() {
    var isExpanded by remember { mutableStateOf(false) }
    val transitionState = remember { MutableTransitionState(false) }
    transitionState.targetState = isExpanded

    // تعریف انیمیشن
    val transition = updateTransition(transitionState, label = "Transition")
    val size by transition.animateDp(label = "Size") { state ->
        if (state) 200.dp else 100.dp
    }
    val color by transition.animateColor(label = "Color") { state ->
        if (state) Color.Red else Color.Blue
    }
    val offsetX by transition.animateDp(label = "OffsetX") { state ->
        if (state) 100.dp else 0.dp
    }

    Surface(modifier = Modifier.fillMaxSize(), color = MaterialTheme.colorScheme.background) {
        Box(
            modifier = Modifier.fillMaxSize(),
            contentAlignment = Alignment.Center
        ) {
            // دایره که رنگ، اندازه و موقعیتش با انیمیشن تغییر می‌کند
            Box(
                modifier = Modifier
                    .size(size)
                    .offset(x = offsetX)
                    .background(color)
                    .clickable {
                        isExpanded = !isExpanded
                        transitionState.targetState = isExpanded
                    }
            )
        }
    }
}

/**
 * پیش‌نمایش صفحه AdvancedAnimationScreen
 */
@Preview(showBackground = true)
@Composable
fun AdvancedAnimationScreenPreview() {
    AdvancedAnimationScreen()
}