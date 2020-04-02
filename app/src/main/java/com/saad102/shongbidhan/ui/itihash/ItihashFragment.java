package com.saad102.shongbidhan.ui.itihash;

import androidx.lifecycle.ViewModelProviders;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.saad102.shongbidhan.R;

public class ItihashFragment extends Fragment {

    private ItihashViewModel itihashViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        itihashViewModel =
                ViewModelProviders.of(this).get(ItihashViewModel.class);
        View root =  inflater.inflate(R.layout.fragment_itihash, container, false);
        return root;
    }
}
