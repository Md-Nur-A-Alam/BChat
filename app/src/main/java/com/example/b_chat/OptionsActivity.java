package com.example.b_chat;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class OptionsActivity extends AppCompatActivity {

    ImageButton socialMedia, eCommerce, moneyTransection;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_options);

        socialMedia = findViewById(R.id.socialmedia);
        eCommerce = findViewById(R.id.ecommerce);
        moneyTransection = findViewById(R.id.moneytransection);

        socialMedia.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(OptionsActivity.this, MainActivity.class);
                startActivity(intent);
            }
        });

        eCommerce.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(OptionsActivity.this, MainActivity.class);
                startActivity(intent);
            }
        });

        moneyTransection.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(OptionsActivity.this, MainActivity.class);
                startActivity(intent);
            }
        });
    }
}