package com.example.calackids;

import androidx.recyclerview.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;


public class CardAdapter extends RecyclerView.Adapter<CardAdapter.ExampleViewHolder> {
    private ArrayList<Card> mExampleList;

    public static class ExampleViewHolder extends RecyclerView.ViewHolder {
        public ImageView mImageView;
        public TextView mTextView1;
        public TextView mTextView2;

        public ExampleViewHolder(View itemView) {
            super(itemView);
            mImageView = itemView.findViewById(R.id.img);
            mTextView1 = itemView.findViewById(R.id.text);
        }
    }

    public CardAdapter(ArrayList<Card> exampleList) {
        mExampleList = exampleList;
    }

    @Override
    public ExampleViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.activity_menu_child, parent, false);
        ExampleViewHolder evh = new ExampleViewHolder(v);
        return evh;
    }

    @Override
    public void onBindViewHolder(ExampleViewHolder holder, int position) {
        Card currentItem = mExampleList.get(position);

        holder.mImageView.setImageResource(currentItem.getImage_id());
        holder.mTextView1.setText(currentItem.getCard_text());
    }

    @Override
    public int getItemCount() {
        return mExampleList.size();
    }
}
//import android.content.Context;
//import android.view.LayoutInflater;
//import android.view.View;
//import android.view.ViewGroup;
//import android.widget.ArrayAdapter;
//import android.widget.ImageView;
//import android.widget.TextView;
//import androidx.annotation.NonNull;
//import androidx.annotation.Nullable;
//import java.util.ArrayList;
//
//public class CardAdapter extends ArrayAdapter<Card> {
//    public CardAdapter(@NonNull Context context, ArrayList<Card> courseModelArrayList) {
//        super(context, 0, courseModelArrayList);
//    }
//
//    @NonNull
//    @Override
//    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
//        View listitemView = convertView;
//        if (listitemView == null) {
//            // Layout Inflater inflates each item to be displayed in GridView.
//            listitemView = LayoutInflater.from(getContext()).inflate(R.layout.cardl, parent, false);
//        }
//        Card card = getItem(position);
//        TextView cardTV = listitemView.findViewById(R.id.img);
//        ImageView cardIV = listitemView.findViewById(R.id.text);
//        cardTV.setText(card.getCard_text());
//        cardIV.setImageResource(card.getImage_id());
//
//        return listitemView;
//    }
//}
//