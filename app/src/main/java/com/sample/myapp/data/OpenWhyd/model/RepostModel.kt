package com.sample.myapp.data.OpenWhyd.model


import com.google.gson.annotations.SerializedName

data class RepostModel(
    @SerializedName("pId")
    val pId: String,
    @SerializedName("uId")
    val uId: String,
    @SerializedName("uNm")
    val uNm: String
)