package com.example.lab1_1tel05;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }

    public void JuegoTresEnRaya(View view){
        Intent intent= new Intent(MainActivity.this, MainTresEnRaya.class);
        startActivity(intent);
    }
}