package com.yusufguler.cryptoapp.service

import retrofit2.http.GET
import retrofit2.http.Query

interface CryptoAPI {
    //prices?key=ff6c23229a2ae7af0be1f337c19451bb0e5caf0b
    @GET("prices")
    suspend fun getCryptoList(
        @Query("key") key : String
    ) : Unit

    @GET("currencies")
    suspend fun getCrypto(
        @Query("key") key : String,
        @Query("ids") id : String,
        @Query("attributes") attributes : String
    ) : Unit

}