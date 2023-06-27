package com.sample.myapp.remote

import com.sample.myapp.data.anime.model.AnimeModel
import retrofit2.http.GET

interface ApiCall {

    @GET(ApiDetails.END_POINT)
    suspend fun getRandomAnime(): AnimeModel
}
