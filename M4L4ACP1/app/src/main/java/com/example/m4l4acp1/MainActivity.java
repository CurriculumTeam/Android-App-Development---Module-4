package com.example.m4l4acp1;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    TextView ques;
    EditText ansgiven;
    String ans;
    Button submit;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ques = (TextView) findViewById(R.id.textView);
        ansgiven = (EditText)findViewById(R.id.editTextTextPersonName);
        submit = (Button) findViewById(R.id.button);

        customdatatype d[] = new customdatatype[5];
        d[0] = new customdatatype("What is currency of India","rupee");
        d[1] = new customdatatype("What is capital of Pakistan","islamabad");
        d[2] = new customdatatype("What is capital of India","Delhi");
        d[3] = new customdatatype("What is currency of India","rupee");
        d[4] = new customdatatype("What is currency of India","rupee");

        Random randomNumber = new Random();

        int numberGenerated = randomNumber.nextInt(5 - 0) + 0;
        ques.setText(d[numberGenerated].quizquestion);
        ans =  d[numberGenerated].quizans;

        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(ansgiven.getText().toString().toLowerCase().equals(ans))
                {
                    int numberGenerated = randomNumber.nextInt(5 - 0) + 0;
                    ques.setText(d[numberGenerated].quizquestion);
                    ans =  d[numberGenerated].quizans;
                    Toast.makeText(MainActivity.this, "Correct!! Answer!!",
                            Toast.LENGTH_LONG).show();
                    ansgiven.setText("");
                }
            }
        });

    }
}