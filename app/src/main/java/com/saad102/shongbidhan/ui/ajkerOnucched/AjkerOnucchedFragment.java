package com.saad102.shongbidhan.ui.ajkerOnucched;

import androidx.lifecycle.ViewModelProviders;

import android.net.Uri;
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

import com.facebook.share.model.ShareHashtag;
import com.facebook.share.model.ShareLinkContent;
import com.facebook.share.widget.ShareButton;
import com.google.firebase.firestore.DocumentReference;
import com.google.firebase.firestore.DocumentSnapshot;
import com.google.firebase.firestore.EventListener;
import com.google.firebase.firestore.FirebaseFirestore;
import com.google.firebase.firestore.FirebaseFirestoreException;
import com.saad102.shongbidhan.R;

public class AjkerOnucchedFragment extends Fragment {
    String KEY_TITLE="title";
    String Key_DES = "description";
    String KEY_BEK = "explanation";
    String KEY_BEKTITLE = "bekkhaTitle";
    public TextView textTitle;
    public TextView textDescription;
    private TextView textBekkhaTitle;
    private TextView textBekkha;
    //    private TextView textLoaded;
    private String title;
    private String description;
    private Button fButton;
    private Button floadButton;
    FirebaseFirestore db= FirebaseFirestore.getInstance();
    DocumentReference constitutionLoad = db.document("/সংবিধান/অনুচ্ছেদ");

    private AjkerOnucchedViewModel ajkerOnucchedViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        ajkerOnucchedViewModel =
                ViewModelProviders.of(this).get(AjkerOnucchedViewModel.class);
       View root = inflater.inflate(R.layout.fragment_ajker_onucched, container, false);
        textTitle = root.findViewById(R.id.ajkerTitle);
        textDescription = root.findViewById(R.id.ajkerDescription);
        textBekkha = root.findViewById(R.id.ajkerBekkha);
        textBekkhaTitle = root.findViewById(R.id.ajkerBekkhaTitle);

//       fButton=root.findViewById(R.id.f1);

        constitutionLoad.addSnapshotListener(new EventListener<DocumentSnapshot>() {
            @Override
            public void onEvent(@Nullable DocumentSnapshot documentSnapshot, @Nullable FirebaseFirestoreException e) {
                if (e!=null){
                    Toast.makeText(getActivity(), "error while loading", Toast.LENGTH_LONG).show();
                    return;
                }
                if (documentSnapshot.exists()){
                    String title = documentSnapshot.getString(KEY_TITLE);
                    String des = documentSnapshot.getString(Key_DES);
                    String bekkhaTitle = documentSnapshot.getString(KEY_BEKTITLE);
                    String bekkha = documentSnapshot.getString(KEY_BEK);
                    textTitle.setText( title);
                    textDescription.setText(des);
                    textBekkhaTitle.setText(bekkhaTitle);
                    textBekkha.setText(bekkha);



                }

            }
        });

        ShareLinkContent content = new ShareLinkContent.Builder()
                .setContentUrl(Uri.parse("https://play.google.com/store/apps/details?id=com.saad102.shongbidhan"))
                .setShareHashtag(new ShareHashtag.Builder()
                        .setHashtag("#বাংলাদেশ_প্রতিদিন")
                .build())
                .setQuote("এপটি আমার ভাল লেগেছে, আপনিও ইনস্টল করে দেখতে পারেন")
                .build();
        ShareButton shareButton = (ShareButton)root.findViewById(R.id.fb_share);
        shareButton.setShareContent(content);



//       floadButton = root.findViewById(R.id.f2);
//       textLoaded = root.findViewById(R.id.fsload);
//
//        fButton.setOnClickListener(
//                new View.OnClickListener() {
//                    @Override
//                    public void onClick(View v) {
//                        title = etTitle.getText().toString();
//                        description = etDescription.getText().toString();
//                        Map<String, Object> note = new HashMap<>();
//                        note.put(KEY_TITLE, title);
//                        note.put(Key_DES, description);
//                       constitutionLoad.set(note).addOnSuccessListener(new OnSuccessListener<Void>() {
//                            @Override
//                            public void onSuccess(Void aVoid) {
//                                 Toast.makeText(getActivity(), "saved to firestore", Toast.LENGTH_LONG).show();
//
//                            }
//                        }).addOnFailureListener(new OnFailureListener() {
//                            @Override
//                            public void onFailure(@NonNull Exception e) {
//                                Toast.makeText(getActivity(), "not saved", Toast.LENGTH_LONG).show();
//                            }
//                        });
//
//                    }
//                }
//        );

//        floadButton.setOnClickListener(
//                new View.OnClickListener() {
//                    @Override
//                    public void onClick(View v) {
//                        constitutionLoad.get().addOnSuccessListener(new OnSuccessListener<DocumentSnapshot>() {
//                            @Override
//                            public void onSuccess(DocumentSnapshot documentSnapshot) {
//                               if(documentSnapshot.exists()){
//                                    String title = documentSnapshot.getString(KEY_TITLE);
//                                    String des = documentSnapshot.getString(Key_DES);
//                                    textLoaded.setText("অনুচ্ছেদ এর শিরোনাম"+ title + "\n"+
//                                            des);
//                               }else {
//                                   Toast.makeText(getActivity(), "Document does not exist", Toast.LENGTH_LONG).show();
//                               }
//                            }
//                        }).addOnFailureListener(new OnFailureListener() {
//                            @Override
//                            public void onFailure(@NonNull Exception e) {
//                                Toast.makeText(getActivity(), "isn't retreived from firestore", Toast.LENGTH_LONG).show();
//                            }
//                        });
//
//                    }
//                }
//        );
       return root;
    }


}
