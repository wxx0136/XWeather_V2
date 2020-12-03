package com.example.xweather_v2.city_manager;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.xweather_v2.R;
import com.example.xweather_v2.db.DatabaseBean;
import com.example.xweather_v2.db.DatabaseManager;

import java.util.ArrayList;
import java.util.List;

public class RemoveCityActivity extends AppCompatActivity implements View.OnClickListener {

    ImageView image_confirm, image_back;
    ListView list_city;
    List<DatabaseBean> mDatas;
    List<DatabaseBean> removeCities; // Temporary save the cities I want to remove from the database.

    private RemoveCityAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_remove_city);

        image_confirm = findViewById(R.id.image_confirm);
        image_back = findViewById(R.id.image_back);
        list_city = findViewById(R.id.list_city);

        mDatas = DatabaseManager.queryAllInfo();
        removeCities = new ArrayList<>();

        image_confirm.setOnClickListener(this);
        image_back.setOnClickListener(this);

        adapter = new RemoveCityAdapter(this, mDatas, removeCities);
        list_city.setAdapter(adapter);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.image_confirm:
                for (int i = 0; i < removeCities.size(); i++) {
                    int city_id = removeCities.get(i).getId();
                    DatabaseManager.removeInfoByCity(city_id);
                }
                finish();
                break;
            case R.id.image_back:
                finish();
                break;
        }
    }


}