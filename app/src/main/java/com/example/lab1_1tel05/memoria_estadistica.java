package com.example.lab1_1tel05;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.util.ArrayList;

public class memoria_estadistica extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_memoria_estadistica);

        Intent intent = getIntent();
        ArrayList<String> estadisticas = intent.getStringArrayListExtra("estadisticas");
        if (estadisticas != null && !estadisticas.isEmpty()) {
            String estadisticaStr = "";
            for (String i : estadisticas) {
                estadisticaStr = estadisticaStr + i + '\n';
            }
            TextView textView = findViewById(R.id.registro_memoria);
            textView.setTextAlignment(View.TEXT_ALIGNMENT_TEXT_START);
            textView.setText(estadisticaStr);
        }
    }

    public void nuevoJuego(View view) {
        Intent intent = new Intent(memoria_estadistica.this, memoria.class);
        startActivity(intent);
    }
}