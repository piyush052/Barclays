
package com.piyush.barclays.response.stockDetails;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class CompanyOfficer {

    @SerializedName("totalPay")
    @Expose
    private TotalPay totalPay;
    @SerializedName("exercisedValue")
    @Expose
    private ExercisedValue exercisedValue;
    @SerializedName("yearBorn")
    @Expose
    private Integer yearBorn;
    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("title")
    @Expose
    private String title;
    @SerializedName("maxAge")
    @Expose
    private Integer maxAge;
    @SerializedName("fiscalYear")
    @Expose
    private Integer fiscalYear;
    @SerializedName("unexercisedValue")
    @Expose
    private UnexercisedValue unexercisedValue;
    @SerializedName("age")
    @Expose
    private Integer age;

    public TotalPay getTotalPay() {
        return totalPay;
    }

    public void setTotalPay(TotalPay totalPay) {
        this.totalPay = totalPay;
    }

    public ExercisedValue getExercisedValue() {
        return exercisedValue;
    }

    public void setExercisedValue(ExercisedValue exercisedValue) {
        this.exercisedValue = exercisedValue;
    }

    public Integer getYearBorn() {
        return yearBorn;
    }

    public void setYearBorn(Integer yearBorn) {
        this.yearBorn = yearBorn;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Integer getMaxAge() {
        return maxAge;
    }

    public void setMaxAge(Integer maxAge) {
        this.maxAge = maxAge;
    }

    public Integer getFiscalYear() {
        return fiscalYear;
    }

    public void setFiscalYear(Integer fiscalYear) {
        this.fiscalYear = fiscalYear;
    }

    public UnexercisedValue getUnexercisedValue() {
        return unexercisedValue;
    }

    public void setUnexercisedValue(UnexercisedValue unexercisedValue) {
        this.unexercisedValue = unexercisedValue;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

}
