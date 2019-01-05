package com.prestaurante.apprestaurante.activities;

import android.content.Intent;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

import com.prestaurante.apprestaurante.R;

import java.util.Timer;
import java.util.TimerTask;

import cn.pedant.SweetAlert.SweetAlertDialog;

public class LoguinActivity extends AppCompatActivity implements View.OnClickListener {


    Button btn_test;
    Button btn1,btn2,btn3,btn4,btn5,btn6,btn7,btn8,btn9,btn0;

    ImageView circle_uno,circle_dos,circle_tres,circle_cuatro,circle_cinco,circle_seis;

    ImageView image_retroceso,image_salir;

    SweetAlertDialog pd;

    String clave = "";
    String digitoClaveUno = "";
    String digitoClaveDos = "";
    String digitoClaveTres = "";
    String digitoClaveCuatro = "";
    String digitoClaveCinco = "";
    String digitoClaveSeis = "";

    int digitos = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_loguin);

       // btn_test = findViewById(R.id.btn_test);
        btn1 = findViewById(R.id.boton1);
        btn2 = findViewById(R.id.boton2);
        btn3 = findViewById(R.id.boton3);
        btn4 = findViewById(R.id.boton4);
        btn5 = findViewById(R.id.boton5);
        btn6 = findViewById(R.id.boton6);
        btn7 = findViewById(R.id.boton7);
        btn8 = findViewById(R.id.boton8);
        btn9 = findViewById(R.id.boton9);
        btn0 = findViewById(R.id.boton0);
        image_retroceso = findViewById(R.id.image_retroceso);
        image_salir = findViewById(R.id.image_salir);

        circle_uno = findViewById(R.id.circle_uno);
        circle_dos = findViewById(R.id.circle_dos);
        circle_tres = findViewById(R.id.circle_tres);
        circle_cuatro = findViewById(R.id.circle_cuatro);
        circle_cinco = findViewById(R.id.circle_cinco);
        circle_seis = findViewById(R.id.circle_seis);

       // btn_test.setOnClickListener(new View.OnClickListener() {
          //  @Override
          //  public void onClick(View view)
         //       Intent i = new Intent(LoguinActivity.this,ControlMesasActivity.class);
          //      startActivity(i);
          //  }
       // });

        btn1.setOnClickListener(this);
        btn2.setOnClickListener(this);
        btn3.setOnClickListener(this);
        btn4.setOnClickListener(this);
        btn5.setOnClickListener(this);
        btn6.setOnClickListener(this);
        btn7.setOnClickListener(this);
        btn8.setOnClickListener(this);
        btn9.setOnClickListener(this);
        btn0.setOnClickListener(this);
        image_retroceso.setOnClickListener(this);
        image_salir.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {

        switch (view.getId()){

            case R.id.boton1:

                digitos++;

                if(digitos==1){

                   digitoClaveUno = "1";
                }
                if(digitos==2){

                    digitoClaveDos = "1";
                }
                if(digitos==3){

                    digitoClaveTres = "1";
                }
                if(digitos==4){

                    digitoClaveCuatro = "1";

                }
                if(digitos==5){

                    digitoClaveCinco = "1";

                }
                if(digitos==6){

                    digitoClaveSeis = "1";
                }

                concatenarClave(digitos);
                pintarCirculo(digitos);

                Log.d("jledesma", clave + " !!!! " + digitos);

                if(digitos==6){

                    autenticar();
                }

                break;

            case R.id.boton2:

                digitos++;

                if(digitos==1){

                    digitoClaveUno = "2";
                }
                if(digitos==2){

                    digitoClaveDos = "2";
                }
                if(digitos==3){

                    digitoClaveTres = "2";
                }
                if(digitos==4){

                    digitoClaveCuatro = "2";

                }
                if(digitos==5){

                    digitoClaveCinco = "2";

                }
                if(digitos==6){

                    digitoClaveSeis = "2";
                }

                concatenarClave(digitos);
                pintarCirculo(digitos);
                Log.d("jledesma", clave + " !!!! " + digitos);

                if(digitos==6){

                    autenticar();
                }

                break;

            case R.id.boton3:

                digitos++;

                if(digitos==1){

                    digitoClaveUno = "3";
                }
                if(digitos==2){

                    digitoClaveDos = "3";
                }
                if(digitos==3){

                    digitoClaveTres = "3";
                }
                if(digitos==4){

                    digitoClaveCuatro = "3";

                }
                if(digitos==5){

                    digitoClaveCinco = "3";

                }
                if(digitos==6){

                    digitoClaveSeis = "3";
                }

                concatenarClave(digitos);
                pintarCirculo(digitos);
                Log.d("jledesma", clave + " !!!! " + digitos);


                if(digitos==6){

                    autenticar();
                }

                break;

            case R.id.boton4:

                digitos++;

                if(digitos==1){

                    digitoClaveUno = "4";
                }
                if(digitos==2){

                    digitoClaveDos = "4";
                }
                if(digitos==3){

                    digitoClaveTres = "4";
                }
                if(digitos==4){

                    digitoClaveCuatro = "4";

                }
                if(digitos==5){

                    digitoClaveCinco = "4";

                }
                if(digitos==6){

                    digitoClaveSeis = "4";
                }

                concatenarClave(digitos);
                pintarCirculo(digitos);
                Log.d("jledesma", clave + " !!!! " + digitos);


                if(digitos==6){

                    autenticar();
                }

                break;

            case R.id.boton5:

                digitos++;

                if(digitos==1){

                    digitoClaveUno = "5";
                }
                if(digitos==2){

                    digitoClaveDos = "5";
                }
                if(digitos==3){

                    digitoClaveTres = "5";
                }
                if(digitos==4){

                    digitoClaveCuatro = "5";

                }
                if(digitos==5){

                    digitoClaveCinco = "5";

                }
                if(digitos==6){

                    digitoClaveSeis = "5";
                }

                concatenarClave(digitos);
                pintarCirculo(digitos);
                Log.d("jledesma", clave + " !!!! " + digitos);


                if(digitos==6){

                    autenticar();
                }

                break;

            case R.id.boton6:

                digitos++;

                if(digitos==1){

                    digitoClaveUno = "6";
                }
                if(digitos==2){

                    digitoClaveDos = "6";
                }
                if(digitos==3){

                    digitoClaveTres = "6";
                }
                if(digitos==4){

                    digitoClaveCuatro = "6";

                }
                if(digitos==5){

                    digitoClaveCinco = "6";

                }
                if(digitos==6){

                    digitoClaveSeis = "6";
                }
                concatenarClave(digitos);
                pintarCirculo(digitos);
                Log.d("jledesma", clave + " !!!! " + digitos);


                if(digitos==6){

                    autenticar();
                }

                break;

            case R.id.boton7:

                digitos++;

                if(digitos==1){

                    digitoClaveUno = "7";
                }
                if(digitos==2){

                    digitoClaveDos = "7";
                }
                if(digitos==3){

                    digitoClaveTres = "7";
                }
                if(digitos==4){

                    digitoClaveCuatro = "7";

                }
                if(digitos==5){

                    digitoClaveCinco = "7";

                }
                if(digitos==6){

                    digitoClaveSeis = "7";
                }
                concatenarClave(digitos);
                pintarCirculo(digitos);
                Log.d("jledesma", clave + " !!!! " + digitos);


                if(digitos==6){

                    autenticar();
                }

                break;

            case R.id.boton8:

                digitos++;

                if(digitos==1){

                    digitoClaveUno = "8";
                }
                if(digitos==2){

                    digitoClaveDos = "8";
                }
                if(digitos==3){

                    digitoClaveTres = "8";
                }
                if(digitos==4){

                    digitoClaveCuatro = "8";

                }
                if(digitos==5){

                    digitoClaveCinco = "8";

                }
                if(digitos==6){

                    digitoClaveSeis = "8";
                }
                concatenarClave(digitos);
                pintarCirculo(digitos);
                Log.d("jledesma", clave + " !!!! " + digitos);


                if(digitos==6){

                    autenticar();
                }

                break;

            case R.id.boton9:

                digitos++;

                if(digitos==1){

                    digitoClaveUno = "9";
                }
                if(digitos==2){

                    digitoClaveDos = "9";
                }
                if(digitos==3){

                    digitoClaveTres = "9";
                }
                if(digitos==4){

                    digitoClaveCuatro = "9";

                }
                if(digitos==5){

                    digitoClaveCinco = "9";

                }
                if(digitos==6){

                    digitoClaveSeis = "9";
                }
                concatenarClave(digitos);
                pintarCirculo(digitos);
                Log.d("jledesma", clave + " !!!! " + digitos);

                if(digitos==6){

                    autenticar();
                }

                break;

            case R.id.boton0:

                digitos++;

                if(digitos==1){

                    digitoClaveUno = "0";
                }
                if(digitos==2){

                    digitoClaveDos = "0";
                }
                if(digitos==3){

                    digitoClaveTres = "0";
                }
                if(digitos==4){

                    digitoClaveCuatro = "0";

                }
                if(digitos==5){

                    digitoClaveCinco = "0";

                }
                if(digitos==6){

                    digitoClaveSeis = "0";
                }
                concatenarClave(digitos);
                pintarCirculo(digitos);
                Log.d("jledesma", clave + " !!!! " + digitos);

                if(digitos==6){

                    autenticar();
                }

                break;

            case R.id.image_retroceso:

                if(digitos>0) {
                    //clave = clave + "0";
                    quitarCirculo(digitos);
                    digitos--;
                    concatenarClave(digitos);

                    Log.d("jledesma", clave + " !!!! " + digitos);

                    if (digitos == 6) {

                        autenticar();
                    }
                }

                break;

            case R.id.image_salir:

                Toast.makeText(LoguinActivity.this,"Salir" ,Toast.LENGTH_SHORT).show();

                break;
        }
    }

    private void concatenarClave(int digitos) {

        if(digitos==1){

            clave =   digitoClaveUno;
        }
        if(digitos==2){

            clave =  digitoClaveUno + digitoClaveDos;
        }
        if(digitos==3){

            clave =  digitoClaveUno + digitoClaveDos + digitoClaveTres;
        }
        if(digitos==4){

            clave =  digitoClaveUno + digitoClaveDos + digitoClaveTres + digitoClaveCuatro;

        }
        if(digitos==5){

            clave =  digitoClaveUno + digitoClaveDos + digitoClaveTres + digitoClaveCuatro + digitoClaveCinco;

        }
        if(digitos==6){

            clave =  digitoClaveUno + digitoClaveDos + digitoClaveTres + digitoClaveCuatro + digitoClaveCinco + digitoClaveSeis;
        }
        if(digitos==0) {

            clave = "";
        }
    }

    private void quitarCirculo(int digitos) {

        if(digitos==1){

            circle_uno.setImageResource(R.drawable.demo_desactive);
        }
        if(digitos==2){

            circle_dos.setImageResource(R.drawable.demo_desactive);
        }
        if(digitos==3){

            circle_tres.setImageResource(R.drawable.demo_desactive);
        }
        if(digitos==4){

            circle_cuatro.setImageResource(R.drawable.demo_desactive);
        }
        if(digitos==5){

            circle_cinco.setImageResource(R.drawable.demo_desactive);
        }
        if(digitos==6){

            circle_seis.setImageResource(R.drawable.demo_desactive);
        }
    }

    private void pintarCirculo(int digitos) {

        if(digitos==1){

            circle_uno.setImageResource(R.drawable.demo_active);
        }
        if(digitos==2){

            circle_dos.setImageResource(R.drawable.demo_active);
        }
        if(digitos==3){

            circle_tres.setImageResource(R.drawable.demo_active);
        }
        if(digitos==4){

            circle_cuatro.setImageResource(R.drawable.demo_active);
        }
        if(digitos==5){

            circle_cinco.setImageResource(R.drawable.demo_active);
        }
        if(digitos==6){

            circle_seis.setImageResource(R.drawable.demo_active);
        }
    }

    private void autenticar() {

        pd = new SweetAlertDialog(LoguinActivity.this,SweetAlertDialog.PROGRESS_TYPE);
        pd.getProgressHelper().setBarColor(Color.parseColor("#102670"));
        pd.setContentText("Por favor, espere...");
        pd.setCancelable(false);
        pd.show();

        TimerTask task = new TimerTask() {
            @Override
            public void run() {


                Intent i = new Intent(LoguinActivity.this,ControlMesasActivity.class);
                startActivity(i);
                finish();

            }
        };

        Timer timer = new Timer();
        timer.schedule(task,3000);


    }
}
