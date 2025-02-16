package com.msa.composeacademy.Introduction



import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

/**
 * صفحه مقدمه که اطلاعات کلی در مورد Jetpack Compose را ارائه می‌دهد.
 */
@Composable
fun IntroductionScreen() {
    Surface(modifier = Modifier.fillMaxSize(), color = MaterialTheme.colorScheme.background) {
        Column(
            modifier = Modifier.padding(16.dp),
            verticalArrangement = Arrangement.spacedBy(16.dp),
            horizontalAlignment = Alignment.Start
        ) {
            Text(text = "مقدمه‌ای بر Jetpack Compose", style = MaterialTheme.typography.headlineMedium)
            Text(
                text = "Jetpack Compose یک فریم‌ورک مدرن برای ساخت UI در اپلیکیشن‌های اندروید است. "
                        + "این فریم‌ورک به شما این امکان را می‌دهد که به راحتی و با استفاده از کد کمتر "
                        + "و به صورت declarative UI بسازید.",
                style = MaterialTheme.typography.bodyMedium
            )
            Text(
                text = "با Jetpack Compose، می‌توانید به سادگی UI خود را با استفاده از کامپوننت‌های "
                        + "قابل ترکیب و مدیریت وضعیت طراحی کنید.",
                style = MaterialTheme.typography.bodyMedium
            )
        }
    }
}

/**
 * پیش‌نمایش صفحه IntroductionScreen
 */
@Preview(showBackground = true)
@Composable
fun IntroductionScreenPreview() {
    IntroductionScreen()
}