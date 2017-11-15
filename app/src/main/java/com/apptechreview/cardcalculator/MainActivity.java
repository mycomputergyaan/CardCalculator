package com.apptechreview.cardcalculator;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.List;

import com.apptechreview.cardcalculator.cards.CommonCards;
import com.apptechreview.cardcalculator.cards.RareCards;


public class MainActivity extends AppCompatActivity {

    private GridLayoutManager lLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setTitle(null);

        List<ItemObject> rowListItem = CommonCards.getAllItemList();
        rowListItem.addAll(RareCards.getAllItemList());
        lLayout = new GridLayoutManager(MainActivity.this, 4);

        RecyclerView rView = findViewById(R.id.recycler_view);
        rView.setHasFixedSize(true);
        rView.setLayoutManager(lLayout);

        RecyclerViewAdapter rcAdapter = new RecyclerViewAdapter(MainActivity.this, rowListItem);
        rView.setAdapter(rcAdapter);
    }


}
