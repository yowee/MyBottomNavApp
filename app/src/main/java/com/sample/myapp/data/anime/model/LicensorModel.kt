package com.sample.myapp.data.anime.model


import com.google.gson.annotations.SerializedName

data class LicensorModel(
    @SerializedName("mal_id")
    val malId: Int,
    @SerializedName("name")
    val name: String,
    @SerializedName("type")
    val type: String,
    @SerializedName("url")
    val url: String
)