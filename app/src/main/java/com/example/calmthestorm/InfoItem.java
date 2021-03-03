package com.example.calmthestorm;

import android.widget.ListView;

import java.util.ArrayList;

public class InfoItem {
    private String myInfo;

    public InfoItem(String info){
        myInfo = info;
    }

    public String getMyInfo(){
        return myInfo;
    }

    //CREATE DUMMY LIST OF INFO LIST ITEMS FOR INITIAL TESTING/SETUP OF RECYCLER VIEW
    public static ArrayList<InfoItem> createDummyList(int numItems){
        ArrayList<InfoItem> items = new ArrayList<>();
        for (int i = 0; i < numItems; i++){
            items.add(new InfoItem(String.format("This is how you live %d", numItems)));
        }
        return items;
    }
}
