import java.util.Locale;
import java.util.Scanner;

public class DataMovie {
    public static void main(String[] args) {
        Data MiPelicula = new Data();
        MiPelicula.nombre = "VanHellsing";
        MiPelicula.descripcion = "Conocedor de su fama como cazadora de monstruos, Van Helsing decide recabar la ayuda de la princesa Anna Valerious de Transilvania. Lejos de ser una damisela a la que se debe socorrer, Anna Valerious es el último miembro de una vieja familia entregada a la persecución y destrucción de Drácula.";
        MiPelicula.fechaDeLanzamiento = 2004;
        MiPelicula.duracion = 120;

        MiPelicula.datosDePeliculas();
        System.out.println("**********************************************");
//        MiPelicula.evaluar(8);
//        MiPelicula.evaluar(8.6);
//        MiPelicula.evaluar(9.1);

        Scanner sc = new Scanner(System.in).useLocale(Locale.US);
        double score1, score2, score3;

        System.out.println("Cual es la puntuacion del Usuario #1 para esta pelicula: " + MiPelicula.nombre);
        score1 = sc.nextDouble();

        System.out.println("Cual es la puntuacion del Usuario #2 para esta pelicula: " + MiPelicula.nombre);
        score2 = sc.nextDouble();

        System.out.println("Cual es la puntuacion del Usuario #3 para esta pelicula: " + MiPelicula.nombre);
        score3 = sc.nextDouble();

        double media = (score1 + score2 + score3) / 3;

        System.out.println("La media de puntaje para: " + MiPelicula.nombre + "es: " + media);


//        System.out.println(MiPelicula.sumaDeScore);
//        System.out.println(MiPelicula.mediaDeScore());

//        Scanner keyboard = new Scanner(System.in);


    }
}
