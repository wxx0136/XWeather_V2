package com.example.xweather_v2.common;

import android.annotation.SuppressLint;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Common {

    public static String units;

    public static String convertUnixToDate(long dt) {
        Date date = new Date(dt * 1000L);
        @SuppressLint("SimpleDateFormat") SimpleDateFormat simpleDateFormat = new SimpleDateFormat("EEE, dd MMM yyyy");
        return simpleDateFormat.format(date);
    }

    public static String convertUnixToWeekday(long dt) {
        Date date = new Date(dt * 1000L);
        @SuppressLint("SimpleDateFormat") SimpleDateFormat simpleDateFormat = new SimpleDateFormat("EEEE");
        return simpleDateFormat.format(date);
    }

    public static String convertUnixToHour(long sunrise) {
        Date date = new Date(sunrise * 1000L);
        @SuppressLint("SimpleDateFormat") SimpleDateFormat simpleDateFormat = new SimpleDateFormat("HH:mm");
        return simpleDateFormat.format(date);
    }

}
