package com.sistecredito.cocktails.ui

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.sistecredito.cocktails.R
import com.sistecredito.cocktails.base.BaseViewHolder
import com.sistecredito.cocktails.data.model.Cocktail
import kotlinx.android.synthetic.main.cocktail_row.view.*

class MainRecyclerAdapter(private val cotext: Context, private val cocktalList: List<Cocktail>): RecyclerView.Adapter<BaseViewHolder<*>>(){
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): BaseViewHolder<*> {
        return MainViewHolder(LayoutInflater.from(Context).inflate(R.layout.cocktail_row,parent,false))
    }

    override fun getItemCount(): Int {
        return cocktalList.size
    }

    override fun onBindViewHolder(holder: BaseViewHolder<*>, position: Int) {
        when(holder){
            is MainViewHolder -> holder.bind(cocktalList[position],position)
        }
    }

    inner class MainViewHolder(itemView: View): BaseViewHolder<Cocktail>(itemView){
        override fun bind(item: Cocktail, position: Int) {
            Glide.with(Context).load(item.imagen).into(itemView.imgCocktail)
            itemView.txtTitulo.text = item.name
            itemView.txtDescription.text = item.description
        }
    }
}


