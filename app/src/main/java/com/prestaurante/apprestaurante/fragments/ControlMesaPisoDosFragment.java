package com.prestaurante.apprestaurante.fragments;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.prestaurante.apprestaurante.R;
import com.prestaurante.apprestaurante.adapters.ControlMesasAdapter;
import com.prestaurante.apprestaurante.entities.Mesa;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */
public class ControlMesaPisoDosFragment extends Fragment {

    RecyclerView recycler_mesas_piso_dos;
    ArrayList<Mesa> list_mesas;

    public ControlMesaPisoDosFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_control_mesa_piso_dos, container, false);

        inicializarUI(view);
        poblarInformacion();
        configurarAdaptador();

        return view;
    }

    private void poblarInformacion() {

        list_mesas = new ArrayList<>();


        for(int i = 0; i< 15; i++){

            Mesa mesa = new Mesa();
            mesa.setNumero("001");
            mesa.setEstado("Libre");

            list_mesas.add(mesa);
        }

    }

    private void configurarAdaptador() {

        recycler_mesas_piso_dos.setAdapter(new ControlMesasAdapter(getContext(),R.layout.item_control_mesas,list_mesas));
        recycler_mesas_piso_dos.setLayoutManager(new GridLayoutManager(getContext(),5));

    }

    private void inicializarUI(View v) {

        recycler_mesas_piso_dos = v.findViewById(R.id.recycler_mesas_piso_dos);
    }
}
