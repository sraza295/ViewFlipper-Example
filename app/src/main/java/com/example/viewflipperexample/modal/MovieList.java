
package com.example.viewflipperexample.modal;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class MovieList {

    @SerializedName("code")
    @Expose
    private Integer code;
    @SerializedName("status")
    @Expose
    private String status;
    @SerializedName("banner_section_list")
    @Expose
    private List<BannerSectionList> bannerSectionList = null;
    @SerializedName("section_count")
    @Expose
    private Integer sectionCount;
    @SerializedName("section_name")
    @Expose
    private List<SectionName> sectionName = null;

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public List<BannerSectionList> getBannerSectionList() {
        return bannerSectionList;
    }

    public void setBannerSectionList(List<BannerSectionList> bannerSectionList) {
        this.bannerSectionList = bannerSectionList;
    }

    public Integer getSectionCount() {
        return sectionCount;
    }

    public void setSectionCount(Integer sectionCount) {
        this.sectionCount = sectionCount;
    }

    public List<SectionName> getSectionName() {
        return sectionName;
    }

    public void setSectionName(List<SectionName> sectionName) {
        this.sectionName = sectionName;
    }

}
