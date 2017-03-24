package com.example.binhm.inbrand.adapter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

import com.example.binhm.inbrand.fragment.FindCode_Fragment;

/**
 * Created by binhm on 3/22/2017.
 */

public class FindCodePaperAdapter extends FragmentStatePagerAdapter {

    public FindCodePaperAdapter(FragmentManager fm){
        super(fm);
    }
    @Override
    public Fragment getItem(int position) {
        Fragment fra = null;
        switch (position){
            case 0:
                fra = new FindCode_Fragment();
                break;
        }
        return fra;
    }

    @Override
    public int getCount() {
        return 1;
    }

    @Override
    public CharSequence getPageTitle(int position) {

        String title = "";
        switch (position){
            case 0:
                title = "QUÉT MÃ QR";
                break;
        }
        return title;
    }
}
