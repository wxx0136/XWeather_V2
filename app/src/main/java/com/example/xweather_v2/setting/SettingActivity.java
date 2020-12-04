package com.example.xweather_v2.setting;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentTransaction;

import com.example.xweather_v2.MainActivity;
import com.example.xweather_v2.R;

public class SettingActivity extends AppCompatActivity implements View.OnClickListener {

    ImageView image_back;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_setting);

        image_back = findViewById(R.id.image_back);
        image_back.setOnClickListener(this);

        if (savedInstanceState != null) return;

        FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();
        fragmentTransaction.replace(R.id.setting_fragment, new SettingsFragment()).commit();
    }

    @Override
    public void onClick(View v) {
        if (v.getId() == R.id.image_back) {
            Intent intent = new Intent(SettingActivity.this, MainActivity.class);
            intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK|Intent.FLAG_ACTIVITY_NEW_TASK);
            intent.putExtra("chosen_city_position",MainActivity.currentPositionOfViewPager);

            startActivity(intent);
        }
    }
}