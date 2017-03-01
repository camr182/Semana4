package com.example.ameza.contactost.pojo;

/**
 * Created by ameza on 21/02/2017.
 */

public class Mascota {

    private int imagen;
    private String titulo;
    private String rating;
    private int imagen1;
    private int imagen2;
    private int imagen3;
    private int imagen4;
    private int imagen5;
    private int imagen6;

    public Mascota(int imagen, String titulo, String rating, int imagen1, int imagen2, int imagen3, int imagen4, int imagen5, int imagen6) {
        this.imagen = imagen;
        this.titulo = titulo;
        this.rating = rating;
        this.imagen1 = imagen1;
        this.imagen2 = imagen2;
        this.imagen3 = imagen3;
        this.imagen4 = imagen4;
        this.imagen5 = imagen5;
        this.imagen6 = imagen6;
    }


    public Mascota(int imagen, String titulo, String rating){
        this.imagen = imagen;
        this.titulo = titulo;
        this.rating = rating;

    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getImagen() {
        return imagen;
    }

    public void setImagen(int imagen) {
        this.imagen = imagen;
    }

    public String getRating() {
        return rating;
    }

    public void setRating(String rating) {
        this.rating = rating;
    }

    public int getImagen1() {
        return imagen1;
    }

    public void setImagen1(int imagen1) {
        this.imagen1 = imagen1;
    }

    public int getImagen2() {
        return imagen2;
    }

    public void setImagen2(int imagen2) {
        this.imagen2 = imagen2;
    }

    public int getImagen3() {
        return imagen3;
    }

    public void setImagen3(int imagen3) {
        this.imagen3 = imagen3;
    }

    public int getImagen4() {
        return imagen4;
    }

    public void setImagen4(int imagen4) {
        this.imagen4 = imagen4;
    }

    public int getImagen5() {
        return imagen5;
    }

    public void setImagen5(int imagen5) {
        this.imagen5 = imagen5;
    }

    public int getImagen6() {
        return imagen6;
    }

    public void setImagen6(int imagen6) {
        this.imagen6 = imagen6;
    }
}
