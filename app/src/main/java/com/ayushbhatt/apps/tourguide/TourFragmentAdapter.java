package com.ayushbhatt.apps.tourguide;

import android.content.res.Resources;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

public class TourFragmentAdapter extends FragmentPagerAdapter {

    public TourFragmentAdapter(FragmentManager fragmentManager) {
        super(fragmentManager);
    }

    @Override
    public int getCount() {
        return 5;
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
            case 4:
                return new RadioFragment();
            default:
                return null;
        }
    }


    @Override
    public CharSequence getPageTitle(int position) {
        switch (position){
            case 0:
                return Resources.getSystem().getString(R.string.welcome);
            case 1:
                return Resources.getSystem().getString(R.string.attractions);
            case 2:
                return Resources.getSystem().getString(R.string.food);
            case 3:
                return Resources.getSystem().getString(R.string.transport);
            case 4:
                return Resources.getSystem().getString(R.string.radio);
            default:
                return null;
        }
    }
}
