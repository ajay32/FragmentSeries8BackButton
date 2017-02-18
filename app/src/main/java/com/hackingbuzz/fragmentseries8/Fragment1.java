package com.hackingbuzz.fragmentseries8;


import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

/**
 * Created by Avi Hacker on 2/17/2017.
 */

public class Fragment1 extends Fragment {





    private FragmentManager fragmentManager;
    private Fragment fragment;
    Button btn;


    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View v = inflater.inflate(R.layout.fragment_1, container, false);
        init(v);
        return v;
    }


    public void init(View v) {

        fragmentManager = getFragmentManager();

         btn = (Button) v.findViewById(R.id.btn1);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                fragment = fragmentManager.findFragmentByTag("frag1");
                FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
                if (fragment != null) {
                    fragmentTransaction.remove(fragment);    // remove Transaction
                }


                fragment = new Fragment2();
                fragmentTransaction.add(R.id.base_layout, fragment, "frag2");    //giving tag to fragment
                fragmentTransaction.addToBackStack("frag2");
                fragmentTransaction.commit();
            }
        });
    }


}
