package com.example.xweather_v2.city_manager;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.SearchView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.xweather_v2.MainActivity;
import com.example.xweather_v2.R;
import com.example.xweather_v2.bean.CityListBean;

import java.util.ArrayList;
import java.util.List;

public class SearchCityActivity extends AppCompatActivity implements View.OnClickListener {

    private CityListBean searchResult;
    ImageView image_back;

    SearchView searchView_bar;
    ListView listView_city_list;

    ArrayAdapter<String> adapter;
    List<String> allCityList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search_city);

        searchView_bar = (SearchView) findViewById(R.id.searchView_bar);
        listView_city_list = (ListView) findViewById(R.id.listView_city_list);
        image_back = (ImageView) findViewById(R.id.image_back);

        image_back.setOnClickListener(this);

        initSearchViewStyle(searchView_bar);
        enableSearchView(searchView_bar, false);
        initAdapterForListView();
    }

    // Change the color to white.
    private void initSearchViewStyle(SearchView searchView) {
        searchView.setQueryHint("Input a city...");

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

    private void initAdapterForListView() {
        if (MainActivity.cityListBeanList.isEmpty())
            throw new NullPointerException("MainActivity.cityListBeanList is empty.");

        enableSearchView(searchView_bar, true);

        allCityList = new ArrayList<>();
        for (CityListBean bean : MainActivity.cityListBeanList) {
            allCityList.add(bean.getName() + ", " + bean.getCountry());
        }

        adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, allCityList);
        listView_city_list.setAdapter(adapter);

        // Allow input the text into the search view to do the query
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

    public void onClick(View view) {
        if (view.getId() == R.id.image_back) finish();
    }
}