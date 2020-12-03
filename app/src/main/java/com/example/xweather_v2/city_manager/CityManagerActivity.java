package com.example.xweather_v2.city_manager;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.example.xweather_v2.MainActivity;
import com.example.xweather_v2.R;
import com.example.xweather_v2.db.DatabaseBean;
import com.example.xweather_v2.db.DatabaseManager;

import java.util.ArrayList;
import java.util.List;

public class CityManagerActivity extends AppCompatActivity implements View.OnClickListener {

    ImageView image_delete, image_add;
    ListView list_city;
    List<DatabaseBean> mDatas;
    CityManagerAdapter cityManagerAdapter;

    public CityManagerActivity() {
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_city_manager);

        image_add = findViewById(R.id.image_add);
        image_delete = findViewById(R.id.image_delete);
        list_city = findViewById(R.id.list_city);
        mDatas = new ArrayList<>();

        // Add click listener
        image_add.setOnClickListener(this);
        image_delete.setOnClickListener(this);

        // Set Adapter
        cityManagerAdapter = new CityManagerAdapter(this, mDatas);
        list_city.setAdapter(cityManagerAdapter);
    }

    @Override
    protected void onResume() {
        super.onResume();

        // Get the real-time info from the database, add them into the memory(Bean/Result), and notify the adapter to renew.
        List<DatabaseBean> list = DatabaseManager.queryAllInfo();
        Log.d("xwei.debug.cityManager: ",list.size()+"");
        mDatas.clear();
        mDatas.addAll(list);
        cityManagerAdapter.notifyDataSetChanged();

        list_city.setOnItemClickListener((parent, view, position, id) -> {
            Intent intent = new Intent(CityManagerActivity.this, MainActivity.class);
            intent.putExtra("chosen_city_position", position);
            startActivity(intent);
        });

    }

    @SuppressLint("NonConstantResourceId")
    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.image_add:
                int cityCount = DatabaseManager.getCityCount();
                if (cityCount < 10) {
                    Intent intent_add = new Intent(this, SearchCityActivity.class);
                    startActivity(intent_add);
                } else {
                    Toast.makeText(this, "Can't add more cities, please remove old ones before adding new cities.", Toast.LENGTH_SHORT).show();
                }
                break;
            case R.id.image_delete:
                Intent intent_remove = new Intent(this, RemoveCityActivity.class);
                startActivity(intent_remove);
                break;
        }
    }
}