package com.piyush.barclays.ui.home.viewModel

import androidx.lifecycle.MutableLiveData
import com.piyush.barclays.base.MyBaseViewModel
import com.piyush.barclays.models.Watchlist

class WatchListViewModel : MyBaseViewModel() {
    var emptyLiveData: MutableLiveData<Boolean> = MutableLiveData()
    var watchListViewModel: MutableLiveData<ArrayList<Watchlist>> = MutableLiveData()

    fun getWatchListData(data: HashMap<String, Watchlist>) {
        if (data.isEmpty()) emptyLiveData.postValue(true)
        else {
            val list: ArrayList<Watchlist> = ArrayList()
            list.addAll(data.values)
            list.sortWith(object : Comparator<Watchlist> {
                override fun compare(p0: Watchlist?, p1: Watchlist?): Int {
                    if (p0 == null || p1 == null) {
                        return 0
                    }
                    return p0.cName.compareTo(p1.cName)
                }
            })

            watchListViewModel.postValue(list)
        }

    }

}