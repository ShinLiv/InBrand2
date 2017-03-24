package com.example.binhm.inbrand;

import android.support.design.widget.TabLayout;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Window;

import com.example.binhm.inbrand.adapter.FindCodePaperAdapter;
import com.example.binhm.inbrand.adapter.InformationAdapter;

public class MainActivity extends AppCompatActivity {

    private ViewPager viewpFindCode;
    private TabLayout tablFindCode;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().hide();
        initView();
        displayFragment();
    }

    public void initView(){
        viewpFindCode = (ViewPager)findViewById(R.id.viewpFindCode);
        tablFindCode = (TabLayout) findViewById(R.id.tablFindCode);
    }

    public void displayFragment(){
        FragmentManager manager = getSupportFragmentManager();
        FindCodePaperAdapter adapter = new FindCodePaperAdapter(manager);
        viewpFindCode.setAdapter(adapter);
        tablFindCode.setupWithViewPager(viewpFindCode);
        viewpFindCode.addOnPageChangeListener(new TabLayout.TabLayoutOnPageChangeListener(tablFindCode));
        tablFindCode.setTabsFromPagerAdapter(adapter);
    }
}
