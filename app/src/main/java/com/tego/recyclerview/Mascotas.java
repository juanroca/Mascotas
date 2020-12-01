package com.tego.recyclerview;

import java.util.ArrayList;

public class Mascotas {
    String nombreMascota;
    int likeMascota;
    int imagenMascota;

    public Mascotas(String nombreMascota, int likeMascota, int imagenMascota) {
        this.nombreMascota = nombreMascota;
        this.likeMascota = likeMascota;
        this.imagenMascota = imagenMascota;
    }

    public String getNombreMascota() {
        return nombreMascota;
    }

    public void setNombreMascota(String nombreMascota) {
        this.nombreMascota = nombreMascota;
    }

    public int getLikeMascota() {
        return likeMascota;
    }

    public void setLikeMascota(int likeMascota) {
        this.likeMascota = likeMascota;
    }

    public int getImagenMascota() {
        return imagenMascota;
    }

    public void setImagenMascota(int imagenMascota) {
        this.imagenMascota = imagenMascota;
    }

}
