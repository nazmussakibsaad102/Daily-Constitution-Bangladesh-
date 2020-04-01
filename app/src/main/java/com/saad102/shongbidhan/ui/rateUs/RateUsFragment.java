package com.saad102.shongbidhan.ui.rateUs;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.facebook.CallbackManager;
import com.facebook.FacebookCallback;
import com.facebook.FacebookException;
import com.facebook.FacebookSdk;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;

import com.facebook.share.Sharer;
import com.facebook.share.model.ShareHashtag;
import com.facebook.share.model.ShareLinkContent;
import com.facebook.share.widget.MessageDialog;
import com.facebook.share.widget.ShareButton;
import com.facebook.share.widget.ShareDialog;
import com.saad102.shongbidhan.R;
import com.saad102.shongbidhan.ui.home.HomeFragment;

public class RateUsFragment  extends Fragment {

    private RateUsViewModel rateUsViewModel;
    CallbackManager callbackManager;
    ShareDialog shareDialog;
    private static String TAG = "RateUsFragment";


    @Override
    public void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        callbackManager.onActivityResult(requestCode, resultCode, data);
    }

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        rateUsViewModel =
                ViewModelProviders.of(this).get(RateUsViewModel.class);
        View root = inflater.inflate(R.layout.fragment_rate_us, container, false);

        ShareLinkContent content = new ShareLinkContent.Builder()
                .setContentUrl(Uri.parse("https://developers.facebook.com"))
                .setQuote("সংবিধান প্রতিদিন এপ টি আমার ভাল লেগেছে, আপনারাও ইন্সটাল করে দেখতে পারেন")
                .setShareHashtag(new ShareHashtag.Builder()
                        .setHashtag("#BangladeshProtidin").build())
                .build();

        ShareButton shareButton = (ShareButton)root.findViewById(R.id.fb_botton);
        shareButton.setShareContent(content);
        shareButton.performClick();

        Button openHome = (Button)root.findViewById(R.id.gotoHome);








        return root;
    }

    }

