package com.example.ameza.contactost.adapters;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.app.FragmentStatePagerAdapter;

import java.util.ArrayList;

/**
 * Created by ameza on 27/02/2017.
 */

public class PageAdapterHome extends FragmentPagerAdapter {

    ArrayList<Fragment> fragment;

    public PageAdapterHome(FragmentManager fm, ArrayList<Fragment> fragment) {
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
