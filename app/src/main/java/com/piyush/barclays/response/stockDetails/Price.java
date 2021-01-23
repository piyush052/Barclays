
package com.piyush.barclays.response.stockDetails;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Price {

    @SerializedName("quoteSourceName")
    @Expose
    private String quoteSourceName;
    @SerializedName("regularMarketOpen")
    @Expose
    private RegularMarketOpen regularMarketOpen;
    @SerializedName("averageDailyVolume3Month")
    @Expose
    private AverageDailyVolume3Month averageDailyVolume3Month;
    @SerializedName("exchange")
    @Expose
    private String exchange;
    @SerializedName("regularMarketTime")
    @Expose
    private Integer regularMarketTime;
    @SerializedName("volume24Hr")
    @Expose
    private Volume24Hr volume24Hr;
    @SerializedName("regularMarketDayHigh")
    @Expose
    private RegularMarketDayHigh regularMarketDayHigh;
    @SerializedName("shortName")
    @Expose
    private String shortName;
    @SerializedName("averageDailyVolume10Day")
    @Expose
    private AverageDailyVolume10Day averageDailyVolume10Day;
    @SerializedName("longName")
    @Expose
    private String longName;
    @SerializedName("regularMarketChange")
    @Expose
    private RegularMarketChange regularMarketChange;
    @SerializedName("currencySymbol")
    @Expose
    private String currencySymbol;
    @SerializedName("regularMarketPreviousClose")
    @Expose
    private RegularMarketPreviousClose regularMarketPreviousClose;
    @SerializedName("postMarketTime")
    @Expose
    private Integer postMarketTime;
    @SerializedName("preMarketPrice")
    @Expose
    private PreMarketPrice preMarketPrice;
    @SerializedName("exchangeDataDelayedBy")
    @Expose
    private Integer exchangeDataDelayedBy;
    @SerializedName("toCurrency")
    @Expose
    private Object toCurrency;
    @SerializedName("postMarketChange")
    @Expose
    private PostMarketChange postMarketChange;
    @SerializedName("postMarketPrice")
    @Expose
    private PostMarketPrice postMarketPrice;
    @SerializedName("exchangeName")
    @Expose
    private String exchangeName;
    @SerializedName("preMarketChange")
    @Expose
    private PreMarketChange preMarketChange;
    @SerializedName("circulatingSupply")
    @Expose
    private CirculatingSupply circulatingSupply;
    @SerializedName("regularMarketDayLow")
    @Expose
    private RegularMarketDayLow regularMarketDayLow;
    @SerializedName("priceHint")
    @Expose
    private PriceHint priceHint;
    @SerializedName("currency")
    @Expose
    private String currency;
    @SerializedName("regularMarketPrice")
    @Expose
    private RegularMarketPrice regularMarketPrice;
    @SerializedName("regularMarketVolume")
    @Expose
    private RegularMarketVolume regularMarketVolume;
    @SerializedName("lastMarket")
    @Expose
    private Object lastMarket;
    @SerializedName("regularMarketSource")
    @Expose
    private String regularMarketSource;
    @SerializedName("openInterest")
    @Expose
    private OpenInterest openInterest;
    @SerializedName("marketState")
    @Expose
    private String marketState;
    @SerializedName("underlyingSymbol")
    @Expose
    private Object underlyingSymbol;
    @SerializedName("marketCap")
    @Expose
    private MarketCap marketCap;
    @SerializedName("quoteType")
    @Expose
    private String quoteType;
    @SerializedName("volumeAllCurrencies")
    @Expose
    private VolumeAllCurrencies volumeAllCurrencies;
    @SerializedName("postMarketSource")
    @Expose
    private String postMarketSource;
    @SerializedName("strikePrice")
    @Expose
    private StrikePrice strikePrice;
    @SerializedName("symbol")
    @Expose
    private String symbol;
    @SerializedName("postMarketChangePercent")
    @Expose
    private PostMarketChangePercent postMarketChangePercent;
    @SerializedName("preMarketSource")
    @Expose
    private String preMarketSource;
    @SerializedName("maxAge")
    @Expose
    private Integer maxAge;
    @SerializedName("fromCurrency")
    @Expose
    private Object fromCurrency;
    @SerializedName("regularMarketChangePercent")
    @Expose
    private RegularMarketChangePercent regularMarketChangePercent;

    public String getQuoteSourceName() {
        return quoteSourceName;
    }

    public void setQuoteSourceName(String quoteSourceName) {
        this.quoteSourceName = quoteSourceName;
    }

    public RegularMarketOpen getRegularMarketOpen() {
        return regularMarketOpen;
    }

    public void setRegularMarketOpen(RegularMarketOpen regularMarketOpen) {
        this.regularMarketOpen = regularMarketOpen;
    }

    public AverageDailyVolume3Month getAverageDailyVolume3Month() {
        return averageDailyVolume3Month;
    }

    public void setAverageDailyVolume3Month(AverageDailyVolume3Month averageDailyVolume3Month) {
        this.averageDailyVolume3Month = averageDailyVolume3Month;
    }

    public String getExchange() {
        return exchange;
    }

    public void setExchange(String exchange) {
        this.exchange = exchange;
    }

    public Integer getRegularMarketTime() {
        return regularMarketTime;
    }

    public void setRegularMarketTime(Integer regularMarketTime) {
        this.regularMarketTime = regularMarketTime;
    }

    public Volume24Hr getVolume24Hr() {
        return volume24Hr;
    }

    public void setVolume24Hr(Volume24Hr volume24Hr) {
        this.volume24Hr = volume24Hr;
    }

    public RegularMarketDayHigh getRegularMarketDayHigh() {
        return regularMarketDayHigh;
    }

    public void setRegularMarketDayHigh(RegularMarketDayHigh regularMarketDayHigh) {
        this.regularMarketDayHigh = regularMarketDayHigh;
    }

    public String getShortName() {
        return shortName;
    }

    public void setShortName(String shortName) {
        this.shortName = shortName;
    }

    public AverageDailyVolume10Day getAverageDailyVolume10Day() {
        return averageDailyVolume10Day;
    }

    public void setAverageDailyVolume10Day(AverageDailyVolume10Day averageDailyVolume10Day) {
        this.averageDailyVolume10Day = averageDailyVolume10Day;
    }

    public String getLongName() {
        return longName;
    }

    public void setLongName(String longName) {
        this.longName = longName;
    }

    public RegularMarketChange getRegularMarketChange() {
        return regularMarketChange;
    }

    public void setRegularMarketChange(RegularMarketChange regularMarketChange) {
        this.regularMarketChange = regularMarketChange;
    }

    public String getCurrencySymbol() {
        return currencySymbol;
    }

    public void setCurrencySymbol(String currencySymbol) {
        this.currencySymbol = currencySymbol;
    }

    public RegularMarketPreviousClose getRegularMarketPreviousClose() {
        return regularMarketPreviousClose;
    }

    public void setRegularMarketPreviousClose(RegularMarketPreviousClose regularMarketPreviousClose) {
        this.regularMarketPreviousClose = regularMarketPreviousClose;
    }

    public Integer getPostMarketTime() {
        return postMarketTime;
    }

    public void setPostMarketTime(Integer postMarketTime) {
        this.postMarketTime = postMarketTime;
    }

    public PreMarketPrice getPreMarketPrice() {
        return preMarketPrice;
    }

    public void setPreMarketPrice(PreMarketPrice preMarketPrice) {
        this.preMarketPrice = preMarketPrice;
    }

    public Integer getExchangeDataDelayedBy() {
        return exchangeDataDelayedBy;
    }

    public void setExchangeDataDelayedBy(Integer exchangeDataDelayedBy) {
        this.exchangeDataDelayedBy = exchangeDataDelayedBy;
    }

    public Object getToCurrency() {
        return toCurrency;
    }

    public void setToCurrency(Object toCurrency) {
        this.toCurrency = toCurrency;
    }

    public PostMarketChange getPostMarketChange() {
        return postMarketChange;
    }

    public void setPostMarketChange(PostMarketChange postMarketChange) {
        this.postMarketChange = postMarketChange;
    }

    public PostMarketPrice getPostMarketPrice() {
        return postMarketPrice;
    }

    public void setPostMarketPrice(PostMarketPrice postMarketPrice) {
        this.postMarketPrice = postMarketPrice;
    }

    public String getExchangeName() {
        return exchangeName;
    }

    public void setExchangeName(String exchangeName) {
        this.exchangeName = exchangeName;
    }

    public PreMarketChange getPreMarketChange() {
        return preMarketChange;
    }

    public void setPreMarketChange(PreMarketChange preMarketChange) {
        this.preMarketChange = preMarketChange;
    }

    public CirculatingSupply getCirculatingSupply() {
        return circulatingSupply;
    }

    public void setCirculatingSupply(CirculatingSupply circulatingSupply) {
        this.circulatingSupply = circulatingSupply;
    }

    public RegularMarketDayLow getRegularMarketDayLow() {
        return regularMarketDayLow;
    }

    public void setRegularMarketDayLow(RegularMarketDayLow regularMarketDayLow) {
        this.regularMarketDayLow = regularMarketDayLow;
    }

    public PriceHint getPriceHint() {
        return priceHint;
    }

    public void setPriceHint(PriceHint priceHint) {
        this.priceHint = priceHint;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public RegularMarketPrice getRegularMarketPrice() {
        return regularMarketPrice;
    }

    public void setRegularMarketPrice(RegularMarketPrice regularMarketPrice) {
        this.regularMarketPrice = regularMarketPrice;
    }

    public RegularMarketVolume getRegularMarketVolume() {
        return regularMarketVolume;
    }

    public void setRegularMarketVolume(RegularMarketVolume regularMarketVolume) {
        this.regularMarketVolume = regularMarketVolume;
    }

    public Object getLastMarket() {
        return lastMarket;
    }

    public void setLastMarket(Object lastMarket) {
        this.lastMarket = lastMarket;
    }

    public String getRegularMarketSource() {
        return regularMarketSource;
    }

    public void setRegularMarketSource(String regularMarketSource) {
        this.regularMarketSource = regularMarketSource;
    }

    public OpenInterest getOpenInterest() {
        return openInterest;
    }

    public void setOpenInterest(OpenInterest openInterest) {
        this.openInterest = openInterest;
    }

    public String getMarketState() {
        return marketState;
    }

    public void setMarketState(String marketState) {
        this.marketState = marketState;
    }

    public Object getUnderlyingSymbol() {
        return underlyingSymbol;
    }

    public void setUnderlyingSymbol(Object underlyingSymbol) {
        this.underlyingSymbol = underlyingSymbol;
    }

    public MarketCap getMarketCap() {
        return marketCap;
    }

    public void setMarketCap(MarketCap marketCap) {
        this.marketCap = marketCap;
    }

    public String getQuoteType() {
        return quoteType;
    }

    public void setQuoteType(String quoteType) {
        this.quoteType = quoteType;
    }

    public VolumeAllCurrencies getVolumeAllCurrencies() {
        return volumeAllCurrencies;
    }

    public void setVolumeAllCurrencies(VolumeAllCurrencies volumeAllCurrencies) {
        this.volumeAllCurrencies = volumeAllCurrencies;
    }

    public String getPostMarketSource() {
        return postMarketSource;
    }

    public void setPostMarketSource(String postMarketSource) {
        this.postMarketSource = postMarketSource;
    }

    public StrikePrice getStrikePrice() {
        return strikePrice;
    }

    public void setStrikePrice(StrikePrice strikePrice) {
        this.strikePrice = strikePrice;
    }

    public String getSymbol() {
        return symbol;
    }

    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }

    public PostMarketChangePercent getPostMarketChangePercent() {
        return postMarketChangePercent;
    }

    public void setPostMarketChangePercent(PostMarketChangePercent postMarketChangePercent) {
        this.postMarketChangePercent = postMarketChangePercent;
    }

    public String getPreMarketSource() {
        return preMarketSource;
    }

    public void setPreMarketSource(String preMarketSource) {
        this.preMarketSource = preMarketSource;
    }

    public Integer getMaxAge() {
        return maxAge;
    }

    public void setMaxAge(Integer maxAge) {
        this.maxAge = maxAge;
    }

    public Object getFromCurrency() {
        return fromCurrency;
    }

    public void setFromCurrency(Object fromCurrency) {
        this.fromCurrency = fromCurrency;
    }

    public RegularMarketChangePercent getRegularMarketChangePercent() {
        return regularMarketChangePercent;
    }

    public void setRegularMarketChangePercent(RegularMarketChangePercent regularMarketChangePercent) {
        this.regularMarketChangePercent = regularMarketChangePercent;
    }

}
