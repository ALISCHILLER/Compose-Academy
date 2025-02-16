package com.msa.composeacademy.finalProject



import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

/**
 * صفحه‌ای که منابع و مستندات مربوط به پروژه نهایی را ارائه می‌دهد.
 */
@Composable
fun FinalProjectResources() {
    Surface(modifier = Modifier.fillMaxSize(), color = MaterialTheme.colorScheme.background) {
        Column(
            modifier = Modifier.padding(16.dp),
            verticalArrangement = Arrangement.spacedBy(16.dp),
            horizontalAlignment = Alignment.Start
        ) {
            Text(text = "منابع پروژه نهایی", style = MaterialTheme.typography.headlineMedium)
            Text(
                text = "در اینجا منابع و مستندات مفید برای پروژه نهایی آورده شده است:",
                style = MaterialTheme.typography.bodyMedium
            )
            Text(
                text = "1. مستندات Jetpack Compose: https://developer.android.com/jetpack/compose",
                style = MaterialTheme.typography.bodyMedium
            )
            Text(
                text = "2. مستندات Room Database: https://developer.android.com/training/data-storage/room",
                style = MaterialTheme.typography.bodyMedium
            )
            Text(
                text = "3. آموزش ViewModel: https://developer.android.com/topic/libraries/architecture/viewmodel",
                style = MaterialTheme.typography.bodyMedium
            )
            Text(
                text = "4. مثال‌های Jetpack Compose در GitHub: https://github.com/android/compose-samples",
                style = MaterialTheme.typography.bodyMedium
            )
            Spacer(modifier = Modifier.height(16.dp))
            Button(onClick = { /* Navigate back to project screen */ }) {
                Text("بازگشت به پروژه نهایی")
            }
        }
    }
}

/**
 * پیش‌نمایش صفحه FinalProjectResources
 */
@Preview(showBackground = true)
@Composable
fun FinalProjectResourcesPreview() {
    FinalProjectResources()
}