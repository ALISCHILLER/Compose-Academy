@file:OptIn(ExperimentalMaterial3Api::class)

package com.msa.composeacademy.navigation


import androidx.compose.animation.*
import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import androidx.navigation.compose.*

@OptIn(ExperimentalAnimationApi::class)
@Composable
fun NavigationAnimationsScreen(navController: NavController) {
    var isVisible by remember { mutableStateOf(true) }

    Scaffold(
        topBar = {
            TopAppBar(
                title = { Text("انیمیشن‌ها در ناوبری") },
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
            AnimatedVisibility(
                visible = isVisible,
                enter = fadeIn() + slideInVertically(initialOffsetY = { -it }),
                exit = fadeOut() + slideOutVertically(targetOffsetY = { -it })
            ) {
                Text(
                    text = "این متن انیمیشن دارد!",
                    style = MaterialTheme.typography.headlineMedium
                )
            }
            Spacer(modifier = Modifier.height(16.dp))
            Button(onClick = { isVisible = !isVisible }) {
                Text("تغییر وضعیت انیمیشن")
            }
            Spacer(modifier = Modifier.height(16.dp))
            Button(onClick = { navController.navigate("next") }) {
                Text("رفتن به صفحه بعدی")
            }
        }
    }
}

@Composable
fun NextAnimationScreen(navController: NavController) {
    Scaffold(
        topBar = {
            TopAppBar(
                title = { Text("صفحه بعدی") },
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
            Text(text = "این صفحه بعدی است.", style = MaterialTheme.typography.headlineMedium)
            Spacer(modifier = Modifier.height(16.dp))
            Button(onClick = { navController.popBackStack() }) {
                Text("بازگشت")
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun NavigationAnimationsScreenPreview() {
    val navController = rememberNavController()
    NavHost(navController, startDestination = "home") {
        composable("home") { NavigationAnimationsScreen(navController) }
        composable("next") { NextAnimationScreen(navController) }
    }
}