@file:OptIn(ExperimentalMaterial3Api::class)

package com.msa.composeacademy.navigation


import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import androidx.navigation.compose.*
import androidx.navigation.navArgument

class DeepLinkingActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            val navController = rememberNavController()
            NavHost(navController, startDestination = "home") {
                composable("home") { DeepLinkingScreen(navController) }
                composable(
                    "detail/{itemId}",
                    arguments = listOf(navArgument("itemId") { defaultValue = "0" })
                ) { backStackEntry ->
                    val itemId = backStackEntry.arguments?.getString("itemId")
                    DetailScreen(itemId)
                }
            }
        }
    }
}

@Composable
fun DeepLinkingScreen(navController: NavController) {
    Scaffold(
        topBar = {
            TopAppBar(
                title = { Text("پیاده‌سازی Deep Linking") },
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
            Button(onClick = { navController.navigate("detail/1") }) {
                Text("رفتن به جزئیات آیتم 1")
            }
            Spacer(modifier = Modifier.height(16.dp))
            Button(onClick = { navController.navigate("detail/2") }) {
                Text("رفتن به جزئیات آیتم 2")
            }
        }
    }
}

@Composable
fun DetailScreen(itemId: String?) {
    Scaffold(
        topBar = {
            TopAppBar(
                title = { Text("جزئیات آیتم") },
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
            Text(text = "جزئیات آیتم: $itemId", style = MaterialTheme.typography.headlineMedium)
        }
    }
}

@Preview(showBackground = true)
@Composable
fun DeepLinkingScreenPreview() {
    val navController = rememberNavController()
    DeepLinkingScreen(navController)
}