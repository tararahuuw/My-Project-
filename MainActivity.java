package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getSupportActionBar().setTitle("Login");
    }
    public void login(View v){
        Intent intent = new Intent(this, MainActivity3.class);
        startActivity(intent);
    }
    public void register(View v){
        Intent intent = new Intent(this, MainActivity2.class);
        startActivity(intent);
    }
}