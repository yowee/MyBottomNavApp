package com.sample.myapp.data.anime.model


import com.google.gson.annotations.SerializedName

data class TitleModel(
    @SerializedName("title")
    val title: String,
    @SerializedName("type")
    val type: String
)