package com.msa.composeacademy.advancedTopics



import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

/**
 * صفحه‌ای برای توضیح نحوه استفاده از رنگ‌ها و تم‌ها در Jetpack Compose
 * این صفحه شامل مثال‌هایی از تعریف و استفاده از تم‌ها است.
 */
@Composable
fun ThemingScreen() {
    Surface(modifier = Modifier.fillMaxSize(), color = MaterialTheme.colorScheme.background) {
        Column(
            modifier = Modifier.padding(16.dp),
            verticalArrangement = Arrangement.spacedBy(16.dp),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Text(text = "تم‌بندی در Jetpack Compose", style = MaterialTheme.typography.headlineMedium)
            Spacer(modifier = Modifier.height(16.dp))
            Text(text = "رنگ اصلی: ${MaterialTheme.colorScheme.primary}", style = MaterialTheme.typography.bodyMedium)
            Button(onClick = { /* عمل خاصی در اینجا */ }, colors = ButtonDefaults.buttonColors(containerColor = MaterialTheme.colorScheme.secondary)) {
                Text("دکمه با رنگ ثانویه")
            }
        }
    }
}

/**
 * پیش‌نمایش صفحه ThemingScreen
 */
@Preview(showBackground = true)
@Composable
fun ThemingScreenPreview() {
    ThemingScreen()
}