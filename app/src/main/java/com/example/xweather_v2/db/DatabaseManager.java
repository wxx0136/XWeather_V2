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

    // Based on the city name, update the content
    public static int updateInfoByCity(int id, String content) {
        ContentValues values = new ContentValues();
        values.put("content", content);
        return database.update("info", values, "id=?", new String[]{String.valueOf(id)});
    }

    // Add a new city
    public static void addCityInfo(int id, String city, String state, String country, double lat, double lon, String content) {
        ContentValues values = new ContentValues();
        values.put("id", id);
        values.put("city", city);
        values.put("state", state);
        values.put("country", country);
        values.put("lat", lat);
        values.put("lon", lon);
        values.put("content", content);
        database.insert("info", null, values);
    }

    // Query the weather info based on the city name.
    public static String queryInfoByCity(int id) {
        @SuppressLint("Recycle") Cursor cursor = database.query("info", null, "id=?", new String[]{String.valueOf(id)}, null, null, null);
        if (cursor.getCount() > 0) {
            cursor.moveToFirst();
            return cursor.getString(cursor.getColumnIndex("content"));
        }
        return null;
    }

    // The weather favorites max number is 10 (iOS 14 weather App max number is 20)
    public static int getCityCount() {
        @SuppressLint("Recycle") Cursor cursor = database.query("info", null, null, null, null, null, null);
        return cursor.getCount();
    }

    // Fetch all information from the database
    public static List<DatabaseBean> queryAllInfo() {
        @SuppressLint("Recycle") Cursor cursor = database.query("info", null, null, null, null, null, null);
        List<DatabaseBean> databaseBeanList = new ArrayList<>();
        while (cursor.moveToNext()) {
            int _pk = cursor.getInt(cursor.getColumnIndex("_pk"));
            int id = cursor.getInt(cursor.getColumnIndex("id"));
            String city = cursor.getString(cursor.getColumnIndex("city"));
            String state = cursor.getString(cursor.getColumnIndex("state"));
            String country = cursor.getString(cursor.getColumnIndex("country"));
            double lat = cursor.getDouble(cursor.getColumnIndex("lat"));
            double lon = cursor.getDouble(cursor.getColumnIndex("lon"));
            String content = cursor.getString(cursor.getColumnIndex("content"));
            DatabaseBean bean = new DatabaseBean(_pk, id, city, state, country, lat, lon, content);
            databaseBeanList.add(bean);
        }
        return databaseBeanList;
    }

    // Based on the city_id, remove the info of this city in the database
    public static void removeInfoByCity(int id) {
        database.delete("info", "id=?", new String[]{String.valueOf(id)});
    }


}
