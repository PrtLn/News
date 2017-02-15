package com.prt.news;

import com.prt.news.model.NewsArticle;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by prt on 2/14/2017.
 */

public class NewsStore {
    private static List<NewsArticle> mNewsArticles = new ArrayList<>();

    public static List<NewsArticle> getmNewsArticles() {
        return mNewsArticles;
    }

    public static void setmNewsArticles(List<NewsArticle> mNewsArticles) {
        NewsStore.mNewsArticles = mNewsArticles;
    }
}
