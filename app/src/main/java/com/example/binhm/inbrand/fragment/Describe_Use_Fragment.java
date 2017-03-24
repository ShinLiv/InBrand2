package com.example.binhm.inbrand.fragment;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.binhm.inbrand.R;

public class Describe_Use_Fragment extends Fragment {

    private TextView describe, use;

    public Describe_Use_Fragment() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_describe__use_, container, false);
        return view;
    }

    public void initView(View view){
        describe = (TextView)view.findViewById(R.id.tvDescribe);
        use = (TextView)view.findViewById(R.id.tvUse);
    }

}
