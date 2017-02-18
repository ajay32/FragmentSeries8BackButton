package com.hackingbuzz.fragmentseries8;


import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by Avi Hacker on 2/17/2017.
 */

public class Fragment2 extends Fragment {

    // We should remove a fragment before adding other fragment to our base layout (Activity)
    // in our fragment class we always import fragment from support v4 library...
    // dont take fragmentf rom android.app.Fragment -- always go for v4 library
    // we give tag to a fragment when we call it..



    private FragmentManager fragmentManager;
    private Fragment fragment;


    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View v = inflater.inflate(R.layout.fragment_2, container, false);  // we got view (our layout in v variable
        return v;
    }



}
