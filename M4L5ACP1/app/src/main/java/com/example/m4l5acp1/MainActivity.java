package com.example.m4l5acp1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    Fragmentclassa a;
    Fragmentclassb b;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        a = new Fragmentclassa();
        b = new Fragmentclassb();
        getSupportFragmentManager().beginTransaction().replace(R.id.fragmentsa,a)
                .replace(R.id.fragmentsb,b).commit();

    }
}