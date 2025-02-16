package com.msa.composeacademy.DataHandling

import androidx.compose.foundation.layout.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Delete
import androidx.compose.material.icons.filled.Edit
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

/**
 * کلاس داده برای نمایش اطلاعات کاربر
 */
data class User(val id: Int, val name: String, val age: Int)

/**
 * صفحه‌ای برای نمایش نحوه استفاده از کلاس‌های داده در Jetpack Compose
 * این صفحه شامل لیستی از کاربران است و قابلیت ویرایش و حذف را نیز دارد.
 */
@Composable
fun DataClassExampleScreen() {
    // داده‌های نمونه
    var users by remember { mutableStateOf(mutableListOf<User>()) }
    var name by remember { mutableStateOf("") }
    var age by remember { mutableStateOf("") }
    var selectedUserId by remember { mutableStateOf<Int?>(null) }

    Surface(modifier = Modifier.fillMaxSize(), color = MaterialTheme.colorScheme.background) {
        Column(
            modifier = Modifier
                .padding(16.dp)
                .fillMaxSize(),
            verticalArrangement = Arrangement.spacedBy(8.dp)
        ) {
            Text(text = "لیست کاربران:", style = MaterialTheme.typography.headlineMedium)
            Spacer(modifier = Modifier.height(10.dp))

            // نمایش لیست کاربران
            users.forEach { user ->
                UserItem(user = user, onEdit = { selectedUserId = user.id; name = user.name; age = user.age.toString() }, onDelete = { users.remove(user) })
            }

            Spacer(modifier = Modifier.height(20.dp))

            // فیلدهای ورودی برای ویرایش یا افزودن کاربر
            TextField(value = name, onValueChange = { name = it }, label = { Text("نام") })
            TextField(value = age, onValueChange = { age = it }, label = { Text("سن") })

            Button(onClick = {
                if (selectedUserId != null) {
                    // ویرایش کاربر
                    users = users.map {
                        if (it.id == selectedUserId) User(it.id, name, age.toInt()) else it
                    }.toMutableList()
                    selectedUserId = null
                } else {
                    // افزودن کاربر جدید
                    users.add(User(users.size + 1, name, age.toInt()))
                }
                // پاک کردن ورودی‌ها
                name = ""
                age = ""
            }) {
                Text(text = if (selectedUserId != null) "ویرایش" else "افزودن")
            }
        }
    }
}

/**
 * کامپوننت برای نمایش هر کاربر
 */
@Composable
fun UserItem(user: User, onEdit: () -> Unit, onDelete: () -> Unit) {
    Card(
        modifier = Modifier.fillMaxWidth(),
        elevation = CardDefaults.cardElevation(4.dp)
    ) {
        Row(
            modifier = Modifier.padding(16.dp),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.SpaceBetween
        ) {
            Text(text = "${user.name}, سن: ${user.age}")
            Row {
                IconButton(onClick = onEdit) {
                    Icon(Icons.Default.Edit, contentDescription = "ویرایش")
                }
                IconButton(onClick = onDelete) {
                    Icon(Icons.Default.Delete, contentDescription = "حذف")
                }
            }
        }
    }
}

/**
 * پیش‌نمایش صفحه DataClassExampleScreen
 */
@Preview(showBackground = true)
@Composable
fun DataClassExampleScreenPreview() {
    DataClassExampleScreen()
}