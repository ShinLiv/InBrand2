package com.example.binhm.inbrand.fragment;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.TextView;

import com.example.binhm.inbrand.R;

import org.w3c.dom.Text;

public class Producer_Fragment extends Fragment {

    private TextView Code, Producere, address, phone, website;

    public Producer_Fragment() {

    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_producer_, container, false);
        return view;
    }

    public void initView(View view){

        Code = (TextView)view.findViewById(R.id.tvCode);
        Producere = (TextView)view.findViewById(R.id.tvNameProducer);
        address = (TextView)view.findViewById(R.id.tvAddress);
        phone = (TextView)view.findViewById(R.id.tvPhone);
        website = (TextView)view.findViewById(R.id.tvLinkWebsite);
    }
}
