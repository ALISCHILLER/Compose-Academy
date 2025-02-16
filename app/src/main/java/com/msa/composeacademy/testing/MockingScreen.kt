//package com.msa.composeacademy.testing
//
//
//
//import androidx.compose.foundation.layout.*
//import androidx.compose.material3.*
//import androidx.compose.runtime.*
//import androidx.compose.ui.Alignment
//import androidx.compose.ui.Modifier
//import androidx.compose.ui.tooling.preview.Preview
//import androidx.compose.ui.unit.dp
//import androidx.lifecycle.ViewModel
//import androidx.lifecycle.viewmodel.compose.viewModel
//import org.junit.Assert.assertEquals
//import org.junit.Test
//import org.mockito.Mockito.*
//
///**
// * ViewModel برای مدیریت داده‌ها
// */
//class MockingViewModel(private val repository: DataRepository) : ViewModel() {
//    var data by mutableStateOf("")
//
//    fun fetchData() {
//        data = repository.getData()
//    }
//}
//
///**
// * رابط برای منبع داده
// */
//interface DataRepository {
//    fun getData(): String
//}
//
///**
// * صفحه‌ای برای تست Mocking در Jetpack Compose
// */
//@Composable
//fun MockingScreen(viewModel: MockingViewModel = viewModel()) {
//    Surface(modifier = Modifier.fillMaxSize(), color = MaterialTheme.colorScheme.background) {
//        Column(
//            modifier = Modifier.fillMaxSize(),
//            verticalArrangement = Arrangement.Center,
//            horizontalAlignment = Alignment.CenterHorizontally
//        ) {
//            Button(onClick = { viewModel.fetchData() }) {
//                Text(text = "دریافت داده")
//            }
//            Spacer(modifier = Modifier.height(16.dp))
//            Text(text = viewModel.data)
//        }
//    }
//}
//
///**
// * کلاس تست برای MockingScreen
// */
//class MockingScreenTest {
//    @Test
//    fun testMocking() {
//        // ایجاد Mock برای DataRepository
//        val mockRepository = mock(DataRepository::class.java)
//        `when`(mockRepository.getData()).thenReturn("داده‌های تستی")
//
//        // ایجاد ViewModel با Mock
//        val viewModel = MockingViewModel(mockRepository)
//
//        // تست fetchData
//        viewModel.fetchData()
//
//        // بررسی داده‌های دریافت شده
//        assertEquals("داده‌های تستی", viewModel.data)
//    }
//}
//
///**
// * پیش‌نمایش صفحه MockingScreen
// */
//@Preview(showBackground = true)
//@Composable
//fun MockingScreenPreview() {
//    MockingScreen()
//}