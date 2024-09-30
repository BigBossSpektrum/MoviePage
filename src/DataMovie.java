import com.aluracursos.moviepage.calculos.CalculadoraDeTiempo;
import com.aluracursos.moviepage.calculos.FiltroRecomendaciones;
import com.aluracursos.moviepage.modelos.Episodio;
import com.aluracursos.moviepage.modelos.Pelicula;
import com.aluracursos.moviepage.modelos.Serie;

public class DataMovie {
    public static void main(String[] args) {
        Pelicula miPelicula = new Pelicula("Encanto", 2021);
        miPelicula.setDuracionEnMinutos(120);
        miPelicula.setIncluidoEnElPlan(true);

        miPelicula.muestraFichaTecnica();
        miPelicula.evalua(10);
        miPelicula.evalua(10);
        miPelicula.evalua(7.8);
        System.out.println(miPelicula.getTotalDelasEvaluaciones());
        System.out.println(miPelicula.calculaMedia());

        Serie casaDragon = new Serie("La casa del dragón", 2022);
        casaDragon.setTemporadas(1);
        casaDragon.setMinutosPorEpisodio(50);
        casaDragon.setEpisodiosPorTemporada(10);
        casaDragon.muestraFichaTecnica();
        System.out.println(casaDragon.getDuracionEnMinutos());

        Pelicula otraPelicula = new Pelicula("Matrix", 1998);
        otraPelicula.setDuracionEnMinutos(180);

        CalculadoraDeTiempo calculadora = new CalculadoraDeTiempo();
        calculadora.incluye(miPelicula);
        calculadora.incluye(casaDragon);
        calculadora.incluye(otraPelicula);
        System.out.println("Tiempo necesario para ver tus títulos favoritos estas vacaciones "
                + calculadora.getTiempoTotal() + " minutos");

        FiltroRecomendaciones filtroRecomendaciones = new FiltroRecomendaciones();
        filtroRecomendaciones.filtro(miPelicula);

        Episodio episodio = new Episodio();
        episodio.setNumero(1);
        episodio.setNombre("La casa targeryen");
        episodio.setSerie(casaDragon);
        episodio.setTotalDeVisualizacion(400);
        filtroRecomendaciones.filtro(episodio);

        System.out.println(episodio);

        var peliculaNueva = new Pelicula("Interestelar", 2014);
        peliculaNueva.setDuracionEnMinutos(180);
        peliculaNueva.setDirector("Christopher Nolan");
        peliculaNueva.setIncluidoEnElPlan(true);

        System.out.println(peliculaNueva);

        var serieNueva = new Serie("Swallowed Star", 2022);
        serieNueva.setTemporadas(3);
        serieNueva.setEpisodiosPorTemporada(60);
        serieNueva.setEpisodiosPorTemporada(60);
        serieNueva.setMinutosPorEpisodio(20);
        serieNueva.setEscritor("Zhu Hong Zhi");


        System.out.println(serieNueva);
    }
}
