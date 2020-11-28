package com.example.xweather_v2;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.fragment.app.Fragment;

public class CityWeatherFragment extends Fragment {

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
        return view;
    }

    private void initView(View itemView) {
//        panel_today_general
        img_weather = (ImageView) itemView.findViewById(R.id.img_weather);
        txt_city_name = (TextView) itemView.findViewById(R.id.txt_city_name);
        txt_temperature = (TextView) itemView.findViewById(R.id.txt_temperature);
        txt_description = (TextView) itemView.findViewById(R.id.txt_description);
        txt_date_time = (TextView) itemView.findViewById(R.id.txt_date_time);
        txt_maxTemp = (TextView) itemView.findViewById(R.id.txt_maxTemp);
        txt_minTemp = (TextView) itemView.findViewById(R.id.txt_minTemp);
//        panel_today_details
        txt_sunrise = (TextView) itemView.findViewById(R.id.txt_sunrise);
        txt_sunset = (TextView) itemView.findViewById(R.id.txt_sunset);
        txt_chanceOfSnow = (TextView) itemView.findViewById(R.id.txt_chanceOfSnow);
        txt_wind = (TextView) itemView.findViewById(R.id.txt_wind);
        txt_feelsLike = (TextView) itemView.findViewById(R.id.txt_feelsLike);
        txt_precipitation = (TextView) itemView.findViewById(R.id.txt_precipitation);
        txt_pressure = (TextView) itemView.findViewById(R.id.txt_pressure);
        txt_humidity = (TextView) itemView.findViewById(R.id.txt_humidity);
        txt_visibility = (TextView) itemView.findViewById(R.id.txt_visibility);
        txt_uvIndex = (TextView) itemView.findViewById(R.id.txt_uvIndex);
    }
}