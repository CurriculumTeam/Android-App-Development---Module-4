package com.example.m4l5a2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
    FragmentA a;
    FragmentsB b;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        a = new FragmentA();
        b = new FragmentsB();

        getSupportFragmentManager().beginTransaction()
                .replace(R.id.placefora,a).replace(R.id.placeforb,b).commit();
    }
}