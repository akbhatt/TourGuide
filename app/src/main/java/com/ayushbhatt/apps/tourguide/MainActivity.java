package com.ayushbhatt.apps.tourguide;

import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    ViewPager viewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        viewPager = findViewById(R.id.tourViewPager);
        TourFragmentAdapter tourFragmentAdapter = new TourFragmentAdapter(getSupportFragmentManager(), getApplicationContext());

        viewPager.setAdapter(tourFragmentAdapter);

        TabLayout tourTabs = findViewById(R.id.tourTabLayout);
        tourTabs.setupWithViewPager(viewPager);


    }
}
