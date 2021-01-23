
package com.piyush.barclays.response.stockDetails;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class StockDetails {

    @SerializedName("financialsTemplate")
    @Expose
    private FinancialsTemplate financialsTemplate;
    @SerializedName("price")
    @Expose
    private Price price;
    @SerializedName("secFilings")
    @Expose
    private SecFilings secFilings;
    @SerializedName("quoteType")
    @Expose
    private QuoteType quoteType;
    @SerializedName("calendarEvents")
    @Expose
    private CalendarEvents calendarEvents;
    @SerializedName("summaryDetail")
    @Expose
    private SummaryDetail summaryDetail;
    @SerializedName("symbol")
    @Expose
    private String symbol;
    @SerializedName("assetProfile")
    @Expose
    private AssetProfile assetProfile;
    @SerializedName("pageViews")
    @Expose
    private PageViews pageViews;

    public FinancialsTemplate getFinancialsTemplate() {
        return financialsTemplate;
    }

    public void setFinancialsTemplate(FinancialsTemplate financialsTemplate) {
        this.financialsTemplate = financialsTemplate;
    }

    public Price getPrice() {
        return price;
    }

    public void setPrice(Price price) {
        this.price = price;
    }

    public SecFilings getSecFilings() {
        return secFilings;
    }

    public void setSecFilings(SecFilings secFilings) {
        this.secFilings = secFilings;
    }

    public QuoteType getQuoteType() {
        return quoteType;
    }

    public void setQuoteType(QuoteType quoteType) {
        this.quoteType = quoteType;
    }

    public CalendarEvents getCalendarEvents() {
        return calendarEvents;
    }

    public void setCalendarEvents(CalendarEvents calendarEvents) {
        this.calendarEvents = calendarEvents;
    }

    public SummaryDetail getSummaryDetail() {
        return summaryDetail;
    }

    public void setSummaryDetail(SummaryDetail summaryDetail) {
        this.summaryDetail = summaryDetail;
    }

    public String getSymbol() {
        return symbol;
    }

    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }

    public AssetProfile getAssetProfile() {
        return assetProfile;
    }

    public void setAssetProfile(AssetProfile assetProfile) {
        this.assetProfile = assetProfile;
    }

    public PageViews getPageViews() {
        return pageViews;
    }

    public void setPageViews(PageViews pageViews) {
        this.pageViews = pageViews;
    }

}
