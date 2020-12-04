package com.example.xweather_v2.setting;

import android.os.Bundle;

import androidx.preference.PreferenceFragmentCompat;

import com.example.xweather_v2.R;

public class SettingsFragment extends PreferenceFragmentCompat {

    @Override
    public void onCreatePreferences(Bundle savedInstanceState, String rootKey) {
        setPreferencesFromResource(R.xml.root_preferences, rootKey);


    }
}