//package com.msa.composeacademy.Layouts
//
//import androidx.compose.foundation.Image
//import androidx.compose.foundation.layout.*
//import androidx.compose.material3.*
//import androidx.compose.runtime.Composable
//import androidx.compose.ui.Modifier
//import androidx.compose.ui.res.painterResource
//import androidx.compose.ui.tooling.preview.Preview
//import androidx.compose.ui.unit.dp
//import androidx.compose.ui.unit.sp
//import androidx.constraintlayout.compose.ConstraintLayout
//
///**
// * صفحه‌ای برای نمایش نحوه استفاده از ConstraintLayout در Jetpack Compose
// * این صفحه شامل پروفایل کاربری است.
// */
//@Composable
//fun ConstraintLayoutScreen() {
//    Surface(modifier = Modifier.fillMaxSize(), color = MaterialTheme.colorScheme.background) {
//        ConstraintLayout {
//            // مرجع‌ها
//            val (profileImage, name, bio) = createRefs()
//
//            // تصویر پروفایل
//            Image(
//                painter = painterResource(id = R.drawable.profile_image), // تصویر پروفایل
//                contentDescription = "تصویر پروفایل",
//                modifier = Modifier
//                    .size(100.dp)
//                    .constrainAs(profileImage) {
//                        top.linkTo(parent.top, margin = 32.dp)
//                        start.linkTo(parent.start, margin = 16.dp)
//                    }
//            )
//
//            // نام کاربر
//            Text(
//                text = "نام کاربر",
//                style = MaterialTheme.typography.headlineMedium,
//                fontSize = 20.sp,
//                modifier = Modifier.constrainAs(name) {
//                    top.linkTo(profileImage.bottom, margin = 16.dp)
//                    start.linkTo(parent.start, margin = 16.dp)
//                }
//            )
//
//            // بیوگرافی کاربر
//            Text(
//                text = "این یک بیوگرافی کوتاه است که اطلاعات بیشتری در مورد کاربر ارائه می‌دهد.",
//                style = MaterialTheme.typography.bodyMedium,
//                modifier = Modifier.constrainAs(bio) {
//                    top.linkTo(name.bottom, margin = 8.dp)
//                    start.linkTo(parent.start, margin = 16.dp)
//                    end.linkTo(parent.end, margin = 16.dp)
//                }
//            )
//        }
//    }
//}
//
///**
// * پیش‌نمایش صفحه ConstraintLayoutScreen
// */
//@Preview(showBackground = true)
//@Composable
//fun ConstraintLayoutScreenPreview() {
//    ConstraintLayoutScreen()
//}