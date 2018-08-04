package com.ayushbhatt.apps.tourguide;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

public class RadioFragment extends Fragment {


    public RadioFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View radioView = inflater.inflate(R.layout.fragment_radio, container, false);
        ArrayList<TourObject> RadioStations = new ArrayList<>();
        RadioStations.add(new TourObject(getString(R.string.radio_wkqi), getString(R.string.wkqi_website), getString(R.string.radio_type_tops)));
        RadioStations.add(new TourObject(getString(R.string.radio_wxyt), getString(R.string.wxyt_website), getString(R.string.radio_type_sports)));
        RadioStations.add(new TourObject(getString(R.string.radio_amp), getString(R.string.amp_website), getString(R.string.radio_type_tops)));
        RadioStations.add(new TourObject(getString(R.string.radio_wycd), getString(R.string.wycd_website), getString(R.string.radio_type_country)));
        RadioStations.add(new TourObject(getString(R.string.radio_womc), getString(R.string.womc_website), getString(R.string.radio_type_classic_hits)));
        RadioStations.add(new TourObject(getString(R.string.radio_wmgc), getString(R.string.wmgc_website), getString(R.string.radio_type_hip_hop)));
        RadioStations.add(new TourObject(getString(R.string.radio_wjr), getString(R.string.wjr_website), getString(R.string.radio_type_news_talk)));
        RadioStations.add(new TourObject(getString(R.string.radio_wwj), getString(R.string.wwj_website), getString(R.string.radio_type_news)));

        TourListAdapterThree radioAdapter = new TourListAdapterThree(getActivity(), RadioStations);
        ListView radioListView = radioView.findViewById(R.id.radioFragmentListView);
        radioListView.setAdapter(radioAdapter);


        return radioView;
    }

}
