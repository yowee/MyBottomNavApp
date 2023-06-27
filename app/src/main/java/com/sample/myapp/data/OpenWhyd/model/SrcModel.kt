package com.sample.myapp.data.OpenWhyd.model


import com.google.gson.annotations.SerializedName

data class SrcModel(
    @SerializedName("id")
    val id: String,
    @SerializedName("name")
    val name: String
)