package com.vishnevskiypro.retrofitpractice4.data.api

import com.vishnevskiypro.retrofitpractice4.model.beznal.Beznalichka
import com.vishnevskiypro.retrofitpractice4.model.nal.Nalichka
import retrofit2.Response
import retrofit2.http.GET

interface ApiService {

    @GET("/p24api/pubinfo?json&exchange&coursid=5")
    suspend fun getNalMoney() : Response<Nalichka>

    @GET("/p24api/pubinfo?exchange&json&coursid=11")
    suspend fun getBeznalMoney() : Response<Beznalichka>


}