package com.example.calmthestorm;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class KitListActivity extends AppCompatActivity {
    ArrayList<KitItem> kitItemsInfo = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kit_list);

        String[] contents;
        String disaster;
        disaster = getIntent().getStringExtra("disaster");
        switch (disaster){
            case "tornado":
                contents = getResources().getStringArray(R.array.tornado_kit);
                break;
            case "earthquake":
                contents = getResources().getStringArray(R.array.earthquake_kit);
                break;
            case "wildfire":
                contents = getResources().getStringArray(R.array.wildfire_kit);
                break;
            case "volcano":
                contents = getResources().getStringArray(R.array.volcano_kit);
                break;
            default:
                contents = null;
        }

        if (contents != null){
            for (String info : contents) {
                kitItemsInfo.add(new KitItem(info));
            }
        }
        else
            kitItemsInfo = KitItem.createDummyKit(10);

        RecyclerView rv = (RecyclerView) findViewById(R.id.kitRecyclerView);

        KitAdapter adapter = new KitAdapter(kitItemsInfo);

        rv.setAdapter(adapter);
        rv.setLayoutManager(new LinearLayoutManager(this));
    }
}