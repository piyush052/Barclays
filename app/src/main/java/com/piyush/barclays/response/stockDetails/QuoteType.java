
package com.piyush.barclays.response.stockDetails;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class QuoteType {

    @SerializedName("exchange")
    @Expose
    private String exchange;
    @SerializedName("shortName")
    @Expose
    private String shortName;
    @SerializedName("longName")
    @Expose
    private String longName;
    @SerializedName("exchangeTimezoneName")
    @Expose
    private String exchangeTimezoneName;
    @SerializedName("exchangeTimezoneShortName")
    @Expose
    private String exchangeTimezoneShortName;
    @SerializedName("isEsgPopulated")
    @Expose
    private Boolean isEsgPopulated;
    @SerializedName("gmtOffSetMilliseconds")
    @Expose
    private String gmtOffSetMilliseconds;
    @SerializedName("quoteType")
    @Expose
    private String quoteType;
    @SerializedName("symbol")
    @Expose
    private String symbol;
    @SerializedName("messageBoardId")
    @Expose
    private String messageBoardId;
    @SerializedName("market")
    @Expose
    private String market;

    public String getExchange() {
        return exchange;
    }

    public void setExchange(String exchange) {
        this.exchange = exchange;
    }

    public String getShortName() {
        return shortName;
    }

    public void setShortName(String shortName) {
        this.shortName = shortName;
    }

    public String getLongName() {
        return longName;
    }

    public void setLongName(String longName) {
        this.longName = longName;
    }

    public String getExchangeTimezoneName() {
        return exchangeTimezoneName;
    }

    public void setExchangeTimezoneName(String exchangeTimezoneName) {
        this.exchangeTimezoneName = exchangeTimezoneName;
    }

    public String getExchangeTimezoneShortName() {
        return exchangeTimezoneShortName;
    }

    public void setExchangeTimezoneShortName(String exchangeTimezoneShortName) {
        this.exchangeTimezoneShortName = exchangeTimezoneShortName;
    }

    public Boolean getIsEsgPopulated() {
        return isEsgPopulated;
    }

    public void setIsEsgPopulated(Boolean isEsgPopulated) {
        this.isEsgPopulated = isEsgPopulated;
    }

    public String getGmtOffSetMilliseconds() {
        return gmtOffSetMilliseconds;
    }

    public void setGmtOffSetMilliseconds(String gmtOffSetMilliseconds) {
        this.gmtOffSetMilliseconds = gmtOffSetMilliseconds;
    }

    public String getQuoteType() {
        return quoteType;
    }

    public void setQuoteType(String quoteType) {
        this.quoteType = quoteType;
    }

    public String getSymbol() {
        return symbol;
    }

    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }

    public String getMessageBoardId() {
        return messageBoardId;
    }

    public void setMessageBoardId(String messageBoardId) {
        this.messageBoardId = messageBoardId;
    }

    public String getMarket() {
        return market;
    }

    public void setMarket(String market) {
        this.market = market;
    }

}
