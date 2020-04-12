package com.saad102.shongbidhan.ui.itihash;

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

public class ItihashFragment extends Fragment {

    private ItihashViewModel itihashViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        itihashViewModel =
                ViewModelProviders.of(this).get(ItihashViewModel.class);
        View root =  inflater.inflate(R.layout.fragment_itihash, container, false);


        AdView mAdView1;
        AdView mAdView2;
        AdView mAdView3;
        AdView mAdView4;
        AdView mAdView5;
        AdView mAdView6;
        AdView mAdView7;
        AdView mAdView8;
        AdView mAdView9;
        AdView mAdView10;
        AdView mAdView11;
        AdView mAdView12;

        MobileAds.initialize(getActivity(), "ca-app-pub-9080134869791919~2786856699");
        mAdView1 = (AdView)root.findViewById(R.id.adView1);
        mAdView2 = (AdView)root.findViewById(R.id.adView2);
        mAdView3 = (AdView)root.findViewById(R.id.adView3);
        mAdView4 = (AdView)root.findViewById(R.id.adView4);
        mAdView5 = (AdView)root.findViewById(R.id.adView5);
        mAdView6 = (AdView)root.findViewById(R.id.adView6);
        mAdView7 = (AdView)root.findViewById(R.id.adView7);
        mAdView8 = (AdView)root.findViewById(R.id.adView8);
        mAdView9 = (AdView)root.findViewById(R.id.adView9);
        mAdView10 = (AdView)root.findViewById(R.id.adView10);
        mAdView11 = (AdView)root.findViewById(R.id.adView11);
        mAdView12 = (AdView)root.findViewById(R.id.adView12);
        AdRequest adRequest = new AdRequest.Builder().build();
        mAdView1.loadAd(adRequest);
        mAdView2.loadAd(adRequest);
        mAdView3.loadAd(adRequest);
        mAdView4.loadAd(adRequest);
        mAdView5.loadAd(adRequest);
        mAdView6.loadAd(adRequest);
        mAdView7.loadAd(adRequest);
        mAdView8.loadAd(adRequest);
        mAdView9.loadAd(adRequest);
        mAdView10.loadAd(adRequest);
        mAdView11.loadAd(adRequest);
        mAdView12.loadAd(adRequest);
        return root;
    }
}
