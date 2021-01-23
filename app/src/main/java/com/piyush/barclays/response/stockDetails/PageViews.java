
package com.piyush.barclays.response.stockDetails;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class PageViews {

    @SerializedName("shortTermTrend")
    @Expose
    private String shortTermTrend;
    @SerializedName("midTermTrend")
    @Expose
    private String midTermTrend;
    @SerializedName("longTermTrend")
    @Expose
    private String longTermTrend;
    @SerializedName("maxAge")
    @Expose
    private Integer maxAge;

    public String getShortTermTrend() {
        return shortTermTrend;
    }

    public void setShortTermTrend(String shortTermTrend) {
        this.shortTermTrend = shortTermTrend;
    }

    public String getMidTermTrend() {
        return midTermTrend;
    }

    public void setMidTermTrend(String midTermTrend) {
        this.midTermTrend = midTermTrend;
    }

    public String getLongTermTrend() {
        return longTermTrend;
    }

    public void setLongTermTrend(String longTermTrend) {
        this.longTermTrend = longTermTrend;
    }

    public Integer getMaxAge() {
        return maxAge;
    }

    public void setMaxAge(Integer maxAge) {
        this.maxAge = maxAge;
    }

}
