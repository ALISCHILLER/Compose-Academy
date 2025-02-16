package com.msa.composeacademy.stateManagement



import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.compose.ui.tooling.preview.Preview

/**
 * صفحه‌ای برای توضیح مفاهیم پایه وضعیت (State) در Jetpack Compose
 * این صفحه یک شمارشگر با قابلیت افزایش و ریست کردن را پیاده‌سازی می‌کند.
 */
@Composable
fun StateBasicsScreen() {
    // ایجاد یک وضعیت محلی با استفاده از remember و mutableStateOf
    val count = remember { mutableStateOf(0) }

    Surface(modifier = Modifier.fillMaxSize(), color = MaterialTheme.colorScheme.background) {
        Column(
            modifier = Modifier.padding(16.dp),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center
        ) {
            Text(text = "شمارش: ${count.value}", style = MaterialTheme.typography.headlineMedium)
            Spacer(modifier = Modifier.height(16.dp))
            Row {
                Button(onClick = { count.value++ }) {
                    Text(text = "افزایش شمارش")
                }
                Spacer(modifier = Modifier.width(8.dp))
                Button(onClick = { count.value = 0 }) {
                    Text(text = "ریست شمارش")
                }
            }
        }
    }
}

/**
 * پیش‌نمایش صفحه StateBasicsScreen
 * این تابع برای مشاهده پیش‌نمایش کامپوننت در Android Studio استفاده می‌شود.
 */
@Preview(showBackground = true)
@Composable
fun StateBasicsScreenPreview() {
    StateBasicsScreen()
}