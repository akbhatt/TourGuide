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
        attractions.add(new TourObject("Belle Isle Park", R.drawable.attraction_belle_isle, "Belle Isle, Michigan", "(313) 331-7760", "https://www.belleisleconservancy.org"));
        attractions.add(new TourObject("The Henry Ford", R.drawable.attraction_henry_ford_museum, "20900 Oakwood Blvd, Dearborn, MI 48124", "(313) 982-6001", "https://www.thehenryford.org"));
        attractions.add(new TourObject("Renaissance Center", R.drawable.attraction_renaissance_center, "Detroit, MI 48243", "(313) 567-3126", "gmrencen.com"));
        attractions.add(new TourObject("Detroit Institute of Arts", R.drawable.attraction_detroit_institute_of_arts, "5200 Woodward Ave, Detroit, MI 48202", "(313) 833-7900", "https://www.dia.org"));
        attractions.add(new TourObject("Greektown Casino", R.drawable.attraction_greektown_casino, "555 East Lafayette Blvd, Detroit, MI 48226", "(313) 223-2999", "https://www.greektowncasino.com"));
        attractions.add(new TourObject("Detroit Zoo", R.drawable.attraction_detroit_zoo, "8450 W 10 Mile Rd, Royal Oak, MI 48067", "(248) 541-5717", "https://detroitzoo.org"));

        TourListAdapter attractionsAdapter = new TourListAdapter(getActivity(), attractions);
        ListView attractionListView = attractionsView.findViewById(R.id.attractionsListView);
        attractionListView.setAdapter(attractionsAdapter);

        return attractionsView;
    }
}
