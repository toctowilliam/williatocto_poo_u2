package uni1a;

import java.util.ArrayList;
import java.util.List;

public class Telenovela extends ContenidoAudiovisual {
    private String paisOrigen;
    private int numeroCapitulos;
    private List<Actor> actores; // Relación de composición con Actor

    public Telenovela(String titulo, int duracionEnMinutos, String genero, String paisOrigen, int numeroCapitulos) {
        super(titulo, duracionEnMinutos, genero);
        this.paisOrigen = paisOrigen;
        this.numeroCapitulos = numeroCapitulos;
        this.actores = new ArrayList<>();
    }

    // Método para agregar un actor a la telenovela
    public void agregarActor(Actor actor) {
        actores.add(actor);
    }
    public void eliminarActor(Actor actor) {
        if (actores.remove(actor)) {
            System.out.println("Actor " + actor.getNombre() + " eliminado de la telenovela " + getTitulo());
        } else {
            System.out.println("Actor no encontrado en la telenovela " + getTitulo());
        }
    }

    // Getters y setters
    public String getPaisOrigen() {
        return paisOrigen;
    }

    public void setPaisOrigen(String paisOrigen) {
        this.paisOrigen = paisOrigen;
    }

    public int getNumeroCapitulos() {
        return numeroCapitulos;
    }

    public void setNumeroCapitulos(int numeroCapitulos) {
        this.numeroCapitulos = numeroCapitulos;
    }

    // Método para mostrar detalles de la telenovela
    @Override
    public void mostrarDetalles() {
        System.out.println();
        System.out.println("Detalles de la Telenovela:");
        System.out.println("ID: " + getId());
        System.out.println("Título: " + getTitulo());
        System.out.println("Duración en minutos: " + getDuracionEnMinutos());
        System.out.println("Género: " + getGenero());
        // Aqui se imprime lo relacionado con la clase telenovela.
        System.out.println("País de origen: " + paisOrigen);
        System.out.println("Número de capítulos: " + numeroCapitulos);
        if (!actores.isEmpty()) {
            System.out.println("Actores:");
            for (Actor actor : actores) {
                System.out.println("- " + actor.getNombre());
            }
        } else {
            System.out.println("No hay actores en esta telenovela.");
        }
    }
}