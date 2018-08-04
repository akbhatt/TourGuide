package com.ayushbhatt.apps.tourguide;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;


public class TourFragmentAdapter extends FragmentPagerAdapter {

    private Context mContext;
    private String tabTitles[];

    public TourFragmentAdapter(FragmentManager fragmentManager, Context context) {
        super(fragmentManager);
        this.mContext = context;
        tabTitles = new String[]{
                mContext.getResources().getString(R.string.welcome),
                mContext.getResources().getString(R.string.attractions),
                mContext.getResources().getString(R.string.food),
                mContext.getResources().getString(R.string.transport),
                mContext.getResources().getString(R.string.radio)
        };
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
        return tabTitles[position];
    }
}
