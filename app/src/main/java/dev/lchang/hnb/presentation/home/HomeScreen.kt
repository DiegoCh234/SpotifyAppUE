package dev.lchang.hnb.presentation.home

import androidx.compose.foundation.layout.*
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController

@Composable
fun HomeScreen(navController: NavController) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp),
    ) {
        Text(text = "Pantalla Principal")

        Spacer(modifier = Modifier.height(16.dp))

        Button(
            onClick = { navController.navigate("spotify") },
            modifier = Modifier.fillMaxWidth()
        ) {
            Text("Ir a Spotify 🎵")
        }
    }
}