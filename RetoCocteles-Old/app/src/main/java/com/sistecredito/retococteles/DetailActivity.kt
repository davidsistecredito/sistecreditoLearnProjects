package com.sistecredito.retococteles

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_detail.*

class DetailActivity : AppCompatActivity(){
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)

        val product = intent.getSerializableExtra("producto") as Product

        nameProduct.text = product.name
        descriptionProduct.text = product.description
        imageProduct.setImageResource(product.image)
    }
}