package com.example.calculator;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;

import androidx.appcompat.app.AppCompatActivity;

@SuppressLint("CustomSplashScreen")
public class SplashActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.splash_screen);

       // Delay 2s the go to main menu

        new Handler(Looper.getMainLooper()).postDelayed(()->{
            Intent intent = new Intent(SplashActivity.this, MainMenu.class);
            startActivity(intent);
            finish();
        },2000);

    }
}