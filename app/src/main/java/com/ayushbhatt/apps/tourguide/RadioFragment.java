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
        RadioStations.add(new TourObject("95.5 WKQI FM", "https://channel955.iheart.com/", "Top-40"));
        RadioStations.add(new TourObject("97.1 WXYT FM", "https://player.radio.com/listen/station/971-the-ticket", "Sports"));
        RadioStations.add(new TourObject("98.7 AMP FM", "https://player.radio.com/listen/station/987-amp-radio", "Top-40"));
        RadioStations.add(new TourObject("99.5 WYCD FM", "http://player.radio.com/listen/station/995-wycd", "Country"));
        RadioStations.add(new TourObject("104.3 WOMC FM", "http://player.radio.com/listen/station/1043-womc-hd2", "Classic Hits"));
        RadioStations.add(new TourObject("105.1 WMGC FM", "https://1051thebounce.com/", "Hip Hop"));
        RadioStations.add(new TourObject("760 WJR AM", "www.wjr.com", "News/Talk"));
        RadioStations.add(new TourObject("950 WWJ AM", "http://player.radio.com/listen/station/wwj-newsradio-950", "News"));

        TourListAdapterThree radioAdapter = new TourListAdapterThree(getActivity(), RadioStations);
        ListView radioListView = radioView.findViewById(R.id.radioFragmentListView);
        radioListView.setAdapter(radioAdapter);


        return radioView;
    }

}
