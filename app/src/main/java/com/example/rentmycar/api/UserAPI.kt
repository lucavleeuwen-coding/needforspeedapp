package com.example.rentmycar.api

import retrofit2.Call
import com.example.rentmycar.model.Gebruiker
import retrofit2.http.Body
import retrofit2.http.Headers
import retrofit2.http.POST

interface UserAPI {
    @POST("user/login")
    @Headers("Content-Type:application/json")
    fun loginUser(@Body params: Gebruiker): Call<Gebruiker>

    @POST("user/register")
    @Headers("Content-Type:application/json")
    fun registerUser(@Body params: Gebruiker): Call<Gebruiker>

    @POST("user/lower")
    @Headers("Content-Type:application/json")
    fun lowerScore(@Body params: Gebruiker): Call<Int>
}