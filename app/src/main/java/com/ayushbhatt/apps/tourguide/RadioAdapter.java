package com.ayushbhatt.apps.tourguide;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;

import java.util.ArrayList;

public class RadioAdapter extends RecyclerView.Adapter<RadioAdapter.ViewHolder> {

    private static final String TAG = "RadioAdapter";
    static ArrayList<TourObject> rRadioList;
    public Context rContext;


    public RadioAdapter(ArrayList<TourObject> radioList, Context context) {
        rRadioList = radioList;
        rContext = context;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.tour_list_with_name_website_type, parent, false);
        ViewHolder holder = new ViewHolder(view);

        return holder;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder viewHolder, final int position) {
        Log.d(TAG, "onBindViewHolder is called.");

    }

    @Override
    public int getItemCount() {
        return rRadioList.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {

        TextView rRadioStationNameTextView, rRadioStationWebsiteTextView, rRadioStationTypeTextView;
        RelativeLayout parentLayout;

        public ViewHolder(View view) {
            super(view);
            parentLayout = view.findViewById(R.id.tourListWithNameWebsiteTypeMainRelativeLayout);
            rRadioStationNameTextView = view.findViewById(R.id.tourListWithNameWebsiteTypeNameTextView);
            rRadioStationWebsiteTextView = view.findViewById(R.id.tourListWithNameWebsiteTypeWebsiteTextView);
            rRadioStationTypeTextView = view.findViewById(R.id.tourListWithNameWebsiteTypeTypeTextView);
        }
    }
}
