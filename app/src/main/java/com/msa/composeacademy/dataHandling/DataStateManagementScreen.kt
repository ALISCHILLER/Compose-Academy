@file:OptIn(ExperimentalMaterial3Api::class)

package com.msa.composeacademy.dataHandling



import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import androidx.lifecycle.viewmodel.compose.viewModel
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

// وضعیت داده‌ها
sealed class DataState {
    object Loading : DataState()
    data class Success(val data: List<Postt>) : DataState()
    data class Error(val message: String) : DataState()
}

// ViewModel برای مدیریت وضعیت داده‌ها
class DataStateViewModel : ViewModel() {
    private val _state = mutableStateOf<DataState>(DataState.Loading)
    val state: State<DataState> get() = _state

    fun fetchData() {
        viewModelScope.launch {
            _state.value = DataState.Loading
            delay(2000) // شبیه‌سازی بارگذاری داده
            try {
                // شبیه‌سازی دریافت داده‌ها
                val posts = listOf(
                    Postt(1, 1, "عنوان 1", "متن 1"),
                    Postt(2, 2, "عنوان 2", "متن 2")
                )
                _state.value = DataState.Success(posts)
            } catch (e: Exception) {
                _state.value = DataState.Error("خطا در دریافت داده‌ها")
            }
        }
    }
}

@Composable
fun DataStateManagementScreen() {
    val viewModel: DataStateViewModel = viewModel()
    LaunchedEffect(Unit) {
        viewModel.fetchData()
    }

    Scaffold(
        topBar = {
            TopAppBar(
                title = { Text("مدیریت وضعیت داده‌ها") },
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
            verticalArrangement = Arrangement.Top,
            horizontalAlignment = Alignment.Start
        ) {
            when (val state = viewModel.state.value) {
                is DataState.Loading -> {
                    CircularProgressIndicator()
                    Spacer(modifier = Modifier.height(16.dp))
                    Text("در حال بارگذاری...")
                }
                is DataState.Success -> {
                    Text(text = "لیست پست‌ها:", style = MaterialTheme.typography.headlineMedium)
                    LazyColumn {
                        items(state.data) { post ->
                            Card(
                                modifier = Modifier
                                    .fillMaxWidth()
                                    .padding(8.dp),
                                elevation = CardDefaults.cardElevation(defaultElevation = 4.dp)
                            ) {
                                Column(modifier = Modifier.padding(16.dp)) {
                                    Text(text = post.title, style = MaterialTheme.typography.titleMedium)
                                    Spacer(modifier = Modifier.height(4.dp))
                                    Text(text = post.body)
                                }
                            }
                        }
                    }
                }
                is DataState.Error -> {
                    Text(text = "خطا: ${state.message}", color = MaterialTheme.colorScheme.error)
                }
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun DataStateManagementScreenPreview() {
    DataStateManagementScreen()
}