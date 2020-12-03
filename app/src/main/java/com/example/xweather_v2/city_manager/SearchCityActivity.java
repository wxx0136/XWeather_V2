package com.example.xweather_v2.city_manager;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.SearchView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.xweather_v2.MainActivity;
import com.example.xweather_v2.R;
import com.example.xweather_v2.bean.CityBean;

public class SearchCityActivity extends AppCompatActivity implements View.OnClickListener {

    ImageView image_back;
    SearchView searchView_bar;
    ListView listView_city_list;

    ArrayAdapter<CityBean> adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search_city);

        searchView_bar = findViewById(R.id.searchView_bar);
        listView_city_list = findViewById(R.id.listView_city_list);
        image_back = findViewById(R.id.image_back);

        image_back.setOnClickListener(this);

        initSearchViewStyle(searchView_bar);
//        enableSearchView(searchView_bar, false);
        initAdapterForListView();
    }

    // Change the color to white.
    private void initSearchViewStyle(SearchView searchView) {
        searchView.setQueryHint("Input a city...");
        listView_city_list.setVisibility(View.GONE);

        int id_search_src_text = searchView.getContext().getResources().getIdentifier("android:id/search_src_text", null, null);
        TextView textView = searchView.findViewById(id_search_src_text);
        textView.setTextColor(Color.WHITE);
        textView.setHintTextColor(Color.WHITE);


        int id_search_close_btn = searchView.getContext().getResources().getIdentifier("android:id/search_close_btn", null, null);
        ImageView searchClose = searchView.findViewById(id_search_close_btn);
        searchClose.setColorFilter(Color.WHITE);
    }

    // Because SearchView is a ViewGroup, so we have to disable all its child views.
//    private void enableSearchView(View view, boolean enabled) {
//        view.setEnabled(enabled);
//        if (view instanceof ViewGroup) {
//            ViewGroup viewGroup = (ViewGroup) view;
//            for (int i = 0; i < viewGroup.getChildCount(); i++) {
//                View child = viewGroup.getChildAt(i);
//                enableSearchView(child, enabled);
//            }
//        }
//    }

    private void initAdapterForListView() {
        if (MainActivity.cityListFromFile.isEmpty())
            throw new NullPointerException("MainActivity.cityListBeanList is empty.");

//        enableSearchView(searchView_bar, true);

        adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, MainActivity.cityListFromFile);
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

                // Hide the listView when no input.
                if (TextUtils.isEmpty(newText)) {
                    listView_city_list.setVisibility(View.GONE);
                } else {
                    listView_city_list.setVisibility(View.VISIBLE);
                }

                return true;
            }
        });

        // Add list View click event
        listView_city_list.setOnItemClickListener((parent, view, position, id) -> {
            for (CityBean bean : MainActivity.cityListFromFile) {
                if (adapter.getItem(position) == bean) {
                    Log.d("xwei.SearchAct.ItemClick", "city_id: " + bean.getId() + ", " + bean.getName() + ", " + bean.getState() + ", " + bean.getCountry() + ", Lat: " + bean.getCoord().getLat() + ", Lon: " + bean.getCoord().getLon());
                    Intent intent = new Intent(SearchCityActivity.this, MainActivity.class);
                    intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK|Intent.FLAG_ACTIVITY_NEW_TASK);
                    intent.putExtra("cityBean", bean);
                    startActivity(intent);
                }
            }

        });

    }

    public void onClick(View view) {
        if (view.getId() == R.id.image_back) finish();
    }
}