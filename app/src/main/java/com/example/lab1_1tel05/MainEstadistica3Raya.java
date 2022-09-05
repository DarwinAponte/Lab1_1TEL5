package com.example.lab1_1tel05;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class MainEstadistica3Raya extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_estadistica3_raya);

        Intent intent = getIntent();
        List<String> statusPartido = intent.getStringArrayListExtra("partidas");

        TextView textView = findViewById(R.id.l3e_estadisticasValue);

        if(statusPartido !=null && !statusPartido.isEmpty()){
            int n=1;
            String reporte = "";
            for(String s: statusPartido){
                reporte = reporte +"Juego "+String.valueOf(n) + ": "+s+ "\n";
                //textView.setText(s);
                n++;
                Log.d("msg",s);
            }
            textView.setText(reporte);
        }else{
            textView.setText("Todavía no se ha iniciado una partida");
        }


    }

    public void NuevoJuego(View view){
        Intent intent = new Intent(this, MainTresEnRaya.class);
        startActivity(intent);
    }


}