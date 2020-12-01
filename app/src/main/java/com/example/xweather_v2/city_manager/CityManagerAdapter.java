package com.example.xweather_v2.city_manager;

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
import com.example.xweather_v2.db.DatabaseBean;
import com.google.gson.Gson;
import com.squareup.picasso.Picasso;

import java.util.List;

public class CityManagerAdapter extends BaseAdapter {
    Context context;
    List<DatabaseBean> mDatas;

    public CityManagerAdapter(Context context, List<DatabaseBean> mDatas) {
        this.context = context;
        this.mDatas = mDatas;
    }

    // Disable click the item.
    @Override
    public boolean isEnabled(int position) {
        return false;
    }

    @Override
    public int getCount() {
        return mDatas.size();
    }

    @Override
    public Object getItem(int position) {
        return mDatas.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @SuppressLint("SetTextI18n")
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHolder holder = null;
        if (convertView == null) {
            convertView = LayoutInflater.from(context).inflate(R.layout.item_city_manager, null);
            holder = new ViewHolder(convertView);
            convertView.setTag(holder);
        } else {
            holder = (ViewHolder) convertView.getTag();
        }

        DatabaseBean bean = mDatas.get(position);
        holder.txt_city_name.setText(bean.getCity());
        // Parse Json to get the current weather of the cities.
        OneCallBean oneCallBean = new Gson().fromJson(bean.getContent(), OneCallBean.class);

        String iconURL = "https://openweathermap.org/img/wn/" + oneCallBean.getCurrent().getWeather().get(0).getIcon() + "@2x.png";
        Picasso.get().load(iconURL).into(holder.image_weather);
        holder.txt_temperature.setText(Math.round(oneCallBean.getCurrent().getTemp()) + " ℃");

        return convertView;
    }

    private static class ViewHolder {
        TextView txt_city_name, txt_temperature;
        ImageView image_weather;

        public ViewHolder(View itemView) {
            this.txt_city_name = itemView.findViewById(R.id.txt_city_name);
            this.txt_temperature = itemView.findViewById(R.id.txt_temperature);
            this.image_weather = itemView.findViewById(R.id.image_weather);
        }
    }
}
