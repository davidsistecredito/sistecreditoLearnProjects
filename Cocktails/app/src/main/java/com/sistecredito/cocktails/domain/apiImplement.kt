package com.sistecredito.cocktails.domain

import com.sistecredito.cocktails.data.model.DataSource
import com.sistecredito.cocktails.vo.Resource

class apiImplement(private val dataSource: DataSource): apiCocktailDB {

    override fun getMain(): Resource<List<Coctel>> {
        return dataSource.generateCocktailList()
    }
}