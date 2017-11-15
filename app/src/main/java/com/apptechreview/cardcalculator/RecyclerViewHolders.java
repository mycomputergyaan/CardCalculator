package com.apptechreview.cardcalculator;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class RecyclerViewHolders extends RecyclerView.ViewHolder implements View.OnClickListener{

    public TextView cardName;
    public ImageView cardPhoto;

    public RecyclerViewHolders(View itemView) {
        super(itemView);
        itemView.setOnClickListener(this);
        cardName = itemView.findViewById(R.id.card_name);
        cardPhoto = itemView.findViewById(R.id.card_photo);
    }

    @Override
    public void onClick(View view) {
        Toast.makeText(view.getContext(), "Clicked Card Position = " + getPosition(), Toast.LENGTH_SHORT).show();
    }
}