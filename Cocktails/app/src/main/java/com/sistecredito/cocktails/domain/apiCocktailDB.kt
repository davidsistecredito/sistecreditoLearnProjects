package com.sistecredito.cocktails.domain

import com.sistecredito.cocktails.vo.Resource

interface apiCocktailDB {
    fun getMain(): Resource<List<Coctel>>{}
}


