
package com.piyush.barclays.response.stockDetails;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class AssetProfile {

    @SerializedName("zip")
    @Expose
    private String zip;
    @SerializedName("sector")
    @Expose
    private String sector;
    @SerializedName("fullTimeEmployees")
    @Expose
    private Integer fullTimeEmployees;
    @SerializedName("compensationRisk")
    @Expose
    private Integer compensationRisk;
    @SerializedName("auditRisk")
    @Expose
    private Integer auditRisk;
    @SerializedName("longBusinessSummary")
    @Expose
    private String longBusinessSummary;
    @SerializedName("city")
    @Expose
    private String city;
    @SerializedName("phone")
    @Expose
    private String phone;
    @SerializedName("shareHolderRightsRisk")
    @Expose
    private Integer shareHolderRightsRisk;
    @SerializedName("compensationAsOfEpochDate")
    @Expose
    private Integer compensationAsOfEpochDate;
    @SerializedName("governanceEpochDate")
    @Expose
    private Integer governanceEpochDate;
    @SerializedName("boardRisk")
    @Expose
    private Integer boardRisk;
    @SerializedName("country")
    @Expose
    private String country;
    @SerializedName("companyOfficers")
    @Expose
    private List<CompanyOfficer> companyOfficers = null;
    @SerializedName("website")
    @Expose
    private String website;
    @SerializedName("maxAge")
    @Expose
    private Integer maxAge;
    @SerializedName("overallRisk")
    @Expose
    private Integer overallRisk;
    @SerializedName("address1")
    @Expose
    private String address1;
    @SerializedName("industry")
    @Expose
    private String industry;
    @SerializedName("address2")
    @Expose
    private String address2;

    public String getZip() {
        return zip;
    }

    public void setZip(String zip) {
        this.zip = zip;
    }

    public String getSector() {
        return sector;
    }

    public void setSector(String sector) {
        this.sector = sector;
    }

    public Integer getFullTimeEmployees() {
        return fullTimeEmployees;
    }

    public void setFullTimeEmployees(Integer fullTimeEmployees) {
        this.fullTimeEmployees = fullTimeEmployees;
    }

    public Integer getCompensationRisk() {
        return compensationRisk;
    }

    public void setCompensationRisk(Integer compensationRisk) {
        this.compensationRisk = compensationRisk;
    }

    public Integer getAuditRisk() {
        return auditRisk;
    }

    public void setAuditRisk(Integer auditRisk) {
        this.auditRisk = auditRisk;
    }

    public String getLongBusinessSummary() {
        return longBusinessSummary;
    }

    public void setLongBusinessSummary(String longBusinessSummary) {
        this.longBusinessSummary = longBusinessSummary;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public Integer getShareHolderRightsRisk() {
        return shareHolderRightsRisk;
    }

    public void setShareHolderRightsRisk(Integer shareHolderRightsRisk) {
        this.shareHolderRightsRisk = shareHolderRightsRisk;
    }

    public Integer getCompensationAsOfEpochDate() {
        return compensationAsOfEpochDate;
    }

    public void setCompensationAsOfEpochDate(Integer compensationAsOfEpochDate) {
        this.compensationAsOfEpochDate = compensationAsOfEpochDate;
    }

    public Integer getGovernanceEpochDate() {
        return governanceEpochDate;
    }

    public void setGovernanceEpochDate(Integer governanceEpochDate) {
        this.governanceEpochDate = governanceEpochDate;
    }

    public Integer getBoardRisk() {
        return boardRisk;
    }

    public void setBoardRisk(Integer boardRisk) {
        this.boardRisk = boardRisk;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public List<CompanyOfficer> getCompanyOfficers() {
        return companyOfficers;
    }

    public void setCompanyOfficers(List<CompanyOfficer> companyOfficers) {
        this.companyOfficers = companyOfficers;
    }

    public String getWebsite() {
        return website;
    }

    public void setWebsite(String website) {
        this.website = website;
    }

    public Integer getMaxAge() {
        return maxAge;
    }

    public void setMaxAge(Integer maxAge) {
        this.maxAge = maxAge;
    }

    public Integer getOverallRisk() {
        return overallRisk;
    }

    public void setOverallRisk(Integer overallRisk) {
        this.overallRisk = overallRisk;
    }

    public String getAddress1() {
        return address1;
    }

    public void setAddress1(String address1) {
        this.address1 = address1;
    }

    public String getIndustry() {
        return industry;
    }

    public void setIndustry(String industry) {
        this.industry = industry;
    }

    public String getAddress2() {
        return address2;
    }

    public void setAddress2(String address2) {
        this.address2 = address2;
    }

}
