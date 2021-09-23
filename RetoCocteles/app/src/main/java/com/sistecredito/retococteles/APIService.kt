package com.sistecredito.retococteles

import retrofit2.http.GET
import retrofit2.http.Query

interface APIService {
    @GET ("search.php?s=")
    suspend fun  getCocktailByName(@Query("margarita") cocktailName:String):Drink

}