package com.example.droidcafe;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    ImageView donut, iceCream, froyo;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.content_main);

        donut = findViewById(R.id.donut);
        donut.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               showDonutOrder(view);
            }
        });

        iceCream = findViewById(R.id.ice_cream);
        iceCream.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showIceCreamOrder(view);
            }
        });

        froyo = findViewById(R.id.froyo);
        froyo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showFroyoOrder(view);
            }
        });

    }

    /**
     *
     * @param message
     */
    public void displayToast(String message){ Toast.makeText(getApplicationContext(),
            message,
            Toast.LENGTH_SHORT).show();}


    /**
     *
     * @param message
     */
    public void showFoodOrder(String message){
        displayToast(message);
        Intent intent = new Intent(this, OrderActivity.class);
        startActivity(intent);
    }


    /**
     * Shows a message that the donut image was clicked.
     */
    public void showDonutOrder(View view) {
        showFoodOrder(getString(R.string.donut_order_message));
    }
    /**
     * Shows a message that the ice cream sandwich image was clicked.
     */
    public void showIceCreamOrder(View view) {
        showFoodOrder(getString(R.string.ice_cream_order_message));
    }
    /**
     * Shows a message that the froyo image was clicked.
     */
    public void showFroyoOrder(View view) {
        showFoodOrder(getString(R.string.froyo_order_message));
    }

    @Override
    public void onClick(View view) {

    }
}



