package com.piyush.barclays.adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.LinearLayout
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.piyush.barclays.R
import com.piyush.barclays.models.Watchlist

class WatchListAdapter(
    var context: Context,
    var list: List<Watchlist>,
    private val clickListener: RecommendationAdapter.ItemClickListener
) :
    RecyclerView.Adapter<WatchListAdapter.WatchListHolder>() {

    inner class WatchListHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val cName = itemView.findViewById<TextView>(R.id.c_name)
        val price = itemView.findViewById<TextView>(R.id.price)
        val stockName = itemView.findViewById<TextView>(R.id.stockName)
        val percentChange = itemView.findViewById<TextView>(R.id.percentChange)
        val parentLayout = itemView.findViewById<LinearLayout>(R.id.parentLayout)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): WatchListHolder {
        val view: View =
            LayoutInflater.from(parent.context)
                .inflate(R.layout.recomendation_layout, parent, false)
        return WatchListHolder(view)
    }

    override fun onBindViewHolder(holder: WatchListHolder, position: Int) {
        holder.cName.text = list[position].cName
        holder.price.text = list[position].price
        holder.stockName.text = list[position].exchange
        holder.percentChange.text = list[position].symbol

        holder.parentLayout.setOnClickListener {
            clickListener.onClick(position)
        }    }

    override fun getItemCount(): Int {
        return list.size
    }
}