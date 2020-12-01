package com.example.xweather_v2.db;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

public class DatabaseHelper extends SQLiteOpenHelper {
    public DatabaseHelper(@Nullable Context context) {
        super(context, "XWeather.db", null, 1);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        //  Create table
        String sql = "create table info(_id integer primary key autoincrement, city varchar(50) unique not null, content text not null)";
        db.execSQL(sql);

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }
}
