package com.msa.composeacademy.advancedTopics



import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

/**
 * صفحه‌ای برای توضیح نحوه ادغام Jetpack Compose با کتابخانه‌های دیگر
 * این صفحه شامل مثال‌هایی از ادغام با یک کتابخانه فرضی است.
 */
@Composable
fun IntegrationWithLibrariesScreen() {
    var result by remember { mutableStateOf("نتیجه را اینجا ببینید") }

    Surface(modifier = Modifier.fillMaxSize(), color = MaterialTheme.colorScheme.background) {
        Column(
            modifier = Modifier.padding(16.dp),
            verticalArrangement = Arrangement.spacedBy(16.dp),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Text(text = "ادغام با کتابخانه‌های دیگر", style = MaterialTheme.typography.headlineMedium)
            Button(onClick = {
                // فرض کنید اینجا یک تابع از کتابخانه دیگر را فراخوانی می‌کنیم
                result = "کتابخانه با موفقیت ادغام شد!"
            }) {
                Text("ادغام کتابخانه")
            }
            Spacer(modifier = Modifier.height(16.dp))
            Text(text = result, style = MaterialTheme.typography.bodyMedium)
        }
    }
}

/**
 * پیش‌نمایش صفحه IntegrationWithLibrariesScreen
 */
@Preview(showBackground = true)
@Composable
fun IntegrationWithLibrariesScreenPreview() {
    IntegrationWithLibrariesScreen()
}