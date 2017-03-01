package com.example.ameza.contactost.adapters;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import java.util.ArrayList;

/**
 * Created by ameza on 27/02/2017.
 */

public class PageAdapterDetalleDog extends FragmentPagerAdapter {

    ArrayList<Fragment> fragment;

    public PageAdapterDetalleDog(FragmentManager fm,ArrayList<Fragment> fragment) {
        super(fm);
        this.fragment=fragment;
    }

    @Override
    public Fragment getItem(int position) {
        return fragment.get(position);
    }

    @Override
    public int getCount() {
        return fragment.size();
    }
}
