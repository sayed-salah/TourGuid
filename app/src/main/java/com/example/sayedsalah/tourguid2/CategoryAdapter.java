package com.example.sayedsalah.tourguid2;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

/**
 * Created by Sayed Salah on 9/30/2017.
 */
public class CategoryAdapter extends FragmentPagerAdapter {
    private Context mcontext;

    public CategoryAdapter(Context mContext, FragmentManager fm) {
        super(fm);
        this.mcontext = mContext;
    }

    @Override
    public Fragment getItem(int position) {
        if (position == 0) {
            return new Fragment_stadium();
        } else if (position == 1) {
            return new Fragment_resturant();
        } else if (position == 2) {
            return new Fragment_club();
        } else {
            return new Fragment_landmark();
        }
    }

    @Override
    public int getCount() {
        return 4;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        if (position == 0) {
            return mcontext.getString(R.string.fragment_stadium);
        } else if (position == 1) {
            return mcontext.getString(R.string.fragment_resturant);
        } else if (position == 2) {
            return mcontext.getString(R.string.fragment_club);
        } else {
            return mcontext.getString(R.string.fragment_landmark);
        }
    }
}
