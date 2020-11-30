package com.example.xweather_v2.today_weather;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.xweather_v2.R;
import com.example.xweather_v2.base.BaseFragment;


public class DailyForecastFragment extends BaseFragment {

    public DailyForecastFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view =  inflater.inflate(R.layout.fragment_daily_forecast, container, false);

        return view;
    }
}