package com.sample.myapp.data.urlhaus.model


import com.google.gson.annotations.SerializedName

data class BlacklistsModel(
    @SerializedName("spamhaus_dbl")
    val spamhausDbl: String,
    @SerializedName("surbl")
    val surbl: String
)