package com.example.basicinput;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
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
        Button decrement = findViewById(R.id.decrement);
        decrement.setClickable(false);

    }

    /**
     * This method will increase the number of cups of coffee by 1.
     */
    public void incrementValue(View view){
        quantity = quantity + 1;
        Button decrement = findViewById(R.id.decrement);
        decrement.setClickable(true);
        this.display(quantity);
    }

    /**
     * This method will decrease the number of cups of coffee by 1.
     */
    public void decrementValue(View view){
        quantity = quantity - 1;
        if(quantity <= 0){
            Button decrement = findViewById(R.id.decrement);
            decrement.setClickable(false);
        }
        display(quantity);
    }

    /**
     * This method is called when order button is clicked.
     * @param view
     */
    public void submitOrder(View view){
        String message = "Price: " + String.valueOf(quantity * 50) + "\nThank You!";
        displayMessage(message);

//        displayPrice(quantity);
    }

    /**
     * This method displays the given quantity value on screen.
     * @param number
     */
    public void display(int number) {
        TextView quantity = findViewById(R.id.result_text_view);
        quantity.setText(String.valueOf(number));
    }

    /**
     * This method displays the given text on screen.
     * @param message
     */
    public void displayMessage(String message){
        TextView result = findViewById(R.id.total_display);
        result.setText(message);
    }
    /**
     * This method displays the given quantity value on screen.
     * @param number
     */
    public void displayPrice(int number){
        TextView price = findViewById(R.id.total_display);
        price.setText(NumberFormat.getCurrencyInstance().format(number));
    }


}
