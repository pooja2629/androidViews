package com.example.fragments;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


/**
 * A simple {@link Fragment} subclass.
 */
public class BtnPenFragment extends Fragment {


    public BtnPenFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        final View view=inflater.inflate(R.layout.fragment_btn_panel, container, false);
        view.findViewById(R.id.btnBike).setOnClickListener(v ->(
                (MainActivity)getActivity()).loadFrangment(new BikeFragment()));
        view.findViewById(R.id.btnPlane).setOnClickListener(v ->(
                (MainActivity)getActivity()).loadFrangment(new PlaneFragment()));
        view.findViewById(R.id.btnRail).setOnClickListener(v ->(
                (MainActivity)getActivity()).loadFrangment(new RailFragment()));
        return view;
    }

}
