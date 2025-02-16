package com.msa.composeacademy.finalProject



import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

/**
 * صفحه‌ای که جزئیات پروژه نهایی را توضیح می‌دهد.
 */
@Composable
fun FinalProjectDetails() {
    Surface(modifier = Modifier.fillMaxSize(), color = MaterialTheme.colorScheme.background) {
        Column(
            modifier = Modifier.padding(16.dp),
            verticalArrangement = Arrangement.spacedBy(16.dp),
            horizontalAlignment = Alignment.Start
        ) {
            Text(text = "جزئیات پروژه نهایی", style = MaterialTheme.typography.headlineMedium)
            Text(
                text = "این پروژه شامل یک اپلیکیشن مدیریت وظایف (To-Do List) است که به کاربران "
                        + "اجازه می‌دهد وظایف خود را اضافه، ویرایش و حذف کنند.",
                style = MaterialTheme.typography.bodyMedium
            )
            Text(
                text = "ویژگی‌های کلیدی اپلیکیشن شامل:",
                style = MaterialTheme.typography.bodyMedium
            )
            Text(
                text = "1. افزودن وظایف جدید با استفاده از فیلد ورودی",
                style = MaterialTheme.typography.bodyMedium
            )
            Text(
                text = "2. مشاهده لیست وظایف با قابلیت فیلتر کردن",
                style = MaterialTheme.typography.bodyMedium
            )
            Text(
                text = "3. ویرایش و حذف وظایف موجود",
                style = MaterialTheme.typography.bodyMedium
            )
            Text(
                text = "4. ذخیره‌سازی داده‌ها در Room Database",
                style = MaterialTheme.typography.bodyMedium
            )
            Text(
                text = "5. استفاده از ViewModel برای مدیریت وضعیت اپلیکیشن",
                style = MaterialTheme.typography.bodyMedium
            )
            Spacer(modifier = Modifier.height(16.dp))
            Button(onClick = { /* Navigate to project resources */ }) {
                Text("منابع پروژه نهایی")
            }
        }
    }
}

/**
 * پیش‌نمایش صفحه FinalProjectDetails
 */
@Preview(showBackground = true)
@Composable
fun FinalProjectDetailsPreview() {
    FinalProjectDetails()
}