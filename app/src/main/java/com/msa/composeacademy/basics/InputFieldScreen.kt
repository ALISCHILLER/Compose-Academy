package com.msa.composeacademy.basics


import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.getValue
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Text

/**
 * صفحه‌ای برای نمایش فیلد ورودی با استفاده از کامپوننت TextField
 * این صفحه به کاربر اجازه می‌دهد تا متنی را وارد کند و وضعیت آن را مدیریت می‌کند.
 */
@Composable
fun InputFieldScreen() {
    var text by remember { mutableStateOf("") } // مدیریت وضعیت متن ورودی

    // استفاده از Surface برای ایجاد یک پس‌زمینه مناسب
    Surface(modifier = Modifier.fillMaxSize(), color = MaterialTheme.colorScheme.background) {
        TextField(
            value = text, // مقدار فعلی فیلد ورودی
            onValueChange = { text = it }, // به‌روزرسانی وضعیت متن هنگام تغییر
            label = { Text("متن را وارد کنید") }, // برچسب فیلد ورودی
            placeholder = { Text("چیزی تایپ کنید...") } // متن پیش‌فرض
        )
    }
}

/**
 * پیش‌نمایش صفحه InputFieldScreen
 * این تابع برای مشاهده پیش‌نمایش کامپوننت در Android Studio استفاده می‌شود.
 */
@Preview(showBackground = true)
@Composable
fun InputFieldScreenPreview() {
    InputFieldScreen()
}