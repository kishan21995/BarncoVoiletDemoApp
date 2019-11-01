package com.app.barncovoiletdemoapp;

import android.content.Context;
import android.graphics.Color;
import android.net.Uri;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;


public class FilterFragment extends Fragment implements View.OnClickListener {

    public FilterFragment() {
        // Required empty public constructor
    }





    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
      View rootView=   inflater.inflate(R.layout.fragment_filter, container, false);

        Button btn11= (Button) rootView.findViewById(R.id.btn1);

       // ImageView imageView= (ImageView) rootView.findViewById(R.id.filter);


        btn11.setOnClickListener(this);
        //imageView.setOnClickListener(this);


        return rootView;

    }

    @Override
    public void onClick(View view) {


        Fragment fragment = null;
        switch (view.getId()) {
            case R.id.btn1:
                fragment = new ViewAllFragment();
                replaceFragment(fragment);
               /* Intent intent=new Intent(HomeFragment.this,ViewAllActivity.class);
                startActivity(intent);*/
                break;

          /*  case R.id.filter:
                fragment = new FilterFragment();
                replaceFragment(fragment);
                break;*/
        }//

    }

    //move onr fragment to another fragment//
    public void replaceFragment(Fragment someFragment) {
        FragmentTransaction transaction = getFragmentManager().beginTransaction();
        transaction.replace(R.id.frame_container, someFragment);
        transaction.addToBackStack(null);
        transaction.commit();
    }



    }



