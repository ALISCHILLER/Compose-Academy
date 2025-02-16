package com.msa.composeacademy.finalProject



import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

/**
 * صفحه‌ای که پروژه نهایی را معرفی می‌کند.
 */
@Composable
fun FinalProjectScreen() {
    Surface(modifier = Modifier.fillMaxSize(), color = MaterialTheme.colorScheme.background) {
        Column(
            modifier = Modifier.padding(16.dp),
            verticalArrangement = Arrangement.spacedBy(16.dp),
            horizontalAlignment = Alignment.Start
        ) {
            Text(text = "پروژه نهایی Jetpack Compose", style = MaterialTheme.typography.headlineMedium)
            Text(
                text = "در این پروژه نهایی، شما یک اپلیکیشن کامل با استفاده از Jetpack Compose "
                        + "ایجاد خواهید کرد که شامل ویژگی‌های زیر است:",
                style = MaterialTheme.typography.bodyMedium
            )
            Text(
                text = "1. طراحی UI با استفاده از کامپوننت‌های Jetpack Compose",
                style = MaterialTheme.typography.bodyMedium
            )
            Text(
                text = "2. مدیریت وضعیت با استفاده از ViewModel و LiveData",
                style = MaterialTheme.typography.bodyMedium
            )
            Text(
                text = "3. ناوبری بین صفحات مختلف اپلیکیشن",
                style = MaterialTheme.typography.bodyMedium
            )
            Text(
                text = "4. ذخیره‌سازی داده‌ها با استفاده از Room Database",
                style = MaterialTheme.typography.bodyMedium
            )
            Text(
                text = "5. انیمیشن‌ها و تعاملات کاربر",
                style = MaterialTheme.typography.bodyMedium
            )
            Text(
                text = "6. تست و عیب‌یابی اپلیکیشن",
                style = MaterialTheme.typography.bodyMedium
            )
            Spacer(modifier = Modifier.height(16.dp))
            Button(onClick = { /* Navigate to project details */ }) {
                Text("جزئیات پروژه نهایی")
            }
        }
    }
}

/**
 * پیش‌نمایش صفحه FinalProjectScreen
 */
@Preview(showBackground = true)
@Composable
fun FinalProjectScreenPreview() {
    FinalProjectScreen()
}