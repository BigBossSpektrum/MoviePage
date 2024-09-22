public class Data {
    String nombre;
    String descripcion;
    int fechaDeLanzamiento;
    int duracion;
    boolean planPremium;
    double sumaDeScore;
    int sumaTotalDeScore;

    void datosDePeliculas(){
        System.out.println("Nombre de la pelicula: " + nombre);
        System.out.println("Descripcion de la pelicula: " + descripcion);
        System.out.println("Fecha de Lanzamiento: " + fechaDeLanzamiento);
        System.out.println("Duracion de la Pelicula: " + duracion);
    }

    void evaluar(double nota){
        sumaDeScore += nota;
        sumaTotalDeScore++;
    }

    double mediaDeScore(){
        return sumaDeScore / sumaTotalDeScore;
    }

}
