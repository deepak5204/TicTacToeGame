package com.example.tictactoepro

import android.os.Bundle
import android.view.View
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.tictactoepro.ui.theme.TicTacToeProTheme

class MainActivity : ComponentActivity() {

    // player representation
    // 0 - X
    // 1 - O

    val activePlayer = 0
    val gameState = mutableListOf(2, 2, 2, 2, 2, 2, 2, 2, 2)
    // state meanings
    // 0 - X
    // 1 - O
    // 2 - Null

    val winningPositions = arrayOf(
        listOf(0, 1, 2), // Top row
        listOf(3, 4, 5), // Middle row
        listOf(6, 7, 8), // Bottom row
        listOf(0, 3, 6), // Left column
        listOf(1, 4, 7), // Middle column
        listOf(2, 5, 8), // Right column
        listOf(0, 4, 8), // Diagonal \
        listOf(2, 4, 6)  // Diagonal /
    )



    fun playerTap(view: View) {
        // Your logic here
    }

    @Override
    protected  override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        // Use XML layout instead of Compose
        setContentView(R.layout.activity_main)
    }
}
