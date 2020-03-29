package com.saad102.shongbidhan.ui.rateUs;

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

import com.saad102.shongbidhan.R;

public class RateUsFragment  extends Fragment {

    private RateUsViewModel rateUsViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        rateUsViewModel =
                ViewModelProviders.of(this).get(RateUsViewModel.class);
        View root = inflater.inflate(R.layout.fragment_rate_us, container, false);
        final TextView textView = root.findViewById(R.id.rate_us);
        rateUsViewModel.getText().observe(this, new Observer<String>() {
            @Override
            public void onChanged(@Nullable String s) {
                textView.setText(s);
            }
        });
        return root;
    }
}