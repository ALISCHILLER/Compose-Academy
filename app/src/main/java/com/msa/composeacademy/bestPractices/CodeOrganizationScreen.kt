package com.msa.composeacademy.bestPractices



import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

/**
 * صفحه‌ای برای توضیح نحوه سازماندهی کد در Jetpack Compose
 * این صفحه شامل نکات و بهترین شیوه‌ها برای سازماندهی پروژه است.
 */
@Composable
fun CodeOrganizationScreen() {
    Surface(modifier = Modifier.fillMaxSize(), color = MaterialTheme.colorScheme.background) {
        Column(
            modifier = Modifier.padding(16.dp),
            verticalArrangement = Arrangement.spacedBy(16.dp),
            horizontalAlignment = Alignment.Start
        ) {
            Text(text = "سازماندهی کد در Jetpack Compose", style = MaterialTheme.typography.headlineMedium)

            // نکته 1: استفاده از ساختار پوشه‌ای منطقی
            Text(
                text = "1. استفاده از ساختار پوشه‌ای منطقی: پوشه‌ها را بر اساس ویژگی‌ها یا ماژول‌ها سازماندهی کنید.",
                style = MaterialTheme.typography.bodyMedium
            )
            Text(
                text = "   - هر ماژول باید شامل فایل‌های مرتبط با خود باشد.",
                style = MaterialTheme.typography.bodySmall
            )

            // نکته 2: تفکیک کامپوننت‌ها
            Text(
                text = "2. تفکیک کامپوننت‌ها: کامپوننت‌های UI را به صورت مجزا و قابل استفاده مجدد ایجاد کنید.",
                style = MaterialTheme.typography.bodyMedium
            )
            Text(
                text = "   - از کامپوننت‌های کوچک و مستقل استفاده کنید.",
                style = MaterialTheme.typography.bodySmall
            )

            // نکته 3: استفاده از ViewModel
            Text(
                text = "3. استفاده از ViewModel: از ViewModel برای مدیریت وضعیت و داده‌ها استفاده کنید.",
                style = MaterialTheme.typography.bodyMedium
            )
            Text(
                text = "   - ViewModel باید مستقل از UI باشد.",
                style = MaterialTheme.typography.bodySmall
            )

            // نکته 4: مستندسازی
            Text(
                text = "4. مستندسازی: کد خود را مستند کنید تا دیگران بتوانند به راحتی آن را درک کنند.",
                style = MaterialTheme.typography.bodyMedium
            )
            Text(
                text = "   - از کدهای کامنتی و مستندات خارجی استفاده کنید.",
                style = MaterialTheme.typography.bodySmall
            )

            // نکته 5: استفاده از ابزارهای lint
            Text(
                text = "5. استفاده از ابزارهای lint: از ابزارهای lint برای شناسایی و اصلاح مشکلات کد استفاده کنید.",
                style = MaterialTheme.typography.bodyMedium
            )
            Text(
                text = "   - lint به شما کمک می‌کند تا مشکلات رایج را شناسایی کنید.",
                style = MaterialTheme.typography.bodySmall
            )
        }
    }
}

/**
 * پیش‌نمایش صفحه CodeOrganizationScreen
 */
@Preview(showBackground = true)
@Composable
fun CodeOrganizationScreenPreview() {
    CodeOrganizationScreen()
}