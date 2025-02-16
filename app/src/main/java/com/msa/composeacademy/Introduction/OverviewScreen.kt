package com.msa.composeacademy.Introduction

import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

/**
 * صفحه‌ای که نمای کلی از سرفصل‌های آموزشی را نمایش می‌دهد.
 */
@Composable
fun OverviewScreen() {
    Surface(modifier = Modifier.fillMaxSize(), color = MaterialTheme.colorScheme.background) {
        Column(
            modifier = Modifier.padding(16.dp),
            verticalArrangement = Arrangement.spacedBy(16.dp),
            horizontalAlignment = Alignment.Start
        ) {
            Text(text = "نمای کلی سرفصل‌های آموزشی", style = MaterialTheme.typography.headlineMedium)
            Text(
                text = "در این دوره، سرفصل‌های زیر پوشش داده خواهد شد:",
                style = MaterialTheme.typography.bodyMedium
            )
            Text(
                text = "1. مقدمه‌ای بر Jetpack Compose",
                style = MaterialTheme.typography.bodyMedium
            )
            Text(
                text = "2. مفاهیم پایه Jetpack Compose",
                style = MaterialTheme.typography.bodyMedium
            )
            Text(
                text = "3. مدیریت وضعیت",
                style = MaterialTheme.typography.bodyMedium
            )
            Text(
                text = "4. چیدمان‌ها و طراحی UI",
                style = MaterialTheme.typography.bodyMedium
            )
            Text(
                text = "5. ناوبری در Jetpack Compose",
                style = MaterialTheme.typography.bodyMedium
            )
            Text(
                text = "6. کار با داده‌ها",
                style = MaterialTheme.typography.bodyMedium
            )
            Text(
                text = "7. انیمیشن‌ها و تعاملات",
                style = MaterialTheme.typography.bodyMedium
            )
            Text(
                text = "8. تست و عیب‌یابی",
                style = MaterialTheme.typography.bodyMedium
            )
            Text(
                text = "9. بهترین شیوه‌ها و نکات پیشرفته",
                style = MaterialTheme.typography.bodyMedium
            )
        }
    }
}

/**
 * پیش‌نمایش صفحه OverviewScreen
 */
@Preview(showBackground = true)
@Composable
fun OverviewScreenPreview() {
    OverviewScreen()
}
