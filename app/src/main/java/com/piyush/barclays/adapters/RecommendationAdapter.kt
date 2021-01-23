package com.piyush.barclays.adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.piyush.barclays.R
import com.piyush.barclays.response.recomondation.Quote

class RecommendationAdapter(var context: Context, var list: List<Quote>) :
    RecyclerView.Adapter<RecommendationAdapter.RecommendationViewHolder>() {


    inner class RecommendationViewHolder(itemView: View) :
        RecyclerView.ViewHolder(itemView) {
          val cName = itemView.findViewById<TextView>(R.id.c_name)
          val price = itemView.findViewById<TextView>(R.id.price)
          val stockName = itemView.findViewById<TextView>(R.id.stockName)
          val percentChange = itemView.findViewById<TextView>(R.id.percentChange)

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecommendationViewHolder {
        val view: View =
            LayoutInflater.from(parent.context)
                .inflate(R.layout.recomendation_layout, parent, false)
        return RecommendationViewHolder(view)
    }

    override fun onBindViewHolder(holder: RecommendationViewHolder, position: Int) {
        holder.cName.text = list[position].fullExchangeName
        holder.price.text = list[position].marketState
        holder.stockName.text = list[position].symbol
        if(list[position].postMarketChange!! >0){
            holder.percentChange.setTextColor(context.resources.getColor(R.color.green))
        }else{
            holder.percentChange.setTextColor(context.resources.getColor(R.color.red_btn))
        }
        holder.percentChange.text = list[position].postMarketChange.toString()
    }

    override fun getItemCount(): Int {
        return list.size
    }
}