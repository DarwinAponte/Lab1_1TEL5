package com.example.lab1_1tel05;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.time.Instant;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;
import java.util.HashMap;

public class memoria extends AppCompatActivity {
    private final ArrayList<String> letras = new ArrayList();
    private final ArrayList<String> letrasExtraidas = new ArrayList();
    private final ArrayList<Integer> matched = new ArrayList();
    public ArrayList<String> estadisticas = new ArrayList();
    private final int[] botonesId = {R.id.button1,R.id.button2,R.id.button3,R.id.button4,
            R.id.button5,R.id.button6,R.id.button7,R.id.button8,R.id.button9,R.id.button10,R.id.button11,R.id.button12,R.id.button13,R.id.button14,R.id.button15};
    private final  ArrayList<Integer> numeroBotonPresionado = new ArrayList();
    private final ArrayList<Button> botones = new ArrayList();


    private Instant start, end;
    Handler handler = new Handler();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_memoria);


        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
            start = Instant.now();
        }
        //ArrayList<String> letras = new ArrayList();
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


        Button btn1 = findViewById(R.id.button1);
        botones.add(btn1);
        btn1.setText(String.valueOf(letras.get(0)));

        btn1.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v){

                btn1.setText(String.valueOf(letras.get(0)));
                memoria(0);
            }
        });

        Button btn2= findViewById(R.id.button2);
        btn2.setText(String.valueOf(letras.get(1)));
        botones.add(btn2);
        btn2.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v){
                btn2.setText(String.valueOf(letras.get(1)));
                memoria(1);
            }


        });

        Button btn3= findViewById(R.id.button3);
        btn3.setText(String.valueOf(letras.get(2)));
        botones.add(btn3);
        btn3.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v){
                btn3.setText(String.valueOf(letras.get(2)));
                memoria(2);
            }

        });

        Button btn4= findViewById(R.id.button4);
        btn4.setText(String.valueOf(letras.get(3)));
        botones.add(btn4);
        btn4.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v){
                btn4.setText(String.valueOf(letras.get(3)));
                memoria(3);
            }


        });


        Button btn5= findViewById(R.id.button5);
        btn5.setText(String.valueOf(letras.get(4)));
        botones.add(btn5);
        btn5.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v){
                btn5.setText(String.valueOf(letras.get(4)));
                memoria(4);
            }


        });


        Button btn6= findViewById(R.id.button6);
        botones.add(btn6);
        btn6.setText(String.valueOf(letras.get(5)));
        btn6.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v){
                btn6.setText(String.valueOf(letras.get(5)));
                memoria(5);
            }


        });


        Button btn7= findViewById(R.id.button7);
        botones.add(btn7);
        btn7.setText(String.valueOf(letras.get(6)));
        btn7.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v){
                btn7.setText(String.valueOf(letras.get(6)));
                memoria(6);
            }


        });

        Button btn8= findViewById(R.id.button8);
        botones.add(btn8);
        btn8.setText(String.valueOf(letras.get(7)));
        btn8.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v){
                btn8.setText(String.valueOf(letras.get(7)));
                memoria(7);
            }


        });

        Button btn9= findViewById(R.id.button9);
        botones.add(btn9);
        btn9.setText(String.valueOf(letras.get(8)));
        btn9.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v){
                btn9.setText(String.valueOf(letras.get(8)));
                memoria(8);
            }


        });

        Button btn10= findViewById(R.id.button10);
        botones.add(btn10);
        btn10.setText(String.valueOf(letras.get(9)));
        btn10.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v){
                btn10.setText(String.valueOf(letras.get(9)));
                memoria(9);
            }


        });

        Button btn11= findViewById(R.id.button11);
        botones.add(btn11);
        btn11.setText(String.valueOf(letras.get(10)));
        btn11.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v){
                btn11.setText(String.valueOf(letras.get(10)));
                memoria(10);
            }
        });

        Button btn12= findViewById(R.id.button12);
        botones.add(btn12);
        btn12.setText(String.valueOf(letras.get(11)));
        btn12.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v){
                btn12.setText(String.valueOf(letras.get(11)));
                memoria(11);
            }
        });

        Button btn13= findViewById(R.id.button13);
        botones.add(btn13);
        btn13.setText(String.valueOf(letras.get(12)));
        btn13.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v){
                btn13.setText(String.valueOf(letras.get(12)));
                memoria(12);
            }
        });

        Button btn14= findViewById(R.id.button14);
        botones.add(btn14);
        btn14.setText(String.valueOf(letras.get(13)));
        btn14.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v){
                btn14.setText(String.valueOf(letras.get(13)));
                memoria(13);
            }
        });

        Button btn15= findViewById(R.id.button15);
        botones.add(btn15);
        btn15.setText(String.valueOf(letras.get(14)));
        btn15.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v){
                btn15.setText(String.valueOf(letras.get(14)));
                memoria(14);
            }
        });

        Button btn16= findViewById(R.id.button16);
        botones.add(btn16);
        btn16.setText(String.valueOf(letras.get(15)));
        btn16.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v){
                btn16.setText(String.valueOf(letras.get(15)));
                memoria(15);
            }
        });


        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                btn1.setText("-");
                btn2.setText("-");
                btn3.setText("-");
                btn4.setText("-");
                btn5.setText("-");
                btn6.setText("-");
                btn7.setText("-");
                btn8.setText("-");
                btn9.setText("-");
                btn10.setText("-");
                btn11.setText("-");
                btn12.setText("-");
                btn13.setText("-");
                btn14.setText("-");
                btn15.setText("-");
                btn16.setText("-");
            }
        }, 1000);
    }

   public void nuevoJuego(View view){
        Random rndm = new Random();
        Handler handler = new Handler();
        Collections.shuffle(letras, rndm);
        matched.clear();
        TextView tiempo = (TextView) findViewById(R.id.msg);
        tiempo.setText("");

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


        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                Button btn1 = findViewById(R.id.button1);
                btn1.setText("-");
                Button btn2= findViewById(R.id.button2);
                btn2.setText("-");
                Button btn3= findViewById(R.id.button3);
                btn3.setText("-");
                Button btn4= findViewById(R.id.button4);
                btn4.setText("-");
                Button btn5= findViewById(R.id.button5);
                btn5.setText("-");
                Button btn6= findViewById(R.id.button6);
                btn6.setText("-");
                Button btn7= findViewById(R.id.button7);
                btn7.setText("-");
                Button btn8= findViewById(R.id.button8);
                btn8.setText("-");
                Button btn9= findViewById(R.id.button9);
                btn9.setText("-");
                Button btn10= findViewById(R.id.button10);
                btn10.setText("-");
                Button btn11= findViewById(R.id.button11);
                btn11.setText("-");
                Button btn12= findViewById(R.id.button12);
                btn12.setText("-");
                Button btn13= findViewById(R.id.button13);
                btn13.setText("-");
                Button btn14= findViewById(R.id.button14);
                btn14.setText("-");
                Button btn15= findViewById(R.id.button15);
                btn15.setText("-");
                Button btn16= findViewById(R.id.button16);
                btn16.setText("-");
            }
        }, 1000);

        if(matched.size() < 8){
            String estadistica = "Juego " + (estadisticas.size() + 1) + " : " + "Canceló";
            estadisticas.add(estadistica);
        }

    }

    public void memoriaEstadisticas(View view){
        Intent intent= new Intent(memoria.this, memoria_estadistica.class);
        intent.putExtra("estadisticas", estadisticas);
        startActivity(intent);
    }

   public void memoria(int i){
       if(letrasExtraidas.size()<=2) {
           letrasExtraidas.add(letras.get(i));
           numeroBotonPresionado.add(i);
           Log.d("msg", "botonrd presionados" + numeroBotonPresionado);
           if (letrasExtraidas.size() == 2) {
               if (letrasExtraidas.get(0) != letrasExtraidas.get(1)) {
                   Button boton = (Button) findViewById(botonesId[numeroBotonPresionado.get(0)]);

                   handler.postDelayed(new Runnable() {
                       @Override
                       public void run() {
                           botones.get(i).setText("-");
                           boton.setText("-");

                       }
                   }, 1000);
               }
               if(letrasExtraidas.get(0) == letrasExtraidas.get(1)){
                   matched.add(1);
                   Log.d("msg", String.valueOf(matched.size()));
                   if(matched.size()==8){
                       if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
                           end = Instant.now();
                       }
                       if (android.os.Build.VERSION.SDK_INT >= android.os.Build.VERSION_CODES.O) {
                           long seconds = end.getEpochSecond() - start.getEpochSecond();

                           Log.d("msg", String.valueOf(seconds));
                           String tiempo_partida = "Terminó en " + Math.round((seconds/60.0)*100.0)/100.0 + " minutos";

                           String estadistica = "Juego " + (estadisticas.size() + 1) + " : " + tiempo_partida;
                           estadisticas.add(estadistica);

                           TextView msg = (TextView) findViewById(R.id.msg);
                           msg.setText(tiempo_partida);
                       }
                       matched.clear();
                   }
               }
               letrasExtraidas.clear();
               numeroBotonPresionado.clear();
           }
       }
   }
}