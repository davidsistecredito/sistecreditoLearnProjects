package com.sistecredito.retococteles

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(){

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val productOne = Product(R.drawable.margarita, "Margarita", "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Nam neque risus, malesuada nec pretium facilisis, viverra id justo. Proin at finibus nibh. Cras sed urna facilisis, venenatis mauris vitae, ultrices orci. Curabitur eget ornare mauris. Mauris neque sapien, laoreet quis finibus facilisis, posuere sit amet mauris. Nullam tellus lorem, volutpat sit amet magna eget, ultrices ultricies orci. Nulla leo quam, blandit ut neque nec, iaculis ullamcorper tellus." +
                " Etiam rutrum gravida erat id tincidunt. Sed posuere dolor est, vitae dignissim enim condimentum a. Duis dui metus, scelerisque vulputate tempus id, tincidunt posuere lectus. Suspendisse at nunc eu magna viverra ultricies. Vestibulum ante ipsum primis in faucibus orci luctus et ultrices posuere cubilia curae")
        val productTwo = Product(R.drawable.pina_colada, "Piña Colada", "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Praesent nisl lorem, pharetra ut nibh sit amet, lobortis pharetra justo. Nulla eleifend ante a tellus pharetra iaculis. Duis sem tellus, placerat ac tortor vel, sollicitudin pretium lectus. Nunc sed velit lobortis, vehicula purus ut, tincidunt tortor. Etiam accumsan consectetur efficitur. Nulla leo massa, dignissim vel cursus et, hendrerit ut neque. Maecenas eget arcu ut ipsum lacinia molli")
        val productThree = Product(R.drawable.mojito, "Mojito", "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Proin pharetra nisl eget mi varius cursus. In ut turpis ut lacus laoreet tincidunt ac vitae mauris. Sed lacus ex, pretium non leo commodo, mollis fermentum tellus. Nunc a sapien nulla. Aenean sem ligula, faucibus porttitor scelerisque ornare, aliquam id orci. Cras bibendum convallis sollicitudin. Fusce blandit maximus lorem, id finibus dolor efficitur mattis. In in lobortis risus. Praesent luctus, " +
                "arcu eu accumsan feugiat, metus ex ultricies dolor, sit amet bibendum orci turpis ac nisl. Duis pellentesque posuere convallis. Pellentesque feugiat eros pretium finibus pretium. Ut dapibus erat vitae sodales volutpat. Donec eget libero porta, pretium urna a, pharetra massa. Sed dolor turpis, hendrerit eget condimentum et, venenatis ac diam.")

        val listaProductos = listOf(productOne, productTwo, productThree, productOne, productTwo, productThree, productOne, productTwo, productThree)

        val adapter = ProductAdapter(this, listaProductos)

        listView.adapter = adapter

        listView.setOnItemClickListener { parent, view, position, id ->
            val intent = Intent(this, DetailActivity::class.java)
            intent.putExtra("producto", listaProductos[position])
            startActivity(intent)
        }

    }
}
