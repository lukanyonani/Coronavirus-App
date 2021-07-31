package com.tmanswap.coronavirusapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.tmanswap.coronavirusapp.ui.protectyourself.ProtectYourselfFragment;

public class ProtectYourself extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.protect_yourself_activity);
        if (savedInstanceState == null) {
            getSupportFragmentManager().beginTransaction()
                    .replace(R.id.container, ProtectYourselfFragment.newInstance())
                    .commitNow();
        }
    }
}
