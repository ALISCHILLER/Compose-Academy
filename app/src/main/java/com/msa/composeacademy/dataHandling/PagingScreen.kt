//@file:OptIn(ExperimentalMaterial3Api::class)
//
//package com.msa.composeacademy.dataHandling
//
//import androidx.compose.foundation.layout.*
//import androidx.compose.foundation.lazy.LazyColumn
//import androidx.compose.material3.*
//import androidx.compose.runtime.*
//import androidx.compose.ui.Alignment
//import androidx.compose.ui.Modifier
//import androidx.compose.ui.tooling.preview.Preview
//import androidx.compose.ui.unit.dp
//import androidx.lifecycle.ViewModel
//import androidx.lifecycle.viewmodel.compose.viewModel
//import androidx.paging.LoadState
//import androidx.paging.Pager
//import androidx.paging.PagingConfig
//import androidx.paging.PagingData
//import androidx.paging.PagingSource
//import androidx.paging.PagingState
//import androidx.paging.compose.LazyPagingItems
//import androidx.paging.compose.collectAsLazyPagingItems
//import kotlinx.coroutines.flow.Flow
//
//// مدل داده
//data class Post(val userId: Int, val id: Int, val title: String, val body: String)
//
//// PagingSource برای بارگذاری داده‌ها
//class PostPagingSource : PagingSource<Int, Post>() {
//    override suspend fun load(params: LoadParams<Int>): LoadResult<Int, Post> {
//        val page = params.key ?: 1
//        return try {
//            // شبیه‌سازی دریافت داده‌ها از API
//            val posts = (1..20).map {
//                Post(it, it, "عنوان $it", "متن $it")
//            }
//            LoadResult.Page(
//                data = posts,
//                prevKey = if (page == 1) null else page - 1,
//                nextKey = if (posts.isEmpty()) null else page + 1
//            )
//        } catch (e: Exception) {
//            LoadResult.Error(e)
//        }
//    }
//
//    override fun getRefreshKey(state: PagingState<Int, Post>): Int? {
//        return state.anchorPosition?.let { anchorPosition ->
//            state.closestPageToPosition(anchorPosition)?.prevKey?.plus(1) ?: state.closestPageToPosition(anchorPosition)?.nextKey?.minus(1)
//        }
//    }
//}
//
//// ViewModel برای مدیریت Paging
//class PagingViewModel : ViewModel() {
//    val posts: Flow<PagingData<Post>> = Pager(PagingConfig(pageSize = 10)) {
//        PostPagingSource()
//    }.flow
//}
//
//@Composable
//fun PagingScreen() {
//    val viewModel: PagingViewModel = viewModel()
//    val lazyPagingItems: LazyPagingItems<Post> = viewModel.posts.collectAsLazyPagingItems()
//
//    Scaffold(
//        topBar = {
//            TopAppBar(
//                title = { Text("پیاده‌سازی Paging برای داده‌های بزرگ") },
//                colors = TopAppBarDefaults.topAppBarColors(
//                    containerColor = MaterialTheme.colorScheme.primary
//                )
//            )
//        }
//    ) { paddingValues ->
//        Column(
//            modifier = Modifier
//                .fillMaxSize()
//                .padding(paddingValues)
//                .padding(16.dp),
//            verticalArrangement = Arrangement.Top,
//            horizontalAlignment = Alignment.Start
//        ) {
//            LazyColumn {
//                items(lazyPagingItems) { post ->
//                    post?.let {
//                        Card(
//                            modifier = Modifier
//                                .fillMaxWidth()
//                                .padding(8.dp),
//                            elevation = CardDefaults.cardElevation(defaultElevation = 4.dp)
//                        ) {
//                            Column(modifier = Modifier.padding(16.dp)) {
//                                Text(text = it.title, style = MaterialTheme.typography.titleMedium)
//                                Spacer(modifier = Modifier.height(4.dp))
//                                Text(text = it.body)
//                            }
//                        }
//                    }
//                }
//                // نمایش بارگذاری در انتهای لیست
//                when {
//                    lazyPagingItems.loadState.append is LoadState.Loading -> {
//                        item {
//                            CircularProgressIndicator(modifier = Modifier.align(Alignment.CenterHorizontally))
//                        }
//                    }
//                }
//            }
//        }
//    }
//}
//
//@Preview(showBackground = true)
//@Composable
//fun PagingScreenPreview() {
//    PagingScreen()
//}