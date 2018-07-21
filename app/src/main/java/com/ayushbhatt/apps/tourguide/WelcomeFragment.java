package com.ayushbhatt.apps.tourguide;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


public class WelcomeFragment extends Fragment {

    public WelcomeFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View welcomeView = inflater.inflate(R.layout.fragment_welcome, container, false);

        TextView history = welcomeView.findViewById(R.id.detroitHistory);
        history.setText(R.string.history_text);
        return welcomeView;
    }
}

