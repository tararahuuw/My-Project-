package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity4 extends AppCompatActivity {

    int qty = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);

        getSupportActionBar().setTitle("Incerement - Decrement");
    }

    public void next(View v) {
        Intent intent = new Intent(this, MainActivity5.class);
        startActivity(intent);
    }

    public void increment(View v) {
        qty = qty + 1;
        display(qty);
    }

    public void decrement(View v) {
        qty = qty - 1;
        display(qty);
    }

    public void display(int x) {
        TextView angka = (TextView) findViewById(R.id.jumlah);
        angka.setText("" + x);
    }
}