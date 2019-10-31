package com.example.syllabusapk;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity {
    /*Adding the Imagebuttons */
    ImageButton btechbutton, pucbutton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btechbutton = findViewById(R.id.btech_button);
        pucbutton = findViewById(R.id.puc_button);

        btechbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentLoadActivity_btech = new Intent(MainActivity.this, Activity_btech.class);
                startActivity(intentLoadActivity_btech);
            }
        });

        pucbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentLoadactivity_puc = new Intent(MainActivity.this, activity_puc.class);
                startActivity(intentLoadactivity_puc);
            }
        });
    }
}

