package dev.lchang.hnb.presentation.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import dev.lchang.hnb.presentation.home.HomeScreen
import dev.lchang.hnb.presentation.spotify.SpotifyScreen

@Composable
fun AppNavGraph(){

    val navController = rememberNavController()

    NavHost(
        navController = navController,
        startDestination = "home"
    ) {
        composable("home") { HomeScreen(navController) }
        composable("spotify") { SpotifyScreen() }
    }
}
