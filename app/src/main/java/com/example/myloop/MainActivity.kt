package com.example.myloop

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

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MaterialTheme {
                Surface(modifier = Modifier.fillMaxSize()) {
                    MainScreen()
                }
            }
        }
    }
}

@Composable
fun MainScreen() {
    var input by remember { mutableStateOf("") }
    var result by remember { mutableStateOf("Результат") }
    Column() {


        Text(
            text = "Введите число a:",
            style = MaterialTheme.typography.titleMedium
        )

        Spacer(Modifier.height(8.dp))

        OutlinedTextField(
            value = input,
            onValueChange = { input = it },
            label = { Text("например: 2.5") },
            modifier = Modifier.fillMaxWidth()
        )

        Spacer(Modifier.height(8.dp))

        Button(onClick = {  }) {
            Text("OK")
        }

        Spacer(Modifier.height(16.dp))

        Text(
            text = result,
            style = MaterialTheme.typography.bodyLarge
        )
    }

}

@Preview(showBackground = true, widthDp = 360, heightDp = 640)
@Composable
fun MainScreenPreview() {
    MaterialTheme {
        MainScreen()
    }
}