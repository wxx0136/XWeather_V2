package com.example.xweather_v2.db;

import android.annotation.SuppressLint;
import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

import java.util.ArrayList;
import java.util.List;

public class DatabaseManager {
    public static SQLiteDatabase database;

    // init database
    public static void initDB(Context context) {
        DatabaseHelper databaseHelper = new DatabaseHelper(context);
        database = databaseHelper.getWritableDatabase();
    }

    // Search city list in the database
    public static List<String> queryAllCityName() {
        @SuppressLint("Recycle") Cursor cursor = database.query("info", null, null, null, null, null, null);
        List<String> cityList = new ArrayList<>();
        while (cursor.moveToNext()) {
            String city = cursor.getString(cursor.getColumnIndex("city"));
            cityList.add(city);
        }

        return cityList;
    }

    // Based on the city name, update the content
    public static int updateInfoByCity(String city, String content) {
        ContentValues values = new ContentValues();
        values.put("content", content);
        return database.update("info", values, "city=?", new String[]{city});
    }

    // Add a new city
    public static long addCityInfo(String city, String content) {
        ContentValues values = new ContentValues();
        values.put("city", city);
        values.put("content", content);
        return database.insert("info", null, values);
    }

    // Query the weather info based on the city name.
    public static String queryInfoByCity(String city) {
        @SuppressLint("Recycle") Cursor cursor = database.query("info", null, "city=?", new String[]{city}, null, null, null);
        if (cursor.getCount() > 0) {
            cursor.moveToFirst();
            return cursor.getString(cursor.getColumnIndex("content"));
        }
        return null;
    }

}
