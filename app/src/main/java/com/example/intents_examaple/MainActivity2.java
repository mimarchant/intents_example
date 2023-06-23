package com.example.intents_examaple;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        initListeners();
    }


    private void initListeners() {
        Button implicitIntentButtton = findViewById(R.id.gotoBtn);
        Button backButton = findViewById(R.id.backBtn);

        implicitIntentButtton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent implicitIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://google.com"));
                startActivity(implicitIntent);
            }
        });

        backButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent goBack = new Intent(MainActivity2.this, MainActivity.class);
                startActivity(goBack);
            }
        });
    }
}