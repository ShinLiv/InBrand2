package com.example.binhm.inbrand.fragment;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.DialogFragment;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.binhm.inbrand.R;

import org.w3c.dom.Text;

public class MoreDetailFragment extends DialogFragment {

    private TextView code, origin, specification, productionBatch,introduce, process;

    public MoreDetailFragment() {
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
        View view = inflater.inflate(R.layout.fragment_more_detail, container, false);
        return view;
    }

    public void initView(View view){
        code = (TextView)view.findViewById(R.id.tvCode);
        origin = (TextView)view.findViewById(R.id.tvOrigin);
        specification = (TextView)view.findViewById(R.id.tvSpecification);
        productionBatch = (TextView)view.findViewById(R.id.tvProductionBatch);
        introduce = (TextView)view.findViewById(R.id.tvIntroduce);
        process = (TextView)view.findViewById(R.id.tvProcess);
    }

}
