package com.example.tictactoepro

import android.media.Image
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.ImageView
import android.widget.TextView
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
import androidx.core.content.ContextCompat
import com.example.tictactoepro.ui.theme.TicTacToeProTheme

class MainActivity : ComponentActivity() {

    // player representation
    // 0 - X
    // 1 - O

    private var activePlayer = 0
    private val gameState = mutableListOf(2, 2, 2, 2, 2, 2, 2, 2, 2)
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
        val img = view as ImageView
        val tappedImage = img.tag.toString().toInt()

        if (gameState[tappedImage] == 2) {
            gameState[tappedImage] = activePlayer
            img.translationY = -1000f

            val status: TextView = findViewById(R.id.textView)
            if (activePlayer == 0) {
                img.setImageDrawable(ContextCompat.getDrawable(this, R.drawable.x))
                activePlayer = 1
                status.text = "O's Turn - Tap to play"
            } else {
                img.setImageDrawable(ContextCompat.getDrawable(this, R.drawable.o))
                activePlayer = 0
                status.text = "X's Turn - Tap to play"
            }

            img.animate().translationYBy(1000f).duration = 300
        }
    }


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}
