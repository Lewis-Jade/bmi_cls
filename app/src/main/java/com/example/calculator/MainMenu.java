package com.example.calculator;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainMenu extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_menu);
        ImageView bmiCalculator = findViewById(R.id.bmicalc);
        ImageView myCalculator = findViewById(R.id.calculator);
        TextView bmiNav = findViewById(R.id.bminav);
        TextView calcNav = findViewById(R.id.calcnav);


        bmiCalculator.setOnClickListener(view -> {
            Intent intent = new Intent(MainMenu.this,BmiCalculatorActivity.class);
            startActivity(intent);
            overridePendingTransition(android.R.anim.slide_in_left, android.R.anim.slide_out_right);

        } );


        myCalculator.setOnClickListener(view -> {
            Intent intent = new Intent(MainMenu.this,MainActivity.class);
            startActivity(intent);
            overridePendingTransition(android.R.anim.slide_in_left,android.R.anim.slide_out_right);

        });

        bmiNav.setOnClickListener(view -> {
            Intent intent = new Intent(MainMenu.this,BmiCalculatorActivity.class);
            startActivity(intent);
            overridePendingTransition(android.R.anim.slide_in_left,android.R.anim.slide_out_right);

        });
        calcNav.setOnClickListener(view -> {
            Intent intent = new Intent(MainMenu.this,MainActivity.class);
            startActivity(intent);
            overridePendingTransition(android.R.anim.slide_in_left,android.R.anim.slide_out_right);

        });




    }
}