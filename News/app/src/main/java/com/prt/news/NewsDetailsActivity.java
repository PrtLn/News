package com.prt.news;

import android.graphics.Bitmap;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.ProgressBar;
import android.widget.Toast;

public class NewsDetailsActivity extends AppCompatActivity {
    private WebView mWebView;
    private ProgressBar mProgressBar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_news_details);

        mWebView = (WebView) findViewById(R.id.activity_news_details_webveiw);
        mProgressBar = (ProgressBar) findViewById(R.id.activity_news_detailes_progressbar);
    }

    public void updateNewsDetails(int index) {
        mWebView.getSettings().setJavaScriptEnabled(true);
        mWebView.setWebViewClient(new WebViewClient() {
            @Override
            public void onPageStarted(WebView view, String url, Bitmap favicon) {
                mProgressBar.setVisibility(View.VISIBLE);
            }

            @Override
            public void onPageFinished(WebView view, String url) {
                mProgressBar.setVisibility(View.GONE);
            }

            @Override
            public void onReceivedError(WebView view, WebResourceRequest request,
                                        WebResourceError error) {
                mProgressBar.setVisibility(View.GONE);
                Toast.makeText(NewsDetailsActivity.this, "Error in loading webpage",
                        Toast.LENGTH_SHORT).show();
            }
        });
        mWebView.loadUrl(NewsStore.getmNewsArticles().get(index).getUrlToArticle());
        getSupportActionBar().setTitle(NewsStore.getmNewsArticles().get(index).getTitle());
    }
}
