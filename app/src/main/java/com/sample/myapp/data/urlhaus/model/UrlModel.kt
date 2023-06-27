package com.sample.myapp.data.urlhaus.model


import com.google.gson.annotations.SerializedName

data class UrlModel(
    @SerializedName("blacklists")
    val blacklists: BlacklistsModel,
    @SerializedName("date_added")
    val dateAdded: String,
    @SerializedName("host")
    val host: String,
    @SerializedName("id")
    val id: Int,
    @SerializedName("larted")
    val larted: String,
    @SerializedName("reporter")
    val reporter: String,
    @SerializedName("tags")
    val tags: List<String>,
    @SerializedName("threat")
    val threat: String,
    @SerializedName("url")
    val url: String,
    @SerializedName("url_status")
    val urlStatus: String,
    @SerializedName("urlhaus_reference")
    val urlhausReference: String
)