package com.example.linearlayout;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
    }
    public void homeactivitybtn(View view){
        setContentView(R.layout.activity_main);
    }
    public void activity3btnsetting(View view){
        setContentView(R.layout.activity_main3);
    }
}