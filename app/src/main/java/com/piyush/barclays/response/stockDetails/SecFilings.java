
package com.piyush.barclays.response.stockDetails;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class SecFilings {

    @SerializedName("filings")
    @Expose
    private List<Filing> filings = null;
    @SerializedName("maxAge")
    @Expose
    private Integer maxAge;

    public List<Filing> getFilings() {
        return filings;
    }

    public void setFilings(List<Filing> filings) {
        this.filings = filings;
    }

    public Integer getMaxAge() {
        return maxAge;
    }

    public void setMaxAge(Integer maxAge) {
        this.maxAge = maxAge;
    }

}
