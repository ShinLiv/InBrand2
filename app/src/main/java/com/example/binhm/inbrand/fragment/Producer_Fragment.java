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


    private OnFragmentInteractionListener mListener;

    private TextView headerCode, headerProducer, headerorigin, headeraddress, headerphone, headerwebsite,
                Code, Producere, Origin, address, phone, website;

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

    // TODO: Rename method, update argument and hook method into UI event
    public void onButtonPressed(Uri uri) {
        if (mListener != null) {
            mListener.onFragmentInteraction(uri);
        }
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);

    }

    @Override
    public void onDetach() {
        super.onDetach();
        mListener = null;
    }

    public interface OnFragmentInteractionListener {
        // TODO: Update argument type and name
        void onFragmentInteraction(Uri uri);
    }

    public void initView(View view){

        headerCode = (TextView)view.findViewById(R.id.tvHeaderCode);
        headerProducer = (TextView)view.findViewById(R.id.tvHeaderProducer);
        headerorigin = (TextView)view.findViewById(R.id.tvHeaderOrigin);
        headeraddress = (TextView)view.findViewById(R.id.tvHeaderAddress);
        headerphone = (TextView)view.findViewById(R.id.tvHeaderPhone);
        headerwebsite = (TextView)view.findViewById(R.id.tvHeaderWebsite);
        Code = (TextView)view.findViewById(R.id.tvCode);
        Producere = (TextView)view.findViewById(R.id.tvNameProducer);
        Origin = (TextView)view.findViewById(R.id.tvContentOrigin);
        address = (TextView)view.findViewById(R.id.tvAddress);
        phone = (TextView)view.findViewById(R.id.tvPhone);
        website = (TextView)view.findViewById(R.id.tvLinkWebsite);
    }
}
