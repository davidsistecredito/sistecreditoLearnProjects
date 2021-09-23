package com.sistecredito.retococteles

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import kotlinx.android.synthetic.main.item_producto.view.*

class ProductAdapter(private val mContext: Context, private val productList: List<Product>) : ArrayAdapter<Product>(mContext, 0, productList ) {
    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {
        val layout = LayoutInflater.from(mContext).inflate(R.layout.item_producto, parent, false)

        val product = productList[position]

        layout.name.text = product.name
        layout.description.text = product.description
        layout.imageView.setImageResource(product.image)

        return layout
    }

}