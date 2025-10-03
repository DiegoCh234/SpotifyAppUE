package dev.lchang.hnb.presentation.spotify

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Card
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.unit.dp
import coil.compose.rememberAsyncImagePainter
import dev.lchang.hnb.data.model.SpotifyModel

// Datos de ejemplo (mock) con portadas reales
val mockSpotify = listOf(
    SpotifyModel(
        "Blinding Lights",
        "The Weeknd",
        "https://upload.wikimedia.org/wikipedia/en/0/09/The_Weeknd_-_Blinding_Lights.png"
    ),
    SpotifyModel(
        "Levitating",
        "Dua Lipa",
        "https://upload.wikimedia.org/wikipedia/en/1/1e/Dua_Lipa_-_Levitating.png"
    ),
    SpotifyModel(
        "Get Lucky",
        "Daft Punk",
        "https://upload.wikimedia.org/wikipedia/en/7/70/Daft_Punk_-_Get_Lucky.png"
    ),
    SpotifyModel(
        "Tití Me Preguntó",
        "Bad Bunny",
        "https://upload.wikimedia.org/wikipedia/en/0/0a/Bad_Bunny_-_Un_Verano_Sin_Ti.png"
    )
)

@Composable
fun SpotifyScreen() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp)
    ) {
        Text(
            text = "🎶 Recomendados en Spotify",
            style = MaterialTheme.typography.headlineMedium
        )

        Spacer(modifier = Modifier.height(8.dp))

        LazyColumn {
            items(mockSpotify) { song ->
                Card(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(vertical = 8.dp)
                ) {
                    Row(modifier = Modifier.padding(12.dp)) {
                        Image(
                            painter = rememberAsyncImagePainter(song.imageUrl),
                            contentDescription = song.title,
                            modifier = Modifier.size(64.dp),
                            contentScale = ContentScale.Crop
                        )
                        Spacer(modifier = Modifier.width(12.dp))
                        Column {
                            Text(
                                text = song.title,
                                style = MaterialTheme.typography.titleMedium
                            )
                            Text(
                                text = song.artist,
                                style = MaterialTheme.typography.bodyMedium
                            )
                        }
                    }
                }
            }
        }
    }
}