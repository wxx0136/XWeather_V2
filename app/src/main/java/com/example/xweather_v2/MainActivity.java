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
import com.example.xweather_v2.db.DatabaseBean;
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
    List<CityBean> cityListFromDB;
    List<ImageView> imageViewList;
    private CityFragmentPagerAdapter adapter;

    public static List<CityBean> cityListFromFile;

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

        cityListFromDB = fetchAllCityInfoFromDB();
        imageViewList = new ArrayList<>();

        // First time running, give a default location. Can be changed by GPS later.
        CityBean defaultCityBean = new Gson().fromJson(mockCurrentCityJson, CityBean.class);
        if (cityListFromDB.size() == 0) {
            cityListFromDB.add(defaultCityBean);
        }

        // Jump back from SearchCity Activity
        try {
            CityBean intentCityBean = (CityBean) getIntent().getSerializableExtra("cityBean");
            if (intentCityBean != null && !cityListFromDB.contains(intentCityBean)) {
                cityListFromDB.add(intentCityBean);
            }
        } catch (Exception exception) {
            Log.d("xwei.Main.onCreate", exception.toString());
        }
        Log.d("xwei.Main.db content", cityListFromDB.toString());

        initPager(); // Init View Pager
        adapter = new CityFragmentPagerAdapter(getSupportFragmentManager(), 0, fragmentList);
        main_vp.setAdapter(adapter);
        initPoint();
        main_vp.setCurrentItem(fragmentList.size() - 1); // Set the default view is the last added one.
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        // Get rest cities in the database
        CityBean defaultCityBean = new Gson().fromJson(mockCurrentCityJson, CityBean.class);
        List<CityBean> restCityList = fetchAllCityInfoFromDB();
        if (restCityList.size() == 0) {
            restCityList.add(defaultCityBean);
        }
        cityListFromDB.clear();
        cityListFromDB.addAll(restCityList);

        // The rest cities create fragments again
        fragmentList.clear();
        initPager();
        adapter.notifyDataSetChanged();
        // Recreate the number of pager dot
        imageViewList.clear();
        main_layout_point.removeAllViews();
        initPoint();
//        main_vp.setCurrentItem(fragmentList.size() - 1);

    }

    @Override
    protected void onResume() {
        super.onResume();
        int position = getIntent().getIntExtra("chosen_city_position", fragmentList.size() - 1);
        Log.d("xwei.Main.onRestart.position", position + "");
        main_vp.setCurrentItem(position);
    }

    private List<CityBean> fetchAllCityInfoFromDB() {
        List<DatabaseBean> dbBean = DatabaseManager.queryAllInfo();
        List<CityBean> returnList = new ArrayList<>();
        for (DatabaseBean db : dbBean) {
            CityBean city = new CityBean();
            city.setName(db.getCity());
            city.setState(db.getState());
            city.setCountry(db.getCountry());
            city.setId(db.getId());
            CityBean.CoordBean cb = new CityBean.CoordBean(db.getLon(), db.getLat());
            city.setCoord(cb);
            returnList.add(city);
        }
        return returnList;
    }

    private void initPager() {
        // Create Fragment objects, add them to the view pager data source.
        for (int i = 0; i < cityListFromDB.size(); i++) {
            CityWeatherFragment cityWeatherFragment = new CityWeatherFragment();

            Bundle bundle = new Bundle();
            bundle.putInt("city_id", cityListFromDB.get(i).getId());
            bundle.putString("city_name", cityListFromDB.get(i).getName());
            bundle.putString("city_state", cityListFromDB.get(i).getState());
            bundle.putString("city_country", cityListFromDB.get(i).getCountry());
            bundle.putDouble("city_lat", cityListFromDB.get(i).getCoord().getLat());
            bundle.putDouble("city_lon", cityListFromDB.get(i).getCoord().getLon());
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
            List<CityBean> beanList = new ArrayList<>();
            try {
                StringBuilder builder = new StringBuilder();
                InputStream is = getResources().openRawResource(R.raw.city_list);
                GZIPInputStream gzipInputStream = new GZIPInputStream(is);

                InputStreamReader reader = new InputStreamReader(gzipInputStream);
                BufferedReader in = new BufferedReader(reader);
                String readed;
                while ((readed = in.readLine()) != null)
                    builder.append(readed);

                // The city_list.json from open weather map is a JSON[] array.
                beanList = new Gson().fromJson(builder.toString(), new TypeToken<List<CityBean>>() {
                }.getType());

                Log.d("city_list", builder.toString());
            } catch (IOException e) {
                e.printStackTrace();
            }
            return beanList;
        }

        @Override
        protected void onSuccess(List<CityBean> beanList) {
            super.onSuccess(beanList);
            cityListFromFile = beanList;
        }

    }
}