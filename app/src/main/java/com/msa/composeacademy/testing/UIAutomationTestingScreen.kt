package com.msa.composeacademy.testing



import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.test.*
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.test.junit4.createComposeRule
import org.junit.Rule
import org.junit.Test

/**
 * صفحه‌ای برای تست خودکار UI در Jetpack Compose
 * این صفحه شامل یک دکمه و یک متن است که با کلیک بر روی دکمه متن تغییر می‌کند.
 */
@Composable
fun UIAutomationTestingScreen() {
    var text by remember { mutableStateOf("قبل از کلیک") }

    Surface(modifier = Modifier.fillMaxSize(), color = MaterialTheme.colorScheme.background) {
        Column(
            modifier = Modifier.fillMaxSize(),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Text(text = text)
            Spacer(modifier = Modifier.height(16.dp))
            Button(onClick = { text = "بعد از کلیک" }) {
                Text(text = "کلیک کن")
            }
        }
    }
}

/**
 * کلاس تست برای UIAutomationTestingScreen
 */
class UIAutomationTestingScreenTest {
    @get:Rule
    val composeTestRule = createComposeRule()

    @Test
    fun testUIButtonClick() {
        // راه‌اندازی کامپوننت
        composeTestRule.setContent {
            UIAutomationTestingScreen()
        }

        // بررسی متن اولیه
        composeTestRule.onNodeWithText("قبل از کلیک").assertIsDisplayed()

        // کلیک بر روی دکمه
        composeTestRule.onNodeWithText("کلیک کن").performClick()

        // بررسی متن بعد از کلیک
        composeTestRule.onNodeWithText("بعد از کلیک").assertIsDisplayed()
    }
}

/**
 * پیش‌نمایش صفحه UIAutomationTestingScreen
 */
@Preview(showBackground = true)
@Composable
fun UIAutomationTestingScreenPreview() {
    UIAutomationTestingScreen()
}