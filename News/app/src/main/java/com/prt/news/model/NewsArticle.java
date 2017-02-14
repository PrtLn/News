package com.prt.news.model;

import android.widget.ImageView;

/**
 * Created by prt on 2/14/2017.
 */

public class NewsArticle
{
    private String title;
    private String details;
    private ImageView imageUrl;
    private String time;
    private String urlToArticle;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDetails() {
        return details;
    }

    public void setDetails(String details) {
        this.details = details;
    }

    public ImageView getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(ImageView imageUrl) {
        this.imageUrl = imageUrl;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getUrlToArticle() {
        return urlToArticle;
    }

    public void setUrlToArticle(String urlToArticle) {
        this.urlToArticle = urlToArticle;
    }
}
