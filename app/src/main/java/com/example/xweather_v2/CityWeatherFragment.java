package com.example.xweather_v2;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.example.xweather_v2.Base.BaseFragment;
import com.example.xweather_v2.Common.Common;

public class CityWeatherFragment extends BaseFragment {

    ImageView img_weather;
    TextView txt_city_name, txt_temperature, txt_description, txt_date_time, txt_maxTemp, txt_minTemp,
            txt_sunrise, txt_sunset, txt_chanceOfSnow, txt_wind, txt_feelsLike, txt_precipitation, txt_pressure, txt_humidity, txt_visibility, txt_uvIndex;
    LinearLayout panel_today_general, panel_today_details;

    public CityWeatherFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_city_weather, container, false);
        initView(view);
        //调用父类方法
        loadData(Common.oneCallURL());

        return view;
    }

    @Override
    public void onSuccess(String result) {
        super.onSuccess(result);
    }

    @Override
    public void onError(Throwable ex, boolean isOnCallback) {
        super.onError(ex, isOnCallback);
    }

    private void initView(View view) {
//        panel_today_general
        img_weather = (ImageView) view.findViewById(R.id.img_weather);
        txt_city_name = (TextView) view.findViewById(R.id.txt_city_name);
        txt_temperature = (TextView) view.findViewById(R.id.txt_temperature);
        txt_description = (TextView) view.findViewById(R.id.txt_description);
        txt_date_time = (TextView) view.findViewById(R.id.txt_date_time);
        txt_maxTemp = (TextView) view.findViewById(R.id.txt_maxTemp);
        txt_minTemp = (TextView) view.findViewById(R.id.txt_minTemp);
//        panel_today_details
        txt_sunrise = (TextView) view.findViewById(R.id.txt_sunrise);
        txt_sunset = (TextView) view.findViewById(R.id.txt_sunset);
        txt_chanceOfSnow = (TextView) view.findViewById(R.id.txt_chanceOfSnow);
        txt_wind = (TextView) view.findViewById(R.id.txt_wind);
        txt_feelsLike = (TextView) view.findViewById(R.id.txt_feelsLike);
        txt_precipitation = (TextView) view.findViewById(R.id.txt_precipitation);
        txt_pressure = (TextView) view.findViewById(R.id.txt_pressure);
        txt_humidity = (TextView) view.findViewById(R.id.txt_humidity);
        txt_visibility = (TextView) view.findViewById(R.id.txt_visibility);
        txt_uvIndex = (TextView) view.findViewById(R.id.txt_uvIndex);
    }
}