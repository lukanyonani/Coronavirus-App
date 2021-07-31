package com.tmanswap.coronavirusapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.tmanswap.coronavirusapp.ui.symptomstesting.SymptomsTestingFragment;

public class SymptomsTesting extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.symptoms_testing_activity);
        if (savedInstanceState == null) {
            getSupportFragmentManager().beginTransaction()
                    .replace(R.id.container, SymptomsTestingFragment.newInstance())
                    .commitNow();
        }
    }
}
