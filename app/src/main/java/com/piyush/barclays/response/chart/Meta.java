
package com.piyush.barclays.response.chart;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class Meta {

    @SerializedName("currency")
    @Expose
    private String currency;
    @SerializedName("symbol")
    @Expose
    private String symbol;
    @SerializedName("exchangeName")
    @Expose
    private String exchangeName;
    @SerializedName("instrumentType")
    @Expose
    private String instrumentType;
    @SerializedName("firstTradeDate")
    @Expose
    private Integer firstTradeDate;
    @SerializedName("regularMarketTime")
    @Expose
    private Integer regularMarketTime;
    @SerializedName("gmtoffset")
    @Expose
    private Integer gmtoffset;
    @SerializedName("timezone")
    @Expose
    private String timezone;
    @SerializedName("exchangeTimezoneName")
    @Expose
    private String exchangeTimezoneName;
    @SerializedName("regularMarketPrice")
    @Expose
    private Double regularMarketPrice;
    @SerializedName("chartPreviousClose")
    @Expose
    private Double chartPreviousClose;
    @SerializedName("previousClose")
    @Expose
    private Double previousClose;
    @SerializedName("scale")
    @Expose
    private Integer scale;
    @SerializedName("priceHint")
    @Expose
    private Integer priceHint;
    @SerializedName("currentTradingPeriod")
    @Expose
    private CurrentTradingPeriod currentTradingPeriod;
    @SerializedName("tradingPeriods")
    @Expose
    private List<List<TradingPeriod>> tradingPeriods = null;
    @SerializedName("dataGranularity")
    @Expose
    private String dataGranularity;
    @SerializedName("range")
    @Expose
    private String range;
    @SerializedName("validRanges")
    @Expose
    private List<String> validRanges = null;

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public String getSymbol() {
        return symbol;
    }

    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }

    public String getExchangeName() {
        return exchangeName;
    }

    public void setExchangeName(String exchangeName) {
        this.exchangeName = exchangeName;
    }

    public String getInstrumentType() {
        return instrumentType;
    }

    public void setInstrumentType(String instrumentType) {
        this.instrumentType = instrumentType;
    }

    public Integer getFirstTradeDate() {
        return firstTradeDate;
    }

    public void setFirstTradeDate(Integer firstTradeDate) {
        this.firstTradeDate = firstTradeDate;
    }

    public Integer getRegularMarketTime() {
        return regularMarketTime;
    }

    public void setRegularMarketTime(Integer regularMarketTime) {
        this.regularMarketTime = regularMarketTime;
    }

    public Integer getGmtoffset() {
        return gmtoffset;
    }

    public void setGmtoffset(Integer gmtoffset) {
        this.gmtoffset = gmtoffset;
    }

    public String getTimezone() {
        return timezone;
    }

    public void setTimezone(String timezone) {
        this.timezone = timezone;
    }

    public String getExchangeTimezoneName() {
        return exchangeTimezoneName;
    }

    public void setExchangeTimezoneName(String exchangeTimezoneName) {
        this.exchangeTimezoneName = exchangeTimezoneName;
    }

    public Double getRegularMarketPrice() {
        return regularMarketPrice;
    }

    public void setRegularMarketPrice(Double regularMarketPrice) {
        this.regularMarketPrice = regularMarketPrice;
    }

    public Double getChartPreviousClose() {
        return chartPreviousClose;
    }

    public void setChartPreviousClose(Double chartPreviousClose) {
        this.chartPreviousClose = chartPreviousClose;
    }

    public Double getPreviousClose() {
        return previousClose;
    }

    public void setPreviousClose(Double previousClose) {
        this.previousClose = previousClose;
    }

    public Integer getScale() {
        return scale;
    }

    public void setScale(Integer scale) {
        this.scale = scale;
    }

    public Integer getPriceHint() {
        return priceHint;
    }

    public void setPriceHint(Integer priceHint) {
        this.priceHint = priceHint;
    }

    public CurrentTradingPeriod getCurrentTradingPeriod() {
        return currentTradingPeriod;
    }

    public void setCurrentTradingPeriod(CurrentTradingPeriod currentTradingPeriod) {
        this.currentTradingPeriod = currentTradingPeriod;
    }

    public List<List<TradingPeriod>> getTradingPeriods() {
        return tradingPeriods;
    }

    public void setTradingPeriods(List<List<TradingPeriod>> tradingPeriods) {
        this.tradingPeriods = tradingPeriods;
    }

    public String getDataGranularity() {
        return dataGranularity;
    }

    public void setDataGranularity(String dataGranularity) {
        this.dataGranularity = dataGranularity;
    }

    public String getRange() {
        return range;
    }

    public void setRange(String range) {
        this.range = range;
    }

    public List<String> getValidRanges() {
        return validRanges;
    }

    public void setValidRanges(List<String> validRanges) {
        this.validRanges = validRanges;
    }

}
