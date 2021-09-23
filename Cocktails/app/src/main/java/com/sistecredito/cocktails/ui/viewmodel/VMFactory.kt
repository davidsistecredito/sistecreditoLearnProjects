package com.sistecredito.cocktails.ui.viewmodel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.sistecredito.cocktails.domain.apiCocktailDB

class VMFactory (private val apiCocktailDB: apiCocktailDB):ViewModelProvider.Factory{
    override fun <T : ViewModel?> create(modelClass: Class<T>) : T {
        return modelClass.getConstructor(apiCocktailDB::class.java).newInstance(apiCocktailDB)
    }

}