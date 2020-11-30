package com.example.xweather_v2.city_manager;

import android.os.Bundle;
import android.util.Log;

import androidx.appcompat.app.AppCompatActivity;

import com.example.xweather_v2.R;
import com.example.xweather_v2.bean.CityWithCoordBean;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.label305.asynctask.SimpleAsyncTask;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.List;
import java.util.zip.GZIPInputStream;

public class SearchCityActivity extends AppCompatActivity {

    private List<CityWithCoordBean> cityWithCoordBeanList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search_city);

        new loadCities().execute();

    }

    private class loadCities extends SimpleAsyncTask<List<CityWithCoordBean>> {

        @Override
        protected List<CityWithCoordBean> doInBackgroundSimple() {
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

                cityWithCoordBeanList = new Gson().fromJson(builder.toString(), new TypeToken<List<CityWithCoordBean>>() {
                }.getType());

                Log.d("city_list", builder.toString());
            } catch (IOException e) {
                e.printStackTrace();
            }
            return cityWithCoordBeanList;
        }

        @Override
        protected void onSuccess(List<CityWithCoordBean> city_list) {
            super.onSuccess(city_list);

            for (CityWithCoordBean bean : city_list) {
                if (bean.getName().equals("Winnipeg")) {
                    System.out.println(bean.getCoord().getLat() + ", " + bean.getCoord().getLon());
                }
            }
        }

    }


}