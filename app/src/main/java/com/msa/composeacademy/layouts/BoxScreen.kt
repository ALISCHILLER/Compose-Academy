package com.msa.composeacademy.Layouts

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.msa.composeacademy.R

/**
 * صفحه‌ای برای نمایش نحوه استفاده از Box در Jetpack Compose
 * این صفحه شامل گالری عکس با متن توصیفی است.
 */
@Composable
fun BoxScreen() {
    Surface(modifier = Modifier.fillMaxSize(), color = MaterialTheme.colorScheme.background) {
        Column(modifier = Modifier.padding(16.dp)) {
            Text(text = "گالری عکس", style = MaterialTheme.typography.headlineMedium, fontSize = 24.sp)
            Spacer(modifier = Modifier.height(16.dp))

            // جعبه برای تصویر
            Box(
                modifier = Modifier
                    .size(200.dp)
                    .padding(8.dp)
                    .clip(RoundedCornerShape(8.dp))
            ) {
                Image(
                    painter = painterResource(id = R.drawable.ic_launcher_background), // تصویر نمونه
                    contentDescription = "تصویر گالری",
                    modifier = Modifier.fillMaxSize()
                )
                Text(
                    text = "توضیحات تصویر",
                    modifier = Modifier
                        .align(Alignment.BottomStart)
                        .padding(8.dp)
                        .background(MaterialTheme.colorScheme.onSurface.copy(alpha = 0.7f)),
                    color = MaterialTheme.colorScheme.background,
                    fontSize = 16.sp
                )
            }
        }
    }
}

/**
 * پیش‌نمایش صفحه BoxScreen
 */
@Preview(showBackground = true)
@Composable
fun BoxScreenPreview() {
    BoxScreen()
}