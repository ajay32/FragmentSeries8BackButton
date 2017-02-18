package com.hackingbuzz.fragmentseries8;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Fragment fragment;
    Button button;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button = (Button) findViewById(R.id.button1);
        button.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {

        button.setVisibility(View.GONE);


        fragment = new Fragment1();
        FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();
        fragmentTransaction.add(R.id.base_layout, fragment, "frag1");   // third parament -- giving tag to our fragment so that we can use it in future to add or remove this fragment
        fragmentTransaction.addToBackStack("frag1");  // adding fragment to backstack by its tag
        fragmentTransaction.commit();
    }

    // see even for removing fragment we have to set backPressed method on thier parent activity ..doesnt matter how many fragments are gonna come on that activity


    // you will see no button when you come back to acitivty boz we set the Visibility to Gone

    @Override
    public void onBackPressed() {  // this method call when we click on back button

        int count = getFragmentManager().getBackStackEntryCount();   // it will count all the fragments got in backtrack

        if (count == 0) {
            super.onBackPressed();     // if zero simply go back from our acitivity


        } else {
            getFragmentManager().popBackStack();   // othwise it will remove fragment by fragment..


        }

    }


}
