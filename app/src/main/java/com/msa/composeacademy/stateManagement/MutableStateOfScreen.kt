package com.msa.composeacademy.stateManagement



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
 * صفحه‌ای برای توضیح نحوه استفاده از mutableStateOf در Jetpack Compose
 * این صفحه یک دکمه برای تغییر رنگ پس‌زمینه صفحه را پیاده‌سازی می‌کند.
 */
@Composable
fun MutableStateOfScreen() {
    // ایجاد یک وضعیت با استفاده از mutableStateOf
    var color by remember { mutableStateOf(Color.White) }

    Surface(modifier = Modifier.fillMaxSize(), color = MaterialTheme.colorScheme.background) {
        Column(
            modifier = Modifier
                .fillMaxSize()
                .background(color)
                .padding(16.dp),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Text(text = "رنگ پس‌زمینه فعلی: ${if (color == Color.White) "سفید" else "آبی"}", style = MaterialTheme.typography.headlineMedium)
            Spacer(modifier = Modifier.height(16.dp))
            Button(onClick = { color = if (color == Color.White) Color.Blue else Color.White }) {
                Text(text = "تغییر رنگ پس‌زمینه")
            }
        }
    }
}

/**
 * پیش‌نمایش صفحه MutableStateOfScreen
 * این تابع برای مشاهده پیش‌نمایش کامپوننت در Android Studio استفاده می‌شود.
 */
@Preview(showBackground = true)
@Composable
fun MutableStateOfScreenPreview() {
    MutableStateOfScreen()
}