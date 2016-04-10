package com.ljcapps.middleman;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

public class CheckStatusActivity extends AppCompatActivity {

    double mLatitude;
    double mLongitude;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_check_status);

        Intent intent = getIntent();
        mLatitude = intent.getDoubleExtra("Latitude", 0.00);
        mLongitude = intent.getDoubleExtra("Longitude", 0.00);

        double[] latitudes = {40.0, 41.0, 50.0, 38.0, 78.0};
        double[] longitudes = {-77, -75, -60, -80, -80.5};

        for (int i = 0; i < latitudes.length; i++) {
            if ((latitudes[i] <= mLatitude + 3 && latitudes[i] >= mLatitude - 3) && (longitudes[i] <= mLongitude + 3 && longitudes[i] >= mLongitude -3)) {
                Toast.makeText(this, "SUCCESS!", Toast.LENGTH_SHORT).show();
            }
            else{
                Toast.makeText(this, "FAILURE!", Toast.LENGTH_SHORT).show();
            }
        }


    }
}
