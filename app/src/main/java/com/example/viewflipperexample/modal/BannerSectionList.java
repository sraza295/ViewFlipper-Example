
package com.example.viewflipperexample.modal;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class BannerSectionList {

    @SerializedName("image_path")
    @Expose
    private String imagePath;
    @SerializedName("title")
    @Expose
    private String title;

    public String getImagePath() {
        return imagePath;
    }

    public void setImagePath(String imagePath) {
        this.imagePath = imagePath;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

}
