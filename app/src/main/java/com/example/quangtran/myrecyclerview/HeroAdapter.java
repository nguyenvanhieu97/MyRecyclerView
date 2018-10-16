package com.example.quangtran.myrecyclerview;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

public class HeroAdapter extends RecyclerView.Adapter<HeroAdapter.ViewHolder> {
    private int[] images;

    public HeroAdapter(int[] images) {
        this.images = images;

    }

    @NonNull
    @Override
    public HeroAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        Context context = viewGroup.getContext();
        LayoutInflater inflater = LayoutInflater.from(context);
        View contactView = inflater.inflate(R.layout.item_recycler, viewGroup, false);
        return new ViewHolder(contactView);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder viewHolder, int i) {
        int imageId = images[i];
        viewHolder.mImageHero.setImageResource(imageId);
    }

    @Override
    public int getItemCount() {
        return images != null ? images.length : 0;
    }

    //viewHolder
    public static class ViewHolder extends RecyclerView.ViewHolder {
        private ImageView mImageHero;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            mImageHero = itemView.findViewById(R.id.image_icon);
        }
    }
}
