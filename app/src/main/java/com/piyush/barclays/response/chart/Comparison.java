
package com.piyush.barclays.response.chart;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Comparison {

    @SerializedName("symbol")
    @Expose
    private String symbol;
    @SerializedName("previousClose")
    @Expose
    private Double previousClose;
    @SerializedName("gmtoffset")
    @Expose
    private Integer gmtoffset;
    @SerializedName("high")
    @Expose
    private List<Double> high = null;
    @SerializedName("low")
    @Expose
    private List<Double> low = null;
    @SerializedName("chartPreviousClose")
    @Expose
    private Double chartPreviousClose;
    @SerializedName("close")
    @Expose
    private List<Double> close = null;
    @SerializedName("open")
    @Expose
    private List<Double> open = null;

    public String getSymbol() {
        return symbol;
    }

    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }

    public Double getPreviousClose() {
        return previousClose;
    }

    public void setPreviousClose(Double previousClose) {
        this.previousClose = previousClose;
    }

    public Integer getGmtoffset() {
        return gmtoffset;
    }

    public void setGmtoffset(Integer gmtoffset) {
        this.gmtoffset = gmtoffset;
    }

    public List<Double> getHigh() {
        return high;
    }

    public void setHigh(List<Double> high) {
        this.high = high;
    }

    public List<Double> getLow() {
        return low;
    }

    public void setLow(List<Double> low) {
        this.low = low;
    }

    public Double getChartPreviousClose() {
        return chartPreviousClose;
    }

    public void setChartPreviousClose(Double chartPreviousClose) {
        this.chartPreviousClose = chartPreviousClose;
    }

    public List<Double> getClose() {
        return close;
    }

    public void setClose(List<Double> close) {
        this.close = close;
    }

    public List<Double> getOpen() {
        return open;
    }

    public void setOpen(List<Double> open) {
        this.open = open;
    }

}
