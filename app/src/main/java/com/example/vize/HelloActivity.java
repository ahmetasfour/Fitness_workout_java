package com.example.vize;

// HelloActivity.java
import android.app.Activity;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

public class HelloActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.home);
    }
}