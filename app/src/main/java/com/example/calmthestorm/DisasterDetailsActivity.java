package com.example.calmthestorm;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class DisasterDetailsActivity extends AppCompatActivity {
    private String disaster;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_disaster_detail);
        disaster = getIntent().getStringExtra("disaster");
    }

    public void getDisasterInfo(View view){
        Intent intent = new Intent(this, ListsActivity.class);
        Log.i("info", "second time" + disaster);
        intent.putExtra("disaster", disaster);
        startActivity(intent);
    }

    public void getMap(View view){
        Intent intent = new Intent(this, MapActivity.class);
        startActivity(intent);
    }

    public void getSurvivalKit(View view){
        Intent intent = new Intent(this, KitListActivity.class);
        intent.putExtra("disaster", disaster);
        startActivity(intent);
    }
}