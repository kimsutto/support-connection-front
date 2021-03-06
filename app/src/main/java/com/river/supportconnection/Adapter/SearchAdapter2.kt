package com.river.supportconnection.Adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.river.supportconnection.R
import com.river.supportconnection.data.Search
import kotlinx.android.synthetic.main.searchrecycler.view.*

class SearchAdapter2: RecyclerView.Adapter<Holder3>() {
    var searchlist = mutableListOf<Search>()
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): Holder3 {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.searchrecycler, parent, false)
        return Holder3(view)
    }

    override fun onBindViewHolder(holder: Holder3, position: Int) {
        val search = searchlist[position]
        if(search.category == "생계비"){
            holder.setSearch(search)
        }
    }

    override fun getItemCount(): Int {
        return searchlist.size
    }
}

class Holder3(itemView: View) : RecyclerView.ViewHolder(itemView){
    fun setSearch(search: Search){
        if (search.category=="생계비") {
            itemView.recname.text= search.name
            itemView.recmoneny.text = search.amount.toString()
            itemView.recicon.setImageResource(R.mipmap.ic_go)
        }
    }
}