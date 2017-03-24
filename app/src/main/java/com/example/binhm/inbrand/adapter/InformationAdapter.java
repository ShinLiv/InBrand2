package com.example.binhm.inbrand.adapter;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

import com.example.binhm.inbrand.fragment.BaseInformationFragment;
import com.example.binhm.inbrand.fragment.Describe_Use_Fragment;
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
                fra = new BaseInformationFragment();
                break;
            case 2:
                fra = new Describe_Use_Fragment();
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
                title = "Thông Tin Sản Phẩm";
                break;
            case 2:
                title = "Mô tả và Cách sử dụng";
        }
        return title;
    }

    @Override
    public int getCount() {
        return 3;
    }
}
