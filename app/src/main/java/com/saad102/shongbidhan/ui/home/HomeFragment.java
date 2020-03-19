package com.saad102.shongbidhan.ui.home;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProviders;

import com.saad102.shongbidhan.ChoturthoVag;
import com.saad102.shongbidhan.DitiyoVag;
import com.saad102.shongbidhan.Prostabona;
import com.saad102.shongbidhan.ProthomVag;
import com.saad102.shongbidhan.R;
import com.saad102.shongbidhan.TritioVag;

public class HomeFragment extends Fragment {

    private HomeViewModel homeViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        homeViewModel =
                ViewModelProviders.of(this).get(HomeViewModel.class);
        View root = inflater.inflate(R.layout.fragment_home, container, false);


        final Button bt1 = root.findViewById(R.id.bt1);
        bt1.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent intetnt= new Intent(getActivity(), Prostabona.class);
                       startActivity(intetnt);
                    }
                }
        );


        final Button bt2 = root.findViewById(R.id.bt2);
        bt2.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent intetnt= new Intent(getActivity(), ProthomVag.class);
                        startActivity(intetnt);
                    }
                }
        );

        final Button bt3 = root.findViewById(R.id.bt3);
        bt3.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent intetnt= new Intent(getActivity(), DitiyoVag.class);
                        startActivity(intetnt);
                    }
                }
        );
        final Button bt4 = root.findViewById(R.id.bt4);
        bt4.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent intetnt= new Intent(getActivity(), TritioVag.class);
                        startActivity(intetnt);
                    }
                }
        );
        final Button bt5 = root.findViewById(R.id.bt5);
        bt5.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent intetnt= new Intent(getActivity(), ChoturthoVag.class);
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