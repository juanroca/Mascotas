package com.tego.recyclerview;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;


public class ViewHolder extends RecyclerView.ViewHolder {

    ImageView imagenMascota;
    TextView nombreMascota;
    ImageButton huesoMascota;
    TextView likesMascota;



    public ViewHolder(@NonNull View itemView) {
        super(itemView);
        imagenMascota = (ImageView) itemView.findViewById(R.id.imgMascota);
        nombreMascota = (TextView) itemView.findViewById(R.id.tvNombre);
        huesoMascota = (ImageButton) itemView.findViewById(R.id.ibHueso);
        likesMascota = (TextView) itemView.findViewById(R.id.tvLikes);

    }


}
