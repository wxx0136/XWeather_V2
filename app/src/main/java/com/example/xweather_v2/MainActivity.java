package com.example.xweather_v2;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    ImageView main_img_add_city, main_img_more;
    LinearLayout main_layout_point;
    ViewPager main_vp;

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