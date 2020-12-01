package com.example.xweather_v2.city_manager;

import android.graphics.Color;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.SearchView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.xweather_v2.R;
import com.example.xweather_v2.bean.CityListBean;
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

public class SearchCityActivity extends AppCompatActivity {

    private List<CityListBean> cityListBeanList;
    private CityListBean searchResult;

    SearchView searchView_bar;
    ListView listView_city_list;

    ArrayAdapter<String> adapter;
    List<String> allCityList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search_city);

        new loadCities().execute();

        searchView_bar = (SearchView) findViewById(R.id.searchView_bar);
        listView_city_list = (ListView) findViewById(R.id.listView_city_list);

        initSearchViewStyle(searchView_bar);
        enableSearchView(searchView_bar, false);

        allCityList = new ArrayList<>();
        adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, allCityList);
        listView_city_list.setAdapter(adapter);
    }

    // Change the color to white.
    private void initSearchViewStyle(SearchView searchView){
        searchView.setQueryHint("Preparing...");

        int id_search_src_text = searchView.getContext().getResources().getIdentifier("android:id/search_src_text", null, null);
        TextView textView = (TextView) searchView.findViewById(id_search_src_text);
        textView.setTextColor(Color.WHITE);
        textView.setHintTextColor(Color.WHITE);


        int id_search_close_btn = searchView.getContext().getResources().getIdentifier("android:id/search_close_btn", null, null);
        ImageView searchClose = (ImageView) searchView.findViewById(id_search_close_btn);
        searchClose.setColorFilter(Color.WHITE);
    }

    // Because SearchView is a ViewGroup, so we have to disable all its child views.
    private void enableSearchView(View view, boolean enabled) {
        view.setEnabled(enabled);
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i = 0; i < viewGroup.getChildCount(); i++) {
                View child = viewGroup.getChildAt(i);
                enableSearchView(child, enabled);
            }
        }
    }

    private class loadCities extends SimpleAsyncTask<List<CityListBean>> {

        @Override
        protected List<CityListBean> doInBackgroundSimple() {
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

                cityListBeanList = new Gson().fromJson(builder.toString(), new TypeToken<List<CityListBean>>() {
                }.getType());

                Log.d("city_list", builder.toString());
            } catch (IOException e) {
                e.printStackTrace();
            }
            return cityListBeanList;
        }

        @Override
        protected void onSuccess(List<CityListBean> beanList) {
//            super.onSuccess(beanList);

            for (CityListBean bean : beanList) {
                adapter.add(bean.getName() + ", " + bean.getCountry());
            }

            Log.d("xwei", allCityList.get(10));


            // Allow input the text into the search view to do the query
            searchView_bar.setQueryHint("Input a city...");
            enableSearchView(searchView_bar, true);

            searchView_bar.setOnQueryTextListener(new SearchView.OnQueryTextListener() {
                @Override
                public boolean onQueryTextSubmit(String query) {
                    return false;
                }

                @Override
                public boolean onQueryTextChange(String newText) {


                    adapter.getFilter().filter(newText);

                    return false;
                }
            });

        }

    }

}