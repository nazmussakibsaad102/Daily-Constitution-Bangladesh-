package com.saad102.shongbidhan;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.MobileAds;

public class NobomVag extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nobom_vag);
        AdView mAdView1;
        AdView mAdView2;
        AdView mAdView3;
        AdView mAdView4;

        MobileAds.initialize(NobomVag.this, "ca-app-pub-9080134869791919~2786856699");
        mAdView1 = (AdView)findViewById(R.id.adView1);
        mAdView2 = (AdView)findViewById(R.id.adView2);
        mAdView3 = (AdView)findViewById(R.id.adView3);
        mAdView4 = (AdView)findViewById(R.id.adView4);
        AdRequest adRequest = new AdRequest.Builder().build();
        mAdView1.loadAd(adRequest);
        mAdView2.loadAd(adRequest);
        mAdView3.loadAd(adRequest);
        mAdView4.loadAd(adRequest);
    }
}
