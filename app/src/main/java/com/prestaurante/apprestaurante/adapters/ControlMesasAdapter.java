package com.prestaurante.apprestaurante.adapters;

import android.content.Context;
import android.support.constraint.ConstraintLayout;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import com.prestaurante.apprestaurante.R;
import com.prestaurante.apprestaurante.entities.Mesa;

import java.util.ArrayList;

/**
 * Created by jledesma on 4/01/19.
 */

public class ControlMesasAdapter extends RecyclerView.Adapter<ControlMesasAdapter.ControlMesasAdapterViewHolder> {

    Context context;
    int item_control_mesas;
    ArrayList<Mesa> list_mesas;

    public ControlMesasAdapter(Context context, int item_control_mesas, ArrayList<Mesa> list_mesas) {

        this.context = context;
        this.item_control_mesas = item_control_mesas;
        this.list_mesas = list_mesas;
    }

    @Override
    public ControlMesasAdapterViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_control_mesas, parent, false);
        return new ControlMesasAdapterViewHolder(view);
    }

    @Override
    public void onBindViewHolder(ControlMesasAdapterViewHolder holder, final int position) {

        Mesa mesa = list_mesas.get(position);

        holder.tv_numero_mesa.setText(mesa.getNumero().toString());
        holder.tv_estado_mesa.setText(mesa.getEstado().toString());

        holder.item_mesa_piso_uno.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                //Evento Onclick
                Toast.makeText(context,"" + position,Toast.LENGTH_SHORT).show();
            }
        });
    }

    @Override
    public int getItemCount() {
        return list_mesas.size();
    }


    public class ControlMesasAdapterViewHolder extends RecyclerView.ViewHolder {

        ConstraintLayout item_mesa_piso_uno;
        TextView tv_numero_mesa, tv_estado_mesa;

        public ControlMesasAdapterViewHolder(View itemView) {
            super(itemView);

            tv_numero_mesa = itemView.findViewById(R.id.tv_numero_mesa);
            tv_estado_mesa = itemView.findViewById(R.id.tv_estado_mesa);
            item_mesa_piso_uno = itemView.findViewById(R.id.item_mesa_piso_uno);
        }
    }
}
