package com.sample.myapp.data.anime.model


import com.google.gson.annotations.SerializedName

data class FromModel(
    @SerializedName("day")
    val day: Int,
    @SerializedName("month")
    val month: Int,
    @SerializedName("year")
    val year: Int
)