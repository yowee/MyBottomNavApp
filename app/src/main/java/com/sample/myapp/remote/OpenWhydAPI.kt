package com.sample.myapp.remote

import com.sample.myapp.data.OpenWhyd.model.OpenWhydModel
import retrofit2.http.GET

interface OpenWhydAPI {

    @GET(ApiDetails.ADRIEN)
    suspend fun getAdrien(): OpenWhydModel

}