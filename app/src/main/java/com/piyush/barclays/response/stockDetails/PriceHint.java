
package com.piyush.barclays.response.stockDetails;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class PriceHint {

    @SerializedName("raw")
    @Expose
    private Long raw;
    @SerializedName("fmt")
    @Expose
    private String fmt;
    @SerializedName("longFmt")
    @Expose
    private String longFmt;

    public Long getRaw() {
        return raw;
    }

    public void setRaw(Long raw) {
        this.raw = raw;
    }

    public String getFmt() {
        return fmt;
    }

    public void setFmt(String fmt) {
        this.fmt = fmt;
    }

    public String getLongFmt() {
        return longFmt;
    }

    public void setLongFmt(String longFmt) {
        this.longFmt = longFmt;
    }

}
