package com.tmanswap.coronavirusapp.ui.symptomstesting;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProviders;

import com.tmanswap.coronavirusapp.R;

public class SymptomsTestingFragment extends Fragment {

    private SymptomsTestingViewModel mViewModel;

    public static SymptomsTestingFragment newInstance() {
        return new SymptomsTestingFragment();
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.symptoms_testing_fragment, container, false);
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        mViewModel = ViewModelProviders.of(this).get(SymptomsTestingViewModel.class);
        // TODO: Use the ViewModel
    }

}
