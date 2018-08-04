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
        TransportObjects.add(new TourObject(getString(R.string.transport_ddot), getString(R.string.ddot_website), getString(R.string.transport_type_city_bus)));
        TransportObjects.add(new TourObject(getString(R.string.transport_greyhound), getString(R.string.greyhound_website), getString(R.string.transport_type_bus)));
        TransportObjects.add(new TourObject(getString(R.string.transport_enterprise), getString(R.string.enterprise_website), getString(R.string.transport_type_rental_car)));
        TransportObjects.add(new TourObject(getString(R.string.transport_hertz), getString(R.string.hertz_website), getString(R.string.transport_type_rental_car)));
        TransportObjects.add(new TourObject(getString(R.string.transport_dpm), getString(R.string.dpm_website), getString(R.string.transport_type_third_rail)));
        TransportObjects.add(new TourObject(getString(R.string.transport_qline), getString(R.string.qline_website), getString(R.string.transport_type_street_car)));
        TransportObjects.add(new TourObject(getString(R.string.transport_biking), getString(R.string.biking_website), getString(R.string.transport_type_bike)));

        TourListAdapterThree transportAdapter = new TourListAdapterThree(getActivity(), TransportObjects);
        ListView transportListView = transportView.findViewById(R.id.transportFragmentListView);
        transportListView.setAdapter(transportAdapter);

        return transportView;
    }

}
