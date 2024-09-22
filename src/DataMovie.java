import java.util.Locale;
import java.util.Scanner;

public class DataMovie {
    public static void main(String[] args) {
        Data miPelicula = new Data();
        miPelicula.nombre = "VanHellsing";
        miPelicula.descripcion = "Conocedor de su fama como cazadora de monstruos, Van Helsing decide recabar la ayuda de la princesa Anna Valerious de Transilvania. Lejos de ser una damisela a la que se debe socorrer, Anna Valerious es el último miembro de una vieja familia entregada a la persecución y destrucción de Drácula.";
        miPelicula.fechaDeLanzamiento = 2004;
        miPelicula.duracion = 120;

        miPelicula.datosDePeliculas();
        System.out.println("**********************************************");
//        miPelicula.evaluar(8);
//        miPelicula.evaluar(8.6);
//        miPelicula.evaluar(9.1);

        Scanner sc = new Scanner(System.in).useLocale(Locale.US);
        double score1, score2, score3;

        System.out.println("Cual es la puntuacion del Usuario #1 para esta pelicula: " + miPelicula.nombre);
        score1 = sc.nextDouble();

        System.out.println("Cual es la puntuacion del Usuario #2 para esta pelicula: " + miPelicula.nombre);
        score2 = sc.nextDouble();

        System.out.println("Cual es la puntuacion del Usuario #3 para esta pelicula: " + miPelicula.nombre);
        score3 = sc.nextDouble();

        double media = (score1 + score2 + score3) / 3;

        System.out.println("La media de puntaje para: " + miPelicula.nombre + "es: " + media);


//        System.out.println(miPelicula.sumaDeScore);
//        System.out.println(miPelicula.mediaDeScore());

//        Scanner keyboard = new Scanner(System.in);


    }
}
