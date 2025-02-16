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

/**
 * صفحه‌ای برای نمایش نحوه استفاده از ناوبری تو در تو در Jetpack Compose
 * این صفحه شامل ناوبری بین صفحات اصلی و زیرصفحات است.
 */
@Composable
fun NestedNavigationScreen() {
    val navController = rememberNavController()

    NavHost(navController = navController, startDestination = "main") {
        composable("main") { MainScreen(navController) }
        navigation(startDestination = "sub1", route = "nested") {
            composable("sub1") { SubScreen1(navController) }
            composable("sub2") { SubScreen2(navController) }
        }
    }
}

/**
 * صفحه اصلی (MainScreen)
 */
@Composable
fun MainScreen(navController: NavController) {
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
            Button(onClick = { navController.navigate("nested/sub1") }) {
                Text(text = "برو به زیرصفحه 1")
            }
            Spacer(modifier = Modifier.height(10.dp))
            Button(onClick = { navController.navigate("nested/sub2") }) {
                Text(text = "برو به زیرصفحه 2")
            }
        }
    }
}

/**
 * زیرصفحه 1 (SubScreen1)
 */
@Composable
fun SubScreen1(navController: NavController) {
    Surface(modifier = Modifier.fillMaxSize(), color = MaterialTheme.colorScheme.background) {
        Column(
            modifier = Modifier
                .padding(16.dp)
                .fillMaxSize(),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Text(text = "زیرصفحه 1", style = MaterialTheme.typography.headlineMedium)
            Spacer(modifier = Modifier.height(20.dp))
            Button(onClick = { navController.popBackStack() }) {
                Text(text = "برگشت به صفحه اصلی")
            }
        }
    }
}

/**
 * زیرصفحه 2 (SubScreen2)
 */
@Composable
fun SubScreen2(navController: NavController) {
    Surface(modifier = Modifier.fillMaxSize(), color = MaterialTheme.colorScheme.background) {
        Column(
            modifier = Modifier
                .padding(16.dp)
                .fillMaxSize(),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Text(text = "زیرصفحه 2", style = MaterialTheme.typography.headlineMedium)
            Spacer(modifier = Modifier.height(20.dp))
            Button(onClick = { navController.popBackStack() }) {
                Text(text = "برگشت به صفحه اصلی")
            }
        }
    }
}

/**
 * پیش‌نمایش صفحه NestedNavigationScreen
 */
@Preview(showBackground = true)
@Composable
fun NestedNavigationScreenPreview() {
    NestedNavigationScreen()
}
