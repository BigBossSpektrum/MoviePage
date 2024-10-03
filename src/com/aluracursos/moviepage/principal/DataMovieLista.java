package com.aluracursos.moviepage.principal;

import com.aluracursos.moviepage.modelos.Pelicula;
import com.aluracursos.moviepage.modelos.Serie;
import com.aluracursos.moviepage.modelos.Titulo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class DataMovieLista {
    public static void main(String[] args) {

        Pelicula miPelicula = new Pelicula("Encanto", 2021);
        miPelicula.evalua(9);
        Serie casaDragon = new Serie("La casa del dragón", 2022);
        casaDragon.evalua(8);
        Pelicula otraPelicula = new Pelicula("Matrix", 1998);
        otraPelicula.evalua(10);
        var peliculaNueva = new Pelicula("Interestelar", 2014);
        peliculaNueva.evalua(9);
        var serieNueva = new Serie("Swallowed Star", 2022);
        serieNueva.evalua(10);

        ArrayList<Titulo> lista = new ArrayList<>();
        lista.add(miPelicula);
        lista.add(casaDragon);
        lista.add(otraPelicula);
        lista.add(peliculaNueva);
        lista.add(serieNueva);

        for (Titulo item: lista){
            System.out.println(item.getNombre());
            if (item instanceof Pelicula pelicula && pelicula.getClasificacion() > 3){
                System.out.println(pelicula.getClasificacion());
            }
        }

        ArrayList<String> ListaDeDirectores = new ArrayList<>();
        ListaDeDirectores.add("Steven Spielberg");
        ListaDeDirectores.add("Peter Jackson");
        ListaDeDirectores.add("Michael Bay");
        ListaDeDirectores.add("James Cameron");
        System.out.println(ListaDeDirectores);

        Collections.sort(ListaDeDirectores);
        System.out.println("Lista de Directores: " + ListaDeDirectores);

        Collections.sort(lista);
        System.out.println("Lista de Titulos ordenados: " + lista);

        lista.sort(Comparator.comparing(Titulo::getFechaDeLanzamiento));
        System.out.println("Lista ordenada por Fecha de Lanzamientos: " + lista);
    }
}
