@file:OptIn(ExperimentalAnimationApi::class, ExperimentalMaterial3Api::class)
package com.msa.composeacademy.animations





import androidx.compose.animation.ExperimentalAnimationApi
import androidx.compose.animation.animateColor
import androidx.compose.animation.core.*
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Composable
fun CustomAnimationsScreen() {
    var isAnimating by remember { mutableStateOf(false) }

    // انیمیشن سفارشی
    val transition = updateTransition(targetState = isAnimating, label = "Animation Transition")

    val size by transition.animateDp(label = "Box Size") { state ->
        if (state) 200.dp else 100.dp
    }

    val color by transition.animateColor(label = "Box Color") { state ->
        if (state) MaterialTheme.colorScheme.primary else MaterialTheme.colorScheme.secondary
    }

    Scaffold(
        topBar = {
            TopAppBar(
                title = { Text("ایجاد انیمیشن‌های سفارشی") },
                colors = TopAppBarDefaults.topAppBarColors(
                    containerColor = MaterialTheme.colorScheme.primary
                )
            )
        }
    ) { paddingValues ->
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(paddingValues)
                .padding(16.dp),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Button(onClick = { isAnimating = !isAnimating }) {
                Text(text = if (isAnimating) "کوچک کردن" else "بزرگ کردن")
            }

            Spacer(modifier = Modifier.height(20.dp))

            Box(
                modifier = Modifier
                    .size(size)
                    .background(color),
                contentAlignment = Alignment.Center
            ) {
                Text(text = "انیمیشن سفارشی", color = MaterialTheme.colorScheme.onPrimary)
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun CustomAnimationsScreenPreview() {
    CustomAnimationsScreen()
}