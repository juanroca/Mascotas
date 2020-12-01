package com.tego.recyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ArrayList<Mascotas> lista = new ArrayList<Mascotas>();
        lista.add(new Mascotas("Pepe", 0, R.drawable.mascota1));
        lista.add(new Mascotas("Kyro", 1, R.drawable.mascota2));
        lista.add(new Mascotas("Layca", 2, R.drawable.mascota3));
        lista.add(new Mascotas("Thor", 3, R.drawable.mascota4));
        lista.add(new Mascotas("Falcon", 4, R.drawable.mascota5));

        RecyclerView contenedor = (RecyclerView) findViewById(R.id.RvMascotas);
            contenedor.setHasFixedSize(true);
            LinearLayoutManager layout = new LinearLayoutManager(getApplicationContext());
            layout.setOrientation(LinearLayoutManager.VERTICAL);
            contenedor.setAdapter(new Adaptador(lista));
            contenedor.setLayoutManager(layout);

    }
}