package com.example.calmthestorm;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.Ignore;
import androidx.room.PrimaryKey;

@Entity
public class Location {

    @PrimaryKey(autoGenerate = true)
    public int id;

    @ColumnInfo(name = "street")
    public String street;

    @ColumnInfo(name = "city")
    public String city;

    @ColumnInfo(name = "state")
    public String state;

    @ColumnInfo(name= "zip_code")
    public String zipCode;

    @Ignore
    public Location(){}

    public Location(String street, String city, String state, String zipCode){
        this.state = street;
        this.city = city;
        this.state = state;
        this.zipCode = zipCode;
    }
}
