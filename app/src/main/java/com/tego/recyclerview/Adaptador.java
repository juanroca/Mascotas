package com.tego.recyclerview;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class Adaptador extends RecyclerView.Adapter<ViewHolder> {

    List<Mascotas> ListaMascotas;

    public Adaptador(List<Mascotas> listaMascotas) {
        ListaMascotas = listaMascotas;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View vista = LayoutInflater.from(parent.getContext()).inflate(R.layout.elemento_lista_mascotas, parent, false);
        return new ViewHolder(vista);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.nombreMascota.setText(ListaMascotas.get(position).getNombreMascota());
        holder.imagenMascota.setImageResource(ListaMascotas.get(position).getImagenMascota());
        holder.likesMascota.setText(ListaMascotas.get(position).getLikeMascota());
    }

    @Override
    public int getItemCount() {
        return ListaMascotas.size();
    }
}
