package com.example.mauricio.geolocalizacion;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;

public class FirstMapActivity extends AppCompatActivity
        implements OnMapReadyCallback {

    private FirstMapFragment mFirstMapFragment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mFirstMapFragment = FirstMapFragment.newInstance();
        getSupportFragmentManager()
                .beginTransaction()
                .add(R.id.map_container, mFirstMapFragment)
                .commit();

    }

    @Override
    public void onMapReady(GoogleMap googleMap) {

    }
}