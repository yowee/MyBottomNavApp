package com.sample.myapp.remote

import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object ApiDetails{
     const val END_POINT = "random/anime"
     const val URL_RECENT = "urls/recent"
     const val ADRIEN = "/adrien?format=json"
     const val OPENWHYD = "https://openwhyd.org"
     const val ANIME = "https://api.jikan.moe/v4/"
     const val URLHAUS = "https://urlhaus-api.abuse.ch/v1/"

    fun <T>  hitApi(baseUrl: String, classs: Class<T> ): T? {
       return getRetrofitInstance(baseUrl).create(classs) as T?
    }
    fun getRetrofitInstance(baseUrl : String ) = Retrofit.Builder()
        .baseUrl(baseUrl)
        .addConverterFactory(GsonConverterFactory.create())
        .client(getClient())
        .build()


    fun getClient() = OkHttpClient.Builder()
        .addInterceptor(HttpLoggingInterceptor().apply {
            level = HttpLoggingInterceptor.Level.BODY
        })
        .build()

}


