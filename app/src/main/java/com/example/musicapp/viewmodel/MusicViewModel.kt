package com.example.musicapp.viewmodel

import androidx.compose.runtime.mutableStateListOf
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.musicapp.data.ApiClient
import com.example.musicapp.data.Track
import kotlinx.coroutines.launch

class MusicViewModel : ViewModel() {
    private val _tracks = mutableStateListOf<Track>()
    val tracks: List<Track> get() = _tracks

    fun fetchTopTracks(apiKey: String) {
        viewModelScope.launch {
            try {
                val response = ApiClient.musicApiService.getTopTracks(apiKey)
                _tracks.addAll(response.tracks.track)
            } catch (e: Exception) {
                e.printStackTrace()
            }
        }
    }
}
