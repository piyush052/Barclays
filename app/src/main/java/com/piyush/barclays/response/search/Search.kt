package com.piyush.barclays.response.search

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName


class Search {
    @SerializedName("explains")
    @Expose
    var explains: List<Any>? = null

    @SerializedName("count")
    @Expose
    var count: Int? = null

    @SerializedName("quotes")
    @Expose
    var quotes: List<Quote>? = null

    @SerializedName("news")
    @Expose
    var news: List<News>? = null

    @SerializedName("nav")
    @Expose
    var nav: List<Any>? = null

    @SerializedName("lists")
    @Expose
    var lists: List<Any>? = null

    @SerializedName("researchReports")
    @Expose
    var researchReports: List<Any>? = null

    @SerializedName("totalTime")
    @Expose
    var totalTime: Int? = null

    @SerializedName("timeTakenForQuotes")
    @Expose
    var timeTakenForQuotes: Int? = null

    @SerializedName("timeTakenForNews")
    @Expose
    var timeTakenForNews: Int? = null

    @SerializedName("timeTakenForAlgowatchlist")
    @Expose
    var timeTakenForAlgowatchlist: Int? = null

    @SerializedName("timeTakenForPredefinedScreener")
    @Expose
    var timeTakenForPredefinedScreener: Int? = null

    @SerializedName("timeTakenForCrunchbase")
    @Expose
    var timeTakenForCrunchbase: Int? = null

    @SerializedName("timeTakenForNav")
    @Expose
    var timeTakenForNav: Int? = null

    @SerializedName("timeTakenForResearchReports")
    @Expose
    var timeTakenForResearchReports: Int? = null

}