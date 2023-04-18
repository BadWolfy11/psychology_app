package com.example.ps.adapther;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView.ViewHolder;

import com.example.ps.model.Category;

import java.util.List;

public class Category_adapther extends RecyclerView.Adapter<Category_adapther.CategoryViewHolder> {
    Context context;
    List<Category> categories;

    public Category_adapther(Context context, List<Category> categories) {
        this.context = context;
        this.categories = categories;
    }

    @NonNull
    @Override
    public CategoryViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return null;
    }

    @Override
    public void onBindViewHolder(@NonNull CategoryViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return categories.size();
    }

    public static final class CategoryViewHolder extends RecyclerView.ViewHolder
    {

        public CategoryViewHolder(@NonNull View itemView) {
            super(itemView);
        }
    }
}
