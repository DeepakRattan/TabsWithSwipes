package com.example.deepakrattan.tabswithswipes;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

/**
 * Created by Deepak Rattan on 31-Dec-16.
 */

public class MyPagerAdapter extends FragmentStatePagerAdapter {
    private int tabCount;

    public MyPagerAdapter(FragmentManager fm, int tabCount) {
        super(fm);
        this.tabCount = tabCount;
    }

    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0:
                TabOneFragment tab1 = new TabOneFragment();
                return tab1;
            case 1:
                TabTwoFragment tab2 = new TabTwoFragment();
                return tab2;
            case 2:
                TabThreeFragment tab3 = new TabThreeFragment();
                return tab3;
            default:
                return null;
        }
    }

    @Override
    public int getCount() {
        return tabCount;
    }
}
