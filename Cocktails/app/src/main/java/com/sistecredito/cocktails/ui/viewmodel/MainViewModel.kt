package com.sistecredito.cocktails.ui.viewmodel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.liveData
import com.sistecredito.cocktails.domain.apiCocktailDB
import com.sistecredito.cocktails.vo.Resource
import kotlinx.coroutines.Dispatchers

class MainViewModel(private val apiCocktailDB: apiCocktailDB):ViewModel(){

    val fetchCocktailList = liveData(Dispatchers.IO){
        emit(Resource.Loading())
        try {
            emit(apiCocktailDB.getMain())

        } catch (e: Exception){
            emit(Resource.Failure(e))
        }
    }

}