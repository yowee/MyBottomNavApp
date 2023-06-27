package com.sample.myapp.data.OpenWhyd.model


import com.google.gson.annotations.SerializedName

data class PlModel(
    @SerializedName("id")
    val id: Int,
    @SerializedName("name")
    val name: String
)