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
import kotlinx.coroutines.launch
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.http.GET

// مدل داده
data class Postt(val userId: Int, val id: Int, val title: String, val body: String)

// رابط API
interface ApiService {
    @GET("posts")
    suspend fun getPosts(): List<Postt>
}

// ViewModel برای مدیریت داده‌ها
class RetrofitViewModel : ViewModel() {
    private val _posts = mutableStateListOf<Postt>()
    val posts: List<Postt> get() = _posts

    private val retrofit = Retrofit.Builder()
        .baseUrl("https://jsonplaceholder.typicode.com/")
        .addConverterFactory(GsonConverterFactory.create())
        .build()

    private val apiService = retrofit.create(ApiService::class.java)

    fun fetchPosts() {
        viewModelScope.launch {
            try {
                val fetchedPosts = apiService.getPosts()
                _posts.clear()
                _posts.addAll(fetchedPosts)
            } catch (e: Exception) {
                // مدیریت خطا
                println("Error fetching posts: ${e.message}")
            }
        }
    }
}

@Composable
fun RetrofitIntegrationScreen() {
    val viewModel: RetrofitViewModel = viewModel()
    LaunchedEffect(Unit) {
        viewModel.fetchPosts()
    }

    Scaffold(
        topBar = {
            TopAppBar(
                title = { Text("استفاده از Retrofit برای APIها") },
                colors =TopAppBarDefaults.topAppBarColors(
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
            Text(text = "لیست پست‌ها:", style = MaterialTheme.typography.headlineMedium)
            Spacer(modifier = Modifier.height(8.dp))

            LazyColumn {
                items(viewModel.posts) { post ->
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
    }
}

@Preview(showBackground = true)
@Composable
fun RetrofitIntegrationScreenPreview() {
    RetrofitIntegrationScreen()
}