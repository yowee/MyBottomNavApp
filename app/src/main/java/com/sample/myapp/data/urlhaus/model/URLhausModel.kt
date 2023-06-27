package com.sample.myapp.data.urlhaus.model


import com.google.gson.annotations.SerializedName

data class URLhausModel(
    @SerializedName("query_status")
    val queryStatus: String,
    @SerializedName("urls")
    val urls: List<UrlModel>
)