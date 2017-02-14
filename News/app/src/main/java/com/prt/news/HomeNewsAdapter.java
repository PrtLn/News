package com.prt.news;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.prt.news.model.NewsArticle;

import java.util.List;

/**
 * Created by prt on 2/14/2017.
 */

public class HomeNewsAdapter extends RecyclerView.Adapter<HomeNewsAdapter.HomeNewsViewHolder>
{
    private List<NewsArticle> mNewsArticles;

    public HomeNewsAdapter(List<NewsArticle> newsArticles) {
        mNewsArticles = newsArticles;
    }

    @Override
    public HomeNewsViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.item_home_news, parent, false);
        HomeNewsViewHolder homeNewsViewHolder = new HomeNewsViewHolder(view);
        return homeNewsViewHolder;
    }

    @Override
    public void onBindViewHolder(HomeNewsViewHolder holder, int position) {
        NewsArticle newsArticle = mNewsArticles.get(position);
        Glide.with(holder.cardImageView.getContext())
                .load(newsArticle.getImageUrl())
                .centerCrop()
                .into(holder.cardImageView);
        holder.cardTitleTextView.setText(newsArticle.getTitle());
        holder.cardTimeTextView.setText(newsArticle.getTime());
        holder.cardContentTextView.setText(newsArticle.getDetails());
    }

    @Override
    public int getItemCount() {
        return mNewsArticles.size();
    }

    public static class HomeNewsViewHolder extends RecyclerView.ViewHolder
    {
        ImageView cardImageView;
        TextView cardTitleTextView;
        TextView cardTimeTextView;
        TextView cardContentTextView;

        public HomeNewsViewHolder(View itemView) {
            super(itemView);
            cardImageView = (ImageView) itemView.findViewById(R.id.card_news_image);
            cardTitleTextView = (TextView) itemView.findViewById(R.id.card_news_title);
            cardTimeTextView = (TextView) itemView.findViewById(R.id.card_news_time);
            cardContentTextView = (TextView) itemView.findViewById(R.id.card_news_content);
        }
    }
}
