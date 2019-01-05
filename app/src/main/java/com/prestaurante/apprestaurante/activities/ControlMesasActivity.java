package com.prestaurante.apprestaurante.activities;

import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.prestaurante.apprestaurante.R;
import com.prestaurante.apprestaurante.fragments.ControlMesaPisoDosFragment;
import com.prestaurante.apprestaurante.fragments.ControlMesaPisoUnoFragment;

public class ControlMesasActivity extends AppCompatActivity implements View.OnClickListener {

    Fragment fragment;
    Button btn_piso_uno,btn_piso_dos;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_control_mesas);

        inicializarUI();
        inicializarEventos();

        fragment = new ControlMesaPisoUnoFragment();
        insertarFragment();
    }

    private void inicializarEventos() {

        btn_piso_uno.setOnClickListener(this);
        btn_piso_dos.setOnClickListener(this);
    }

    private void inicializarUI() {

        btn_piso_uno = findViewById(R.id.btn_piso_uno);
        btn_piso_dos = findViewById(R.id.btn_piso_dos);
    }

    public void insertarFragment(){

        if(fragment != null){

            getSupportFragmentManager().beginTransaction().
                    replace(R.id.contenedor_control_mesas,fragment).commit();

        }
    }

    @Override
    public void onClick(View view) {

        switch (view.getId()){


            case R.id.btn_piso_uno:

                activarTabUno();
                desactivarTabDos();
                fragment = new ControlMesaPisoUnoFragment();
                insertarFragment();

                break;

            case R.id.btn_piso_dos:

                activarTabDos();
                desactivarTabUno();
                fragment = new ControlMesaPisoDosFragment();
                insertarFragment();

                break;
        }

    }

    private void desactivarTabUno() {

        btn_piso_uno.setBackgroundResource(R.color.textLight);
        btn_piso_uno.setTextColor(getResources().getColor(R.color.textDark));


    }

    public void activarTabUno(){

        btn_piso_uno.setBackgroundResource(R.color.colorPrimary);
        btn_piso_uno.setTextColor(getResources().getColor(R.color.lightPrimeryColor));

    }

    public void activarTabDos(){

        btn_piso_dos.setBackgroundResource(R.color.colorPrimary);
        btn_piso_dos.setTextColor(getResources().getColor(R.color.lightPrimeryColor));
    }

    public void desactivarTabDos(){

        btn_piso_dos.setBackgroundResource(R.color.textLight);
        btn_piso_dos.setTextColor(getResources().getColor(R.color.textDark));
    }
}
