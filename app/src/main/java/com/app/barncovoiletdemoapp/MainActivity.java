package com.app.barncovoiletdemoapp;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class MainActivity extends AppCompatActivity {
    private ActionBar toolbar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);





        toolbar = getSupportActionBar();

        BottomNavigationView navigation = (BottomNavigationView) findViewById(R.id.navigation);
        navigation.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener);



        //toolbar.setTitle("Shop");

        // load the store fragment by default
        //toolbar.setTitle("Shop");
        loadFragment(new HomeFragment());



    }

    private BottomNavigationView.OnNavigationItemSelectedListener mOnNavigationItemSelectedListener
            = new BottomNavigationView.OnNavigationItemSelectedListener() {

        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem item) {
            Fragment fragment;
            switch (item.getItemId()) {
                case R.id.navigation_home:
                    //toolbar.setTitle("Home");

                    fragment = new HomeFragment();
                    loadFragment(fragment);

                    return true;
                case R.id.navigation_search:
                    //toolbar.setTitle("Search");


                    fragment = new SearchFragment();
                    loadFragment(fragment);

                    return true;
                case R.id.navigation_cart:
                    //toolbar.setTitle("Cart");


                    fragment = new CartFragment();
                    loadFragment(fragment);

                    return true;
                case R.id.navigation_account:
                   // toolbar.setTitle("Account");


                    fragment = new AccountFragment();
                    loadFragment(fragment);

                    return true;
            }
            return false;
        }
    };
    private void loadFragment(Fragment fragment) {
        // load fragment
        FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
        transaction.replace(R.id.frame_container, fragment);
        transaction.addToBackStack(null);
        transaction.commit();
    }

}  //Bottom navigation//
