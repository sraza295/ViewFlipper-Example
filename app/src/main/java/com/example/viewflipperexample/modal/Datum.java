
package com.example.viewflipperexample.modal;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Datum {

    @SerializedName("permalink")
    @Expose
    private String permalink;
    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("story")
    @Expose
    private String story;
    @SerializedName("genre")
    @Expose
    private List<String> genre = null;
    @SerializedName("release_date")
    @Expose
    private String releaseDate;
    @SerializedName("posterForTv")
    @Expose
    private String posterForTv;
    @SerializedName("rating")
    @Expose
    private float rating;

    public String getPermalink() {
        return permalink;
    }

    public void setPermalink(String permalink) {
        this.permalink = permalink;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getStory() {
        return story;
    }

    public void setStory(String story) {
        this.story = story;
    }

    public List<String> getGenre() {
        return genre;
    }

    public void setGenre(List<String> genre) {
        this.genre = genre;
    }

    public String getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(String releaseDate) {
        this.releaseDate = releaseDate;
    }

    public String getPosterForTv() {
        return posterForTv;
    }

    public void setPosterForTv(String posterForTv) {
        this.posterForTv = posterForTv;
    }

    public float getRating() {
        return rating;
    }

    public void setRating(Integer rating) {
        this.rating = rating;
    }

}
