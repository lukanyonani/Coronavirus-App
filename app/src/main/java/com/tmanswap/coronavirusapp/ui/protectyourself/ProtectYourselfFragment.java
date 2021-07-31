package com.tmanswap.coronavirusapp.ui.protectyourself;

import androidx.lifecycle.ViewModelProviders;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.tmanswap.coronavirusapp.R;

public class ProtectYourselfFragment extends Fragment {

    private ProtectYourselfViewModel mViewModel;

    public static ProtectYourselfFragment newInstance() {
        return new ProtectYourselfFragment();
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.protect_yourself_fragment, container, false);
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        mViewModel = ViewModelProviders.of(this).get(ProtectYourselfViewModel.class);
        // TODO: Use the ViewModel
    }

}
