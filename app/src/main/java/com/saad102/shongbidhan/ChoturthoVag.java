package com.saad102.shongbidhan;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.MobileAds;

public class ChoturthoVag extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_choturtho_vag);
        AdView mAdView1;
        AdView mAdView2;
        AdView mAdView3;
        AdView mAdView4;
        AdView mAdView5;
        AdView mAdView6;
        AdView mAdView7;
        AdView mAdView8;
        AdView mAdView9;

        MobileAds.initialize(ChoturthoVag.this, "ca-app-pub-9080134869791919~2786856699");
        mAdView1 = (AdView)findViewById(R.id.adView1);
        mAdView2 = (AdView)findViewById(R.id.adView2);
        mAdView3 = (AdView)findViewById(R.id.adView3);
        mAdView4 = (AdView)findViewById(R.id.adView4);
        mAdView5 = (AdView)findViewById(R.id.adView5);
        mAdView6 = (AdView)findViewById(R.id.adView6);
        mAdView7 = (AdView)findViewById(R.id.adView7);
        mAdView8 = (AdView)findViewById(R.id.adView8);
        mAdView9 = (AdView)findViewById(R.id.adView9);
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

    }
}
