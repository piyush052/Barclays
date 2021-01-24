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
            val list: ArrayList<Watchlist> = ArrayList();
            list.addAll(data.values)
            watchListViewModel.postValue(list)
        }

    }

}