package com.example.basic_kotlin

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Scaffold
import androidx.compose.ui.Modifier
import com.example.basic_kotlin.ui.theme.BasickotlinTheme
import com.example.basic_kotlin.ui.components.NameCard

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            BasickotlinTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    NameCard()
                }
            }
        }
    }
}
