package com.saad102.shongbidhan.ui.slideshow;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;

import com.saad102.shongbidhan.ChoturthoTofsil;
import com.saad102.shongbidhan.DitiyoTofsil;
import com.saad102.shongbidhan.PonchomTofsil;
import com.saad102.shongbidhan.ProthomTofsil;
import com.saad102.shongbidhan.R;
import com.saad102.shongbidhan.ShoshthoTofsil;
import com.saad102.shongbidhan.SoptomTofsil;
import com.saad102.shongbidhan.TritiyoTofsil;

public class SlideshowFragment extends Fragment {

    private SlideshowViewModel slideshowViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        slideshowViewModel =
                ViewModelProviders.of(this).get(SlideshowViewModel.class);
        View root = inflater.inflate(R.layout.fragment_slideshow, container, false);

        final CardView bt1 = root.findViewById(R.id.bt_tofsil1);
        bt1.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent intetnt= new Intent(getActivity(), ProthomTofsil.class);
                        startActivity(intetnt);
                    }
                }
        );
        final CardView bt2 = root.findViewById(R.id.bt_tofsil2);
        bt2.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent intetnt= new Intent(getActivity(), DitiyoTofsil.class);
                        startActivity(intetnt);
                    }
                }
        );
        final CardView bt3 = root.findViewById(R.id.bt_tofsil3);
        bt3.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent intetnt= new Intent(getActivity(), TritiyoTofsil.class);
                        startActivity(intetnt);
                    }
                }
        );
        final CardView bt4 = root.findViewById(R.id.bt_tofsil4);
        bt4.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent intetnt= new Intent(getActivity(), ChoturthoTofsil.class);
                        startActivity(intetnt);
                    }
                }
        );
        final CardView bt5 = root.findViewById(R.id.bt_tofsil5);
        bt5.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent intetnt= new Intent(getActivity(), PonchomTofsil.class);
                        startActivity(intetnt);
                    }
                }
        );
        final CardView bt6 = root.findViewById(R.id.bt_tofsil6);
        bt6.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent intetnt= new Intent(getActivity(), ShoshthoTofsil.class);
                        startActivity(intetnt);
                    }
                }
        );

        final CardView bt7 = root.findViewById(R.id.bt_tofsil7);
        bt7.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent intetnt= new Intent(getActivity(), SoptomTofsil.class);
                        startActivity(intetnt);
                    }
                }
        );

        return root;
    }
}