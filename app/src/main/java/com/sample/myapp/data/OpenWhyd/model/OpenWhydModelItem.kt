package com.sample.myapp.data.OpenWhyd.model


import com.google.gson.annotations.SerializedName

data class OpenWhydModelItem(
    @SerializedName("ctx")
    val ctx: String,
    @SerializedName("eId")
    val eId: String,
    @SerializedName("_id")
    val id: String,
    @SerializedName("img")
    val img: String,
    @SerializedName("lov")
    val lov: List<String>,
    @SerializedName("name")
    val name: String,
    @SerializedName("nbP")
    val nbP: Int,
    @SerializedName("nbR")
    val nbR: Int,
    @SerializedName("pl")
    val pl: PlModel,
    @SerializedName("repost")
    val repost: RepostModel,
    @SerializedName("src")
    val src: SrcModel,
    @SerializedName("text")
    val text: String,
    @SerializedName("uId")
    val uId: String,
    @SerializedName("uNm")
    val uNm: String
)