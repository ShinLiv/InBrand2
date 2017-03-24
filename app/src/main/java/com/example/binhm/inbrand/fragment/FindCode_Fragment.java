package com.example.binhm.inbrand.fragment;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.support.v4.view.KeyEventCompat;
import android.support.v7.widget.SearchView;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.Log;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.example.binhm.inbrand.Information;
import com.example.binhm.inbrand.MainActivity;
import com.example.binhm.inbrand.R;
import com.example.binhm.inbrand.adapter.InformationAdapter;

/**
 * FindCode_Fragment có chức năng tìm kiếm mã qr và chụp ảnh nhận diện mã qr
 * gồm các biến: searchCode: là edittext để nhập mà qr
 */

public class FindCode_Fragment extends Fragment {

    private EditText searchCode;

    public FindCode_Fragment() {
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
        View view = inflater.inflate(R.layout.fragment_find_code_, container, false);
        initView(view);

        searchCode.setOnEditorActionListener(new TextView.OnEditorActionListener() {
            @Override
            public boolean onEditorAction(TextView v, int actionId, KeyEvent event) {
                if (actionId == EditorInfo.IME_ACTION_SEARCH) {
                   displayInformation();
                    return true;
                }
                return false;
            }
        });
        return view;
    }

    public void initView(View view){

        searchCode = (EditText) view.findViewById(R.id.editFindCode);
    }

    public void performSerach(){
        searchCode.clearFocus();
        InputMethodManager im = (InputMethodManager)getContext().getSystemService(Context.INPUT_METHOD_SERVICE);
        im.hideSoftInputFromWindow(searchCode.getWindowToken(), 0);
        displayInformation();
    }

    public void displayInformation(){
        Intent intent = new Intent(getContext(), Information.class);
        startActivity(intent);
    }
}
