package com.example.musicapp.data

import com.google.gson.annotations.SerializedName

data class TopTracksResponse(
    val tracks: Tracks
)

data class Tracks(
    val track: List<Track>
)

data class Track(
    val name: String,
    val artist: Artist,
    val image: List<Image>
)

data class Artist(
    val name: String
)

data class Image(
    @SerializedName("#text")
    val text: String
)

