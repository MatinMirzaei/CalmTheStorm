package com.example.calmthestorm;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class KitListActivity extends AppCompatActivity {
    ArrayList<KitItem> kitItemsInfo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kit_list);

        RecyclerView rv = (RecyclerView) findViewById(R.id.kitRecyclerView);

        kitItemsInfo = KitItem.createDummyKit(10);

        KitAdapter adapter = new KitAdapter(kitItemsInfo);

        rv.setAdapter(adapter);
        rv.setLayoutManager(new LinearLayoutManager(this));
    }
}