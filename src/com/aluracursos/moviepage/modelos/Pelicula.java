package com.aluracursos.moviepage.modelos;

import com.aluracursos.moviepage.calculos.Clasificacion;

public class Pelicula extends Titulo implements Clasificacion {

    private String Director;

    public Pelicula(String nombre, int fechaDeLanzamiento) {
        super(nombre, fechaDeLanzamiento);
    }

    public String getDirector() {
        return Director;
    }

    public void setDirector(String director) {
        Director = director;
    }


    @Override
    public int getClasificacion() {
        return (int) (calculaMedia() / 2);
    }

    @Override
    public String toString() {
        return "Pelicula: " + this.getNombre() + " Fue estrenada en: " + "(" + this.getFechaDeLanzamiento() + ")" + " Y dirigida por: " + "(" + this.getDirector() + ")" + " Duracion en minutos: " + "(" + this.getDuracionEnMinutos() +")";
    }


}
