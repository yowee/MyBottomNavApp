package com.sample.myapp.data.anime.model


import com.google.gson.annotations.SerializedName

data class JpgModel(
    @SerializedName("image_url")
    val imageUrl: String,
    @SerializedName("large_image_url")
    val largeImageUrl: String,
    @SerializedName("small_image_url")
    val smallImageUrl: String
)