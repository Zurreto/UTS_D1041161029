package com.example.d1041161029_chavin_lorento;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void launch5(View view) {
        Intent intent = new Intent(MainActivity.this, SixthActivity.class);
        startActivity(intent);
    }

    public void launch4(View view) {
        Intent intent = new Intent(MainActivity.this, FifthActivity.class);
        startActivity(intent);
    }

    public void launch3(View view) {
        Intent intent = new Intent(MainActivity.this, FourthActivity.class);
        startActivity(intent);
    }

    public void launch2(View view) {
        Intent intent = new Intent(MainActivity.this, ThirdActivity.class);
        startActivity(intent);
    }

    public void launch1(View view) {
        Intent intent = new Intent(MainActivity.this, SecondActivity.class);
        startActivity(intent);
    }
}
