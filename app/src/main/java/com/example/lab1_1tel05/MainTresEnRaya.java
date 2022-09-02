package com.example.lab1_1tel05;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

public class MainTresEnRaya extends AppCompatActivity {

    int contador = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_tres_en_raya);



        Button btn11= (Button) findViewById(R.id.btn_11);
        btn11.setOnClickListener(view -> {
            TextView txt11=findViewById(R.id.btn_11);
            String sTxt11=txt11.getText().toString();
            if((contador % 2)==0){
                txt11.setText("O");
                contador ++;
            }else{
                txt11.setText("X");
                contador ++;
            }
        });

        Button btn12= (Button) findViewById(R.id.btn_12);
        btn12.setOnClickListener(view -> {
            TextView txt12=findViewById(R.id.btn_12);
            String sTxt12=txt12.getText().toString();
            if((contador % 2)==0){
                txt12.setText("O");
                contador ++;
            }else{
                txt12.setText("X");
                contador ++;
            }
        });

        Button btn13= (Button) findViewById(R.id.btn_13);
        btn13.setOnClickListener(view -> {
            TextView txt13=findViewById(R.id.btn_13);
            String sTxt12=txt13.getText().toString();
            if((contador % 2)==0){
                txt13.setText("O");
                contador ++;
            }else{
                txt13.setText("X");
                contador ++;
            }
        });




        Button btn21= (Button) findViewById(R.id.btn_21);
        btn21.setOnClickListener(view -> {
            TextView txt21=findViewById(R.id.btn_21);
            String sTxt21=txt21.getText().toString();
            if((contador % 2)==0){
                txt21.setText("O");
                contador ++;
            }else{
                txt21.setText("X");
                contador ++;
            }
        });

        Button btn22= (Button) findViewById(R.id.btn_22);
        btn22.setOnClickListener(view -> {
            TextView txt22=findViewById(R.id.btn_22);
            String sTxt22=txt22.getText().toString();
            if((contador % 2)==0){
                txt22.setText("O");
                contador ++;
            }else{
                txt22.setText("X");
                contador ++;
            }
        });

        Button btn23= (Button) findViewById(R.id.btn_23);
        btn23.setOnClickListener(view -> {
            TextView txt23=findViewById(R.id.btn_23);
            String sTxt23=txt23.getText().toString();
            if((contador % 2)==0){
                txt23.setText("O");
                contador ++;
            }else{
                txt23.setText("X");
                contador ++;
            }
        });





        Button btn31= (Button) findViewById(R.id.btn_31);
        btn31.setOnClickListener(view -> {
            TextView txt31=findViewById(R.id.btn_31);
            String sTxt31=txt31.getText().toString();
            if((contador % 2)==0){
                txt31.setText("O");
                contador ++;
            }else{
                txt31.setText("X");
                contador ++;
            }
        });

        Button btn32= (Button) findViewById(R.id.btn_32);
        btn32.setOnClickListener(view -> {
            TextView txt32=findViewById(R.id.btn_32);
            String sTxt32=txt32.getText().toString();
            if((contador % 2)==0){
                txt32.setText("O");
                contador ++;
            }else{
                txt32.setText("X");
                contador ++;
            }
        });

        Button btn33= (Button) findViewById(R.id.btn_33);
        btn33.setOnClickListener(view -> {
            TextView txt33=findViewById(R.id.btn_33);
            String sTxt33=txt33.getText().toString();
            if((contador % 2)==0){
                txt33.setText("O");
                contador ++;
            }else{
                txt33.setText("X");
                contador ++;
            }
        });






    }
}