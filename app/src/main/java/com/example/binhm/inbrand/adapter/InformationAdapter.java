package com.example.binhm.inbrand.adapter;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

import com.example.binhm.inbrand.fragment.DetailFragment;
import com.example.binhm.inbrand.fragment.Producer_Fragment;

/**
 * Created by binhm on 3/22/2017.
 */

public class InformationAdapter extends FragmentStatePagerAdapter {

    public InformationAdapter(FragmentManager fm){

        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        Fragment fra = null;
        switch (position){
            case 0:
                fra = new Producer_Fragment();
                break;
            case 1:
                fra = new DetailFragment();
                break;
        }
        return fra;
    }
    @Override
    public CharSequence getPageTitle(int position) {
        String title = "";
        switch (position){
            case 0:
                title = "Nhà Sản Xuất";
                break;
            case 1:
                title = "Thông Tin Chi Tiết";
                break;
        }
        return title;
    }

    @Override
    public int getCount() {
        return 2;
    }
}
