package com.example.xweather_v2.Common;

import android.annotation.SuppressLint;
import android.location.Location;

import java.security.InvalidParameterException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Common {
    public static final String oneCallAPI = "https://api.openweathermap.org/data/2.5/onecall";
    public static final String APP_ID = "c86e7feaf57899bbd3e116870f278257";

    private static final String UNIT_METRIC = "metric";
    private static final String UNIT_IMPERIAL = "imperial";
    public static final String CURRENT = "current";
    public static final String HOURLY = "hourly";
    public static final String DAILY = "daily";

    public static Location current_location = null;
    private static String units = "metric";

    public static String convertUnixToDate(long dt) {
        Date date = new Date(dt * 1000L);
        @SuppressLint("SimpleDateFormat") SimpleDateFormat simpleDateFormat = new SimpleDateFormat("HH:mm EEE MM yyyy");
        return simpleDateFormat.format(date);
    }

    public static String convertUnixToHour(long sunrise) {
        Date date = new Date(sunrise * 1000L);
        @SuppressLint("SimpleDateFormat") SimpleDateFormat simpleDateFormat = new SimpleDateFormat("HH:mm");
        return simpleDateFormat.format(date);
    }

    // 因为我使用的是免费的API KEY，所以按城市名称无法获得hourly和daily的天气预报，所以我将做一组假的搜索栏，提前储存一些城市的座标。
    // 如果发现其他免费的可以按城市名称获取座标的API，再更新添加进去。
    public static String oneCallURL(String exclude) {
        if (current_location == null) throw new InvalidParameterException();
//        exclude: current,hourly,daily
        return oneCallAPI + "?lat=" + current_location.getLatitude() + "&lon=" + current_location.getLongitude() + "&exclude=" + exclude + "&appid=" + APP_ID + "&units=" + Common.units;
    }

    public void setUnits(String units) {
        // metric：℃, imperial: ℉
        Common.units = units;
    }

}
