package com.msa.composeacademy.basics


import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview

/**
 * صفحه‌ای برای نمایش دکمه با استفاده از کامپوننت Button
 * این صفحه یک دکمه ساده را نمایش می‌دهد که کاربر می‌تواند بر روی آن کلیک کند.
 */
@Composable
fun ButtonScreen() {
    // استفاده از Surface برای ایجاد یک پس‌زمینه مناسب
    Surface(modifier = Modifier.fillMaxSize(), color = MaterialTheme.colorScheme.background) {
        Button(onClick = {
            // TODO: مدیریت کلیک دکمه
            println("دکمه کلیک شد!") // در اینجا می‌توانید عملکرد دکمه را پیاده‌سازی کنید
        }) {
            Text(text = "کلیک کن")
        }
    }
}

/**
 * پیش‌نمایش صفحه ButtonScreen
 * این تابع برای مشاهده پیش‌نمایش کامپوننت در Android Studio استفاده می‌شود.
 */
@Preview(showBackground = true)
@Composable
fun ButtonScreenPreview() {
    ButtonScreen()
}