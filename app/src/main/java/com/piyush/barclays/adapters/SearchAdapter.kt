package com.piyush.barclays.adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.LinearLayout
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.piyush.barclays.R
import com.piyush.barclays.response.search.Quote

class SearchAdapter (var list : ArrayList<Quote>, var type: ItemClickListener): RecyclerView.Adapter<SearchAdapter.SearchAdapterViewHolder>() {

    inner class SearchAdapterViewHolder(itemView:View):RecyclerView.ViewHolder(itemView){
        val cName: TextView = itemView.findViewById(R.id.c_name)
        val stockName: TextView = itemView.findViewById(R.id.stockName)
        val itemLayout: LinearLayout = itemView.findViewById(R.id.itemLayout)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): SearchAdapterViewHolder {
        val view: View =
            LayoutInflater.from(parent.context)
                .inflate(R.layout.search_layout, parent, false)
        return SearchAdapterViewHolder(view)
    }

    override fun onBindViewHolder(holder: SearchAdapterViewHolder, position: Int) {
        holder.cName.text = list[position].shortname
        holder.stockName.text = list[position].exchange
        holder.itemLayout.setOnClickListener {
            type.onClick(position)
        }
    }

    override fun getItemCount(): Int {
       return list.size
    }

    interface ItemClickListener{
        fun onClick(position: Int)
    }
}