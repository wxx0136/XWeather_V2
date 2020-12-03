package com.example.xweather_v2.today_weather;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.xweather_v2.R;
import com.example.xweather_v2.base.BaseFragment;

public class HourlyForecastFragment extends BaseFragment {

    public HourlyForecastFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_hourly_forecast, container, false);
    }


}