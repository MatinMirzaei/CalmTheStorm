package com.example.calmthestorm;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        String[] tornado_instr;
    }

    public void getDisasterDetail(View view){
        Intent intent = new Intent(this, DisasterDetailsActivity.class);
        String disaster;
        switch (view.getId()){
            case R.id.earthquakeBtn:
                disaster = "earthquake";
                break;
            case R.id.tornadoBtn:
                disaster = "tornado";
                break;
            case R.id.wildfireBtn:
                disaster = "wildfire";
                break;
            case R.id.volcanoBtn:
                disaster = "volcano";
                break;
            default:
                disaster = "default";
        };
        Log.i("info", disaster);
        intent.putExtra("disaster", disaster);
        startActivity(intent);
    }
}