package com.example.calmthestorm;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class DisasterDetailsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_disaster_detail);
    }

    public void getDisasterInfo(View view){
        Intent intent = new Intent(this, ListsActivity.class);
        startActivity(intent);
    }

    public void getMap(View view){
        Intent intent = new Intent(this, MapActivity.class);
        startActivity(intent);
    }

    public void getSurvivalKit(View view){
        Intent intent = new Intent(this, KitListActivity.class);
        startActivity(intent);
    }
}