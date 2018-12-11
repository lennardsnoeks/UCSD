package com.example.snoek.ucsd_high_fid;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.widget.CardView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.support.annotation.Nullable;


public class ActivitiesList extends Fragment {
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        //just change the fragment_dashboard
        //with the fragment you want to inflate
        //like if the class is HomeFragment it should have R.layout.home_fragment
        //if it is DashboardFragment it should have R.layout.fragment_dashboard
        View view = inflater.inflate(R.layout.fragment_activities_list, null);

        CardView card1 = view.findViewById(R.id.c1);
        CardView card2 = view.findViewById(R.id.c2);
        CardView card3 = view.findViewById(R.id.c3);
        CardView card4 = view.findViewById(R.id.c4);
        CardView card5 = view.findViewById(R.id.c5);
        CardView card6 = view.findViewById(R.id.c6);
        card1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ActivityDetailFragment fragment = new ActivityDetailFragment();
                loadFragment(fragment);
            }

        });
        card2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ActivityDetailFragment fragment = new ActivityDetailFragment();
                loadFragment(fragment);
            }

        });
        card3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ActivityDetailFragment fragment = new ActivityDetailFragment();
                loadFragment(fragment);
            }

        });
        card4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ActivityDetailFragment fragment = new ActivityDetailFragment();
                loadFragment(fragment);
            }

        });
        card5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ActivityDetailFragment fragment = new ActivityDetailFragment();
                loadFragment(fragment);
            }

        });
        card6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ActivityDetailFragment fragment = new ActivityDetailFragment();
                loadFragment(fragment);
            }

        });

        return view;
    }

    private void loadFragment(Fragment fragment) {
        FragmentTransaction transaction = getParentFragment().getFragmentManager().beginTransaction();
        transaction.replace(R.id.fragment_container, fragment); // give your fragment container id in first parameter
        transaction.addToBackStack(null);  // if written, this transaction will be added to backstack
        transaction.commit();
    }
}
