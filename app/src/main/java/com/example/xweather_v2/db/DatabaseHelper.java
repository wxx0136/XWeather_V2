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
        String sql = "create table info(_pk INTEGER PRIMARY KEY autoincrement, id INTEGER UNIQUE NOT NULL, city CHAR(50), lat REAL NOT NULL, lon REAL NOT NULL, content TEXT NOT NULL)";
        db.execSQL(sql);

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }
}
