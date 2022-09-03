package com.example.lab1_1tel05;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainTresEnRaya extends AppCompatActivity {

    //valores para saber el ganador
    int a=1;
    int b=4;

    int contador = 1;
    // row
    int winLine1 = 0;
    int winLine2 = 0;
    int winLine3 = 0;
    //column
    int winCol1 = 0;
    int winCol2 = 0;
    int winCol3 = 0;
    //diagonal
    int winDiagDown = 0;
    int winDiagUP = 0;

//    int matriz[][] = new int[3][3];


    int [][] matriz = {{0,0,0},{0,0,0},{0,0,0}};


    boolean estado = true;






    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_tres_en_raya);


        if(estado){
            Button btn11= (Button) findViewById(R.id.btn_11);
            btn11.setOnClickListener(view -> {
                TextView txt11=findViewById(R.id.btn_11);
                String sTxt11=txt11.getText().toString();
                if((contador % 2)==0){
                    txt11.setText("O");

                    //jugador1
                    matriz[0][0] = a;
                    contador ++;
                }else{
                    txt11.setText("X");

                    //jugador2
                    matriz[0][0] = b;
                    contador ++;
                }
                validarGanador();

            });

            Button btn12= (Button) findViewById(R.id.btn_12);
            btn12.setOnClickListener(view -> {
                TextView txt12=findViewById(R.id.btn_12);
                String sTxt12=txt12.getText().toString();
                if((contador % 2)==0){
                    txt12.setText("O");

                    //jugador1
                    matriz[0][1] = a;
                    contador ++;
                }else{
                    txt12.setText("X");

                    //jugador2
                    matriz[0][1] = b;
                    contador ++;
                }
                validarGanador();

            });

            Button btn13= (Button) findViewById(R.id.btn_13);
            btn13.setOnClickListener(view -> {
                TextView txt13=findViewById(R.id.btn_13);
                String sTxt12=txt13.getText().toString();
                if((contador % 2)==0){
                    txt13.setText("O");

                    //jugador1
                    matriz[0][2] = a;
                    contador ++;
                }else{
                    txt13.setText("X");

                    //jugador2
                    matriz[0][2] = b;
                    contador ++;
                }
                validarGanador();

            });



            Button btn21= (Button) findViewById(R.id.btn_21);
            btn21.setOnClickListener(view -> {
                TextView txt21=findViewById(R.id.btn_21);
                String sTxt21=txt21.getText().toString();
                if((contador % 2)==0){
                    txt21.setText("O");

                    //jugador1
                    matriz[1][0] = a;
                    contador ++;
                }else{
                    txt21.setText("X");

                    //jugador2
                    matriz[1][0] = b;
                    contador ++;
                }
                validarGanador();

            });

            Button btn22= (Button) findViewById(R.id.btn_22);
            btn22.setOnClickListener(view -> {
                TextView txt22=findViewById(R.id.btn_22);
                String sTxt22=txt22.getText().toString();
                if((contador % 2)==0){
                    txt22.setText("O");

                    //jugador1
                    matriz[1][1] = a;
                    contador ++;
                }else{
                    txt22.setText("X");

                    //jugador2
                    matriz[1][1] = b;
                    contador ++;
                }
                validarGanador();

            });

            Button btn23= (Button) findViewById(R.id.btn_23);
            btn23.setOnClickListener(view -> {
                TextView txt23=findViewById(R.id.btn_23);
                String sTxt23=txt23.getText().toString();
                if((contador % 2)==0){
                    txt23.setText("O");

                    //jugador1
                    matriz[1][2] = a;
                    contador ++;
                }else{
                    txt23.setText("X");

                    //jugador2
                    matriz[1][2] = b;
                    contador ++;
                }
                validarGanador();

            });



            Button btn31= (Button) findViewById(R.id.btn_31);
            btn31.setOnClickListener(view -> {
                TextView txt31=findViewById(R.id.btn_31);
                String sTxt31=txt31.getText().toString();
                if((contador % 2)==0){
                    txt31.setText("O");

                    //jugador1
                    matriz[2][0] = a;
                    contador ++;
                }else{
                    txt31.setText("X");

                    //jugador2
                    matriz[2][0] = b;
                    contador ++;
                }
                validarGanador();

            });

            Button btn32= (Button) findViewById(R.id.btn_32);
            btn32.setOnClickListener(view -> {
                TextView txt32=findViewById(R.id.btn_32);
                String sTxt32=txt32.getText().toString();
                if((contador % 2)==0){
                    txt32.setText("O");

                    //jugador1
                    matriz[2][1] = a;
                    contador ++;
                }else{
                    txt32.setText("X");

                    //jugador2
                    matriz[2][1] = b;
                    contador ++;
                }
                validarGanador();

            });

            Button btn33= (Button) findViewById(R.id.btn_33);
            btn33.setOnClickListener(view -> {
                TextView txt33=findViewById(R.id.btn_33);
                String sTxt33=txt33.getText().toString();
                if((contador % 2)==0){
                    txt33.setText("O");

                    //jugador1
                    matriz[2][2] = a;
                    contador ++;
                }else{
                    txt33.setText("X");

                    //jugador2
                    matriz[2][2] = b;
                    contador ++;
                }
                validarGanador();

            });

        }
    }

    public void nuevoJuego(View view){
        int [][] matriz = {{0,0,0},{0,0,0},{0,0,0}};

        TextView txt11=findViewById(R.id.btn_11);
        txt11.setText("-");

        TextView txt12=findViewById(R.id.btn_12);
        txt12.setText("-");

        TextView txt13=findViewById(R.id.btn_13);
        txt13.setText("-");


        TextView txt21=findViewById(R.id.btn_21);
        txt21.setText("-");

        TextView txt22=findViewById(R.id.btn_22);
        txt22.setText("-");

        TextView txt23=findViewById(R.id.btn_23);
        txt23.setText("-");


        TextView txt31=findViewById(R.id.btn_31);
        txt31.setText("-");

        TextView txt32=findViewById(R.id.btn_32);
        txt32.setText("-");

        TextView txt33=findViewById(R.id.btn_33);
        txt33.setText("-");

        TextView muestraResult= findViewById(R.id.l3_notificaciones);


        muestraResult.setText("");

    }


    //para validar
    private void validarGanador() {
        Log.d("turn", "-------------------");
        for (int x=0; x < matriz.length; x++) {
            System.out.print("|");
            for (int y=0; y < matriz[x].length; y++) {
                System.out.print (matriz[x][y]);
                if (y!=matriz[x].length-1) System.out.print("\t");
            }
            System.out.println("|");
        }

        TextView muestraResult= findViewById(R.id.l3_notificaciones);


        winDiagDown=matriz[0][0]+matriz[1][1]+matriz[2][2];
        winDiagUP=matriz[2][0]+matriz[1][1]+matriz[0][2];

        winLine1=matriz[0][0]+matriz[0][1]+matriz[0][2];
        winLine2=matriz[1][0]+matriz[1][1]+matriz[1][2];
        winLine3=matriz[2][0]+matriz[2][1]+matriz[2][2];

        winCol1=matriz[0][0]+matriz[1][0]+matriz[2][0];
        winCol2=matriz[0][1]+matriz[1][1]+matriz[2][1];
        winCol3=matriz[0][2]+matriz[1][2]+matriz[2][2];


        if(winLine1==3 || winLine2==3 || winLine3==3 ||
                winCol1==3 || winCol2==3 || winCol3==3 ||
                winDiagDown==3 || winDiagUP==3 ){
            muestraResult.setText("Ganó O");
        }
        if(winLine1==12 || winLine2==12 || winLine3==12 ||
                winCol1==12 || winCol2==12 ||winCol3==12 ||
                winDiagDown==12 ||winDiagUP==12){
            muestraResult.setText("Ganó X");
        }
    }
}