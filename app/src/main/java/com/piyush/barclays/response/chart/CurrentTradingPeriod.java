
package com.piyush.barclays.response.chart;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class CurrentTradingPeriod {

    @SerializedName("pre")
    @Expose
    private Pre pre;
    @SerializedName("regular")
    @Expose
    private Regular regular;
    @SerializedName("post")
    @Expose
    private Post post;

    public Pre getPre() {
        return pre;
    }

    public void setPre(Pre pre) {
        this.pre = pre;
    }

    public Regular getRegular() {
        return regular;
    }

    public void setRegular(Regular regular) {
        this.regular = regular;
    }

    public Post getPost() {
        return post;
    }

    public void setPost(Post post) {
        this.post = post;
    }

}
