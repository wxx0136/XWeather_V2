package com.example.xweather_v2.today_weather;

import android.annotation.SuppressLint;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.xweather_v2.R;
import com.example.xweather_v2.bean.OneCallBean;
import com.example.xweather_v2.common.Common;
import com.squareup.picasso.Picasso;

public class DailyForecastAdapter extends BaseAdapter {

    Context context;
    OneCallBean oneCallBean;

    public DailyForecastAdapter(Context context, OneCallBean oneCallBean) {
        this.context = context;
        this.oneCallBean = oneCallBean;
    }

    // Disable click the item.
    @Override
    public boolean isEnabled(int position) {
        return false;
    }

    @Override
    public int getCount() {
        return oneCallBean.getDaily().size() - 1;
    }

    @Override
    public Object getItem(int position) {
        return oneCallBean.getDaily().get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @SuppressLint({"SetTextI18n", "InflateParams"})
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHolder holder;
        if (convertView == null) {
            convertView = LayoutInflater.from(context).inflate(R.layout.item_daily_forecast, null);
            holder = new ViewHolder(convertView);
            convertView.setTag(holder);
        } else {
            holder = (ViewHolder) convertView.getTag();
        }

        holder.txt_listView_daily_item_day.setText(Common.convertUnixToWeekday(oneCallBean.getDaily().get(position + 1).getDt()));
        holder.txt_listView_daily_item_maxTemp.setText(Math.round(oneCallBean.getDaily().get(position + 1).getTemp().getMax()) + "");
        holder.txt_listView_daily_item_minTemp.setText(Math.round(oneCallBean.getDaily().get(position + 1).getTemp().getMin()) + "");

        String iconURL = "https://openweathermap.org/img/wn/" + oneCallBean.getDaily().get(position + 1).getWeather().get(0).getIcon() + "@2x.png";
        Picasso.get().load(iconURL).into(holder.image_listView_daily_item_weather);

        return convertView;
    }

    static class ViewHolder {
        TextView txt_listView_daily_item_day, txt_listView_daily_item_maxTemp, txt_listView_daily_item_minTemp;
        ImageView image_listView_daily_item_weather;

        public ViewHolder(View itemView) {
            txt_listView_daily_item_day = itemView.findViewById(R.id.txt_listView_daily_item_day);
            txt_listView_daily_item_maxTemp = itemView.findViewById(R.id.txt_listView_daily_item_maxTemp);
            txt_listView_daily_item_minTemp = itemView.findViewById(R.id.txt_listView_daily_item_minTemp);

            image_listView_daily_item_weather = itemView.findViewById(R.id.image_listView_daily_item_weather);
        }
    }
}
