package com.example.binhm.inbrand;

import android.graphics.drawable.Drawable;
import android.support.design.widget.TabLayout;
import android.support.v4.app.FragmentManager;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.binhm.inbrand.adapter.FindCodePaperAdapter;
import com.example.binhm.inbrand.adapter.InformationAdapter;
import com.example.binhm.inbrand.fragment.MoreDetailFragment;

public class Information extends AppCompatActivity {

    private ViewPager viewPager;
    private TabLayout tabLayout;
    private TextView name, moreDetail, notification;
    ImageView imageView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_information);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setTitle("Thông Tin Sản Phẩm");
        initView();
        displayInfor();
        moreDetail.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                displayMoreDetail();
            }
        });
    }

    public void initView(){
        name = (TextView)findViewById(R.id.tvName);
        moreDetail = (TextView)findViewById(R.id.tvMoreDetail);
        notification = (TextView)findViewById(R.id.tvNotification);
        imageView = (ImageView)findViewById(R.id.imageView) ;
        viewPager = (ViewPager)findViewById(R.id.viewpProduct);
        tabLayout = (TabLayout)findViewById(R.id.tablInformation);
    }

    public void displayInfor(){
        tabLayout.setTabTextColors(getResources().getColorStateList(R.color.colorText));
        FragmentManager manager = getSupportFragmentManager();
        InformationAdapter adapter = new InformationAdapter(manager);
        viewPager.setAdapter(adapter);
        tabLayout.setupWithViewPager(viewPager);
        viewPager.addOnPageChangeListener(new TabLayout.TabLayoutOnPageChangeListener(tabLayout));
        tabLayout.setTabsFromPagerAdapter(adapter);
    }

    @Override
    public boolean onSupportNavigateUp() {
        onBackPressed();
        return true;
    }

    public void displayMoreDetail(){
            FragmentManager fm = getSupportFragmentManager();
            MoreDetailFragment editNameDialogFragment = new MoreDetailFragment();
            editNameDialogFragment.show(fm, "fragment_edit_name");

    }
}
