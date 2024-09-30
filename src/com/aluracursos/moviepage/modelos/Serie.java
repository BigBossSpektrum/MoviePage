package com.aluracursos.moviepage.modelos;

public class Serie extends Titulo {
    int temporadas;
    int episodiosPorTemporada;
    int minutosPorEpisodio;
    String escritor;

    public Serie(String nombre, int fechaDeLanzamiento) {
        super(nombre, fechaDeLanzamiento);
    }

    public String getEscritor() {
        return escritor;
    }

    public void setEscritor(String escritor) {
        this.escritor = escritor;
    }

    public int getDuracionEnMinutos() {
        return temporadas * episodiosPorTemporada * minutosPorEpisodio;
    }

    public int getTemporadas() {
        return temporadas;
    }

    public void setTemporadas(int temporadas) {
        this.temporadas = temporadas;
    }

    public int getEpisodiosPorTemporada() {
        return episodiosPorTemporada;
    }

    public void setEpisodiosPorTemporada(int episodiosPorTemporada) {
        this.episodiosPorTemporada = episodiosPorTemporada;
    }

    public int getMinutosPorEpisodio() {
        return minutosPorEpisodio;
    }

    public void setMinutosPorEpisodio(int minutosPorEpisodio) {
        this.minutosPorEpisodio = minutosPorEpisodio;
    }

    public String toString() {
        return "Serie: " + this.getNombre() + " Fue estrenada en: " + "(" + this.getFechaDeLanzamiento() + ")" + " Y escrita por: " + "(" + this.getEscritor() + ")" + " Actualmente tiene: " + this.getTemporadas() + " cada capitulo tiene una duracion de minutos: " + "(" + this.getMinutosPorEpisodio() +")" + " y cada temporada tiene un aproximado de " + this.getEpisodiosPorTemporada() + " Episodios";
    }


}
