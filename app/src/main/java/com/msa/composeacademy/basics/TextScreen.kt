package com.msa.composeacademy.basics



import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp
import androidx.compose.ui.text.font.FontWeight

/**
 * صفحه‌ای برای نمایش متن با استفاده از کامپوننت Text
 * این صفحه یک متن ساده را با استفاده از استایل‌های Material Design نمایش می‌دهد.
 */
@Composable
fun TextScreen() {
    // استفاده از Surface برای ایجاد یک پس‌زمینه مناسب
    Surface(modifier = Modifier.fillMaxSize(), color = MaterialTheme.colorScheme.background) {
        Text(
            text = "سلام، Jetpack Compose!",
            style = MaterialTheme.typography.headlineMedium.copy(
                fontSize = 24.sp, // اندازه فونت
                fontWeight = FontWeight.Bold // وزن فونت
            )
        )
    }
}

/**
 * پیش‌نمایش صفحه TextScreen
 * این تابع برای مشاهده پیش‌نمایش کامپوننت در Android Studio استفاده می‌شود.
 */
@Preview(showBackground = true)
@Composable
fun TextScreenPreview() {
    TextScreen()
}