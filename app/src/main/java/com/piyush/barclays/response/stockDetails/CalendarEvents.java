
package com.piyush.barclays.response.stockDetails;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class CalendarEvents {

    @SerializedName("maxAge")
    @Expose
    private Integer maxAge;
    @SerializedName("earnings")
    @Expose
    private Earnings earnings;
    @SerializedName("exDividendDate")
    @Expose
    private ExDividendDate exDividendDate;
    @SerializedName("dividendDate")
    @Expose
    private DividendDate dividendDate;

    public Integer getMaxAge() {
        return maxAge;
    }

    public void setMaxAge(Integer maxAge) {
        this.maxAge = maxAge;
    }

    public Earnings getEarnings() {
        return earnings;
    }

    public void setEarnings(Earnings earnings) {
        this.earnings = earnings;
    }

    public ExDividendDate getExDividendDate() {
        return exDividendDate;
    }

    public void setExDividendDate(ExDividendDate exDividendDate) {
        this.exDividendDate = exDividendDate;
    }

    public DividendDate getDividendDate() {
        return dividendDate;
    }

    public void setDividendDate(DividendDate dividendDate) {
        this.dividendDate = dividendDate;
    }

}
