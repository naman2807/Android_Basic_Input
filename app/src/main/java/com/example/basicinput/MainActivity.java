package com.example.basicinput;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.basicinput.R;

import java.text.NumberFormat;

/**
 * This app displays an order form to order coffee.
 */
public class MainActivity extends AppCompatActivity {
    private int quantity = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button kmToMilesButton = findViewById(R.id.buttonConvKmToMiles);
        Button milesToKmButton = findViewById(R.id.buttonConvMilesToKm);
        EditText kmText = findViewById(R.id.kiloInput);
        String km = kmText.getText().toString();
        EditText mileText = findViewById(R.id.milesInput);
    }
}
