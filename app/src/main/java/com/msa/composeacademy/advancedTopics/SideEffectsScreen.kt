package com.msa.composeacademy.advancedTopics



import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

/**
 * صفحه‌ای برای مدیریت اثرات جانبی در Jetpack Compose
 * این صفحه شامل مثال‌هایی از استفاده از LaunchedEffect و SideEffect است.
 */
@Composable
fun SideEffectsScreen() {
    var count by remember { mutableStateOf(0) }
    var message by remember { mutableStateOf("تعداد: 0") }

    // LaunchedEffect برای اجرای کد در اثر تغییر count
    LaunchedEffect(count) {
        message = "تعداد: $count"
    }

    // SideEffect برای اجرای کد در هر بار بازسازی
    SideEffect {
        println("تعداد فعلی: $count")
    }

    Surface(modifier = Modifier.fillMaxSize(), color = MaterialTheme.colorScheme.background) {
        Column(
            modifier = Modifier.padding(16.dp),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Text(text = message, style = MaterialTheme.typography.headlineMedium)
            Spacer(modifier = Modifier.height(16.dp))
            Button(onClick = { count++ }) {
                Text("افزایش تعداد")
            }
        }
    }
}

/**
 * پیش‌نمایش صفحه SideEffectsScreen
 */
@Preview(showBackground = true)
@Composable
fun SideEffectsScreenPreview() {
    SideEffectsScreen()
}