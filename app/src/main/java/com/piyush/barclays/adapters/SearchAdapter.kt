package com.piyush.barclays.adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.LinearLayout
import android.widget.RelativeLayout
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.piyush.barclays.R
import com.piyush.barclays.api.SharedPrefManager
import com.piyush.barclays.models.Watchlist
import com.piyush.barclays.response.search.Quote

class SearchAdapter (private val context: Context, var list : ArrayList<Quote>, var type: ItemClickListener): RecyclerView.Adapter<SearchAdapter.SearchAdapterViewHolder>() {

    inner class SearchAdapterViewHolder(itemView:View):RecyclerView.ViewHolder(itemView){
        val cName: TextView = itemView.findViewById(R.id.c_name)
        val stockName: TextView = itemView.findViewById(R.id.stockName)
        val itemLayout: RelativeLayout = itemView.findViewById(R.id.itemLayout)
        val watchList: ImageView = itemView.findViewById(R.id.watchList)
        init {
            watchList.setOnClickListener {
                watchList.setImageDrawable(context.getDrawable(R.drawable.ic_baseline_done_outline))
                val quote: Quote = list[adapterPosition]
                val hasmap: HashMap<String, Watchlist> = SharedPrefManager.getInstance(context).getWatchListData()
                if (hasmap.containsKey(quote.symbol)) {
                    type.onWatchListClick(true)
                } else {
                    type.onWatchListClick(false)
                    quote.symbol?.let { it1 ->
                        hasmap[it1] =
                            Watchlist(quote.symbol!!, quote.exchange!!, quote.shortname!!, quote.score!!.toString())
                        SharedPrefManager.getInstance(context).setWatchListData(hasmap)
                    }
                }

            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): SearchAdapterViewHolder {
        val view: View =
            LayoutInflater.from(parent.context)
                .inflate(R.layout.search_layout, parent, false)
        return SearchAdapterViewHolder(view)
    }

    override fun onBindViewHolder(holder: SearchAdapterViewHolder, position: Int) {
        holder.cName.text = list[position].shortname + "(${list[position].symbol})"
        holder.stockName.text = list[position].score.toString()
        val hasmap: HashMap<String, Watchlist> = SharedPrefManager.getInstance(context).getWatchListData()
        if(hasmap.containsKey(list[position].symbol)){
            holder.watchList.setImageDrawable(context.getDrawable(R.drawable.ic_baseline_done_outline))
        }else{
           holder.watchList.setImageDrawable(context.getDrawable(R.drawable.ic_add_box))
        }
        holder.itemLayout.setOnClickListener {
            type.onClick(position)
        }
    }

    override fun getItemCount(): Int {
       return list.size
    }

    interface ItemClickListener{
        fun onClick(position: Int)
        fun onWatchListClick(isAdded: Boolean)
    }

}