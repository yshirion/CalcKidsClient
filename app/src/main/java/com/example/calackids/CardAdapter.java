package com.example.calackids;

import androidx.recyclerview.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.ArrayList;


public class CardAdapter extends RecyclerView.Adapter<CardAdapter.ExampleViewHolder> {
    private ArrayList<MenuCard> mExampleList;


    public static class ExampleViewHolder extends RecyclerView.ViewHolder {
        public ImageView mImageView;
        public TextView mTextView1;

        public ExampleViewHolder(View itemView) {
            super(itemView);
            mImageView = itemView.findViewById(R.id.img);
            mTextView1 = itemView.findViewById(R.id.text);
        }

    }

    public CardAdapter(ArrayList<MenuCard> exampleList) {
        mExampleList = exampleList;
    }

    @Override
    public ExampleViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.menu_card_layout, parent, false);
        ExampleViewHolder evh = new ExampleViewHolder(v);
        return evh;
    }

    @Override
    public void onBindViewHolder(ExampleViewHolder holder, int position) {
        MenuCard currentItem = mExampleList.get(position);

        holder.mImageView.setImageResource(currentItem.getImage_id());
        holder.mTextView1.setText(currentItem.getCard_text());
        holder.itemView.setTag(currentItem);


    }

    @Override
    public int getItemCount() {
        return mExampleList.size();
    }
}