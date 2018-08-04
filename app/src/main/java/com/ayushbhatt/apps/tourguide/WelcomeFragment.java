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
        View welcomeView = inflater.inflate(R.layout.fragment_welcome, container, false);

        final TextView history = welcomeView.findViewById(R.id.detroitHistory);
        history.setText(R.string.history_text);

        //toast to direct people to visit different tabs
        history.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getActivity(), R.string.learn_about_detroit_toast, Toast.LENGTH_LONG).show();
            }
        });

        return welcomeView;
    }
}

