package dev.lchang.hnb

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import dev.lchang.hnb.presentation.navigation.AppNavGraph
import dev.lchang.hnb.ui.theme.AppUETheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            AppUETheme {
                AppNavGraph()
            }
        }
    }
}