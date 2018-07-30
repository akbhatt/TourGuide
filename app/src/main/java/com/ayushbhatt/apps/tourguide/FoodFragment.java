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
        FoodPlace.add(new TourObject("Giovanni's", R.drawable.food_giovannis, "330 S Oakwood, Detroit, MI 48217-1453", "(313) 841-0122", "http://www.giovannisristorante.com", "Ratings: 4.7/5", "Italian, Vegetarian, Vegan Options"));
        FoodPlace.add(new TourObject("Scotty Simpson's Fish & Chips", R.drawable.food_scotty_simpson_fish_chips, "22200 Fenkell Ave, Detroit, MI 48223", "(313) 533-0950", "places.singleplatform.com", "Ratings: 4.6/5", "Burgers, Fish'n'chips, Sea Food"));
        FoodPlace.add(new TourObject("Roast", R.drawable.food_roast_steak, "1128 Washington Blvd, Detroit, MI 48226", "(313) 961-2500", "roastdetroit.com", "Ratings: 4.5/5", "Steak, Meat"));
        FoodPlace.add(new TourObject("Supino Pizzeria", R.drawable.food_supinos_pizza, "2457 Russell St, Detroit, MI 48207", "(313) 567-7879", "supinopizzeria.com", "Ratings: 4.6/5", "Pizza"));

        TourListAdapterTwo foodAdapter = new TourListAdapterTwo(getActivity(), FoodPlace);
        ListView foodListView = FoodFragmentView.findViewById(R.id.foodListView);
        foodListView.setAdapter(foodAdapter);

        return FoodFragmentView;
    }

}
