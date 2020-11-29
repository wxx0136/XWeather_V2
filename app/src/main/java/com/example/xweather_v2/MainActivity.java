package com.example.xweather_v2;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.viewpager.widget.ViewPager;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    ImageView main_img_add_city, main_img_more;
    LinearLayout main_layout_point;
    ViewPager main_vp;

    List<Fragment> fragmentList; // Data source of the View Pager
    List<String> cityList;
    List<ImageView> imageViewList;
    private CityFragmentPagerAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        main_img_add_city = findViewById(R.id.main_img_add_city);
        main_img_more = findViewById(R.id.main_img_more);
        main_layout_point = findViewById(R.id.main_layout_point);
        main_vp = findViewById(R.id.main_vp);

//        添加点击事件
        main_img_add_city.setOnClickListener(this);
        main_img_more.setOnClickListener(this);

        fragmentList = new ArrayList<>();
        cityList = new ArrayList<>();
        imageViewList = new ArrayList<>();
        if (cityList.size() == 0) {
            cityList.add("Winnipeg");
        }

        initPager(); // Init View Pager
        adapter = new CityFragmentPagerAdapter(getSupportFragmentManager(), 0, fragmentList);
        main_vp.setAdapter(adapter);
        initPoint();

    }

    private void initPoint() {
    }

    private void initPager() {
        /* 创建Fragment对象，添加到ViewPager数据源当中*/
        for (int i = 0; i < cityList.size(); i++) {
            CityWeatherFragment cityWeatherFragment = new CityWeatherFragment();
            Bundle bundle = new Bundle();
            bundle.putString("city_name",cityList.get(i));
            cityWeatherFragment.setArguments(bundle);
            fragmentList.add(cityWeatherFragment);
        }
    }

    @SuppressLint("NonConstantResourceId")
    @Override
    public void onClick(View view) {
        Intent intent = new Intent();
        switch (view.getId()) {
            case R.id.main_img_add_city:
//                intent.setClass(this,CityManagerActivity.class);
                break;
            case R.id.main_img_more:
//                intent.setClass(this,MoreActivity.class);
                break;
        }
        startActivity(intent);
    }
}