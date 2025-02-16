package com.msa.composeacademy.layouts



import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.material3.TextField
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.text.input.PasswordVisualTransformation

/**
 * صفحه‌ای برای نمایش نحوه استفاده از Column و Row در Jetpack Compose
 * این صفحه شامل یک فرم ورود (Login Form) است.
 */
@Composable
fun ColumnRowScreen() {
    // وضعیت برای فیلدهای ورودی
    val username = remember { mutableStateOf("") }
    val password = remember { mutableStateOf("") }

    Surface(modifier = Modifier.fillMaxSize(), color = MaterialTheme.colorScheme.background) {
        Column(
            modifier = Modifier
                .padding(16.dp)
                .fillMaxWidth(),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Text(text = "ورود به حساب کاربری", fontSize = 24.sp, style = MaterialTheme.typography.headlineMedium)
            Spacer(modifier = Modifier.height(20.dp))

            // فیلد نام کاربری
            TextField(
                value = username.value,
                onValueChange = { username.value = it },
                label = { Text("نام کاربری") },
                modifier = Modifier.fillMaxWidth()
            )
            Spacer(modifier = Modifier.height(10.dp))

            // فیلد رمز عبور
            TextField(
                value = password.value,
                onValueChange = { password.value = it },
                label = { Text("رمز عبور") },
                visualTransformation = PasswordVisualTransformation(),
                modifier = Modifier.fillMaxWidth()
            )
            Spacer(modifier = Modifier.height(20.dp))

            // دکمه ورود
            Button(onClick = { /* TODO: عمل ورود */ }, modifier = Modifier.fillMaxWidth()) {
                Text(text = "ورود")
            }
        }
    }
}

/**
 * پیش‌نمایش صفحه ColumnRowScreen
 */
@Preview(showBackground = true)
@Composable
fun ColumnRowScreenPreview() {
    ColumnRowScreen()
}