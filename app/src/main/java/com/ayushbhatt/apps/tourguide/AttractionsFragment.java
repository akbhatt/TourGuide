package com.ayushbhatt.apps.tourguide;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;


public class AttractionsFragment extends Fragment {
    public AttractionsFragment() {/*Required empty public constructor*/}

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View attractionsView = inflater.inflate(R.layout.fragment_attractions, container, false);
        //create an array of attractions
        final ArrayList<TourObject> attractions = new ArrayList<>();
        attractions.add(new TourObject(getString(R.string.attraction_belle_isle), R.drawable.attraction_belle_isle, getString(R.string.belle_isle_address), getString(R.string.belle_isle_phonenumber), getString(R.string.belle_isle_website)));
        attractions.add(new TourObject(getString(R.string.attraction_henry_ford), R.drawable.attraction_henry_ford_museum, getString(R.string.henry_ford_address), getString(R.string.henry_ford_phonenumber), getString(R.string.henry_ford_website)));
        attractions.add(new TourObject(getString(R.string.attraction_renaissance_center), R.drawable.attraction_renaissance_center, getString(R.string.renaissance_center_address), getString(R.string.renaissance_center_phonenumber), getString(R.string.renaissance_center_website)));
        attractions.add(new TourObject(getString(R.string.attraction_dia), R.drawable.attraction_detroit_institute_of_arts, getString(R.string.dia_address), getString(R.string.dia_phonenumber), getString(R.string.dia_website)));
        attractions.add(new TourObject(getString(R.string.attraction_greektown_casino), R.drawable.attraction_greektown_casino, getString(R.string.greektown_casino_address), getString(R.string.greektown_casino_phonenumber), getString(R.string.greektown_casino_website)));
        attractions.add(new TourObject(getString(R.string.attraction_detroit_zoo), R.drawable.attraction_detroit_zoo, getString(R.string.detroit_zoo_address), getString(R.string.detroit_zoo_phonenumber), getString(R.string.detroit_zoo_website)));

        TourListAdapter attractionsAdapter = new TourListAdapter(getActivity(), attractions);
        ListView attractionListView = attractionsView.findViewById(R.id.attractionsListView);
        attractionListView.setAdapter(attractionsAdapter);

        return attractionsView;
    }
}
