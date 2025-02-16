package com.msa.composeacademy.layouts


import androidx.compose.foundation.layout.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Search
import androidx.compose.material.icons.filled.Settings
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

/**
 * صفحه‌ای برای نمایش نحوه استفاده از Scaffold در Jetpack Compose
 * این صفحه شامل نوار ابزار، نوار پایین و محتوای اصلی است.
 */
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun ScaffoldExampleScreen() {
    Scaffold(
        topBar = {
            TopAppBar(
                title = { Text("عنوان اپلیکیشن") },
                actions = {
                    IconButton(onClick = { /* TODO: عمل جستجو */ }) {
                        Icon(Icons.Default.Search, contentDescription = "جستجو")
                    }
                }
            )
        },
        bottomBar = {
            BottomAppBar {
                Row(
                    modifier = Modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.SpaceAround
                ) {
                    IconButton(onClick = { /* TODO: عمل خانه */ }) {
                        Icon(Icons.Default.Home, contentDescription = "خانه")
                    }
                    IconButton(onClick = { /* TODO: عمل تنظیمات */ }) {
                        Icon(Icons.Default.Settings, contentDescription = "تنظیمات")
                    }
                }
            }
        }
    ) { innerPadding ->
        // محتوای اصلی
        Column(
            modifier = Modifier
                .padding(innerPadding)
                .fillMaxSize(),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Text(text = "محتوای اصلی اپلیکیشن", style = MaterialTheme.typography.headlineMedium)
            Spacer(modifier = Modifier.height(20.dp))
            Text(text = "اینجا می‌توانید محتوای خود را قرار دهید.")
        }
    }
}

/**
 * پیش‌نمایش صفحه ScaffoldExampleScreen
 */
@Preview(showBackground = true)
@Composable
fun ScaffoldExampleScreenPreview() {
    ScaffoldExampleScreen()
}