package com.example.musicapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.lifecycle.viewmodel.compose.viewModel
import com.example.musicapp.ui.HomeScreen
import com.example.musicapp.viewmodel.MusicViewModel

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            val viewModel: MusicViewModel = viewModel()
            viewModel.fetchTopTracks("797cf313c8517f2fa032c03662bb3f8e")
            HomeScreen(viewModel)
        }
    }
}
