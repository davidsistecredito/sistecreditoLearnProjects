package com.sistecredito.cocktails.data.model

import com.sistecredito.cocktails.vo.Resource

class DataSource {

    val generateCocktailList = Resource.Succes(listOf(
        Cocktail(imagen = "https://img.vixdata.io/pd/jpg-large/es/sites/default/files/imj/elgrancatador/q/quien-invento-la-pina-colada-1.jpg", name = "Piña Colada" , description = "Prepáralo con Piña, Ginebra y azúcar."),
        Cocktail(imagen = "https://www.cocinavital.mx/wp-content/uploads/2018/03/margarita_tradicional-e1582054510330.jpg", name = "Margarita" , description = "Preparación a base de Vodka, agua mineral y fruta."),
        Cocktail(imagen = "https://dg38gzoej82xh.cloudfront.net/sites/default/files/styles/image_gallery_xl/public/images/node/article/beautiful-mojito.jpg?itok=2RgyMLU6", name = "Mojito" , description = "A base de ron, azúcar blanco y hirbabuena.")
    ))
}