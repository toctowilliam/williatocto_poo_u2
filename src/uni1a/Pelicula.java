/**
 * Class Pelicula
 */
package uni1a;

import java.util.ArrayList;
import java.util.List;

// Subclase Pelicula que extiende de ContenidoAudiovisual
public class Pelicula extends ContenidoAudiovisual {
    private String estudio;
    private List<Actor> actores; // Asociación con Actor

    public Pelicula(String titulo, int duracionEnMinutos, String genero, String estudio) {
        super(titulo, duracionEnMinutos, genero);
        this.estudio = estudio;
        this.actores = new ArrayList<>(); // lista de actores vacía
    }

    // Método para agregar un actor a la lista de la película
    public void agregarActor(Actor actor) {
        if (!actores.contains(actor)) {
            actores.add(actor);
            actor.agregarPelicula(this);
        }
    }

    // Método para eliminar un actor
    public void eliminarActor(Actor actor) {
        actores.remove(actor);
    }
    // Método para obtener los actores.
    public List<Actor> obtenerActores() {
        return new ArrayList<>(actores);
    }

    // Getters y setters
    public String getEstudio() {
        return estudio;
    }

    public void setEstudio(String estudio) {
        this.estudio = estudio;
    }
    @Override
    public void mostrarDetalles() {
        System.out.println("Detalles de la película:");
        System.out.println("ID: " + getId());
        System.out.println("Título: " + getTitulo());
        System.out.println("Duración en minutos: " + getDuracionEnMinutos());
        System.out.println("Género: " + getGenero());
        System.out.println("Estudio: " + estudio);
        System.out.println("Actores:");
        for (Actor actor : actores) {
            System.out.println("\t"+actor);
        }
        System.out.println("================================================================");
    }
    @Override
    public String toString() {
        return  getTitulo() ;
    }
}