package com.example.calmthestorm;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.os.DeadObjectException;

import java.util.ArrayList;

public class ListsActivity extends AppCompatActivity {
    ArrayList<InfoItem> disasterInfo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lists);

        RecyclerView rv = (RecyclerView) findViewById(R.id.recyclerView);

        disasterInfo = InfoItem.createDummyList(10);

        DetailAdapter adapter = new DetailAdapter(disasterInfo);

        rv.setAdapter(adapter);
        rv.setLayoutManager(new LinearLayoutManager(this));
    }
}