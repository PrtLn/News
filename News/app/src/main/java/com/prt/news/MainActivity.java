package com.prt.news;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.prt.news.model.NewsArticle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private RecyclerView newsRecyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        List<NewsArticle> newsArticles = new ArrayList<>();

        newsArticles.add(new NewsArticle("Reunited after 65 years, and more remarkable love letters",
                "Tales of heartbreak, elation, rejection and redemption - to mark Valentine's Day, here are four love letters, each telling a unique story...",
                "http://ichef-1.bbci.co.uk/news/660/cpsprodpb/F68A/production/_94241136_istock-467100475.jpg?w=764&amp;h=400&amp;crop=1",
                "Today",
                "http://www.bbc.com/news/magazine-38908121"));

        newsArticles.add(new NewsArticle("Vogue Paris is going to feature a transgender model on its cover for the first time next month.",
                "Brazilian Valentina Sampaio has more than 32,000 followers on Instagram." +
                        "Editor Emmanuelle Alt says she has beauty striking enough to stun on the cover of Vogue...",
                "https://scontent-waw1-1.cdninstagram.com/t51.2885-15/s750x750/sh0.08/e35/16229178_1807571686126776_7476641603877076992_n.jpg?w=764&amp;h=400&amp;crop=1",
                "Today",
                "http://www.bbc.co.uk/newsbeat/article/38965846/french-vogue-gets-first-transgender-cover-star"));

        NewsStore.setmNewsArticles(newsArticles);

        newsRecyclerView = (RecyclerView) findViewById(R.id.activity_main_recyclerview);
        newsRecyclerView.setLayoutManager(new LinearLayoutManager(this));

        HomeNewsAdapter homeNewsAdapter = new HomeNewsAdapter(NewsStore.getmNewsArticles());
        newsRecyclerView.setAdapter(homeNewsAdapter);
    }
}
