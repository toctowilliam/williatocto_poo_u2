package uni1a;

import java.util.ArrayList;
import java.util.List;

public class VideoYouTube extends ContenidoAudiovisual {

    private String nombre_canal;
    private int numeroVistas;
    private List<Investigador> investigadores;  // Lista para relación de agregación con Investigador

    public VideoYouTube(String titulo, int duracionEnMinutos, String genero, String nombre_canal, int numeroVistas) {
        super(titulo, duracionEnMinutos, genero);
        this.nombre_canal = nombre_canal;
        this.numeroVistas = numeroVistas;
        this.investigadores = new ArrayList<>();
    }
    public void agregarInvestigador(Investigador investigador) {
        investigadores.add(investigador);
    }
    public String getCanal() {
        return nombre_canal;
    }

    public void setCanal(String canal) {
        this.nombre_canal = canal;
    }

    @Override
    public void mostrarDetalles() {
        // Llama al método de la clase base para mostrar los detalles comunes de ContenidoAudiovisual
        System.out.println();
        System.out.println("Detalles del Video YouTube:");
        System.out.println("ID: " + getId());
        System.out.println("Título: " + getTitulo());
        System.out.println("Duración en minutos: " + getDuracionEnMinutos());
        System.out.println("Género: " + getGenero());
        // Mostrar detalles específicos de VideoYouTube
        System.out.println("Canal: " + nombre_canal);
        System.out.println("Número de vistas: " + numeroVistas);
        System.out.println("Investigadores:");
        for (Investigador investigador : investigadores) {
            System.out.println(" - " + investigador);
        }
        System.out.println("================================================================");
    }

}