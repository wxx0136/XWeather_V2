package com.example.xweather_v2.today_weather;

import android.annotation.SuppressLint;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.xweather_v2.R;
import com.example.xweather_v2.bean.OneCallBean;
import com.example.xweather_v2.common.Common;
import com.squareup.picasso.Picasso;

public class HourlyForecastAdapter extends RecyclerView.Adapter<HourlyForecastAdapter.ViewHolder> {

    Context context;
    OneCallBean oneCallBean;

    public HourlyForecastAdapter(Context context, OneCallBean oneCallBean) {
        this.context = context;
        this.oneCallBean = oneCallBean;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_hourly_forecast, parent, false);
        return new ViewHolder(itemView);
    }

    @SuppressLint("SetTextI18n")
    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        String hour = Common.convertUnixToHour(oneCallBean.getHourly().get(position + 1).getDt()).split(":")[0];

        String unit_temp;
        if (Common.units.equals("metric")) {
            unit_temp = "℃";
        } else {
            unit_temp = "℉";
        }

        holder.txt_listView_hourly_item_clock.setText(hour);
        holder.txt_listView_hourly_item_temperature.setText(Math.round(oneCallBean.getHourly().get(position + 1).getTemp()) + unit_temp);

        String iconURL = "https://openweathermap.org/img/wn/" + oneCallBean.getHourly().get(position + 1).getWeather().get(0).getIcon() + "@2x.png";
        Picasso.get().load(iconURL).into(holder.image_listView_hourly_item_weather);
    }

    @Override
    public int getItemCount() {
        return 24;
    }

    static class ViewHolder extends RecyclerView.ViewHolder {
        TextView txt_listView_hourly_item_clock, txt_listView_hourly_item_temperature;
        ImageView image_listView_hourly_item_weather;

        public ViewHolder(View itemView) {
            super(itemView);
            txt_listView_hourly_item_clock = itemView.findViewById(R.id.txt_listView_hourly_item_clock);
            txt_listView_hourly_item_temperature = itemView.findViewById(R.id.txt_listView_hourly_item_temperature);

            image_listView_hourly_item_weather = itemView.findViewById(R.id.image_listView_hourly_item_weather);
        }
    }
}
