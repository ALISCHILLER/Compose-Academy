package com.msa.composeacademy.basics



import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import com.msa.composeacademy.R

/**
 * صفحه‌ای برای نمایش تصویر با استفاده از کامپوننت Image
 * این صفحه یک تصویر را از منابع drawable بارگذاری و نمایش می‌دهد.
 */
@Composable
fun ImageScreen() {
    // استفاده از Surface برای ایجاد یک پس‌زمینه مناسب
    Surface(modifier = Modifier.fillMaxSize(), color = MaterialTheme.colorScheme.background) {
        Image(
            painter = painterResource(id = R.drawable.ic_launcher_background), // تصویر باید در پوشه drawable قرار گیرد
            contentDescription = "تصویر نمونه" // توضیحات برای دسترسی‌پذیری
        )
    }
}

/**
 * پیش‌نمایش صفحه ImageScreen
 * این تابع برای مشاهده پیش‌نمایش کامپوننت در Android Studio استفاده می‌شود.
 */
@Preview(showBackground = true)
@Composable
fun ImageScreenPreview() {
    ImageScreen()
}