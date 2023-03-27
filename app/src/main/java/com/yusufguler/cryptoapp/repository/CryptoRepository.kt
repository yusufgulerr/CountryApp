package com.yusufguler.cryptoapp.repository

import com.yusufguler.cryptoapp.model.Crypto
import com.yusufguler.cryptoapp.model.CryptoList
import com.yusufguler.cryptoapp.service.CryptoAPI
import com.yusufguler.cryptoapp.util.Constants.API_KEY
import com.yusufguler.cryptoapp.util.Resource
import dagger.hilt.android.scopes.ActivityScoped
import javax.inject.Inject

@ActivityScoped
class CryptoRepository @Inject constructor(
    private val api : CryptoAPI
){
    suspend fun getCryptoList() : Resource<CryptoList>{
        val response = try{
            api.getCryptoList()
        }catch (e : java.lang.Exception){
            return Resource.Error("Error")
        }
        return Resource.Success(response)
    }
    suspend fun getCrypto() : Resource<Crypto>{
        val response = try{
            api.getCrypto()
        }catch (e : java.lang.Exception){
            return Resource.Error("Error")
        }
        return Resource.Success(response)
    }
}