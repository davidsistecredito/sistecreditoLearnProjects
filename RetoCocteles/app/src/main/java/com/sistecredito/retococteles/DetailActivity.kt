package com.sistecredito.retococteles

import android.icu.number.NumberFormatter.with
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.squareup.picasso.Picasso
import kotlinx.android.synthetic.main.activity_detail.*

class DetailActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)

        val product = intent.getSerializableExtra("producto") as Drink

        nameProduct.text = product.strDrink
        descriptionProduct.text = product.strInstructions
        Picasso.get()
            .load(product.strDrinkThumb)
            .placeholder(R.drawable.margarita)
            .error(R.drawable.margarita)
            .fit()
            .into(imageProduct)
    }
}
