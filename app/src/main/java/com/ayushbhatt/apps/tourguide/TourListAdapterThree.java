package com.ayushbhatt.apps.tourguide;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

public class TourListAdapterThree extends ArrayAdapter<TourObject> {
    public TourListAdapterThree(Activity context, ArrayList<TourObject> TransportObject) {
        super(context, 0, TransportObject);
    }


    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        //inflate the view if existing view is not reused
        if (convertView == null) {
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.tour_list_with_name_website_type, parent, false);
        }

        class ViewHolder {
            TextView tObjectName3, tObjectWebsite3, tObjectType3;
        }

        TourObject currentTourObject = getItem(position);

        ViewHolder holder = new ViewHolder();

        holder.tObjectName3 = convertView.findViewById(R.id.tourListWithNameWebsiteTypeNameTextView);
        holder.tObjectName3.setText(currentTourObject.getObjectName());

        holder.tObjectWebsite3 = convertView.findViewById(R.id.tourListWithNameWebsiteTypeWebsiteTextView);
        holder.tObjectWebsite3.setText(currentTourObject.getObjectWebsite());

        holder.tObjectType3 = convertView.findViewById(R.id.tourListWithNameWebsiteTypeTypeTextView);
        holder.tObjectType3.setText(currentTourObject.getObjectType());


        return convertView;
    }
}
