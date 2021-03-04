package com.example.calmthestorm;


import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

import java.util.ArrayList;


@Entity
public class SurvivalMaps {
    @PrimaryKey
    public int id;

    @ColumnInfo(name ="locationId")
    public int locationId;

    @ColumnInfo(name = "disasterId")
    public int disasterId;
}
