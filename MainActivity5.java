package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity5 extends AppCompatActivity {
    int a;
    int b;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main5);

        getSupportActionBar().setTitle("Score Board");
    }

    public void next(View v) {
        Intent intent = new Intent(this, MainActivity4.class);
        startActivity(intent);
    }
    public void point1(View v){
        a = a + 1;
        display1(a);
    }

    public void point2(View v){
        a = a + 2;
        display1(a);
    }

    public void point3(View v){
        a = a + 3;
        display1(a);
    }

    public void point1b(View v){
        b = b + 1;
        displayb2(b);
    }

    public void point2b(View v){
        b = b + 2;
        displayb2(b);
    }

    public void point3b(View v){
        b = b + 3;
        displayb2(b);
    }

    public void display1(int x){
        TextView boardA = (TextView) findViewById(R.id.display);
        boardA.setText(""+ x);
    }
    public void displayb2(int x){
        TextView boardB = (TextView) findViewById(R.id.displayb);
        boardB.setText(""+ x);
    }
    public void Clear(View v){
        a = 0;
        b = 0;
        display1(a);
        displayb2(b);
    }
}