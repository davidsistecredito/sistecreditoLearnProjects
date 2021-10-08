package com.sistecredito.retococteles

import android.content.Intent
import android.os.Bundle
import android.widget.*
import androidx.appcompat.app.AppCompatActivity
import com.google.gson.GsonBuilder
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val search = findViewById<SearchView>(R.id.srcBuscar)




        val listaProductos = Product(Product)

        val adapter = ProductAdapter(this, listaProductos)

        listView.adapter = adapter

        listView.setOnItemClickListener { parent, view, position, id ->
            val intent = Intent(this, DetailActivity::class.java)
            intent.putExtra("producto", listaProductos[position])
            startActivity(intent)
        }

        search.setOnQueryTextListener(
            object : SearchView.OnQueryTextListener {
                override fun onQueryTextSubmit(text: String?): Boolean {
                    return false
                }

                override fun onQueryTextChange(text: String?): Boolean {
                    filterProducts(text)
                    return false
                }
            }
        )
    }

    private fun filterProducts(text: String?) {
        (listView.adapter as ArrayAdapter<Product>).filter.filter(text)
    }

    private fun getRetrofit(): APIService {
        val gson = GsonBuilder()
            .setLenient()
            .create()
        return Retrofit.Builder()
            .baseUrl("www.thecocktaildb.com/api/json/v1/1/")
            .addConverterFactory(GsonConverterFactory.create(GsonBuilder().create(gson)))
            .build().create(APIService::class.java)
    }

    private fun getCocktail(query:String){
        CoroutineScope(Dispatchers.IO).launch {
            val call = getRetrofit()
        }
    }
}
