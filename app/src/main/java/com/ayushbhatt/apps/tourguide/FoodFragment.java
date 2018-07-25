package com.ayushbhatt.apps.tourguide;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;

public class FoodFragment extends Fragment {


    public FoodFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View FoodFragmentView = inflater.inflate(R.layout.fragment_food, container, false);
        //create an array for food places
        final ArrayList<TourObject> FoodPlace = new ArrayList<>();
        FoodPlace.add(new TourObject("Giovanni's,", 1, "330 S Oakwood, Detroit, MI 48217-1453", "(313) 841-0122", "http://www.giovannisristorante.com", 4.7, "Italian, Vegetarian, Vegan Options"));
//        FoodPlace.add(new TourObject("Scotty Simpson's Fish & Chips",1,"22200 Fenkell Ave, Detroit, MI 48223"));

        return FoodFragmentView;
    }

}
