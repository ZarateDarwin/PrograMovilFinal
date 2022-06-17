package com.example.zaratedarwinmauricio2doparcial;

import androidx.recyclerview.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class Adaptador extends RecyclerView.Adapter<Adaptador.HolderCita>{
    private ArrayList<Cita> listaCitas;
    public Adaptador(ArrayList<Cita> listaCitas) {
        this.listaCitas = listaCitas;
    }

    @NonNull
    @Override
    public Adaptador.HolderCita onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_leyout,null,false);

        return new HolderCita(view);
    }

    @Override
    public void onBindViewHolder(@NonNull Adaptador.HolderCita holder, int position) {
        holder.asignarDatos(listaCitas.get(position));
    }

    @Override
    public int getItemCount() {
        return listaCitas.size();
    }

    public class HolderCita extends RecyclerView.ViewHolder {

        TextView tvNombre,tvCelular,tvFecha,tvHora;
        public HolderCita(@NonNull View itemView) {
            super(itemView);
            tvNombre = itemView.findViewById(R.id.tvItemNombre);
            tvCelular = itemView.findViewById(R.id.tvItemNumeroCelular);
            tvFecha = itemView.findViewById(R.id.tvItemFecha);
            tvHora = itemView.findViewById(R.id.tvItemHora);
        }
        public void asignarDatos(Cita cita) {
            tvNombre.setText("nombre: "+cita.getNombre());
            tvCelular.setText("precio: "+cita.getCelular());
            tvFecha.setText("serie: "+cita.getFecha());
            tvHora.setText("codigo del producto: "+cita.getHora());

        }
    }

}
