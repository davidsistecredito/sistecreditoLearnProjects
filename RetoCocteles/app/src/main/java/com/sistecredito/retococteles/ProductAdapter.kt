package com.sistecredito.retococteles

import android.content.Context
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.Filter
import kotlinx.android.synthetic.main.item_producto.view.*

class ProductAdapter(
    private val mContext: Context,
    private val productList: List<Drink>
) : ArrayAdapter<Product>(mContext, 0, productList) {

    private var filter: Filter? = null
    private var mutableProductList: MutableList<Product> = productList.toMutableList()

    override fun getView(
        position: Int,
        convertView: View?,
        parent: ViewGroup
    ): View {
        val layout = LayoutInflater.from(mContext)
            .inflate(R.layout.item_producto, parent, false)

        if (position < mutableProductList.size) {
            val product = mutableProductList[position]

            layout.name.text = product.strDrink
            layout.description.text = product.strInstructions
            layout.imageView.setImageResource(product.strDrinkThumb)
        }

        return layout
    }

    override fun getFilter(): Filter {
        if (filter == null) {
            filter = ProductFilter()
        }
        return filter!!
    }

    inner class ProductFilter : Filter() {
        override fun performFiltering(text: CharSequence?): FilterResults {
            val results = FilterResults()
            text?.let {
                val list = mutableListOf<Product>()
                val productNames = mutableListOf<String>()
                productList.forEach {
                    productNames.add(Product.strDrink)
                }
                productNames.forEachIndexed { index, productName ->
                    if (productName.toLowerCase().contains(text)) {
                        list.add(productList[index])
                    } else {
                        Log.d("ProductAdapter", "'$text' is not on the list")
                    }
                }
                results.values = list
                results.count = list.size
            }
            return results
        }

        override fun publishResults(
            text: CharSequence?,
            results: FilterResults?
        ) {
            mutableProductList = results?.values as MutableList<Product>
            notifyDataSetChanged()
        }
    }
}
