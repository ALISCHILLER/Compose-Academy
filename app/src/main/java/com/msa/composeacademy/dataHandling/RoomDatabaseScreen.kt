package com.msa.composeacademy.DataHandling

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.room.*
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

/**
 * کلاس داده برای نمایش اطلاعات کاربر
 */
@Entity(tableName = "users")
data class UserEntity(
    @PrimaryKey(autoGenerate = true) val id: Long = 0,
    val name: String,
    val age: Int
)

/**
 * DAO برای دسترسی به داده‌های کاربران
 */
@Dao
interface UserDao {
    @Insert
    suspend fun insert(user: UserEntity)

    @Query("SELECT * FROM users")
    suspend fun getAllUsers(): List<UserEntity>

    @Delete
    suspend fun delete(user: UserEntity)
}

/**
 * پایگاه داده برای مدیریت کاربران
 */
@Database(entities = [UserEntity::class], version = 1)
abstract class AppDatabase : RoomDatabase() {
    abstract fun userDao(): UserDao
}

/**
 * صفحه‌ای برای نمایش نحوه استفاده از Room Database در Jetpack Compose
 */
@Composable
fun RoomDatabaseScreen() {
    var users by remember { mutableStateOf(listOf<UserEntity>()) }
    var name by remember { mutableStateOf("") }
    var age by remember { mutableStateOf("") }

    // ایجاد پایگاه داده
    val database = Room.databaseBuilder(
        LocalContext.current,
        AppDatabase::class.java, "app-database"
    ).build()

    // بارگذاری کاربران از پایگاه داده
    LaunchedEffect(Unit) {
        users = database.userDao().getAllUsers()
    }

    Surface(modifier = Modifier.fillMaxSize(), color = MaterialTheme.colorScheme.background) {
        Column(
            modifier = Modifier
                .padding(16.dp)
                .fillMaxSize(),
            verticalArrangement = Arrangement.spacedBy(8.dp)
        ) {
            Text(text = "افزودن کاربر:", style = MaterialTheme.typography.headlineMedium)
            TextField(value = name, onValueChange = { name = it }, label = { Text("نام") })
            TextField(value = age, onValueChange = { age = it }, label = { Text("سن") })

            Button(onClick = {
                val user = UserEntity(name = name, age = age.toInt())
                CoroutineScope(Dispatchers.IO).launch {
                    database.userDao().insert(user)
                    // بروزرسانی لیست کاربران
                    users = database.userDao().getAllUsers()
                }
                name = ""
                age = ""
            }) {
                Text(text = "افزودن")
            }

            Spacer(modifier = Modifier.height(20.dp))
            Text(text = "لیست کاربران:", style = MaterialTheme.typography.headlineMedium)
            users.forEach { user ->
                Text(text = "${user.name}, سن: ${user.age}")
            }
        }
    }
}

/**
 * پیش‌نمایش صفحه RoomDatabaseScreen
 */
@Preview(showBackground = true)
@Composable
fun RoomDatabaseScreenPreview() {
    RoomDatabaseScreen()
}