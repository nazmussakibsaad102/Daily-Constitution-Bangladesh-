package com.saad102.shongbidhan.ui.BananBivrat;

import androidx.lifecycle.ViewModelProviders;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.MobileAds;
import com.saad102.shongbidhan.ChoturthoTofsil;
import com.saad102.shongbidhan.R;

public class BananBivratFragment extends Fragment {

    private BananBivratViewModel BananBivratViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        BananBivratViewModel =
                ViewModelProviders.of(this).get(BananBivratViewModel.class);
        View root = inflater.inflate(R.layout.fragment_banan_bivrat, container, false);


        return root;
    }
}

