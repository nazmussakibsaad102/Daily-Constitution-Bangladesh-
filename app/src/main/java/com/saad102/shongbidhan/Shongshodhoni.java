package com.saad102.shongbidhan;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.MobileAds;

public class Shongshodhoni extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shongshodhoni);
        AdView mAdView1;
        AdView mAdView2;
        AdView mAdView3;
        AdView mAdView4;
        AdView mAdView5;


        MobileAds.initialize(Shongshodhoni.this, "ca-app-pub-9080134869791919~2786856699");
        mAdView1 = (AdView)findViewById(R.id.adView1);
        mAdView2 = (AdView)findViewById(R.id.adView2);
        mAdView3 = (AdView)findViewById(R.id.adView3);
        mAdView4 = (AdView)findViewById(R.id.adView4);
        mAdView5 = (AdView)findViewById(R.id.adView5);
        AdRequest adRequest = new AdRequest.Builder().build();
        mAdView1.loadAd(adRequest);
        mAdView2.loadAd(adRequest);
        mAdView3.loadAd(adRequest);
        mAdView4.loadAd(adRequest);
        mAdView5.loadAd(adRequest);

        final CardView bt1 = findViewById(R.id.bt_shongshodhoni1);
       bt1.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               Intent intetnt= new Intent(Shongshodhoni.this, ProthomShongshodhoni.class);
               startActivity(intetnt);
           }
       });
        final CardView bt2 = findViewById(R.id.bt_shongshodhoni2);
        bt2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intetnt= new Intent(Shongshodhoni.this, DitiyoShongshodhoni.class);
                startActivity(intetnt);
            }
        });
        final CardView bt3 = findViewById(R.id.bt_shongshodhoni3);
        bt3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intetnt= new Intent(Shongshodhoni.this, TritiyoShongshodhoni.class);
                startActivity(intetnt);
            }
        });
        final CardView bt4 = findViewById(R.id.bt_shongshodhoni4);
        bt4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intetnt= new Intent(Shongshodhoni.this, ChoturthoShongshodhoni.class);
                startActivity(intetnt);
            }
        });
        final CardView bt5 = findViewById(R.id.bt_shongshodhoni5);
        bt5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intetnt= new Intent(Shongshodhoni.this, PonchomShongshodhoni.class);
                startActivity(intetnt);
            }
        });
        final CardView bt6 = findViewById(R.id.bt_shongshodhoni6);
        bt6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intetnt= new Intent(Shongshodhoni.this, ShoshthoShongshodhoni.class);
                startActivity(intetnt);
            }
        });
        final CardView bt7 = findViewById(R.id.bt_shongshodhoni7);
        bt7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intetnt= new Intent(Shongshodhoni.this, ShoptomShongshodhoni.class);
                startActivity(intetnt);
            }
        });
        final CardView bt8 = findViewById(R.id.bt_shongshodhoni8);
        bt8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intetnt= new Intent(Shongshodhoni.this, OshtomShongshodhoni.class);
                startActivity(intetnt);
            }
        });
        final CardView bt9 = findViewById(R.id.bt_shongshodhoni9);
        bt9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intetnt= new Intent(Shongshodhoni.this,NobomShongshodhoni.class);
                startActivity(intetnt);
            }
        });
        final CardView bt10 = findViewById(R.id.bt_shongshodhoni10);
        bt10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intetnt= new Intent(Shongshodhoni.this, DoshomShongshodhoni.class);
                startActivity(intetnt);
            }
        });
        final CardView bt11 = findViewById(R.id.bt_shongshodhoni11);
        bt11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intetnt= new Intent(Shongshodhoni.this,EkadoshShongshodhoni.class);
                startActivity(intetnt);
            }
        });
        final CardView bt12 = findViewById(R.id.bt_shongshodhoni12);
        bt12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intetnt= new Intent(Shongshodhoni.this,DadoshShongshodhoni.class);
                startActivity(intetnt);
            }
        });
        final CardView bt13 = findViewById(R.id.bt_shongshodhoni13);
        bt13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intetnt= new Intent(Shongshodhoni.this,TroyodoshShongshodhoni.class);
                startActivity(intetnt);
            }
        });
        final CardView bt14 = findViewById(R.id.bt_shongshodhoni14);
        bt14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intetnt= new Intent(Shongshodhoni.this,ChoturdoshShongshodhoni.class);
                startActivity(intetnt);
            }
        });
        final CardView bt15 = findViewById(R.id.bt_shongshodhoni15);
        bt15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intetnt= new Intent(Shongshodhoni.this, PonchodoshShongshodhoni.class);
                startActivity(intetnt);
            }
        });
        final CardView bt16 = findViewById(R.id.bt_shongshodhoni16);
        bt16.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intetnt= new Intent(Shongshodhoni.this, ShoroshShongshodhoni.class);
                startActivity(intetnt);
            }
        });
        final CardView bt17 = findViewById(R.id.bt_shongshodhoni17);
        bt17.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intetnt= new Intent(Shongshodhoni.this, ShoptodoshShongshodhoni.class);
                startActivity(intetnt);
            }
        });

    }
}
