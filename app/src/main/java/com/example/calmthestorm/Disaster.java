package com.example.calmthestorm;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity
public class Disaster {
    @PrimaryKey
    public int Id;

    @ColumnInfo(name ="info")
    public String info;

    @ColumnInfo(name = "type")
    public String type;

    public Disaster(String info, String type){
        this.info = info;
        this.type = type;
    }
}
