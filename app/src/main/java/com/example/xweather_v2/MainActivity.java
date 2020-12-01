package com.example.xweather_v2;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.viewpager.widget.ViewPager;

import com.example.xweather_v2.bean.CityBean;
import com.example.xweather_v2.city_manager.CityManagerActivity;
import com.example.xweather_v2.db.DatabaseManager;
import com.example.xweather_v2.today_weather.CityFragmentPagerAdapter;
import com.example.xweather_v2.today_weather.CityWeatherFragment;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.label305.asynctask.SimpleAsyncTask;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.zip.GZIPInputStream;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    ImageView main_img_add_city, main_img_more;
    LinearLayout main_layout_point;
    ViewPager main_vp;

    // Because using the free api, I can't get the Coord with the city name at the same time.
    String mockCurrentCityJson = "{\"id\":6183235,\"name\":\"Winnipeg\",\"state\":\"\",\"country\":\"CA\",\"coord\":{\"lon\":-97.147041,\"lat\":49.884399}}";

    List<Fragment> fragmentList; // Data source of the View Pager
    List<String> cityList;
    List<ImageView> imageViewList;
    private CityFragmentPagerAdapter adapter;

    public static List<CityBean> cityListBean;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Use Async Task to get the city list first.
        new loadCities().execute();

        main_img_add_city = findViewById(R.id.main_img_add_city);
        main_img_more = findViewById(R.id.main_img_more);
        main_layout_point = findViewById(R.id.main_layout_point);
        main_vp = findViewById(R.id.main_vp);

        // Add click events.
        main_img_add_city.setOnClickListener(this);
        main_img_more.setOnClickListener(this);

        fragmentList = new ArrayList<>();
        cityList = DatabaseManager.queryAllCityName(); // Get the city list in the database
        imageViewList = new ArrayList<>();
        if (cityList.size() == 0) {
            cityList.add("Winnipeg");
            cityList.add("Toronto");
        }

        initPager(); // Init View Pager
        adapter = new CityFragmentPagerAdapter(getSupportFragmentManager(), 0, fragmentList);
        main_vp.setAdapter(adapter);
        initPoint();
        main_vp.setCurrentItem(fragmentList.size() - 1); // Set the default view is the last added one.
    }

    private void initPager() {
        // Create Fragment objects, add them to the view pager data source.
        for (int i = 0; i < cityList.size(); i++) {
            CityWeatherFragment cityWeatherFragment = new CityWeatherFragment();

            Bundle bundle = new Bundle();
            bundle.putString("city_name", cityList.get(i));
            cityWeatherFragment.setArguments(bundle);
            fragmentList.add(cityWeatherFragment);
        }
    }

    private void initPoint() {
        for (int i = 0; i < fragmentList.size(); i++) {
            ImageView pIv = new ImageView(this);
            pIv.setImageResource(R.drawable.little_dot_off);
            pIv.setLayoutParams(new LinearLayout.LayoutParams(LinearLayout.LayoutParams.WRAP_CONTENT, LinearLayout.LayoutParams.WRAP_CONTENT));
            LinearLayout.LayoutParams lp = (LinearLayout.LayoutParams) pIv.getLayoutParams();
            lp.setMargins(0, 0, 20, 0);
            imageViewList.add(pIv);
            main_layout_point.addView(pIv);
        }
        imageViewList.get(imageViewList.size() - 1).setImageResource(R.drawable.little_dot_on);

        // Add a listener to let the point switch when change the city page.
        main_vp.addOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {
            }

            @Override
            public void onPageSelected(int position) {
                for (int i = 0; i < imageViewList.size(); i++) {
                    imageViewList.get(i).setImageResource(R.drawable.little_dot_off);
                }
                imageViewList.get(position).setImageResource(R.drawable.little_dot_on);
            }

            @Override
            public void onPageScrollStateChanged(int state) {
            }
        });
    }

    @SuppressLint("NonConstantResourceId")
    @Override
    public void onClick(View view) {
        Intent intent = new Intent();
        switch (view.getId()) {
            case R.id.main_img_add_city:
                intent.setClass(this, CityManagerActivity.class);
                break;
            case R.id.main_img_more:
//                intent.setClass(this,MoreActivity.class);
                break;
        }
        startActivity(intent);
    }

    //  Get the city list for other activity to use later.
    private class loadCities extends SimpleAsyncTask<List<CityBean>> {

        @Override
        protected List<CityBean> doInBackgroundSimple() {
            try {
                StringBuilder builder = new StringBuilder();
                InputStream is = getResources().openRawResource(R.raw.city_list);
                GZIPInputStream gzipInputStream = new GZIPInputStream(is);

                InputStreamReader reader = new InputStreamReader(gzipInputStream);
                BufferedReader in = new BufferedReader(reader);
                String readed;
                while ((readed = in.readLine()) != null)
                    builder.append(readed);

//                The city_list.json from open weather map is a JSON[] array.
//                Example:
//               [
//                {
//                    "id": 833,
//                        "name": "Ḩeşār-e Sefīd",
//                        "state": "",
//                        "country": "IR",
//                        "coord": {
//                    "lon": 47.159401,
//                            "lat": 34.330502
//                },
//                ]

                cityListBean = new Gson().fromJson(builder.toString(), new TypeToken<List<CityBean>>() {
                }.getType());

                Log.d("city_list", builder.toString());
            } catch (IOException e) {
                e.printStackTrace();
            }
            return cityListBean;
        }

        @Override
        protected void onSuccess(List<CityBean> beanList) {
            super.onSuccess(beanList);

        }

    }
}