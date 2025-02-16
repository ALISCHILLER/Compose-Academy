package com.msa.composeacademy.dataHandling



import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.text.KeyboardActions
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.input.ImeAction
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

/**
 * صفحه‌ای برای نمایش نحوه استفاده از LazyColumn در Jetpack Compose
 * این صفحه شامل یک لیست از آیتم‌ها است که به صورت کارآمد بارگذاری می‌شوند
 * و قابلیت جستجو را نیز داراست.
 */
@Composable
fun LazyColumnScreen() {
    // داده‌های نمونه برای نمایش در لیست
    val items = List(100) { "آیتم شماره $it" }
    var searchQuery by remember { mutableStateOf("") }

    // فیلتر کردن آیتم‌ها بر اساس جستجو
    val filteredItems = items.filter { it.contains(searchQuery, ignoreCase = true) }

    Surface(modifier = Modifier.fillMaxSize(), color = MaterialTheme.colorScheme.background) {
        Column(modifier = Modifier.padding(16.dp)) {
            // فیلد جستجو
            TextField(
                value = searchQuery,
                onValueChange = { searchQuery = it },
                label = { Text("جستجو") },
                keyboardOptions = KeyboardOptions.Default.copy(imeAction = ImeAction.Search),
                keyboardActions = KeyboardActions(
                    onSearch = { /* TODO: عمل جستجو */ }
                ),
                modifier = Modifier.fillMaxWidth()
            )
            Spacer(modifier = Modifier.height(16.dp))

            // نمایش لیست با LazyColumn
            LazyColumn(
                modifier = Modifier.fillMaxSize(),
                verticalArrangement = Arrangement.spacedBy(8.dp)
            ) {
                items(filteredItems) { item ->
                    ListItem(item = item)
                }
            }
        }
    }
}

/**
 * کامپوننت برای نمایش هر آیتم در لیست
 */
@Composable
fun ListItem(item: String) {
    Card(
        modifier = Modifier.fillMaxWidth(),
        elevation = CardDefaults.cardElevation(4.dp)
    ) {
        Text(text = item)
//        PaddingValues(16.dp) { ->
//            Text(text = item)
//        }

    }
}

/**
 * پیش‌نمایش صفحه LazyColumnScreen
 */
@Preview(showBackground = true)
@Composable
fun LazyColumnScreenPreview() {
    LazyColumnScreen()
}