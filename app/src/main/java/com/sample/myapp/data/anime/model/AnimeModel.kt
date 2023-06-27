package com.sample.myapp.data.anime.model


import com.google.gson.annotations.SerializedName

data class AnimeModel(
    @SerializedName("data")
    val data: DataModel
)