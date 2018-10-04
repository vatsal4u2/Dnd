package com.dnd.vatsaldipen.dnd;

import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.dnd.vatsaldipen.dnd.fragments.MainFragment;

public class MainActivity extends AppCompatActivity implements MainFragment.OnFragmentInteractionListener{

    private MainFragment mMainFragment;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mMainFragment = MainFragment.newInstance("Dipen","Vatsal");

        getSupportFragmentManager().beginTransaction()
                .add(R.id.container,mMainFragment)
                .commit();
    }

    @Override
    protected void onResume() {
        super.onResume();
    }

    @Override
    protected void onPause() {
        super.onPause();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
    }


    @Override
    public void onFragmentInteraction(Uri uri) {

    }
}
