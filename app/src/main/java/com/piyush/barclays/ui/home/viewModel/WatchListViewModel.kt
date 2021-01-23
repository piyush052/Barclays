package com.piyush.barclays.ui.home.viewModel

import androidx.lifecycle.MutableLiveData
import com.piyush.barclays.base.MyBaseViewModel
import com.piyush.barclays.response.search.Quote

class WatchListViewModel : MyBaseViewModel() {
    var emptyLiveData: MutableLiveData<Boolean> = MutableLiveData()
    var watchListViewModel: MutableLiveData<ArrayList<Quote>> = MutableLiveData()

}