package com.example.calmthestorm;

import java.util.ArrayList;

public class KitItem {

    private String kitItemDetail;
    private Boolean checked;

    public KitItem(String info){
        kitItemDetail = info;
        checked = false;
    }

    public String getKitItemDetail(){
        return kitItemDetail;
    }

    public Boolean getChecked(){
        return checked;
    }

    //CREATE DUMMY LIST OF KIT ITEMS FOR INITIAL TESTING/SETUP OF RECYCLER VIEW
    public static ArrayList<KitItem> createDummyKit(int numItems){
        ArrayList<KitItem> items = new ArrayList<>();
        for (int i = 0; i < numItems; i++){
            items.add(new KitItem(String.format("Add this to my kit %d", i)));
        }
        return items;
    }
}
