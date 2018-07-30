package com.ayushbhatt.apps.tourguide;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

public class TourFragmentAdapter extends FragmentPagerAdapter {

    public TourFragmentAdapter(FragmentManager fragmentManager) {
        super(fragmentManager);
    }

    @Override
    public int getCount() {
        return 4;
    }

    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0:
                return new WelcomeFragment();
            case 1:
                return new AttractionsFragment();
            case 2:
                return new FoodFragment();
            case 3:
                return new TransportFragment();
            default:
                return null;
        }
    }

    @Override
    public CharSequence getPageTitle(int position) {
        switch (position){
            case 0:
                return "Welcome!";
            case 1:
                return "Attractions!";
            case 2:
                return "Food!";
            case 3:
                return "Transport!";
            default:
                return null;
        }
    }
}
