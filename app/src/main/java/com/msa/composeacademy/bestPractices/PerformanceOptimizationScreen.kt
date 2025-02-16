package com.msa.composeacademy.bestPractices



import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

/**
 * صفحه‌ای برای توضیح بهینه‌سازی عملکرد در Jetpack Compose
 * این صفحه شامل نکات و تکنیک‌هایی برای بهینه‌سازی عملکرد اپلیکیشن است.
 */
@Composable
fun PerformanceOptimizationScreen() {
    Surface(modifier = Modifier.fillMaxSize(), color = MaterialTheme.colorScheme.background) {
        Column(
            modifier = Modifier.padding(16.dp),
            verticalArrangement = Arrangement.spacedBy(16.dp),
            horizontalAlignment = Alignment.Start
        ) {
            Text(text = "بهینه‌سازی عملکرد در Jetpack Compose", style = MaterialTheme.typography.headlineMedium)

            // نکته 1: استفاده از Lazy Composables
            Text(
                text = "1. استفاده از Lazy Composables: برای لیست‌های بزرگ از LazyColumn و LazyRow استفاده کنید.",
                style = MaterialTheme.typography.bodyMedium
            )
            Text(
                text = "   - LazyColumn به صورت خودکار فقط عناصر قابل مشاهده را بارگذاری می‌کند.",
                style = MaterialTheme.typography.bodySmall
            )

            // نکته 2: کاهش تعداد recompositions
            Text(
                text = "2. کاهش تعداد recompositions: از remember و derivedStateOf برای جلوگیری از recomposition غیرضروری استفاده کنید.",
                style = MaterialTheme.typography.bodyMedium
            )
            Text(
                text = "   - استفاده از remember برای ذخیره وضعیت محاسباتی.",
                style = MaterialTheme.typography.bodySmall
            )

            // نکته 3: استفاده از Modifier
            Text(
                text = "3. استفاده از Modifier: از Modifiers به طور بهینه استفاده کنید تا از ایجاد کامپوننت‌های اضافی جلوگیری شود.",
                style = MaterialTheme.typography.bodyMedium
            )
            Text(
                text = "   - از Modifiers برای تنظیم اندازه، چیدمان و ظاهر استفاده کنید.",
                style = MaterialTheme.typography.bodySmall
            )

            // نکته 4: استفاده از Coroutines
            Text(
                text = "4. استفاده از Coroutines: برای انجام کارهای طولانی‌مدت از Coroutines استفاده کنید تا UI شما روان بماند.",
                style = MaterialTheme.typography.bodyMedium
            )
            Text(
                text = "   - استفاده از viewModelScope برای اجرای Coroutines.",
                style = MaterialTheme.typography.bodySmall
            )

            // نکته 5: پروفایلینگ
            Text(
                text = "5. پروفایلینگ: از ابزارهای پروفایلینگ برای شناسایی و بهینه‌سازی نقاط ضعف عملکرد استفاده کنید.",
                style = MaterialTheme.typography.bodyMedium
            )
            Text(
                text = "   - استفاده از Android Profiler برای شناسایی مشکلات عملکرد.",
                style = MaterialTheme.typography.bodySmall
            )
        }
    }
}

/**
 * پیش‌نمایش صفحه PerformanceOptimizationScreen
 */
@Preview(showBackground = true)
@Composable
fun PerformanceOptimizationScreenPreview() {
    PerformanceOptimizationScreen()
}