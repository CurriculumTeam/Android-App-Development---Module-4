package com.example.m4l5a1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    our_fragment o;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        o = new our_fragment();
        getSupportFragmentManager().beginTransaction().replace(R.id.fragments,o).commit();
    }
}