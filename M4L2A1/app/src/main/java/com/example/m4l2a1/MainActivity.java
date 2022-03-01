package com.example.m4l2a1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private RadioGroup genderGroup;
    private RadioButton gender;
    private Button showGender;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        genderGroup = (RadioGroup) findViewById(R.id.radiogroup);
        showGender = (Button) findViewById(R.id.button);

        showGender.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int id = genderGroup.getCheckedRadioButtonId();
                gender = (RadioButton)findViewById(id);
                Toast.makeText(MainActivity.this,gender.getText(),Toast.LENGTH_SHORT).show();
            }
        });
    }
}