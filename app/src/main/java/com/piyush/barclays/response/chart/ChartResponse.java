
package com.piyush.barclays.response.chart;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class ChartResponse {

    @SerializedName("chart")
    @Expose
    private Chart chart;

    public Chart getChart() {
        return chart;
    }

    public void setChart(Chart chart) {
        this.chart = chart;
    }

}
