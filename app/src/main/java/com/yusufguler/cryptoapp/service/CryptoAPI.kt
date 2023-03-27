package com.yusufguler.cryptoapp.service

import com.yusufguler.cryptoapp.model.Crypto
import com.yusufguler.cryptoapp.model.CryptoList
import retrofit2.http.GET
import retrofit2.http.Query

interface CryptoAPI {
    //prices?key=ff6c23229a2ae7af0be1f337c19451bb0e5caf0b
    @GET("atilsamancioglu/IA32-CryptoComposeData/main/cryptolist.json")
    suspend fun getCryptoList() : CryptoList

    @GET("atilsamancioglu/IA32-CryptoComposeData/main/crypto.json")
    suspend fun getCrypto() : Crypto

}