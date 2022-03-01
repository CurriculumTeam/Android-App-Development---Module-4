package com.example.m4l2a2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.RadioButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private CheckBox cs,pubg,valo,apex,gta;
    private Button btn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        cs = (CheckBox) findViewById(R.id.csgo);
        pubg = (CheckBox) findViewById(R.id.pubg);
        valo = (CheckBox) findViewById(R.id.valo);
        apex = (CheckBox) findViewById(R.id.apex);
        gta = (CheckBox) findViewById(R.id.gta);

        btn = (Button) findViewById(R.id.button);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String str ="Games you play ";
                if(cs.isChecked())
                {
                    str += "Csgo ";
                }
                if(pubg.isChecked())
                {
                    str += "Pubg ";
                }
                if(gta.isChecked())
                {
                    str += "Gta ";
                }
                if(valo.isChecked())
                {
                    str += "Valorant ";
                }
                if(apex.isChecked())
                {
                    str += "Apex ";
                }
                Toast.makeText(getApplicationContext(), str, Toast.LENGTH_LONG).show();
            }
        });

    }
}