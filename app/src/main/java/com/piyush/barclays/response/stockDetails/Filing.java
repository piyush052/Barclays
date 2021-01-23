
package com.piyush.barclays.response.stockDetails;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Filing {

    @SerializedName("date")
    @Expose
    private String date;
    @SerializedName("epochDate")
    @Expose
    private Integer epochDate;
    @SerializedName("type")
    @Expose
    private String type;
    @SerializedName("title")
    @Expose
    private String title;
    @SerializedName("edgarUrl")
    @Expose
    private String edgarUrl;
    @SerializedName("maxAge")
    @Expose
    private Integer maxAge;

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public Integer getEpochDate() {
        return epochDate;
    }

    public void setEpochDate(Integer epochDate) {
        this.epochDate = epochDate;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getEdgarUrl() {
        return edgarUrl;
    }

    public void setEdgarUrl(String edgarUrl) {
        this.edgarUrl = edgarUrl;
    }

    public Integer getMaxAge() {
        return maxAge;
    }

    public void setMaxAge(Integer maxAge) {
        this.maxAge = maxAge;
    }

}
