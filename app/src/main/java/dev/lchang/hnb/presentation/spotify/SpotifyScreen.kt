package dev.lchang.hnb.presentation.spotify

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Card
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import coil.compose.rememberImagePainter
import dev.lchang.hnb.R
import dev.lchang.hnb.data.model.SpotifyModel

val mockSpotify = listOf(
    SpotifyModel("Blinding Lights", "The Weeknd", R.drawable.week),
    SpotifyModel("Levitating", "Dua Lipa", R.drawable.dua),
    SpotifyModel("Get Lucky", "Daft Punk", R.drawable.ger),
    SpotifyModel("Tití Me Preguntó", "Bad Bunny", R.drawable.badb)
)

@Composable
fun SpotifyScreen() {
    Column(
        modifier = Modifier.fillMaxSize()
    ) {
        // CABECERA
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .height(180.dp)
                .background(
                    Brush.verticalGradient(
                        colors = listOf(Color(0xFF1DB954), Color(0xFF191414)) // Verde Spotify → Negro
                    )
                ),
            contentAlignment = Alignment.Center
        ) {
            Column(horizontalAlignment = Alignment.CenterHorizontally) {
                Text(
                    text = "🎶 Spotify Recomendados",
                    fontSize = 24.sp,
                    fontWeight = FontWeight.Bold,
                    color = Color.White
                )
                Spacer(modifier = Modifier.height(6.dp))
                Text(
                    text = "Lo mejor para ti",
                    fontSize = 16.sp,
                    color = Color.LightGray
                )
            }
        }

        // CONTENIDO CON FONDO CELESTE
        Box(
            modifier = Modifier
                .fillMaxSize()
                .background(Color(0xFFB3E5FC)) // celeste clarito
        ) {
            LazyColumn(
                modifier = Modifier.padding(16.dp)
            ) {
                items(mockSpotify) { song ->
                    Card(
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(vertical = 8.dp)
                    ) {
                        Row(modifier = Modifier.padding(12.dp)) {
                            Image(
                                painter = rememberImagePainter(song.imageRes),
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
}