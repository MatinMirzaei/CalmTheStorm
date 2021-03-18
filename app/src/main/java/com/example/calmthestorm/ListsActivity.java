package com.example.calmthestorm;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.icu.text.IDNA;
import android.os.Bundle;
import android.os.DeadObjectException;

import java.util.ArrayList;

public class ListsActivity extends AppCompatActivity {
    ArrayList<InfoItem> disasterInfo = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lists);
        String[] contents;
        String disaster;
        disaster = getIntent().getStringExtra("disaster");
        switch (disaster){
            case "tornado":
                contents = getResources().getStringArray(R.array.tornado_directions);
                break;
            case "earthquake":
                contents = getResources().getStringArray(R.array.earthquake_directions);
                break;
            case "wildfire":
                contents = getResources().getStringArray(R.array.wildfire_directions);
                break;
            case "volcano":
                contents = getResources().getStringArray(R.array.volcano_directions);
                break;
            default:
                contents = null;
        }

        if (contents != null){
            for (String info : contents) {
                disasterInfo.add(new InfoItem(info));
            }
        }
        else
            disasterInfo = InfoItem.createDummyList(10);

        RecyclerView rv = (RecyclerView) findViewById(R.id.recycler_view);

        DetailAdapter adapter = new DetailAdapter(disasterInfo);

        rv.setAdapter(adapter);
        rv.setLayoutManager(new LinearLayoutManager(this));
    }
}