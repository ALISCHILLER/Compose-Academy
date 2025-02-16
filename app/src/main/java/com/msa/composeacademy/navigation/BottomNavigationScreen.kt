package com.msa.composeacademy.navigation



import androidx.compose.foundation.layout.*
import androidx.compose.material.BottomNavigation
import androidx.compose.material.BottomNavigationItem
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Settings
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import androidx.navigation.compose.*

/**
 * صفحه‌ای برای نمایش نحوه پیاده‌سازی ناوبری پایین در Jetpack Compose
 * این صفحه شامل نوار ناوبری پایین و سه صفحه مختلف است.
 */
@Composable
fun BottomNavigationScreen() {
    val navController = rememberNavController()
    var selectedTab by remember { mutableStateOf("home") }

    Scaffold(
        bottomBar = {
            BottomNavigation {
                BottomNavigationItem(
                    icon = { Icon(Icons.Default.Home, contentDescription = "خانه") },
                    label = { Text("خانه") },
                    selected = selectedTab == "home",
                    onClick = {
                        selectedTab = "home"
                        navController.navigate("home") {
                            popUpTo("home") { inclusive = true }
                        }
                    }
                )
                BottomNavigationItem(
                    icon = { Icon(Icons.Default.Favorite, contentDescription = "علاقه‌مندی‌ها") },
                    label = { Text("علاقه‌مندی‌ها") },
                    selected = selectedTab == "favorites",
                    onClick = {
                        selectedTab = "favorites"
                        navController.navigate("favorites") {
                            popUpTo("home") { inclusive = true }
                        }
                    }
                )
                BottomNavigationItem(
                    icon = { Icon(Icons.Default.Settings, contentDescription = "تنظیمات") },
                    label = { Text("تنظیمات") },
                    selected = selectedTab == "settings",
                    onClick = {
                        selectedTab = "settings"
                        navController.navigate("settings") {
                            popUpTo("home") { inclusive = true }
                        }
                    }
                )
            }
        }
    ) { innerPadding ->
        NavHost(navController = navController, startDestination = "home", Modifier.padding(innerPadding)) {
            composable("home") { HomeScreen(navController) }
            composable("favorites") { FavoritesScreen() }
            composable("settings") { SettingsScreen() }
        }
    }
}

/**
 * صفحه خانه (HomeScreen)
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
            Text(text = "خوش آمدید به صفحه اصلی اپلیکیشن!")
        }
    }
}

/**
 * صفحه علاقه‌مندی‌ها (FavoritesScreen)
 */
@Composable
fun FavoritesScreen() {
    Surface(modifier = Modifier.fillMaxSize(), color = MaterialTheme.colorScheme.background) {
        Column(
            modifier = Modifier
                .padding(16.dp)
                .fillMaxSize(),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Text(text = "صفحه علاقه‌مندی‌ها", style = MaterialTheme.typography.headlineMedium)
            Spacer(modifier = Modifier.height(20.dp))
            Text(text = "در اینجا موارد علاقه‌مندی‌های شما نمایش داده می‌شود.")
        }
    }
}

/**
 * صفحه تنظیمات (SettingsScreen)
 */
@Composable
fun SettingsScreen() {
    Surface(modifier = Modifier.fillMaxSize(), color = MaterialTheme.colorScheme.background) {
        Column(
            modifier = Modifier
                .padding(16.dp)
                .fillMaxSize(),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Text(text = "صفحه تنظیمات", style = MaterialTheme.typography.headlineMedium)
            Spacer(modifier = Modifier.height(20.dp))
            Text(text = "تنظیمات اپلیکیشن در اینجا قابل ویرایش است.")
        }
    }
}

/**
 * پیش‌نمایش صفحه BottomNavigationScreen
 */
@Preview(showBackground = true)
@Composable
fun BottomNavigationScreenPreview() {
    BottomNavigationScreen()
}