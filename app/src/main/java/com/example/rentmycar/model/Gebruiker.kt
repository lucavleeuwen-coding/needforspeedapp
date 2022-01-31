package com.example.rentmycar.model

import com.google.gson.annotations.SerializedName

class Gebruiker (
    @SerializedName("id") val id: Int?,
    @SerializedName("email") val email: String?,
    @SerializedName("firstName") val firstName: String?,
    @SerializedName("lastName") val lastName: String?,
    @SerializedName("address") val address: String?,
    @SerializedName("phone") val phone: String?,
    @SerializedName("socialCredit") val socialCredit: Int?,
    @SerializedName("longitude") val longitude: Double?,
    @SerializedName("latitude") val latitude: Double?,
    @SerializedName("loggedIn") val loggedIn: Boolean?,
    @SerializedName("username") val username: String?,
    @SerializedName("password") val password: String?,
    @SerializedName("trips") val trips: List<Trip>?,
    @SerializedName("cars") val cars: List<Car>?
)