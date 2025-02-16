@file:OptIn(ExperimentalMaterial3Api::class)

package com.msa.composeacademy.layouts



import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun ResponsiveLayoutsScreen() {
    // استفاده از Scaffold برای ایجاد یک ساختار پایه
    Scaffold(
        topBar = {
            TopAppBar(
                title = { Text("طراحی چیدمان‌های پاسخگو") },
                colors = TopAppBarDefaults.topAppBarColors(
                    containerColor = MaterialTheme.colorScheme.primary
                )
            )
        }
    ) { paddingValues ->
        // استفاده از Column برای چیدمان عمودی
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(paddingValues)
                .padding(16.dp),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Top
        ) {
            Text(
                text = "چیدمان پاسخگو با Jetpack Compose",
                fontSize = 24.sp,
                style = MaterialTheme.typography.headlineMedium
            )
            Spacer(modifier = Modifier.height(16.dp))

            // استفاده از Row برای چیدمان افقی
            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceBetween
            ) {
                // ایجاد دکمه‌ها
                Button(onClick = { /*TODO*/ }) {
                    Text("دکمه 1")
                }
                Button(onClick = { /*TODO*/ }) {
                    Text("دکمه 2")
                }
            }

            Spacer(modifier = Modifier.height(16.dp))

            // استفاده از Box برای چیدمان لایه‌ای
            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(200.dp),
                contentAlignment = Alignment.Center
            ) {
                Text(text = "محتوای مرکزی", fontSize = 18.sp)
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun ResponsiveLayoutsScreenPreview() {
    ResponsiveLayoutsScreen()
}