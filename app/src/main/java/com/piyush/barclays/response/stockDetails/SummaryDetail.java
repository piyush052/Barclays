
package com.piyush.barclays.response.stockDetails;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class SummaryDetail {

    @SerializedName("previousClose")
    @Expose
    private PreviousClose previousClose;
    @SerializedName("regularMarketOpen")
    @Expose
    private RegularMarketOpen_ regularMarketOpen;
    @SerializedName("twoHundredDayAverage")
    @Expose
    private TwoHundredDayAverage twoHundredDayAverage;
    @SerializedName("trailingAnnualDividendYield")
    @Expose
    private TrailingAnnualDividendYield trailingAnnualDividendYield;
    @SerializedName("payoutRatio")
    @Expose
    private PayoutRatio payoutRatio;
    @SerializedName("volume24Hr")
    @Expose
    private Volume24Hr_ volume24Hr;
    @SerializedName("regularMarketDayHigh")
    @Expose
    private RegularMarketDayHigh_ regularMarketDayHigh;
    @SerializedName("navPrice")
    @Expose
    private NavPrice navPrice;
    @SerializedName("averageDailyVolume10Day")
    @Expose
    private AverageDailyVolume10Day_ averageDailyVolume10Day;
    @SerializedName("totalAssets")
    @Expose
    private TotalAssets totalAssets;
    @SerializedName("regularMarketPreviousClose")
    @Expose
    private RegularMarketPreviousClose_ regularMarketPreviousClose;
    @SerializedName("fiftyDayAverage")
    @Expose
    private FiftyDayAverage fiftyDayAverage;
    @SerializedName("trailingAnnualDividendRate")
    @Expose
    private TrailingAnnualDividendRate trailingAnnualDividendRate;
    @SerializedName("open")
    @Expose
    private Open open;
    @SerializedName("toCurrency")
    @Expose
    private Object toCurrency;
    @SerializedName("averageVolume10days")
    @Expose
    private AverageVolume10days averageVolume10days;
    @SerializedName("expireDate")
    @Expose
    private ExpireDate expireDate;
    @SerializedName("yield")
    @Expose
    private Yield yield;
    @SerializedName("algorithm")
    @Expose
    private Object algorithm;
    @SerializedName("dividendRate")
    @Expose
    private DividendRate dividendRate;
    @SerializedName("exDividendDate")
    @Expose
    private ExDividendDate_ exDividendDate;
    @SerializedName("beta")
    @Expose
    private Beta beta;
    @SerializedName("circulatingSupply")
    @Expose
    private CirculatingSupply_ circulatingSupply;
    @SerializedName("startDate")
    @Expose
    private StartDate startDate;
    @SerializedName("regularMarketDayLow")
    @Expose
    private RegularMarketDayLow_ regularMarketDayLow;
    @SerializedName("priceHint")
    @Expose
    private PriceHint_ priceHint;
    @SerializedName("currency")
    @Expose
    private String currency;
    @SerializedName("regularMarketVolume")
    @Expose
    private RegularMarketVolume_ regularMarketVolume;
    @SerializedName("lastMarket")
    @Expose
    private Object lastMarket;
    @SerializedName("maxSupply")
    @Expose
    private MaxSupply maxSupply;
    @SerializedName("openInterest")
    @Expose
    private OpenInterest_ openInterest;
    @SerializedName("marketCap")
    @Expose
    private MarketCap_ marketCap;
    @SerializedName("volumeAllCurrencies")
    @Expose
    private VolumeAllCurrencies_ volumeAllCurrencies;
    @SerializedName("strikePrice")
    @Expose
    private StrikePrice_ strikePrice;
    @SerializedName("averageVolume")
    @Expose
    private AverageVolume averageVolume;
    @SerializedName("priceToSalesTrailing12Months")
    @Expose
    private PriceToSalesTrailing12Months priceToSalesTrailing12Months;
    @SerializedName("dayLow")
    @Expose
    private DayLow dayLow;
    @SerializedName("ask")
    @Expose
    private Ask ask;
    @SerializedName("ytdReturn")
    @Expose
    private YtdReturn ytdReturn;
    @SerializedName("askSize")
    @Expose
    private AskSize askSize;
    @SerializedName("volume")
    @Expose
    private Volume volume;
    @SerializedName("fiftyTwoWeekHigh")
    @Expose
    private FiftyTwoWeekHigh fiftyTwoWeekHigh;
    @SerializedName("forwardPE")
    @Expose
    private ForwardPE forwardPE;
    @SerializedName("maxAge")
    @Expose
    private Integer maxAge;
    @SerializedName("fromCurrency")
    @Expose
    private Object fromCurrency;
    @SerializedName("fiveYearAvgDividendYield")
    @Expose
    private FiveYearAvgDividendYield fiveYearAvgDividendYield;
    @SerializedName("fiftyTwoWeekLow")
    @Expose
    private FiftyTwoWeekLow fiftyTwoWeekLow;
    @SerializedName("bid")
    @Expose
    private Bid bid;
    @SerializedName("tradeable")
    @Expose
    private Boolean tradeable;
    @SerializedName("dividendYield")
    @Expose
    private DividendYield dividendYield;
    @SerializedName("bidSize")
    @Expose
    private BidSize bidSize;
    @SerializedName("dayHigh")
    @Expose
    private DayHigh dayHigh;

    public PreviousClose getPreviousClose() {
        return previousClose;
    }

    public void setPreviousClose(PreviousClose previousClose) {
        this.previousClose = previousClose;
    }

    public RegularMarketOpen_ getRegularMarketOpen() {
        return regularMarketOpen;
    }

    public void setRegularMarketOpen(RegularMarketOpen_ regularMarketOpen) {
        this.regularMarketOpen = regularMarketOpen;
    }

    public TwoHundredDayAverage getTwoHundredDayAverage() {
        return twoHundredDayAverage;
    }

    public void setTwoHundredDayAverage(TwoHundredDayAverage twoHundredDayAverage) {
        this.twoHundredDayAverage = twoHundredDayAverage;
    }

    public TrailingAnnualDividendYield getTrailingAnnualDividendYield() {
        return trailingAnnualDividendYield;
    }

    public void setTrailingAnnualDividendYield(TrailingAnnualDividendYield trailingAnnualDividendYield) {
        this.trailingAnnualDividendYield = trailingAnnualDividendYield;
    }

    public PayoutRatio getPayoutRatio() {
        return payoutRatio;
    }

    public void setPayoutRatio(PayoutRatio payoutRatio) {
        this.payoutRatio = payoutRatio;
    }

    public Volume24Hr_ getVolume24Hr() {
        return volume24Hr;
    }

    public void setVolume24Hr(Volume24Hr_ volume24Hr) {
        this.volume24Hr = volume24Hr;
    }

    public RegularMarketDayHigh_ getRegularMarketDayHigh() {
        return regularMarketDayHigh;
    }

    public void setRegularMarketDayHigh(RegularMarketDayHigh_ regularMarketDayHigh) {
        this.regularMarketDayHigh = regularMarketDayHigh;
    }

    public NavPrice getNavPrice() {
        return navPrice;
    }

    public void setNavPrice(NavPrice navPrice) {
        this.navPrice = navPrice;
    }

    public AverageDailyVolume10Day_ getAverageDailyVolume10Day() {
        return averageDailyVolume10Day;
    }

    public void setAverageDailyVolume10Day(AverageDailyVolume10Day_ averageDailyVolume10Day) {
        this.averageDailyVolume10Day = averageDailyVolume10Day;
    }

    public TotalAssets getTotalAssets() {
        return totalAssets;
    }

    public void setTotalAssets(TotalAssets totalAssets) {
        this.totalAssets = totalAssets;
    }

    public RegularMarketPreviousClose_ getRegularMarketPreviousClose() {
        return regularMarketPreviousClose;
    }

    public void setRegularMarketPreviousClose(RegularMarketPreviousClose_ regularMarketPreviousClose) {
        this.regularMarketPreviousClose = regularMarketPreviousClose;
    }

    public FiftyDayAverage getFiftyDayAverage() {
        return fiftyDayAverage;
    }

    public void setFiftyDayAverage(FiftyDayAverage fiftyDayAverage) {
        this.fiftyDayAverage = fiftyDayAverage;
    }

    public TrailingAnnualDividendRate getTrailingAnnualDividendRate() {
        return trailingAnnualDividendRate;
    }

    public void setTrailingAnnualDividendRate(TrailingAnnualDividendRate trailingAnnualDividendRate) {
        this.trailingAnnualDividendRate = trailingAnnualDividendRate;
    }

    public Open getOpen() {
        return open;
    }

    public void setOpen(Open open) {
        this.open = open;
    }

    public Object getToCurrency() {
        return toCurrency;
    }

    public void setToCurrency(Object toCurrency) {
        this.toCurrency = toCurrency;
    }

    public AverageVolume10days getAverageVolume10days() {
        return averageVolume10days;
    }

    public void setAverageVolume10days(AverageVolume10days averageVolume10days) {
        this.averageVolume10days = averageVolume10days;
    }

    public ExpireDate getExpireDate() {
        return expireDate;
    }

    public void setExpireDate(ExpireDate expireDate) {
        this.expireDate = expireDate;
    }

    public Yield getYield() {
        return yield;
    }

    public void setYield(Yield yield) {
        this.yield = yield;
    }

    public Object getAlgorithm() {
        return algorithm;
    }

    public void setAlgorithm(Object algorithm) {
        this.algorithm = algorithm;
    }

    public DividendRate getDividendRate() {
        return dividendRate;
    }

    public void setDividendRate(DividendRate dividendRate) {
        this.dividendRate = dividendRate;
    }

    public ExDividendDate_ getExDividendDate() {
        return exDividendDate;
    }

    public void setExDividendDate(ExDividendDate_ exDividendDate) {
        this.exDividendDate = exDividendDate;
    }

    public Beta getBeta() {
        return beta;
    }

    public void setBeta(Beta beta) {
        this.beta = beta;
    }

    public CirculatingSupply_ getCirculatingSupply() {
        return circulatingSupply;
    }

    public void setCirculatingSupply(CirculatingSupply_ circulatingSupply) {
        this.circulatingSupply = circulatingSupply;
    }

    public StartDate getStartDate() {
        return startDate;
    }

    public void setStartDate(StartDate startDate) {
        this.startDate = startDate;
    }

    public RegularMarketDayLow_ getRegularMarketDayLow() {
        return regularMarketDayLow;
    }

    public void setRegularMarketDayLow(RegularMarketDayLow_ regularMarketDayLow) {
        this.regularMarketDayLow = regularMarketDayLow;
    }

    public PriceHint_ getPriceHint() {
        return priceHint;
    }

    public void setPriceHint(PriceHint_ priceHint) {
        this.priceHint = priceHint;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public RegularMarketVolume_ getRegularMarketVolume() {
        return regularMarketVolume;
    }

    public void setRegularMarketVolume(RegularMarketVolume_ regularMarketVolume) {
        this.regularMarketVolume = regularMarketVolume;
    }

    public Object getLastMarket() {
        return lastMarket;
    }

    public void setLastMarket(Object lastMarket) {
        this.lastMarket = lastMarket;
    }

    public MaxSupply getMaxSupply() {
        return maxSupply;
    }

    public void setMaxSupply(MaxSupply maxSupply) {
        this.maxSupply = maxSupply;
    }

    public OpenInterest_ getOpenInterest() {
        return openInterest;
    }

    public void setOpenInterest(OpenInterest_ openInterest) {
        this.openInterest = openInterest;
    }

    public MarketCap_ getMarketCap() {
        return marketCap;
    }

    public void setMarketCap(MarketCap_ marketCap) {
        this.marketCap = marketCap;
    }

    public VolumeAllCurrencies_ getVolumeAllCurrencies() {
        return volumeAllCurrencies;
    }

    public void setVolumeAllCurrencies(VolumeAllCurrencies_ volumeAllCurrencies) {
        this.volumeAllCurrencies = volumeAllCurrencies;
    }

    public StrikePrice_ getStrikePrice() {
        return strikePrice;
    }

    public void setStrikePrice(StrikePrice_ strikePrice) {
        this.strikePrice = strikePrice;
    }

    public AverageVolume getAverageVolume() {
        return averageVolume;
    }

    public void setAverageVolume(AverageVolume averageVolume) {
        this.averageVolume = averageVolume;
    }

    public PriceToSalesTrailing12Months getPriceToSalesTrailing12Months() {
        return priceToSalesTrailing12Months;
    }

    public void setPriceToSalesTrailing12Months(PriceToSalesTrailing12Months priceToSalesTrailing12Months) {
        this.priceToSalesTrailing12Months = priceToSalesTrailing12Months;
    }

    public DayLow getDayLow() {
        return dayLow;
    }

    public void setDayLow(DayLow dayLow) {
        this.dayLow = dayLow;
    }

    public Ask getAsk() {
        return ask;
    }

    public void setAsk(Ask ask) {
        this.ask = ask;
    }

    public YtdReturn getYtdReturn() {
        return ytdReturn;
    }

    public void setYtdReturn(YtdReturn ytdReturn) {
        this.ytdReturn = ytdReturn;
    }

    public AskSize getAskSize() {
        return askSize;
    }

    public void setAskSize(AskSize askSize) {
        this.askSize = askSize;
    }

    public Volume getVolume() {
        return volume;
    }

    public void setVolume(Volume volume) {
        this.volume = volume;
    }

    public FiftyTwoWeekHigh getFiftyTwoWeekHigh() {
        return fiftyTwoWeekHigh;
    }

    public void setFiftyTwoWeekHigh(FiftyTwoWeekHigh fiftyTwoWeekHigh) {
        this.fiftyTwoWeekHigh = fiftyTwoWeekHigh;
    }

    public ForwardPE getForwardPE() {
        return forwardPE;
    }

    public void setForwardPE(ForwardPE forwardPE) {
        this.forwardPE = forwardPE;
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

    public FiveYearAvgDividendYield getFiveYearAvgDividendYield() {
        return fiveYearAvgDividendYield;
    }

    public void setFiveYearAvgDividendYield(FiveYearAvgDividendYield fiveYearAvgDividendYield) {
        this.fiveYearAvgDividendYield = fiveYearAvgDividendYield;
    }

    public FiftyTwoWeekLow getFiftyTwoWeekLow() {
        return fiftyTwoWeekLow;
    }

    public void setFiftyTwoWeekLow(FiftyTwoWeekLow fiftyTwoWeekLow) {
        this.fiftyTwoWeekLow = fiftyTwoWeekLow;
    }

    public Bid getBid() {
        return bid;
    }

    public void setBid(Bid bid) {
        this.bid = bid;
    }

    public Boolean getTradeable() {
        return tradeable;
    }

    public void setTradeable(Boolean tradeable) {
        this.tradeable = tradeable;
    }

    public DividendYield getDividendYield() {
        return dividendYield;
    }

    public void setDividendYield(DividendYield dividendYield) {
        this.dividendYield = dividendYield;
    }

    public BidSize getBidSize() {
        return bidSize;
    }

    public void setBidSize(BidSize bidSize) {
        this.bidSize = bidSize;
    }

    public DayHigh getDayHigh() {
        return dayHigh;
    }

    public void setDayHigh(DayHigh dayHigh) {
        this.dayHigh = dayHigh;
    }

}
