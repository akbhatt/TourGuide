package com.ayushbhatt.apps.tourguide;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class TourListAdapterTwo extends ArrayAdapter<TourObject> {
    public TourListAdapterTwo(Activity context, ArrayList<TourObject> FoodPlace) {
        super(context, 0, FoodPlace);
    }


    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        //inflate the view if existing view is not reused
        if (convertView == null) {
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.tour_list_layout_with_ratings_and_type, parent, false);
        }

        class ViewHolder {
            TextView tObjectName2, tObjectAddress2, tObjectPhoneNumber2, tObjectWebsite2, tObjectType2, tObjectRatings2;
            ImageView tObjectImage2;
        }

        TourObject currentTourObject = getItem(position);

        ViewHolder holder = new ViewHolder();

        holder.tObjectName2 = convertView.findViewById(R.id.tourNameTextViewTwo);
        holder.tObjectName2.setText(currentTourObject.getObjectName());

        holder.tObjectImage2 = convertView.findViewById(R.id.tourImageViewTwo);
        holder.tObjectImage2.setImageResource(currentTourObject.getObjectImageResourceID());

        holder.tObjectAddress2 = convertView.findViewById(R.id.tourAddressTextViewTwo);
        holder.tObjectAddress2.setText(currentTourObject.getObjectAddress());

        holder.tObjectPhoneNumber2 = convertView.findViewById(R.id.tourPhoneTextViewTwo);
        holder.tObjectPhoneNumber2.setText(currentTourObject.getObjectPhoneNumber());

        holder.tObjectWebsite2 = convertView.findViewById(R.id.tourWebsiteTextViewTwo);
        holder.tObjectWebsite2.setText(currentTourObject.getObjectWebsite());

        holder.tObjectType2 = convertView.findViewById(R.id.tourObjectTypeTextView);
        holder.tObjectType2.setText(currentTourObject.getObjectType());

        holder.tObjectRatings2 = convertView.findViewById(R.id.tourRatingsTextView);
        holder.tObjectRatings2.setText(currentTourObject.getObjectRatings());

        return convertView;
    }
}
