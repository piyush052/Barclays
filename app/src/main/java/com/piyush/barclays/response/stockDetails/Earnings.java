
package com.piyush.barclays.response.stockDetails;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Earnings {

    @SerializedName("earningsDate")
    @Expose
    private List<EarningsDate> earningsDate = null;
    @SerializedName("earningsAverage")
    @Expose
    private EarningsAverage earningsAverage;
    @SerializedName("earningsLow")
    @Expose
    private EarningsLow earningsLow;
    @SerializedName("earningsHigh")
    @Expose
    private EarningsHigh earningsHigh;
    @SerializedName("revenueAverage")
    @Expose
    private RevenueAverage revenueAverage;
    @SerializedName("revenueLow")
    @Expose
    private RevenueLow revenueLow;
    @SerializedName("revenueHigh")
    @Expose
    private RevenueHigh revenueHigh;

    public List<EarningsDate> getEarningsDate() {
        return earningsDate;
    }

    public void setEarningsDate(List<EarningsDate> earningsDate) {
        this.earningsDate = earningsDate;
    }

    public EarningsAverage getEarningsAverage() {
        return earningsAverage;
    }

    public void setEarningsAverage(EarningsAverage earningsAverage) {
        this.earningsAverage = earningsAverage;
    }

    public EarningsLow getEarningsLow() {
        return earningsLow;
    }

    public void setEarningsLow(EarningsLow earningsLow) {
        this.earningsLow = earningsLow;
    }

    public EarningsHigh getEarningsHigh() {
        return earningsHigh;
    }

    public void setEarningsHigh(EarningsHigh earningsHigh) {
        this.earningsHigh = earningsHigh;
    }

    public RevenueAverage getRevenueAverage() {
        return revenueAverage;
    }

    public void setRevenueAverage(RevenueAverage revenueAverage) {
        this.revenueAverage = revenueAverage;
    }

    public RevenueLow getRevenueLow() {
        return revenueLow;
    }

    public void setRevenueLow(RevenueLow revenueLow) {
        this.revenueLow = revenueLow;
    }

    public RevenueHigh getRevenueHigh() {
        return revenueHigh;
    }

    public void setRevenueHigh(RevenueHigh revenueHigh) {
        this.revenueHigh = revenueHigh;
    }

}
