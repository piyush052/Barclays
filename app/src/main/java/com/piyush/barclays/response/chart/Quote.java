
package com.piyush.barclays.response.chart;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Quote {

    @SerializedName("volume")
    @Expose
    private List<Integer> volume = null;
    @SerializedName("open")
    @Expose
    private List<Double> open = null;
    @SerializedName("low")
    @Expose
    private List<Double> low = null;
    @SerializedName("close")
    @Expose
    private List<Double> close = null;
    @SerializedName("high")
    @Expose
    private List<Double> high = null;

    public List<Integer> getVolume() {
        return volume;
    }

    public void setVolume(List<Integer> volume) {
        this.volume = volume;
    }

    public List<Double> getOpen() {
        return open;
    }

    public void setOpen(List<Double> open) {
        this.open = open;
    }

    public List<Double> getLow() {
        return low;
    }

    public void setLow(List<Double> low) {
        this.low = low;
    }

    public List<Double> getClose() {
        return close;
    }

    public void setClose(List<Double> close) {
        this.close = close;
    }

    public List<Double> getHigh() {
        return high;
    }

    public void setHigh(List<Double> high) {
        this.high = high;
    }

}
