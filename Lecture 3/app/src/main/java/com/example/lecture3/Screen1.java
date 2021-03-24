package com.example.lecture3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Screen1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_screen1);
    }
    public void mainScreen(View view) {
        Intent intent = new Intent(this,MainActivity.class);
        startActivity(intent);
    }
}