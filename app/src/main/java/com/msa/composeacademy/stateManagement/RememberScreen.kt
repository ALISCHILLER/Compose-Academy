package com.msa.composeacademy.stateManagement



import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

/**
 * صفحه‌ای برای توضیح نحوه استفاده از remember در Jetpack Compose
 * این صفحه وضعیت ورودی کاربر را با استفاده از remember حفظ می‌کند.
 */
@Composable
fun RememberScreen() {
    // استفاده از remember برای حفظ یک مقدار بین recompositions
    var text by remember { mutableStateOf("") }

    Surface(modifier = Modifier.fillMaxSize(), color = MaterialTheme.colorScheme.background) {
        Column(
            modifier = Modifier.padding(16.dp),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.Start
        ) {
            Text(text = "متن ورودی:", style = MaterialTheme.typography.headlineMedium)
            Spacer(modifier = Modifier.height(8.dp))
            TextField(
                value = text,
                onValueChange = { text = it },
                label = { Text("متن را وارد کنید") },
                modifier = Modifier.fillMaxWidth()
            )
            Spacer(modifier = Modifier.height(16.dp))
            Text(text = "متن شما: $text", style = MaterialTheme.typography.bodyMedium)
        }
    }
}

/**
 * پیش‌نمایش صفحه RememberScreen
 * این تابع برای مشاهده پیش‌نمایش کامپوننت در Android Studio استفاده می‌شود.
 */
@Preview(showBackground = true)
@Composable
fun RememberScreenPreview() {
    RememberScreen()
}