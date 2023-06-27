package com.sample.myapp.remote

import com.sample.myapp.data.urlhaus.model.URLhausModel
import retrofit2.http.GET

interface URLhausAPI {

    @GET(ApiDetails.URL_RECENT)
    suspend fun getUrlRecent(): URLhausModel

}