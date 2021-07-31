package com.tmanswap.coronavirusapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.tmanswap.coronavirusapp.ui.howitspread.HowItSpreadFragment;

public class HowItSpread extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.how_it_spread_activity);
        if (savedInstanceState == null) {
            getSupportFragmentManager().beginTransaction()
                    .replace(R.id.container, HowItSpreadFragment.newInstance())
                    .commitNow();
        }
    }
}
