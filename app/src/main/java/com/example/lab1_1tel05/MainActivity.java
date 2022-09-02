package com.example.lab1_1tel05;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.View;
import android.widget.Button;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



    }
    public void irAMemoria(View view){
        Intent intent = new Intent(MainActivity.this, memoria.class);
        startActivityForResult(intent, 1);
    }

    public void JuegoTresEnRaya(View view){
        Intent intent= new Intent(MainActivity.this, MainTresEnRaya.class);
        startActivity(intent);
    }
}