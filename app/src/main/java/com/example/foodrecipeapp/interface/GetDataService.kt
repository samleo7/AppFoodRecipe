package com.example.foodrecipeapp.`interface`

import com.example.foodrecipeapp.entities.Category
import com.example.foodrecipeapp.entities.Meal
import com.example.foodrecipeapp.entities.MealResponse
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query

interface GetDataService {
    @GET("categories.php")
    fun getCategoryList(): Call<Category>

    @GET("filter.php")
    fun getMealList(@Query("c")category:String):Call<Meal>

    @GET("lookup.php")
    fun getSpecificItem(@Query("i")id:String):Call<MealResponse>

}