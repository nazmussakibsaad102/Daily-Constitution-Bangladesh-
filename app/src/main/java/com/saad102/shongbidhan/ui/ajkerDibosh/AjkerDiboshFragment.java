package com.saad102.shongbidhan.ui.ajkerDibosh;

import androidx.lifecycle.ViewModelProviders;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.MobileAds;
import com.google.firebase.firestore.DocumentReference;
import com.google.firebase.firestore.DocumentSnapshot;
import com.google.firebase.firestore.EventListener;
import com.google.firebase.firestore.FirebaseFirestore;
import com.google.firebase.firestore.FirebaseFirestoreException;
import com.saad102.shongbidhan.R;

public class AjkerDiboshFragment extends Fragment {
    String KEY_DATE_TITLE="আজকের তারিখ";
    String Key_INTERNATIONAL_TITLE = "আন্তর্জাতিক";
    String KEY_BANGLADESH_TITLE = "বাংলাদেশ";
    private TextView date;
    private TextView international;
    private TextView bangladesh;
    //    private TextView textLoaded;
    private String title;
    private String description;
    private Button fButton;
    private Button floadButton;
    FirebaseFirestore db= FirebaseFirestore.getInstance();
    DocumentReference constitutionLoad = db.document("/সংবিধান/আজকের দিবস");

    private AjkerDiboshViewModel ajkerdiboshViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        ajkerdiboshViewModel =
                ViewModelProviders.of(this).get(AjkerDiboshViewModel.class);
        View root =  inflater.inflate(R.layout.fragment_ajker_dibosh, container, false);

        AdView mAdView;


        MobileAds.initialize(getActivity(), "ca-app-pub-9080134869791919~2786856699");
        mAdView = (AdView)root.findViewById(R.id.adView);


        AdRequest adRequest = new AdRequest.Builder().build();
        mAdView.loadAd(adRequest);

        date = root.findViewById(R.id.date);
        international = root.findViewById(R.id.international);
        bangladesh = root.findViewById(R.id.bangladesh);
//       fButton=root.findViewById(R.id.f1);

        constitutionLoad.addSnapshotListener(new EventListener<DocumentSnapshot>() {
            @Override
            public void onEvent(@Nullable DocumentSnapshot documentSnapshot, @Nullable FirebaseFirestoreException e) {
                if (e!=null){
                    Toast.makeText(getActivity(), "error while loading", Toast.LENGTH_LONG).show();
                    return;
                }
                if (documentSnapshot.exists()){
                    String date_title = documentSnapshot.getString(KEY_DATE_TITLE);
                    String international_title = documentSnapshot.getString(Key_INTERNATIONAL_TITLE);
                    String bangladesh_title = documentSnapshot.getString(KEY_BANGLADESH_TITLE);
                    date.setText( date_title);
                    international.setText(international_title);
                    bangladesh.setText(bangladesh_title);

                }

            }
        });
        return root;
    }
}
