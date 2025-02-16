package com.msa.composeacademy.layouts



import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.msa.composeacademy.R

/**
 * صفحه‌ای برای نمایش نحوه ایجاد چیدمان‌های سفارشی در Jetpack Compose
 * این صفحه شامل یک کارت اطلاعاتی است.
 */
@Composable
fun CustomLayoutsScreen() {
    Surface(modifier = Modifier.fillMaxSize(), color = MaterialTheme.colorScheme.background) {
        Column(modifier = Modifier.padding(16.dp)) {
            Text(text = "کارت اطلاعاتی", style = MaterialTheme.typography.headlineMedium, fontSize = 24.sp)
            Spacer(modifier = Modifier.height(16.dp))

            // کارت اطلاعاتی
            Card(
                modifier = Modifier.fillMaxWidth(),
                shape = RoundedCornerShape(8.dp),
                elevation = CardDefaults.cardElevation(defaultElevation = 4.dp)
            ) {
                Row(modifier = Modifier.padding(16.dp)) {
                    // تصویر
                    Image(
                        painter = painterResource(id = R.drawable.ic_launcher_background), // تصویر نمونه
                        contentDescription = "تصویر کارت",
                        modifier = Modifier.size(80.dp)
                    )
                    Spacer(modifier = Modifier.width(16.dp))
                    // متن عنوان و توضیحات
                    Column {
                        Text(text = "عنوان کارت", style = MaterialTheme.typography.titleMedium)
                        Text(text = "این یک توضیحات کوتاه برای کارت است که اطلاعات بیشتری ارائه می‌دهد.", style = MaterialTheme.typography.bodyMedium)
                    }
                }
            }
        }
    }
}

/**
 * پیش‌نمایش صفحه CustomLayoutsScreen
 */
@Preview(showBackground = true)
@Composable
fun CustomLayoutsScreenPreview() {
    CustomLayoutsScreen()
}