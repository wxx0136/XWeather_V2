package com.example.xweather_v2.today_weather;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.example.xweather_v2.BuildConfig;
import com.example.xweather_v2.R;
import com.example.xweather_v2.base.BaseFragment;
import com.example.xweather_v2.bean.CurrentWeatherBean;
import com.example.xweather_v2.bean.OneCallBean;
import com.example.xweather_v2.common.Common;
import com.example.xweather_v2.db.DatabaseManager;
import com.google.gson.Gson;
import com.squareup.picasso.Picasso;

import org.xutils.http.RequestParams;
import org.xutils.x;

public class CityWeatherFragment extends BaseFragment {

    ImageView img_weather;
    TextView txt_city_name, txt_temperature, txt_description, txt_date_time, txt_maxTemp, txt_minTemp,
            txt_sunrise, txt_sunset, txt_wind, txt_feelsLike, txt_pressure, txt_humidity, txt_visibility, txt_cloudiness;
    LinearLayout panel_today_general, panel_today_details;
    String city_name;

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
//        city_name = bundle.getString("city_name");
        params.addQueryStringParameter("lat", );
        params.addQueryStringParameter("lon", );
        params.addQueryStringParameter("appid", BuildConfig.OWM_API_KEY);
        params.addQueryStringParameter("units", Common.units);

        x.http().get(params, this);

        return view;
    }


    @SuppressLint("SetTextI18n")
    private void parseShowData(String result) {
        //        使用Gson解析数据
        OneCallBean oneCallBean = new Gson().fromJson(result, OneCallBean.class);

        //        today_general
        String iconURL = "https://openweathermap.org/img/wn/" + oneCallBean.getCurrent().getWeather().get(0).getIcon() + "@2x.png";
        Picasso.get().load(iconURL).into(img_weather);
        txt_city_name.setText(oneCallBean.getName());
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

    @Override
    public void onSuccess(String result) {
        parseShowData(result);
//        Update the database
        int feedbackInfo = DatabaseManager.updateInfoByCity(id, result);
        if (feedbackInfo <= 0) {
            // update failed, that mean there is no this city name in the database
            DatabaseManager.addCityInfo(id, result);
        }
    }

    @Override
    public void onError(Throwable ex, boolean isOnCallback) {
        // Find the weather information from the database
        String content = DatabaseManager.queryInfoByCity(id);
        if (!TextUtils.isEmpty(content)) {
            parseShowData(content);
        }
    }

}