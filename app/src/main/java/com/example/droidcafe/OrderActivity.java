package com.example.droidcafe;

import static com.example.droidcafe.R.id.sameday;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.RadioButton;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class OrderActivity extends AppCompatActivity implements View.OnClickListener{

    private static final String TAG_ACTIVITY = OrderActivity.class.getSimpleName();
    RadioButton same, next, pick;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_order);




        same = findViewById(R.id.sameday);
        same.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(checked(view)){
                    displayToast(getString(R.string.chosen) +
                            getString(R.string.same_day_messenger_service));

                }
                if(!checked(view)){
                    Log.d(TAG_ACTIVITY, getString(R.string.nothing_clicked));
                }

            }
        });

        next = findViewById(R.id.nextday);
        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(checked(view)){
                    displayToast(getString(R.string.chosen) +
                            getString(R.string.next_day_ground_delivery));

                }
                if(!checked(view)){
                    Log.d(TAG_ACTIVITY, getString(R.string.nothing_clicked));
                }
            }
        });

        pick = findViewById(R.id.pickup);
        pick.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(checked(view)){
                    displayToast(getString(R.string.chosen) +
                            getString(R.string.pick_up));
                }
                if(!checked(view)){
                    Log.d(TAG_ACTIVITY, getString(R.string.nothing_clicked));
                }
            }
        });


    }

    public void displayToast(String message){
         Toast.makeText(getApplicationContext(),
                message,
                Toast.LENGTH_SHORT).show();
    }

    public  boolean  checked(View view){
        boolean checked = ((RadioButton) view).isChecked();
        return checked;
    }


    @Override
    public void onClick(View view) {

    }
}
