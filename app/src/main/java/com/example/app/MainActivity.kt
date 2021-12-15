package com.example.app

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview

class MainActivity : ComponentActivity() {
  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    setContent { Main() }
  }
}

@Composable
fun Main() {
  AppTheme {
    Surface(color = MaterialTheme.colors.background) {
      Column {
        Text(text = "Hello world!")
      }
    }
  }
}

@Preview(showBackground = true)
@Composable
fun MainPreview() {
  Main()
}