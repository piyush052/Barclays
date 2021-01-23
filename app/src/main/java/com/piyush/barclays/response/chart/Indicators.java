
package com.piyush.barclays.response.chart;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Indicators {

    @SerializedName("quote")
    @Expose
    private List<Quote> quote = null;

    public List<Quote> getQuote() {
        return quote;
    }

    public void setQuote(List<Quote> quote) {
        this.quote = quote;
    }

}
