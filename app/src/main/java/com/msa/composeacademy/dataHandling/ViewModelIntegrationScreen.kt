package com.msa.composeacademy.DataHandling

import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewmodel.compose.viewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow

/**
 * ViewModel برای مدیریت داده‌ها
 */
class CounterViewModel : ViewModel() {
    private val _count = MutableStateFlow(0)
    val count: StateFlow<Int> get() = _count

    fun increment() {
        _count.value += 1
    }

    fun decrement() {
        _count.value -= 1
    }
}

/**
 * صفحه‌ای برای نمایش نحوه ادغام ViewModel با Jetpack Compose
 * این صفحه شامل یک شمارنده است که با استفاده از ViewModel مدیریت می‌شود.
 */
@Composable
fun ViewModelIntegrationScreen(viewModel: CounterViewModel = viewModel()) {
    // جمع‌آوری داده‌ها از ViewModel
    val count by viewModel.count.collectAsState()

    Surface(modifier = Modifier.fillMaxSize(), color = MaterialTheme.colorScheme.background) {
        Column(
            modifier = Modifier
                .padding(16.dp)
                .fillMaxSize(),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Text(text = "شمارنده: $count", style = MaterialTheme.typography.headlineMedium)
            Spacer(modifier = Modifier.height(20.dp))
            Row {
                Button(onClick = { viewModel.decrement() }) {
                    Text(text = "کاهش")
                }
                Spacer(modifier = Modifier.width(10.dp))
                Button(onClick = { viewModel.increment() }) {
                    Text(text = "افزایش")
                }
            }
        }
    }
}

/**
 * پیش‌نمایش صفحه ViewModelIntegrationScreen
 */
@Preview(showBackground = true)
@Composable
fun ViewModelIntegrationScreenPreview() {
    ViewModelIntegrationScreen()
}