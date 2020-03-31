package com.saad102.shongbidhan.ui.rateUs;

import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;

import com.facebook.share.model.ShareLinkContent;
import com.facebook.share.widget.ShareButton;
import com.saad102.shongbidhan.R;

public class RateUsFragment  extends Fragment {

    private RateUsViewModel rateUsViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        rateUsViewModel =
                ViewModelProviders.of(this).get(RateUsViewModel.class);
        View root = inflater.inflate(R.layout.fragment_rate_us, container, false);
        ShareLinkContent content = new ShareLinkContent.Builder()
                .setContentUrl(Uri.parse("https://developers.facebook.com"))
                .build();
        return root;
    }
}