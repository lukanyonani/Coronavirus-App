package com.tmanswap.coronavirusapp.ui.howitspread;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProviders;

import com.tmanswap.coronavirusapp.R;

public class HowItSpreadFragment extends Fragment {

    private HowItSpreadViewModel mViewModel;

    public static HowItSpreadFragment newInstance() {
        return new HowItSpreadFragment();
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.how_it_spread_fragment, container, false);
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        mViewModel = ViewModelProviders.of(this).get(HowItSpreadViewModel.class);
        // TODO: Use the ViewModel
    }

}
