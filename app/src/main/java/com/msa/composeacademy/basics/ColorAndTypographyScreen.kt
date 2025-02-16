@file:OptIn(ExperimentalMaterial3Api::class)

package com.msa.composeacademy.basics


import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun ColorAndTypographyScreen() {
    Scaffold(
        topBar = {
            TopAppBar(
                title = { Text("مدیریت رنگ‌ها و نوع‌خط‌ها") },

                colors = TopAppBarDefaults.topAppBarColors(
                    containerColor = MaterialTheme.colorScheme.primary
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
                text = "مدیریت رنگ‌ها",
                fontSize = 20.sp,
                fontWeight = FontWeight.Bold,
                color = Color.Black
            )
            Spacer(modifier = Modifier.height(16.dp))

            // نمایش رنگ‌های مختلف
            Row(
                horizontalArrangement = Arrangement.SpaceEvenly,
                modifier = Modifier.fillMaxWidth()
            ) {
                ColorBox(Color.Red)
                ColorBox(Color.Green)
                ColorBox(Color.Blue)
            }

            Spacer(modifier = Modifier.height(32.dp))

            Text(
                text = "مدیریت نوع‌خط‌ها",
                fontSize = 20.sp,
                fontWeight = FontWeight.Bold,
                color = Color.Black
            )
            Spacer(modifier = Modifier.height(16.dp))

            // نمایش متن با نوع‌خط‌های مختلف
            Text(text = "متن با نوع‌خط عادی", fontSize = 16.sp)
            Text(text = "متن با نوع‌خط بولد", fontSize = 16.sp, fontWeight = FontWeight.Bold)
            Text(text = "متن با نوع‌خط ایتالیک", fontSize = 16.sp, fontStyle = FontStyle.Italic)
        }
    }
}

@Composable
fun ColorBox(color: Color) {
    Box(
        modifier = Modifier
            .size(50.dp)
            .background(color)
    )
}

@Preview(showBackground = true)
@Composable
fun ColorAndTypographyScreenPreview() {
    ColorAndTypographyScreen()
}