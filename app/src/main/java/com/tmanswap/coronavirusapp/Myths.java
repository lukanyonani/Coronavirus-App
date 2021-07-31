package com.tmanswap.coronavirusapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.tmanswap.coronavirusapp.ui.myths.MythsFragment;

public class Myths extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.myths_activity);
        if (savedInstanceState == null) {
            getSupportFragmentManager().beginTransaction()
                    .replace(R.id.container, MythsFragment.newInstance())
                    .commitNow();
        }
    }
}
