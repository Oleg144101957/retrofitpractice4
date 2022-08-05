package com.vishnevskiypro.retrofitpractice4.data.repository

import com.vishnevskiypro.retrofitpractice4.data.api.RetrofitInstance
import com.vishnevskiypro.retrofitpractice4.model.beznal.Beznalichka
import com.vishnevskiypro.retrofitpractice4.model.nal.Nalichka
import retrofit2.Response

class Repository {

    suspend fun getNalRep() : Response<Nalichka> {
        return RetrofitInstance.api.getNalMoney()
    }

    suspend fun getBeznalRep() : Response<Beznalichka>{
        return RetrofitInstance.api.getBeznalMoney()
    }

}