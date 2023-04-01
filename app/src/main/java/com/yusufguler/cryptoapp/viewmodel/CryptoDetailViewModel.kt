package com.yusufguler.cryptoapp.viewmodel

import androidx.lifecycle.ViewModel
import com.yusufguler.cryptoapp.model.Crypto
import com.yusufguler.cryptoapp.repository.CryptoRepository
import com.yusufguler.cryptoapp.util.Resource
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class CryptoDetailViewModel@Inject constructor(
    private val repository: CryptoRepository
) : ViewModel(){




    suspend fun getCrypto() : Resource<Crypto>{
        return repository.getCrypto()
    }
}