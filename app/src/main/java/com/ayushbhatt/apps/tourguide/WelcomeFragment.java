package com.ayushbhatt.apps.tourguide;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;


public class WelcomeFragment extends Fragment {


    public WelcomeFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        final View welcomeView = inflater.inflate(R.layout.fragment_welcome, container, false);


        TextView toAttractions = welcomeView.findViewById(R.id.toAttractionsFragment);
        toAttractions.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getActivity(), "This Works!", Toast.LENGTH_SHORT).show();
            }
        });

        return welcomeView;
    }
    }

