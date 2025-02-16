@file:OptIn(ExperimentalMaterial3Api::class)

package com.msa.composeacademy.layouts



import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun GridLayoutsScreen() {
    // استفاده از Scaffold برای ایجاد یک ساختار پایه
    Scaffold(
        topBar = {
            TopAppBar(
                title = { Text("طراحی چیدمان‌های شبکه‌ای") },
                colors = TopAppBarDefaults.topAppBarColors(
                    containerColor = MaterialTheme.colorScheme.primary
                )
            )
        }
    ) { paddingValues ->
        // استفاده از LazyVerticalGrid برای ایجاد چیدمان شبکه‌ای
        LazyVerticalGrid(
            columns = GridCells.Fixed(2), // تعداد ستون‌ها
            modifier = Modifier
                .fillMaxSize()
                .padding(paddingValues)
                .padding(16.dp),
            contentPadding = PaddingValues(8.dp)
        ) {
            items(20) { index ->
                // ایجاد کارت برای هر عنصر
                Card(
                    modifier = Modifier
                        .padding(8.dp)
                        .fillMaxWidth(),
                    elevation = CardDefaults.cardElevation(defaultElevation = 4.dp)
                ) {
                    Box(
                        modifier = Modifier
                            .height(100.dp),
                        contentAlignment = Alignment.Center
                    ) {
                        Text(text = "آیتم $index", fontSize = 18.sp)
                    }
                }
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun GridLayoutsScreenPreview() {
    GridLayoutsScreen()
}