package com.example.mealapi

import retrofit2.Response
import retrofit2.http.GET

interface APIService {

    @GET("categories.php")
    suspend fun getCategories(): Category
}