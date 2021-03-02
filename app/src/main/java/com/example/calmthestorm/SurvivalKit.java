package com.example.calmthestorm;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity
public class SurvivalKit {
    @PrimaryKey
    public int id;

    @ColumnInfo(name ="disasterId")
    public int disasterId;

    @ColumnInfo(name = "userId")
    public int userId;
}
