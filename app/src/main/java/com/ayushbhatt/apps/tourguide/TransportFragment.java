package com.ayushbhatt.apps.tourguide;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;


public class TransportFragment extends Fragment {


    public TransportFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View transportView = inflater.inflate(R.layout.fragment_transport, container, false);
        ArrayList<TourObject> TransportObjects = new ArrayList<>();
        TransportObjects.add(new TourObject("Detroit Department Of Transportation", "www.detroitmi.gov/How-Do-I/Locate-Transportation/Bus-Schedules", "City Bus"));
        TransportObjects.add(new TourObject("Greyhound", "locations.greyhound.com/us/michigan/detroit", "Bus"));
        TransportObjects.add(new TourObject("Enterprise Rent-A-Car", "https://www.enterprise.com", "Rental Car"));
        TransportObjects.add(new TourObject("Hertz", "www.hertz.com", "Rental Car"));
        TransportObjects.add(new TourObject("Detroit People Mover", "www.thepeoplemover.com/map.html", "Third Rail Train"));
        TransportObjects.add(new TourObject("QLine", "https://qlinedetroit.com", "StreetCar"));
        TransportObjects.add(new TourObject("Biking", "http://detroitgreenways.org/bike-map-and-parking", "Bike"));

        TourListAdapterThree transportAdapter = new TourListAdapterThree(getActivity(), TransportObjects);
        ListView transportListView = transportView.findViewById(R.id.transportFragmentListView);
        transportListView.setAdapter(transportAdapter);

        return transportView;
    }

}
