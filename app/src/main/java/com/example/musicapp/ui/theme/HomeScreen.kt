package com.example.musicapp.ui

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import coil.compose.rememberAsyncImagePainter
import coil.compose.rememberImagePainter
import com.example.musicapp.data.Track
import com.example.musicapp.viewmodel.MusicViewModel

@Composable
fun HomeScreen(viewModel: MusicViewModel) {
    val tracks = viewModel.tracks

    Column(modifier = Modifier.padding(16.dp)) {
        Text(text = "Top Tracks", style = MaterialTheme.typography.headlineSmall)
        Spacer(modifier = Modifier.height(16.dp))

        LazyColumn {
            items(tracks) { track ->
                TrackItem(track)
            }
        }
    }
}

@Composable
fun TrackItem(track: Track) {
    Row(modifier = Modifier.padding(8.dp)) {
        Image(
            painter = rememberAsyncImagePainter(track.image.firstOrNull()?.text),
            contentDescription = null,
            modifier = Modifier.size(64.dp)
        )
        Spacer(modifier = Modifier.width(8.dp))
        Column {
            Text(text = track.name, style = MaterialTheme.typography.bodyLarge)
            Text(text = track.artist.name, style = MaterialTheme.typography.bodyMedium)
        }
    }
}

