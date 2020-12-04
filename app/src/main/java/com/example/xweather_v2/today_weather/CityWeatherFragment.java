package com.example.xweather_v2.today_weather;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.xweather_v2.BuildConfig;
import com.example.xweather_v2.R;
import com.example.xweather_v2.base.BaseFragment;
import com.example.xweather_v2.bean.OneCallBean;
import com.example.xweather_v2.common.Common;
import com.example.xweather_v2.db.DatabaseManager;
import com.google.gson.Gson;
import com.squareup.picasso.Picasso;

import org.xutils.http.RequestParams;
import org.xutils.x;

public class CityWeatherFragment extends BaseFragment {

    private ImageView img_weather;
    private TextView txt_city_name, txt_temperature, txt_description, txt_date_time, txt_maxTemp, txt_minTemp,
            txt_sunrise, txt_sunset, txt_wind, txt_feelsLike, txt_pressure, txt_humidity, txt_visibility, txt_cloudiness;

    private int city_id;
    private String city_name;
    private String city_state;
    private String city_country;
    private double city_lat, city_lon;

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

        Bundle bundle = getArguments();

        assert bundle != null;
        city_id = bundle.getInt("city_id");
        city_name = bundle.getString("city_name");
        city_state = bundle.getString("city_state");
        city_country = bundle.getString("city_country");
        city_lat = bundle.getDouble("city_lat");
        city_lon = bundle.getDouble("city_lon");

        params.addQueryStringParameter("lat", String.valueOf(city_lat));
        params.addQueryStringParameter("lon", String.valueOf(city_lon));
        params.addQueryStringParameter("appid", BuildConfig.OWM_API_KEY);
        params.addQueryStringParameter("units", Common.units);

        x.http().get(params, this);

        return view;
    }


    @SuppressLint("SetTextI18n")
    private void parseShowData(String result) {
        // 使用Gson解析数据
        try {
            OneCallBean oneCallBean = new Gson().fromJson(result, OneCallBean.class);
            // today_general
            String iconURL = "https://openweathermap.org/img/wn/" + oneCallBean.getCurrent().getWeather().get(0).getIcon() + "@2x.png";
            Picasso.get().load(iconURL).into(img_weather);
            txt_city_name.setText(city_name);
            txt_temperature.setText(Math.round(oneCallBean.getCurrent().getTemp()) + " ℃");
            txt_description.setText(oneCallBean.getCurrent().getWeather().get(0).getDescription());
            txt_date_time.setText(Common.convertUnixToDate(oneCallBean.getCurrent().getDt()));
            txt_maxTemp.setText(Math.round(oneCallBean.getDaily().get(0).getTemp().getMax()) + "");
            txt_minTemp.setText(Math.round(oneCallBean.getDaily().get(0).getTemp().getMin()) + "");

            txt_sunrise.setText(Common.convertUnixToHour(oneCallBean.getCurrent().getSunrise()));
            txt_sunset.setText(Common.convertUnixToHour(oneCallBean.getCurrent().getSunset()));
            txt_cloudiness.setText(oneCallBean.getCurrent().getClouds() + " %");
            txt_wind.setText(getWindDirection(oneCallBean.getCurrent().getWind_deg()) + " " + oneCallBean.getCurrent().getWind_speed() + " m/s");
            txt_feelsLike.setText(Math.round(oneCallBean.getCurrent().getFeels_like()) + " ℃");
            txt_pressure.setText(oneCallBean.getCurrent().getPressure() + " hPa");
            txt_humidity.setText(oneCallBean.getCurrent().getHumidity() + " %");
            txt_visibility.setText(oneCallBean.getCurrent().getVisibility() / 1000 + " km");
        } catch (Exception exception) {
            Log.d("xwei.jsonParse", exception.toString());
        }

    }

    // Calculate the wind direction by JSON: wind.deg data.
    private String getWindDirection(int deg) {
        String direction = "";
        if (deg == 0 || deg == 360) {
            direction = "N";
        } else if (deg == 90) {
            direction = "E";
        } else if (deg == 180) {
            direction = "S";
        } else if (deg == 270) {
            direction = "W";
        } else if (deg > 0 && deg < 90) {
            direction = "NE";
        } else if (deg > 90 && deg < 180) {
            direction = "SE";
        } else if (deg > 180 && deg < 270) {
            direction = "SW";
        } else if (deg > 270 && deg < 360) {
            direction = "NW";
        }

        return direction;
    }


    private void initView(View view) {
//        today_general
        img_weather = view.findViewById(R.id.img_weather);
        txt_city_name = view.findViewById(R.id.txt_city_name);
        txt_temperature = view.findViewById(R.id.txt_temperature);
        txt_description = view.findViewById(R.id.txt_description);
        txt_date_time = view.findViewById(R.id.txt_date_time);
        txt_maxTemp = view.findViewById(R.id.txt_maxTemp);
        txt_minTemp = view.findViewById(R.id.txt_minTemp);
//        today_details
        txt_sunrise = view.findViewById(R.id.txt_sunrise);
        txt_sunset = view.findViewById(R.id.txt_sunset);
        txt_cloudiness = view.findViewById(R.id.txt_clouds);
        txt_wind = view.findViewById(R.id.txt_wind);
        txt_feelsLike = view.findViewById(R.id.txt_feelsLike);
        txt_pressure = view.findViewById(R.id.txt_pressure);
        txt_humidity = view.findViewById(R.id.txt_humidity);
        txt_visibility = view.findViewById(R.id.txt_visibility);
    }

    @Override
    public void onSuccess(String result) {
        try {
            parseShowData(result);
        } catch (Exception exception) {
            Log.d("xwei.CityWeatherFragment.onSuccess", exception.toString());
        }

        // Update the database
        int feedbackInfo = DatabaseManager.updateInfoByCity(city_id, result);
        if (feedbackInfo <= 0) {
            // update failed, that mean there is no this city name in the database
            DatabaseManager.addCityInfo(city_id, city_name, city_state, city_country, city_lat, city_lon, result);
        }
    }

    @Override
    public void onError(Throwable ex, boolean isOnCallback) {
        // Find the weather information from the database
        String content = DatabaseManager.queryInfoByCity(city_id);
        if (!TextUtils.isEmpty(content)) {
            parseShowData(content);
        }
    }

}