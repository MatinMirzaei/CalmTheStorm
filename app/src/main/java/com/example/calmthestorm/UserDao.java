package com.example.calmthestorm;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;

import java.util.List;

@Dao
public interface UserDao {

    @Query("SELECT * FROM user")
    List<User> getAll();

    @Insert
    void addUser(User user);

    @Update
    User updateUser(int id);

    @Delete
    void deleteUser(int id);
}
