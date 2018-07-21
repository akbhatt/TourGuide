package com.ayushbhatt.apps.tourguide;

import android.support.design.widget.TabLayout;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ViewPager viewPager = findViewById(R.id.tourViewPager);
        PagerAdapter tourFragmentAdapter = new TourFragmentAdapter(getSupportFragmentManager());
        viewPager.setAdapter(tourFragmentAdapter);

        TabLayout tourTabs = findViewById(R.id.tourTabLayout);
        tourTabs.setupWithViewPager(viewPager);


    }
}
