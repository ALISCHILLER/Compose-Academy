@file:OptIn(ExperimentalMaterial3Api::class)

package com.msa.composeacademy.stateManagement



import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewmodel.compose.viewModel

// ViewModel برای مدیریت وضعیت
class CounterViewModel : ViewModel() {
    private var _count = mutableStateOf(0)
    val count: State<Int> get() = _count

    fun increment() {
        _count.value += 1
    }

    fun decrement() {
        if (_count.value > 0) {
            _count.value -= 1
        }
    }
}

@Composable
fun ViewModelIntegrationScreen() {
    // استفاده از ViewModel
    val viewModel: CounterViewModel = viewModel()
    val count by viewModel.count

    Scaffold(
        topBar = {
            TopAppBar(
                title = { Text("ادغام ViewModel") },
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
            verticalArrangement = Arrangement.Center
        ) {
            Text(text = "شمارنده: $count", style = MaterialTheme.typography.headlineMedium)
            Spacer(modifier = Modifier.height(16.dp))
            Row {
                Button(onClick = { viewModel.decrement() }) {
                    Text("کاهش")
                }
                Spacer(modifier = Modifier.width(16.dp))
                Button(onClick = { viewModel.increment() }) {
                    Text("افزایش")
                }
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun ViewModelIntegrationScreenPreview() {
    ViewModelIntegrationScreen()
}