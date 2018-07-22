package com.ayushbhatt.apps.tourguide;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class AttractionsAdapter extends ArrayAdapter<AttractionInfo> {
    public AttractionsAdapter(Activity context, ArrayList<AttractionInfo> attractions) {
        super(context, 0, attractions);
    }


    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        //inflate the view if existing view is not reused
        if (convertView == null) {
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.attraction_list_layout, parent, false);
        }

        AttractionInfo currentAttraction = getItem(position);

        TextView attractionName = convertView.findViewById(R.id.attractionsNameTextView);
        attractionName.setText(currentAttraction.getAttractionName());

        ImageView attractionImage = convertView.findViewById(R.id.attractionsImageView);
        attractionImage.setImageResource(currentAttraction.getAttractionImageResourceID());

        TextView attractionAddress = convertView.findViewById(R.id.attractionsAddressTextView);
        attractionAddress.setText(currentAttraction.getAttractionAddress());

        TextView attractionPhoneNumber = convertView.findViewById(R.id.attractionsPhoneTextView);
        attractionPhoneNumber.setText(currentAttraction.getAttractionPhoneNumber());

        TextView attractionWebsite = convertView.findViewById(R.id.attractionsWebsiteTextView);
        attractionWebsite.setText(currentAttraction.getAttractionWebsite());

        return convertView;
    }
}
