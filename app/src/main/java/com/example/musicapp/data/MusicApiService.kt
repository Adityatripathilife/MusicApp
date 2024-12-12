package com.example.musicapp.data

import retrofit2.http.GET
import retrofit2.http.Query

interface MusicApiService {
    @GET("?method=chart.racetracks&format=json")
    suspend fun getTopTracks(
        @Query("797cf313c8517f2fa032c03662bb3f8e") apiKey: String
    ): TopTracksResponse
}
