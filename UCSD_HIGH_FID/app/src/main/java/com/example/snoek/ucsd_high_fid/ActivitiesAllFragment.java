package com.example.snoek.ucsd_high_fid;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.support.annotation.Nullable;
import android.widget.AdapterView;
import android.widget.Spinner;


public class ActivitiesAllFragment extends Fragment {
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        //just change the fragment_dashboard
        //with the fragment you want to inflate
        //like if the class is HomeFragment it should have R.layout.home_fragment
        //if it is DashboardFragment it should have R.layout.fragment_dashboard
        View view = inflater.inflate(R.layout.fragment_activities_all, null);

        final Spinner spinner = view.findViewById(R.id.spinner8);
        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parentView, View selectedItemView, int position, long id) {
                switch(spinner.getSelectedItem().toString()) {
                    case "Lijst":
                        loadFragment(new ActivitiesList());
                        break;
                    case "Kalender":
                        loadFragment(new ActivitiesCalendar());
                        break;
                    case "Kaart":
                        loadFragment(new ActivitiesMap());
                        break;
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> parentView) {
                ActivitiesList fragment = new ActivitiesList();
                loadFragment(fragment);
            }
        });

        return view;
    }

    private void loadFragment(Fragment fragment) {
        FragmentTransaction transaction = getFragmentManager().beginTransaction();
        transaction.replace(R.id.linearLayout2, fragment); // give your fragment container id in first parameter
        transaction.addToBackStack(null);  // if written, this transaction will be added to backstack
        transaction.commit();
    }
}
