package com.example.lab1_1tel05;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.provider.Settings;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class memoria extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_memoria);
        ArrayList<String> letras = new ArrayList();
        Random rndm = new Random();
        letras.add("A");
        letras.add("A");
        letras.add("B");
        letras.add("B");
        letras.add("C");
        letras.add("C");
        letras.add("D");
        letras.add("D");
        letras.add("E");
        letras.add("E");
        letras.add("F");
        letras.add("F");
        letras.add("G");
        letras.add("G");
        letras.add("H");
        letras.add("H");
        Collections.shuffle(letras, rndm);
        Log.d("lista",""+letras);

        Button btn1 = findViewById(R.id.button1);
        btn1.setText(String.valueOf(letras.get(0)));
        Button btn2= findViewById(R.id.button2);
        btn2.setText(String.valueOf(letras.get(1)));
        Button btn3= findViewById(R.id.button3);
        btn3.setText(String.valueOf(letras.get(2)));
        Button btn4= findViewById(R.id.button4);
        btn4.setText(String.valueOf(letras.get(3)));
        Button btn5= findViewById(R.id.button5);
        btn5.setText(String.valueOf(letras.get(4)));
        Button btn6= findViewById(R.id.button6);
        btn6.setText(String.valueOf(letras.get(5)));
        Button btn7= findViewById(R.id.button7);
        btn7.setText(String.valueOf(letras.get(6)));
        Button btn8= findViewById(R.id.button8);
        btn8.setText(String.valueOf(letras.get(7)));
        Button btn9= findViewById(R.id.button9);
        btn9.setText(String.valueOf(letras.get(8)));
        Button btn10= findViewById(R.id.button10);
        btn10.setText(String.valueOf(letras.get(9)));
        Button btn11= findViewById(R.id.button11);
        btn11.setText(String.valueOf(letras.get(10)));
        Button btn12= findViewById(R.id.button12);
        btn12.setText(String.valueOf(letras.get(11)));
        Button btn13= findViewById(R.id.button13);
        btn13.setText(String.valueOf(letras.get(12)));
        Button btn14= findViewById(R.id.button14);
        btn14.setText(String.valueOf(letras.get(13)));
        Button btn15= findViewById(R.id.button15);
        btn15.setText(String.valueOf(letras.get(14)));
        Button btn16= findViewById(R.id.button16);
        btn16.setText(String.valueOf(letras.get(15)));
    }

    public void nuevoJuego(View view){
        ArrayList<String> letras = new ArrayList();
        Random rndm = new Random();
        Collections.shuffle(letras, rndm);
        Button btn1 = findViewById(R.id.button1);
        btn1.setText(String.valueOf(letras.get(0)));
        Button btn2= findViewById(R.id.button2);
        btn2.setText(String.valueOf(letras.get(1)));
        Button btn3= findViewById(R.id.button3);
        btn3.setText(String.valueOf(letras.get(2)));
        Button btn4= findViewById(R.id.button4);
        btn4.setText(String.valueOf(letras.get(3)));
        Button btn5= findViewById(R.id.button5);
        btn5.setText(String.valueOf(letras.get(4)));
        Button btn6= findViewById(R.id.button6);
        btn6.setText(String.valueOf(letras.get(5)));
        Button btn7= findViewById(R.id.button7);
        btn7.setText(String.valueOf(letras.get(6)));
        Button btn8= findViewById(R.id.button8);
        btn8.setText(String.valueOf(letras.get(7)));
        Button btn9= findViewById(R.id.button9);
        btn9.setText(String.valueOf(letras.get(8)));
        Button btn10= findViewById(R.id.button10);
        btn10.setText(String.valueOf(letras.get(9)));
        Button btn11= findViewById(R.id.button11);
        btn11.setText(String.valueOf(letras.get(10)));
        Button btn12= findViewById(R.id.button12);
        btn12.setText(String.valueOf(letras.get(11)));
        Button btn13= findViewById(R.id.button13);
        btn13.setText(String.valueOf(letras.get(12)));
        Button btn14= findViewById(R.id.button14);
        btn14.setText(String.valueOf(letras.get(13)));
        Button btn15= findViewById(R.id.button15);
        btn15.setText(String.valueOf(letras.get(14)));
        Button btn16= findViewById(R.id.button16);
        btn16.setText(String.valueOf(letras.get(15)));


    }
}