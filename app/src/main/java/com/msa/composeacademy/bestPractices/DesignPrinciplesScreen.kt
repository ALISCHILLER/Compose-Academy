package com.msa.composeacademy.bestPractices



import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

/**
 * صفحه‌ای برای توضیح اصول طراحی در Jetpack Compose
 * این صفحه شامل نکات و اصول طراحی متریال و UI است.
 */
@Composable
fun DesignPrinciplesScreen() {
    Surface(modifier = Modifier.fillMaxSize(), color = MaterialTheme.colorScheme.background) {
        Column(
            modifier = Modifier.padding(16.dp),
            verticalArrangement = Arrangement.spacedBy(16.dp),
            horizontalAlignment = Alignment.Start
        ) {
            Text(text = "اصول طراحی در Jetpack Compose", style = MaterialTheme.typography.headlineMedium)

            // بخش اول: طراحی متریال
            Text(
                text = "1. طراحی متریال: از اصول طراحی متریال برای ایجاد UI زیبا و کاربرپسند استفاده کنید.",
                style = MaterialTheme.typography.bodyMedium
            )
            Text(
                text = "   - استفاده از رنگ‌های متناسب با تم و طراحی.",
                style = MaterialTheme.typography.bodySmall
            )
            Text(
                text = "   - استفاده از انیمیشن‌های ملایم برای انتقالات.",
                style = MaterialTheme.typography.bodySmall
            )

            // بخش دوم: دسترسی‌پذیری
            Text(
                text = "2. دسترسی‌پذیری: اطمینان حاصل کنید که اپلیکیشن شما برای همه کاربران قابل دسترسی باشد.",
                style = MaterialTheme.typography.bodyMedium
            )
            Text(
                text = "   - استفاده از توصیف‌های صوتی برای عناصر UI.",
                style = MaterialTheme.typography.bodySmall
            )
            Text(
                text = "   - اطمینان از اینکه رنگ‌ها برای افراد با اختلالات بینایی مناسب هستند.",
                style = MaterialTheme.typography.bodySmall
            )

            // بخش سوم: پاسخگویی
            Text(
                text = "3. پاسخگویی: UI شما باید به اندازه صفحه نمایش و دستگاه‌های مختلف پاسخگو باشد.",
                style = MaterialTheme.typography.bodyMedium
            )
            Text(
                text = "   - استفاده از Modifiers برای تنظیم اندازه و چیدمان.",
                style = MaterialTheme.typography.bodySmall
            )
            Text(
                text = "   - تست UI در اندازه‌های مختلف صفحه نمایش.",
                style = MaterialTheme.typography.bodySmall
            )

            // بخش چهارم: سادگی
            Text(
                text = "4. سادگی: طراحی‌های ساده و کاربرپسند را ترجیح دهید.",
                style = MaterialTheme.typography.bodyMedium
            )
            Text(
                text = "   - حذف عناصر غیرضروری از UI.",
                style = MaterialTheme.typography.bodySmall
            )
            Text(
                text = "   - استفاده از فضای سفید به عنوان بخشی از طراحی.",
                style = MaterialTheme.typography.bodySmall
            )

            // بخش پنجم: استفاده از فضای سفید
            Text(
                text = "5. استفاده از فضای سفید: فضای سفید مناسب به خوانایی و زیبایی طراحی کمک می‌کند.",
                style = MaterialTheme.typography.bodyMedium
            )
            Text(
                text = "   - اطمینان از فاصله مناسب بین عناصر.",
                style = MaterialTheme.typography.bodySmall
            )
        }
    }
}

/**
 * پیش‌نمایش صفحه DesignPrinciplesScreen
 */
@Preview(showBackground = true)
@Composable
fun DesignPrinciplesScreenPreview() {
    DesignPrinciplesScreen()
}