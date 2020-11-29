package com.example.xweather_v2.common;

import android.annotation.SuppressLint;
import android.location.Location;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Common {
    public static final String APP_ID = "c86e7feaf57899bbd3e116870f278257";

    public static final String UNIT_METRIC = "metric";
    public static final String UNIT_IMPERIAL = "imperial";

    public static Location current_location = null;
    public static String units = UNIT_METRIC;

    public static String convertUnixToDate(long dt) {
        Date date = new Date(dt * 1000L);
        @SuppressLint("SimpleDateFormat") SimpleDateFormat simpleDateFormat = new SimpleDateFormat("EEE, dd MMM yyyy");
        return simpleDateFormat.format(date);
    }

    public static String convertUnixToWeekday(long dt) {
        Date date = new Date(dt * 1000L);
        @SuppressLint("SimpleDateFormat") SimpleDateFormat simpleDateFormat = new SimpleDateFormat("EEE");
        return simpleDateFormat.format(date);
    }

    public static String convertUnixToHour(long sunrise) {
        Date date = new Date(sunrise * 1000L);
        @SuppressLint("SimpleDateFormat") SimpleDateFormat simpleDateFormat = new SimpleDateFormat("HH:mm");
        return simpleDateFormat.format(date);
    }

    public static Location getLocationByCityName(String city_name){
        return null;
    }

    public void setUnits(String units) {
        // metric：℃, imperial: ℉
        Common.units = units;
    }

}
