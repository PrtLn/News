package com.prt.news.model;

/**
 * Created by prt on 2/14/2017.
 */

public class NewsArticle {
    private String mImageUrl;
    private String mTitle;
    private String mTime;
    private String mDetails;
    private String mUrlToArticle;

    public NewsArticle(String title, String details, String imageUrl, String time, String urlToArticle) {
        this.mTitle = title;
        this.mDetails = details;
        this.mImageUrl = imageUrl;
        this.mTime = time;
        this.mUrlToArticle = urlToArticle;
    }

    public String getTitle() {
        return mTitle;
    }

    public void setTitle(String title) {
        this.mTitle = title;
    }

    public String getDetails() {
        return mDetails;
    }

    public void setDetails(String details) {
        this.mDetails = details;
    }

    public String getImageUrl() {
        return mImageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.mImageUrl = imageUrl;
    }

    public String getTime() {
        return mTime;
    }

    public void setTime(String time) {
        this.mTime = time;
    }

    public String getUrlToArticle() {
        return mUrlToArticle;
    }

    public void setUrlToArticle(String urlToArticle) {
        this.mUrlToArticle = urlToArticle;
    }
}
