package com.ayushbhatt.apps.tourguide;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

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
        FoodPlace.add(new TourObject(getString(R.string.foodplace_giovannis), getString(R.string.foodplace_giovannis_address), getString(R.string.foodplace_giovannis_phonenumber), getString(R.string.giovannis_website), getString(R.string.giovannis_ratings), getString(R.string.giovannis_foodtype)));
        FoodPlace.add(new TourObject(getString(R.string.foodplace_scotty_simpson_detroit), getString(R.string.foodplace_scotty_simpson_address), getString(R.string.foodplace_scotty_simpson_phonenumber), getString(R.string.scotty_simpson_website), getString(R.string.scotty_simpson_ratings), getString(R.string.scotty_simpson_foodtype)));
        FoodPlace.add(new TourObject(getString(R.string.foodplace_roast_detroit), getString(R.string.foodplace_roast_address), getString(R.string.foodplace_roast_phonenumber), getString(R.string.roast_website), getString(R.string.roast_ratings), getString(R.string.roast_foodtype)));
        FoodPlace.add(new TourObject(getString(R.string.foodplace_supino_pizza), getString(R.string.foodplace_supino_address), getString(R.string.foodplace_supino_phonenumber), getString(R.string.supino_website), getString(R.string.supino_ratings), getString(R.string.pizza)));

        TourListAdapterTwo foodAdapter = new TourListAdapterTwo(getActivity(), FoodPlace);
        ListView foodListView = FoodFragmentView.findViewById(R.id.foodListView);
        foodListView.setAdapter(foodAdapter);

        return FoodFragmentView;
    }

}
