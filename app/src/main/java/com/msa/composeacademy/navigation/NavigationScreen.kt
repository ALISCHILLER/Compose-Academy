package com.msa.composeacademy.Navigation

import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import androidx.navigation.compose.*
import androidx.navigation.compose.rememberNavController

/**
 * صفحه‌ای برای نمایش نحوه استفاده از ناوبری در Jetpack Compose
 * این صفحه شامل ناوبری ساده بین دو صفحه است.
 */
@Composable
fun NavigationScreen() {
    // ایجاد NavHostController
    val navController = rememberNavController()

    // تعریف NavHost
    NavHost(navController = navController, startDestination = "home") {
        composable("home") { HomeScreen(navController) }
        composable("details/{itemId}") { backStackEntry ->
            DetailScreen(itemId = backStackEntry.arguments?.getString("itemId") ?: "")
        }
    }
}

/**
 * صفحه اصلی (HomeScreen)
 */
@Composable
fun HomeScreen(navController: NavController) {
    Surface(modifier = Modifier.fillMaxSize(), color = MaterialTheme.colorScheme.background) {
        Column(
            modifier = Modifier
                .padding(16.dp)
                .fillMaxSize(),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Text(text = "صفحه اصلی", style = MaterialTheme.typography.headlineMedium)
            Spacer(modifier = Modifier.height(20.dp))

            // دکمه برای رفتن به صفحه جزئیات
            Button(onClick = { navController.navigate("details/1") }) {
                Text(text = "برو به صفحه جزئیات 1")
            }
            Spacer(modifier = Modifier.height(10.dp))
            Button(onClick = { navController.navigate("details/2") }) {
                Text(text = "برو به صفحه جزئیات 2")
            }
        }
    }
}

/**
 * صفحه جزئیات (DetailScreen)
 */
@Composable
fun DetailScreen(itemId: String) {
    Surface(modifier = Modifier.fillMaxSize(), color = MaterialTheme.colorScheme.background) {
        Column(
            modifier = Modifier
                .padding(16.dp)
                .fillMaxSize(),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Text(text = "صفحه جزئیات", style = MaterialTheme.typography.headlineMedium)
            Spacer(modifier = Modifier.height(20.dp))
            Text(text = "این صفحه جزئیات برای آیتم $itemId است.")
        }
    }
}

/**
 * پیش‌نمایش صفحه NavigationScreen
 */
@Preview(showBackground = true)
@Composable
fun NavigationScreenPreview() {
    NavigationScreen()
}