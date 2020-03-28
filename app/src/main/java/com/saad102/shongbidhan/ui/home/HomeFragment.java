package com.saad102.shongbidhan.ui.home;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProviders;

import com.saad102.shongbidhan.ChoturthoVag;
import com.saad102.shongbidhan.DitiyoVag;
import com.saad102.shongbidhan.DoshomVag;
import com.saad102.shongbidhan.EkadoshVag;
import com.saad102.shongbidhan.NobomVag;
import com.saad102.shongbidhan.OshtomVag;
import com.saad102.shongbidhan.PonchomVag;
import com.saad102.shongbidhan.Prostabona;
import com.saad102.shongbidhan.ProthomVag;
import com.saad102.shongbidhan.R;
import com.saad102.shongbidhan.ShoptomVag;
import com.saad102.shongbidhan.ShoshthoVag;
import com.saad102.shongbidhan.TritioVag;

public class HomeFragment extends Fragment {

    private HomeViewModel homeViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        homeViewModel =
                ViewModelProviders.of(this).get(HomeViewModel.class);
        View root = inflater.inflate(R.layout.fragment_home, container, false);


        final CardView bt1 = root.findViewById(R.id.bt1);
        bt1.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent intetnt= new Intent(getActivity(), Prostabona.class);
                        startActivity(intetnt);
                    }
                }
        );


        final CardView bt2 = root.findViewById(R.id.bt2);
        bt2.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent intetnt= new Intent(getActivity(), ProthomVag.class);
                        startActivity(intetnt);
                    }
                }
        );

        final CardView bt3 = root.findViewById(R.id.bt3);
        bt3.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent intetnt= new Intent(getActivity(), DitiyoVag.class);
                        startActivity(intetnt);
                    }
                }
        );
        final CardView bt4 = root.findViewById(R.id.bt4);
        bt4.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent intetnt= new Intent(getActivity(), TritioVag.class);
                        startActivity(intetnt);
                    }
                }
        );
        final CardView bt5 = root.findViewById(R.id.bt5);
        bt5.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent intetnt= new Intent(getActivity(), ChoturthoVag.class);
                        startActivity(intetnt);
                    }
                }
        );
        final CardView bt6 = root.findViewById(R.id.bt6);
        bt6.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent intetnt= new Intent(getActivity(), PonchomVag.class);
                        startActivity(intetnt);
                    }
                }
        );
        final CardView bt7 = root.findViewById(R.id.bt7);
        bt7.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent intetnt= new Intent(getActivity(), ShoshthoVag.class);
                        startActivity(intetnt);
                    }
                }
        );
        final CardView bt8 = root.findViewById(R.id.bt8);
        bt8.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent intetnt= new Intent(getActivity(), ShoptomVag.class);
                        startActivity(intetnt);
                    }
                }
        );
        final CardView bt9 = root.findViewById(R.id.bt9);
        bt9.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent intetnt= new Intent(getActivity(), OshtomVag.class);
                        startActivity(intetnt);
                    }
                }
        );
        final CardView bt10 = root.findViewById(R.id.bt10);
        bt10.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent intetnt= new Intent(getActivity(), NobomVag.class);
                        startActivity(intetnt);
                    }
                }
        );
        final CardView bt11 = root.findViewById(R.id.bt11);
        bt11.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent intetnt= new Intent(getActivity(), NobomVag.class);
                        startActivity(intetnt);
                    }
                }
        );
        final CardView bt12 = root.findViewById(R.id.bt12);
        bt12.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent intetnt= new Intent(getActivity(), DoshomVag.class);
                        startActivity(intetnt);
                    }
                }
        );
        final CardView bt13 = root.findViewById(R.id.bt13);
        bt13.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent intetnt= new Intent(getActivity(), EkadoshVag.class);
                        startActivity(intetnt);
                    }
                }
        );
//        final TextView textView = root.findViewById(R.id.text_home);
//        homeViewModel.getText().observe(this, new Observer<String>() {
//            @Override
//            public void onChanged(@Nullable String s) {
//                textView.setText(s);
//            }
//        });
        return root;
    }
}