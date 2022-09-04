package com.example.lab1_1tel05;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class memoria extends AppCompatActivity {
    private final ArrayList<String> letras = new ArrayList();
    private final ArrayList<String> letrasExtraidas = new ArrayList();
    private final int[] botonesId = {R.id.button1,R.id.button2,R.id.button3,R.id.button4,
            R.id.button5,R.id.button6,R.id.button7,R.id.button8,R.id.button9,R.id.button10,R.id.button11,R.id.button12,R.id.button13,R.id.button14,R.id.button15};
    private final  ArrayList<Integer> numeroBotonPresionado = new ArrayList();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_memoria);
        //ArrayList<String> letras = new ArrayList();
        Random rndm = new Random();
        Handler handler = new Handler();
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
        Log.d("msg","se crea lista en on create");
        Button btn1 = findViewById(R.id.button1);
        btn1.setText(String.valueOf(letras.get(0)));

        btn1.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v){

                btn1.setText(String.valueOf(letras.get(0)));

                if(letrasExtraidas.size()<=2){
                    letrasExtraidas.add(letras.get(0));
                    numeroBotonPresionado.add(0);
                    Log.d("msg","botonrd presionados"+numeroBotonPresionado);
                    if(letrasExtraidas.size()==2){
                        if(letrasExtraidas.get(0) != letrasExtraidas.get(1)){
                            int primerboton= numeroBotonPresionado.get(1);
                            Log.d("msg","primer boton presionado: "+primerboton);
                            Button boton = (Button) findViewById(botonesId[numeroBotonPresionado.get(0)]);
                            handler.postDelayed(new Runnable() {
                                @Override
                                public void run() {
                                    btn1.setText("-");
                                    boton.setText("-");
                                }
                            }, 1000);

                        }
                        letrasExtraidas.clear();
                        numeroBotonPresionado.clear();
                    }

                }
            }


        });

        Button btn2= findViewById(R.id.button2);
        btn2.setText(String.valueOf(letras.get(1)));

        btn2.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v){
                btn2.setText(String.valueOf(letras.get(1)));
                numeroBotonPresionado.add(1);
                Log.d("msg",""+numeroBotonPresionado);
                if(letrasExtraidas.size()<=2){
                    letrasExtraidas.add(letras.get(1));
                    if(letrasExtraidas.size()==2){
                        if(letrasExtraidas.get(0) != letrasExtraidas.get(1)){

                            Button boton = (Button) findViewById(botonesId[numeroBotonPresionado.get(0)]);
                            handler.postDelayed(new Runnable() {
                                @Override
                                public void run() {
                                    btn2.setText("-");
                                    boton.setText("-");
                                }
                            }, 1000);

                        }
                        letrasExtraidas.clear();
                        numeroBotonPresionado.clear();
                    }
                }
            }


        });

        Button btn3= findViewById(R.id.button3);
        btn3.setText(String.valueOf(letras.get(2)));

        btn3.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v){
                btn3.setText(String.valueOf(letras.get(2)));
                if(letrasExtraidas.size()<=2){
                    letrasExtraidas.add(letras.get(2));
                    numeroBotonPresionado.add(2);
                    if(letrasExtraidas.size()==2){
                        if(letrasExtraidas.get(0) != letrasExtraidas.get(1)){
                            Button boton = (Button) findViewById(botonesId[numeroBotonPresionado.get(0)]);
                            handler.postDelayed(new Runnable() {
                                @Override
                                public void run() {
                                    btn3.setText("-");
                                    boton.setText("-");
                                }
                            }, 1000);

                        }
                        letrasExtraidas.clear();
                        numeroBotonPresionado.clear();
                    }
                }
            }

        });

        Button btn4= findViewById(R.id.button4);
        btn4.setText(String.valueOf(letras.get(3)));

        btn4.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v){
                btn4.setText(String.valueOf(letras.get(3)));
                if(letrasExtraidas.size()<=2){
                    letrasExtraidas.add(letras.get(3));
                    numeroBotonPresionado.add(3);
                    if(letrasExtraidas.size()==2){
                        if(letrasExtraidas.get(0) != letrasExtraidas.get(1)){
                            Button boton = (Button) findViewById(botonesId[numeroBotonPresionado.get(0)]);
                            handler.postDelayed(new Runnable() {
                                @Override
                                public void run() {
                                    btn4.setText("-");
                                    boton.setText("-");
                                }
                            }, 1000);

                        }
                        letrasExtraidas.clear();
                        numeroBotonPresionado.clear();
                    }
                }
            }


        });


        Button btn5= findViewById(R.id.button5);
        btn5.setText(String.valueOf(letras.get(4)));

        btn5.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v){
                btn5.setText(String.valueOf(letras.get(4)));
                if(letrasExtraidas.size()<=2){
                    letrasExtraidas.add(letras.get(4));
                    numeroBotonPresionado.add(4);
                    if(letrasExtraidas.size()==2){
                        if(letrasExtraidas.get(0) != letrasExtraidas.get(1)){
                            Button boton = (Button) findViewById(botonesId[numeroBotonPresionado.get(0)]);
                            handler.postDelayed(new Runnable() {
                                @Override
                                public void run() {
                                    btn5.setText("-");
                                    boton.setText("-");
                                }
                            }, 1000);

                        }
                        letrasExtraidas.clear();
                        numeroBotonPresionado.clear();
                    }
                }
            }


        });


        Button btn6= findViewById(R.id.button6);
        btn6.setText(String.valueOf(letras.get(5)));
        btn6.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v){
                btn6.setText(String.valueOf(letras.get(5)));
                if(letrasExtraidas.size()<=2){
                    letrasExtraidas.add(letras.get(5));
                    numeroBotonPresionado.add(5);
                    if(letrasExtraidas.size()==2){
                        if(letrasExtraidas.get(0) != letrasExtraidas.get(1)){
                            Button boton = (Button) findViewById(botonesId[numeroBotonPresionado.get(0)]);
                            handler.postDelayed(new Runnable() {
                                @Override
                                public void run() {
                                    btn6.setText("-");
                                    boton.setText("-");
                                }
                            }, 1000);

                        }
                        letrasExtraidas.clear();
                        numeroBotonPresionado.clear();
                    }
                }
            }


        });


        Button btn7= findViewById(R.id.button7);
        btn7.setText(String.valueOf(letras.get(6)));
        btn7.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v){
                btn7.setText(String.valueOf(letras.get(6)));
                if(letrasExtraidas.size()<=2){
                    letrasExtraidas.add(letras.get(6));
                    numeroBotonPresionado.add(6);
                    if(letrasExtraidas.size()==2){
                        if(letrasExtraidas.get(0) != letrasExtraidas.get(1)){
                            Button boton = (Button) findViewById(botonesId[numeroBotonPresionado.get(0)]);
                            handler.postDelayed(new Runnable() {
                                @Override
                                public void run() {
                                    btn7.setText("-");
                                    boton.setText("-");
                                }
                            }, 1000);

                        }
                        letrasExtraidas.clear();
                        numeroBotonPresionado.clear();
                    }
                }
            }


        });

        Button btn8= findViewById(R.id.button8);
        btn8.setText(String.valueOf(letras.get(7)));
        btn8.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v){
                btn8.setText(String.valueOf(letras.get(7)));
                if(letrasExtraidas.size()<=2){
                    letrasExtraidas.add(letras.get(7));
                    numeroBotonPresionado.add(7);
                    if(letrasExtraidas.size()==2){
                        if(letrasExtraidas.get(0) != letrasExtraidas.get(1)){
                            Button boton = (Button) findViewById(botonesId[numeroBotonPresionado.get(0)]);
                            handler.postDelayed(new Runnable() {
                                @Override
                                public void run() {
                                    btn8.setText("-");
                                    boton.setText("-");
                                }
                            }, 1000);

                        }
                        letrasExtraidas.clear();
                        numeroBotonPresionado.clear();
                    }
                }
            }


        });

        Button btn9= findViewById(R.id.button9);
        btn9.setText(String.valueOf(letras.get(8)));
        btn9.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v){
                btn9.setText(String.valueOf(letras.get(8)));
                if(letrasExtraidas.size()<=2){
                    letrasExtraidas.add(letras.get(8));
                    numeroBotonPresionado.add(8);
                    if(letrasExtraidas.size()==2){
                        if(letrasExtraidas.get(0) != letrasExtraidas.get(1)){
                            Button boton = (Button) findViewById(botonesId[numeroBotonPresionado.get(0)]);
                            handler.postDelayed(new Runnable() {
                                @Override
                                public void run() {
                                    btn9.setText("-");
                                    boton.setText("-");
                                }
                            }, 1000);

                        }
                        letrasExtraidas.clear();
                        numeroBotonPresionado.clear();
                    }
                }
            }


        });

        Button btn10= findViewById(R.id.button10);
        btn10.setText(String.valueOf(letras.get(9)));
        btn10.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v){
                btn10.setText(String.valueOf(letras.get(9)));
                if(letrasExtraidas.size()<=2){
                    letrasExtraidas.add(letras.get(9));
                    numeroBotonPresionado.add(9);
                    if(letrasExtraidas.size()==2){
                        if(letrasExtraidas.get(0) != letrasExtraidas.get(1)){
                            Button boton = (Button) findViewById(botonesId[numeroBotonPresionado.get(0)]);
                            handler.postDelayed(new Runnable() {
                                @Override
                                public void run() {
                                    btn10.setText("-");
                                    boton.setText("-");
                                }
                            }, 1000);

                        }
                        letrasExtraidas.clear();
                        numeroBotonPresionado.clear();
                    }
                }
            }


        });

        Button btn11= findViewById(R.id.button11);
        btn11.setText(String.valueOf(letras.get(10)));
        btn11.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v){
                btn11.setText(String.valueOf(letras.get(10)));
                if(letrasExtraidas.size()<=2){
                    letrasExtraidas.add(letras.get(10));
                    numeroBotonPresionado.add(10);
                    if(letrasExtraidas.size()==2){
                        if(letrasExtraidas.get(0) != letrasExtraidas.get(1)){
                            Button boton = (Button) findViewById(botonesId[numeroBotonPresionado.get(0)]);
                            handler.postDelayed(new Runnable() {
                                @Override
                                public void run() {
                                    btn11.setText("-");
                                    boton.setText("-");
                                }
                            }, 1000);

                        }
                        letrasExtraidas.clear();
                        numeroBotonPresionado.clear();
                    }
                }
            }
        });

        Button btn12= findViewById(R.id.button12);
        btn12.setText(String.valueOf(letras.get(11)));
        btn12.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v){
                btn12.setText(String.valueOf(letras.get(11)));
                if(letrasExtraidas.size()<=2){
                    letrasExtraidas.add(letras.get(11));
                    numeroBotonPresionado.add(11);
                    if(letrasExtraidas.size()==2){
                        if(letrasExtraidas.get(0) != letrasExtraidas.get(1)){
                            Button boton = (Button) findViewById(botonesId[numeroBotonPresionado.get(0)]);
                            handler.postDelayed(new Runnable() {
                                @Override
                                public void run() {
                                    btn12.setText("-");
                                    boton.setText("-");
                                }
                            }, 1000);

                        }
                        letrasExtraidas.clear();
                        numeroBotonPresionado.clear();
                    }
                }
            }
        });

        Button btn13= findViewById(R.id.button13);
        btn13.setText(String.valueOf(letras.get(12)));
        btn13.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v){
                btn13.setText(String.valueOf(letras.get(12)));
                numeroBotonPresionado.add(12);
                if(letrasExtraidas.size()<=2){
                    letrasExtraidas.add(letras.get(12));
                    if(letrasExtraidas.size()==2){
                        if(letrasExtraidas.get(0) != letrasExtraidas.get(1)){
                            Button boton = (Button) findViewById(botonesId[numeroBotonPresionado.get(0)]);
                            handler.postDelayed(new Runnable() {
                                @Override
                                public void run() {
                                    btn13.setText("-");
                                    boton.setText("-");
                                }
                            }, 1000);

                        }
                        letrasExtraidas.clear();
                        numeroBotonPresionado.clear();
                    }
                }
            }
        });

        Button btn14= findViewById(R.id.button14);
        btn14.setText(String.valueOf(letras.get(13)));
        btn14.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v){
                btn14.setText(String.valueOf(letras.get(13)));
                if(letrasExtraidas.size()<=2){
                    letrasExtraidas.add(letras.get(13));
                    numeroBotonPresionado.add(13);
                    if(letrasExtraidas.size()==2){
                        if(letrasExtraidas.get(0) != letrasExtraidas.get(1)){
                            Button boton = (Button) findViewById(botonesId[numeroBotonPresionado.get(0)]);
                            handler.postDelayed(new Runnable() {
                                @Override
                                public void run() {
                                    btn14.setText("-");
                                    boton.setText("-");
                                }
                            }, 1000);

                        }
                        letrasExtraidas.clear();
                        numeroBotonPresionado.clear();
                    }
                }
            }
        });

        Button btn15= findViewById(R.id.button15);
        btn15.setText(String.valueOf(letras.get(14)));
        btn15.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v){
                btn15.setText(String.valueOf(letras.get(14)));
                if(letrasExtraidas.size()<=2){
                    letrasExtraidas.add(letras.get(14));
                    numeroBotonPresionado.add(14);
                    if(letrasExtraidas.size()==2){
                        if(letrasExtraidas.get(0) != letrasExtraidas.get(1)){
                            Button boton = (Button) findViewById(botonesId[numeroBotonPresionado.get(0)]);
                            handler.postDelayed(new Runnable() {
                                @Override
                                public void run() {
                                    btn15.setText("-");
                                    boton.setText("-");
                                }
                            }, 1000);

                        }
                        letrasExtraidas.clear();
                        numeroBotonPresionado.clear();
                    }
                }
            }
        });

        Button btn16= findViewById(R.id.button16);
        btn16.setText(String.valueOf(letras.get(15)));
        btn16.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v){
                btn16.setText(String.valueOf(letras.get(15)));
                if(letrasExtraidas.size()<=2){
                    letrasExtraidas.add(letras.get(15));
                    numeroBotonPresionado.add(15);
                    if(letrasExtraidas.size()==2){
                        if(letrasExtraidas.get(0) != letrasExtraidas.get(1)){
                            Button boton = (Button) findViewById(botonesId[numeroBotonPresionado.get(0)]);
                            handler.postDelayed(new Runnable() {
                                @Override
                                public void run() {
                                    btn16.setText("-");
                                    boton.setText("-");
                                }
                            }, 1000);

                        }
                        letrasExtraidas.clear();
                        numeroBotonPresionado.clear();
                    }
                }
            }
        });


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



    }

    public void nuevoJuego(View view){
        Random rndm = new Random();
        Collections.shuffle(letras, rndm);
        Log.d("msg", "se crea lista en nuevo juego");
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

        Handler handler = new Handler();
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

    }

    public void memoriaEstadisticas(View view){
        Intent intent= new Intent(memoria.this, memoria_estadistica.class);
        startActivity(intent);
    }




}