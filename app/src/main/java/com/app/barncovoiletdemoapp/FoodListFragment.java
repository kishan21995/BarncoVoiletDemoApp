package com.app.barncovoiletdemoapp;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;

import androidx.cardview.widget.CardView;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;


public class FoodListFragment extends Fragment implements View.OnClickListener {

    public FoodListFragment() {
        // Required empty public constructor
    }





    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView= inflater.inflate(R.layout.fragment_food_list, container, false);


        CardView cardView=  rootView.findViewById(R.id.pizzaa);

      /*  ImageView imageView= (ImageView) rootView.findViewById(R.id.filter);

        LinearLayout listss=  rootView.findViewById(R.id.lists);*/


        cardView.setOnClickListener(this);
    /*    imageView.setOnClickListener(this);
        listss.setOnClickListener(this);*/



        return rootView;

    }

    @Override
    public void onClick(View view) {


        Fragment fragment = null;
        switch (view.getId()) {
            case R.id.pizzaa:
                fragment = new PizzaFragment();
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
