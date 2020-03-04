package com.example.xyzreader.ui.detail;

import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class ArticleDetailAdapter extends RecyclerView.Adapter<ArticleDetailAdapter.ArticleDetailViewHolder> {
    @NonNull
    @Override
    public ArticleDetailViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return null;
    }

    @Override
    public void onBindViewHolder(@NonNull ArticleDetailViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }

    public class ArticleDetailViewHolder extends RecyclerView.ViewHolder {
        public ArticleDetailViewHolder(View itemView) {
            super(itemView);
        }
    }
}
