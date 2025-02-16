@file:OptIn(ExperimentalMaterial3Api::class, ExperimentalMaterial3Api::class)

package com.msa.composeacademy.basics


import androidx.compose.foundation.Canvas
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.geometry.Size
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.msa.composeacademy.R

@Composable
fun IconScreen() {
    Scaffold(
        topBar = {
            TopAppBar(
                title = { Text("استفاده از آیکون‌ها") },

                colors = TopAppBarDefaults.topAppBarColors(
                    containerColor=MaterialTheme.colorScheme.primary
                )
            )
        }
    ) { paddingValues ->
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(paddingValues)
                .padding(16.dp),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Top
        ) {
            Text(
                text = "آیکون‌های پیش‌ساخته",
                fontSize = 20.sp,
                fontWeight = FontWeight.Bold,
                color = Color.Black
            )
            Spacer(modifier = Modifier.height(16.dp))

            // استفاده از آیکون‌های پیش‌ساخته
            Icon(
                painter = painterResource(id = R.drawable.ic_launcher_background), // آیکون پیش‌ساخته
                contentDescription = "آیکون پیش‌ساخته",
                modifier = Modifier.size(48.dp),
                tint = Color.Unspecified // برای استفاده از رنگ پیش‌فرض آیکون
            )

            Spacer(modifier = Modifier.height(16.dp))

            Text(
                text = "آیکون‌های سفارشی",
                fontSize = 20.sp,
                fontWeight = FontWeight.Bold,
                color = Color.Black
            )
            Spacer(modifier = Modifier.height(16.dp))

            // استفاده از آیکون‌های سفارشی
            CustomIcon()
        }
    }
}

@Composable
fun CustomIcon() {
    // ایجاد آیکون سفارشی با استفاده از Canvas
    Canvas(modifier = Modifier.size(48.dp)) {
        drawCircle(color = Color.Blue)
        drawRect(color = Color.White, topLeft = Offset(10f, 10f), size = Size(28f, 28f))
    }
}

@Preview(showBackground = true)
@Composable
fun IconScreenPreview() {
    IconScreen()
}