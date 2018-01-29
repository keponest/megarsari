package com.marketprice.marketpriceapp.Adapter;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import com.marketprice.marketpriceapp.User.UserBerandaFragment;
import com.marketprice.marketpriceapp.User.UserHistoryFragment;
import com.marketprice.marketpriceapp.User.UserOngoingFragment;

/**
 * Created by Kefin Pudi on 1/30/2018.
 */

public class CustomFragmentPageAdapter extends FragmentPagerAdapter{
    private static final int FRAGMENT_COUNT = 3;
    public CustomFragmentPageAdapter(FragmentManager fm) {
        super(fm);
    }
    @Override
    public Fragment getItem(int position) {
        switch (position){
            case 0:
                return new UserBerandaFragment();
            case 1:
                return new UserHistoryFragment();
            case 2:
                return new UserOngoingFragment();
        }
        return null;
    }
    @Override
    public int getCount() {
        return FRAGMENT_COUNT;
    }
    @Override
    public CharSequence getPageTitle(int position) {
        switch (position){
            case 0:
                return "Beranda";
            case 1:
                return "History";
            case 2:
                return "Transaksi";
        }
        return null;
    }
}
