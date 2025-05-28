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
