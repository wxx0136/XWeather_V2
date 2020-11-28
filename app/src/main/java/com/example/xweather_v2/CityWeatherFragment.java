package com.example.xweather_v2;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.fragment.app.Fragment;

import com.example.xweather_v2.Common.Common;
import com.example.xweather_v2.Model.CurrentWeatherResult;
import com.google.gson.Gson;
import com.squareup.picasso.Picasso;

import org.xutils.common.Callback;
import org.xutils.http.RequestParams;
import org.xutils.x;

public class CityWeatherFragment extends Fragment implements Callback.CommonCallback<String> {

    ImageView img_weather;
    TextView txt_city_name, txt_temperature, txt_description, txt_date_time, txt_maxTemp, txt_minTemp,
            txt_sunrise, txt_sunset, txt_wind, txt_feelsLike, txt_pressure, txt_humidity, txt_visibility, txt_cloudiness;
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
        // GET http request
        String currentWeatherAPI = "https://api.openweathermap.org/data/2.5/onecall";
        RequestParams params = new RequestParams(currentWeatherAPI);
        params.addQueryStringParameter("lat", String.valueOf(Common.current_location.getLatitude()));
        params.addQueryStringParameter("lon", String.valueOf(Common.current_location.getLatitude()));
        params.addQueryStringParameter("appid", Common.APP_ID);
        params.addQueryStringParameter("units", Common.units);
        x.http().get(params, this);

        return view;
    }

    @Override
    public void onSuccess(String result) {
        parseShowData(result);
    }

    @Override
    public void onError(Throwable ex, boolean isOnCallback) {

    }

    @Override
    public void onCancelled(CancelledException cex) {

    }

    @Override
    public void onFinished() {

    }

    @SuppressLint("SetTextI18n")
    private void parseShowData(String result) {
        //        使用gson解析数据
        CurrentWeatherResult currentWeatherResult = new Gson().fromJson(result, CurrentWeatherResult.class);

        //        today_general
        String iconURL = "http://openweathermap.org/img/wn/" + currentWeatherResult.getWeather().get(0).getIcon() + "@2x.png";
        Picasso.get().load(iconURL).into(img_weather);
        txt_city_name.setText(currentWeatherResult.getName());
        txt_temperature.setText(currentWeatherResult.getMain().getTemp() + " ℃");
        txt_description.setText(currentWeatherResult.getWeather().get(0).getDescription());
        txt_date_time.setText(Common.convertUnixToDate(currentWeatherResult.getDt()));
        txt_maxTemp.setText(currentWeatherResult.getMain().getTemp_max() + "");
        txt_minTemp.setText(currentWeatherResult.getMain().getTemp_min() + "");

        //        today_details
        txt_sunrise.setText(Common.convertUnixToHour(currentWeatherResult.getSys().getSunrise()));
        txt_sunset.setText(Common.convertUnixToHour(currentWeatherResult.getSys().getSunset()));
        txt_cloudiness.setText(currentWeatherResult.getClouds().getAll());
        txt_wind.setText(currentWeatherResult.getWind().getSpeed() + " m/s");
        txt_feelsLike.setText(currentWeatherResult.getMain().getFeels_like() + " ℃");
        txt_pressure.setText(currentWeatherResult.getMain().getPressure() + " hPa");
        txt_humidity.setText(currentWeatherResult.getMain().getHumidity() + " %");
        txt_visibility.setText(currentWeatherResult.getVisibility() + "m");
    }


    private void initView(View view) {
//        today_general
        img_weather = (ImageView) view.findViewById(R.id.img_weather);
        txt_city_name = (TextView) view.findViewById(R.id.txt_city_name);
        txt_temperature = (TextView) view.findViewById(R.id.txt_temperature);
        txt_description = (TextView) view.findViewById(R.id.txt_description);
        txt_date_time = (TextView) view.findViewById(R.id.txt_date_time);
        txt_maxTemp = (TextView) view.findViewById(R.id.txt_maxTemp);
        txt_minTemp = (TextView) view.findViewById(R.id.txt_minTemp);
//        today_details
        txt_sunrise = (TextView) view.findViewById(R.id.txt_sunrise);
        txt_sunset = (TextView) view.findViewById(R.id.txt_sunset);
        txt_cloudiness = (TextView) view.findViewById(R.id.txt_cloudiness);
        txt_wind = (TextView) view.findViewById(R.id.txt_wind);
        txt_feelsLike = (TextView) view.findViewById(R.id.txt_feelsLike);
        txt_pressure = (TextView) view.findViewById(R.id.txt_pressure);
        txt_humidity = (TextView) view.findViewById(R.id.txt_humidity);
        txt_visibility = (TextView) view.findViewById(R.id.txt_visibility);
    }
}