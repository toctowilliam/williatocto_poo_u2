package poo;
import uni1a.*;

public class PruebaAudioVisual {
        public static void main(String[] args) {
        System.out.println("Hello from Eclipse!");
        ContenidoAudiovisual[] contenidos = new ContenidoAudiovisual[5];

        //Crear Pelicula
        Pelicula pelicula = new Pelicula("Avatar", 125, "Acción", "20th Century Studios");
        pelicula.agregarActor(new Actor("Sam Worthington", 30));
        pelicula.agregarActor(new Actor("William Tocto", 25));
        contenidos[0] = pelicula;

        // Crear instancia de SerieDeTV y agregar temporadas
        SerieDeTV serie = new SerieDeTV("Game of Thrones", 60, "Fantasy", 8);
        serie.agregarTemporada(new Temporada(1, 10));
        serie.agregarTemporada(new Temporada(2, 10));
        contenidos[1] = serie;

        // Crear Documental y agregar Investigadores
        Documental documental = new Documental("Cosmos", 45, "Science", "Astronomy");
        documental.agregarInvestigador(new Investigador("Carl Sagan", "Astronomía"));
        documental.agregarInvestigador(new Investigador("Neil deGrasse Tyson", "Astrofísica"));
        contenidos[2] = documental;

        // Crear instancias de las subclases

        // Crear VideoYouTube y agregar investigadores
        VideoYouTube video = new VideoYouTube("Tutorial de Java", 10, "Educación", "Canal de Programación", 50000);
        video.agregarInvestigador(new Investigador("William Tocto", "Informática"));
        video.agregarInvestigador(new Investigador("Fenando Perez", "Tecnología"));
        contenidos[3] = video;

        // Crear Telenovela y agregar actores
        Telenovela telenovela = new Telenovela("Amor Eterno", 45, "Romántica", "Colombia", 120);
        telenovela.agregarActor(new Actor("Ana María", 29));
        telenovela.agregarActor(new Actor("Carlos Pérez", 34));
        contenidos[4] = telenovela;


        // Mostrar los detalles de cada contenido audiovisual
        for (ContenidoAudiovisual contenido : contenidos) {
            contenido.mostrarDetalles();
        }
    }
}