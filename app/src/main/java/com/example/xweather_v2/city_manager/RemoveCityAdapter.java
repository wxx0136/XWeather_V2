package com.example.xweather_v2.city_manager;

import android.annotation.SuppressLint;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.xweather_v2.R;
import com.example.xweather_v2.db.DatabaseBean;

import java.util.List;
import java.util.Objects;

public class RemoveCityAdapter extends BaseAdapter {
    RemoveCityActivity context;
    List<DatabaseBean> mDatas;
    List<DatabaseBean> removeCities;

    public RemoveCityAdapter(RemoveCityActivity context, List<DatabaseBean> mDatas, List<DatabaseBean> removeCities) {
        this.context = context;
        this.mDatas = mDatas;
        this.removeCities = removeCities;
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

    @SuppressLint({"SetTextI18n", "InflateParams"})
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHolder holder;
        if (convertView == null) {
            convertView = LayoutInflater.from(context).inflate(R.layout.item_remove_city, null);
            holder = new ViewHolder(convertView);
            convertView.setTag(holder);
        } else {
            holder = (ViewHolder) convertView.getTag();
        }
        DatabaseBean databaseBean = mDatas.get(position);
        if (Objects.equals(databaseBean.getState(), "")) {
            holder.textView.setText(databaseBean.getCity() + ", " + "(Prov/State)" + ", " + databaseBean.getCountry());
        } else {
            holder.textView.setText(databaseBean.getCity() + ", " + databaseBean.getState() + ", " + databaseBean.getCountry());
        }

        // If there is only one city left, you can't remove it.
        if(mDatas.size()==1) holder.imageView.setVisibility(View.INVISIBLE);

        holder.imageView.setOnClickListener(v -> {
            if (mDatas.size() != 1) {
                context.findViewById(R.id.image_confirm).setVisibility(View.VISIBLE);
                mDatas.remove(databaseBean);
                removeCities.add(databaseBean);
                notifyDataSetChanged();
            }

        });


        return convertView;
    }

    static class ViewHolder {
        TextView textView;
        ImageView imageView;

        public ViewHolder(View itemView) {
            textView = itemView.findViewById(R.id.txt_city_name);
            imageView = itemView.findViewById(R.id.image_remove);
        }
    }
}
