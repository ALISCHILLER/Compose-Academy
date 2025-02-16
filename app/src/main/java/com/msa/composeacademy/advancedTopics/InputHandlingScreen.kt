package com.msa.composeacademy.advancedTopics



import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

/**
 * صفحه‌ای برای توضیح نحوه مدیریت ورودی‌ها در Jetpack Compose
 * این صفحه شامل مثال‌هایی از استفاده از TextField و مدیریت ورودی است.
 */
@Composable
fun InputHandlingScreen() {
    var text by remember { mutableStateOf("") }

    Surface(modifier = Modifier.fillMaxSize(), color = MaterialTheme.colorScheme.background) {
        Column(
            modifier = Modifier.padding(16.dp),
            verticalArrangement = Arrangement.spacedBy(16.dp),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Text(text = "مدیریت ورودی‌ها", style = MaterialTheme.typography.headlineMedium)
            TextField(
                value = text,
                onValueChange = { text = it },
                label = { Text("متن را وارد کنید") }
            )
            Spacer(modifier = Modifier.height(16.dp))
            Text(text = "شما وارد کردید: $text", style = MaterialTheme.typography.bodyMedium)
        }
    }
}

/**
 * پیش‌نمایش صفحه InputHandlingScreen
 */
@Preview(showBackground = true)
@Composable
fun InputHandlingScreenPreview() {
    InputHandlingScreen()
}