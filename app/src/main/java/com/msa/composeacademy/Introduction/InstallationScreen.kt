package com.msa.composeacademy.Introduction

import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

/**
 * صفحه‌ای که مراحل نصب Jetpack Compose را توضیح می‌دهد.
 */
@Composable
fun InstallationScreen() {
    Surface(modifier = Modifier.fillMaxSize(), color = MaterialTheme.colorScheme.background) {
        Column(
            modifier = Modifier.padding(16.dp),
            verticalArrangement = Arrangement.spacedBy(16.dp),
            horizontalAlignment = Alignment.Start
        ) {
            Text(text = "نصب Jetpack Compose", style = MaterialTheme.typography.headlineMedium)
            Text(
                text = "برای نصب Jetpack Compose، مراحل زیر را دنبال کنید:",
                style = MaterialTheme.typography.bodyMedium
            )
            Text(
                text = "1. اطمینان حاصل کنید که از Android Studio Arctic Fox یا نسخه‌های بالاتر استفاده می‌کنید.",
                style = MaterialTheme.typography.bodyMedium
            )
            Text(
                text = "2. در فایل build.gradle (Module: app) زیر را اضافه کنید:",
                style = MaterialTheme.typography.bodyMedium
            )
            Text(
                text = """
                dependencies {
                    implementation 'androidx.compose.ui:ui:1.0.0'
                    implementation 'androidx.compose.material:material:1.0.0'
                    implementation 'androidx.compose.ui:ui-tooling:1.0.0'
                }
                """.trimIndent(),
                style = MaterialTheme.typography.bodyMedium
            )
            Text(
                text = "3. همچنین، در فایل build.gradle (Project) زیر را اضافه کنید:",
                style = MaterialTheme.typography.bodyMedium
            )
            Text(
                text = """
                buildscript {
                    ext.kotlin_version = '1.5.21'
                    repositories {
                        google()
                        mavenCentral()
                    }
                    dependencies {
                        classpath "org.jetbrains.kotlin:kotlin-gradle-plugin:kotlin_version"
                    }
                }
                """.trimIndent(),
                style = MaterialTheme.typography.bodyMedium
            )
            Text(
                text = "4. پس از اعمال تغییرات، پروژه را همگام‌سازی کنید.",
                style = MaterialTheme.typography.bodyMedium
            )
        }
    }
}

/**
 * پیش‌نمایش صفحه InstallationScreen
 */
@Preview(showBackground = true)
@Composable
fun InstallationScreenPreview() {
    InstallationScreen()
}

