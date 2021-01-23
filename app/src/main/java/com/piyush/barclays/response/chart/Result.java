
package com.piyush.barclays.response.chart;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Result {

    @SerializedName("meta")
    @Expose
    private Meta meta;
    @SerializedName("timestamp")
    @Expose
    private List<Integer> timestamp = null;
    @SerializedName("comparisons")
    @Expose
    private List<Comparison> comparisons = null;
    @SerializedName("indicators")
    @Expose
    private Indicators indicators;

    public Meta getMeta() {
        return meta;
    }

    public void setMeta(Meta meta) {
        this.meta = meta;
    }

    public List<Integer> getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(List<Integer> timestamp) {
        this.timestamp = timestamp;
    }

    public List<Comparison> getComparisons() {
        return comparisons;
    }

    public void setComparisons(List<Comparison> comparisons) {
        this.comparisons = comparisons;
    }

    public Indicators getIndicators() {
        return indicators;
    }

    public void setIndicators(Indicators indicators) {
        this.indicators = indicators;
    }

}
