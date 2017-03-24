package com.example.binhm.inbrand.fragment;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.binhm.inbrand.R;

public class BaseInformationFragment extends Fragment {

    private TextView standard, status, firstTime, endTime, address;

    public BaseInformationFragment() {
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
        View view = inflater.inflate(R.layout.fragment_base_information, container, false);
        initView(view);
        return view;
    }

    public void initView(View view){

        standard = (TextView) view.findViewById(R.id.tvStandard);
        status = (TextView) view.findViewById(R.id.tvStatus);
        firstTime = (TextView) view.findViewById(R.id.tvFirstTime);
        endTime = (TextView) view.findViewById(R.id.tvEndTime);
        address = (TextView) view.findViewById(R.id.tvAddress);
    }

}
