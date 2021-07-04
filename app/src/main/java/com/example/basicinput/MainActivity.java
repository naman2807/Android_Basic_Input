package com.example.basicinput;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.basicinput.R;

import java.text.DecimalFormat;
import java.text.NumberFormat;

/**
 * This app displays an order form to order coffee.
 */
public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button kmToMilesButton = findViewById(R.id.buttonConvKmToMiles);
        Button milesToKmButton = findViewById(R.id.buttonConvMilesToKm);
        kmToMilesButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText kmText = findViewById(R.id.kiloInput);
                double km = Double.parseDouble(kmText.getText().toString());
                EditText mileText = findViewById(R.id.milesInput);
                double miles = km * 0.62137;
                DecimalFormat format = new DecimalFormat("##.##");
                mileText.setText(format.format(miles));
            }
        });

        milesToKmButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText mileText = findViewById(R.id.milesInput);
                EditText kmText = findViewById(R.id.kiloInput);
                double miles = Double.parseDouble(mileText.getText().toString());
                double km = miles / 0.62137;
            }
        });

    }
}
