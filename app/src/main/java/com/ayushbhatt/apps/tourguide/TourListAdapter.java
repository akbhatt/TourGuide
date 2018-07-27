package com.ayushbhatt.apps.tourguide;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class TourListAdapter extends ArrayAdapter<TourObject> {
    public TourListAdapter(Activity context, ArrayList<TourObject> attractions) {
        super(context, 0, attractions);
    }


    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        //inflate the view if existing view is not reused
        if (convertView == null) {
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.tour_list_layout, parent, false);
        }

        class ViewHolder {
            TextView tObjectName, tObjectAddress, tObjectPhoneNumber, tObjectWebsite;
            ImageView tObjectImage;
        }

        TourObject currentTourObject = getItem(position);

        ViewHolder holder = new ViewHolder();

        holder.tObjectName = convertView.findViewById(R.id.tourNameTextView);
        holder.tObjectName.setText(currentTourObject.getObjectName());

        holder.tObjectImage = convertView.findViewById(R.id.tourImageView);
        holder.tObjectImage.setImageResource(currentTourObject.getObjectImageResourceID());

        holder.tObjectAddress = convertView.findViewById(R.id.tourAddressTextView);
        holder.tObjectAddress.setText(currentTourObject.getObjectAddress());

        holder.tObjectPhoneNumber = convertView.findViewById(R.id.tourPhoneTextView);
        holder.tObjectPhoneNumber.setText(currentTourObject.getObjectPhoneNumber());

        holder.tObjectWebsite = convertView.findViewById(R.id.tourWebsiteTextView);
        holder.tObjectWebsite.setText(currentTourObject.getObjectWebsite());

        return convertView;
    }
}
