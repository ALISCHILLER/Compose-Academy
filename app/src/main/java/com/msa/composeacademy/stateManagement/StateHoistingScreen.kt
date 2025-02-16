package com.msa.composeacademy.stateManagement



import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

/**
 * صفحه‌ای برای توضیح مفهوم State Hoisting در Jetpack Compose
 * این صفحه نشان می‌دهد که چگونه می‌توان وضعیت را از یک کامپوننت به کامپوننت دیگر منتقل کرد.
 */
@Composable
fun StateHoistingScreen() {
    // ایجاد یک وضعیت در سطح بالاتر
    var count by remember { mutableStateOf(0) }

    Surface(modifier = Modifier.fillMaxSize(), color = MaterialTheme.colorScheme.background) {
        Column(
            modifier = Modifier.padding(16.dp),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Text(text = "شمارش: $count", style = MaterialTheme.typography.headlineMedium)
            Spacer(modifier = Modifier.height(16.dp))
            // کامپوننتی برای افزایش شمارش
            CounterButton(count = count, onCountChange = { count++ })
        }
    }
}

/**
 * کامپوننتی برای افزایش شمارش
 */
@Composable
fun CounterButton(count: Int, onCountChange: () -> Unit) {
    Button(onClick = onCountChange) {
        Text(text = "افزایش شمارش")
    }
}

/**
 * پیش‌نمایش صفحه StateHoistingScreen
 * این تابع برای مشاهده پیش‌نمایش کامپوننت در Android Studio استفاده می‌شود.
 */
@Preview(showBackground = true)
@Composable
fun StateHoistingScreenPreview() {
    StateHoistingScreen()
}