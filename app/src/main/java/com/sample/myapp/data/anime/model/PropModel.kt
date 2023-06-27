package com.sample.myapp.data.anime.model


import com.google.gson.annotations.SerializedName

data class PropModel(
    @SerializedName("from")
    val from: FromModel,
    @SerializedName("string")
    val string: String,
    @SerializedName("to")
    val to: ToModel
)