package com.aluracursos.moviepage.modelos;

import com.aluracursos.moviepage.calculos.Clasificacion;

public class Episodio implements Clasificacion {
    private int numero;
    private String nombre;
    private Serie serie;
    private int totalDeVisualizacion;

    public int getTotalDeVisualizacion() {
        return totalDeVisualizacion;
    }

    public void setTotalDeVisualizacion(int totalDeVisualizacion) {
        this.totalDeVisualizacion = totalDeVisualizacion;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Serie getSerie() {
        return serie;
    }

    public void setSerie(Serie serie) {
        this.serie = serie;
    }

    @Override
    public int getClasificacion() {
        if (totalDeVisualizacion > 100){
            return 4;
        }else {
            return 2;
        }
    }

    public String toString() {
        return "La serie: " + this.getNombre() + ". Episodio: " + "(" + this.getNumero() + ")" + ". Visualizaciones: " + "(" + this.getTotalDeVisualizacion() + ")" + ". Tuvo una clasificacion de: " + "(" + this.getClasificacion() +")";
    }
}
