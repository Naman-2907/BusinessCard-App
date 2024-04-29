package com.example.businesscardapp;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private ImageView logoImageView;
    private TextView nameTextView, titleTextView, phoneTextView, emailTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        logoImageView = findViewById(R.id.logoImageView);
        nameTextView = findViewById(R.id.nameTextView);
        titleTextView = findViewById(R.id.titleTextView);
        phoneTextView = findViewById(R.id.phoneTextView);
        emailTextView = findViewById(R.id.emailTextView);

        // Set your name, title, phone number, and email address
        nameTextView.setText("Naman Jain");
        titleTextView.setText("Junior Developer");
        phoneTextView.setText("Phone: +1 2014238426");
        emailTextView.setText("Email: namannj2907@gmail.com");
    }
}
