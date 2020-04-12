package com.saad102.shongbidhan;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.MobileAds;

public class ShoptodoshShongshodhoni extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shoptodosh_shongshodhoni);
        AdView mAdView;


        MobileAds.initialize(ShoptodoshShongshodhoni.this, "ca-app-pub-9080134869791919~2786856699");
        mAdView = (AdView)findViewById(R.id.adView);


        AdRequest adRequest = new AdRequest.Builder().build();
        mAdView.loadAd(adRequest);
    }
}
