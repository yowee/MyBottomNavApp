package com.sample.myapp.data.anime.model


import com.google.gson.annotations.SerializedName

data class URLhausModelModel(
    @SerializedName("query_status")
    val queryStatus: String,
    @SerializedName("urls")
    val urls: List<UrlModel>
)