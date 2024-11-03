/**
 * Class Actor
 */
package uni1a;

import java.util.ArrayList;
import java.util.List;

public class Actor {
    private String nombre;
    private int edad;
    private List<Pelicula> peliculas; // Asociación con Película

    public Actor(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
        this.peliculas = new ArrayList<>();
    }

    // Método para agregar una película a la lista del actor
    public void agregarPelicula(Pelicula pelicula) {
        if (!peliculas.contains(pelicula)) {
            peliculas.add(pelicula);
            pelicula.agregarActor(this); // Enlace bidireccional
        }
    }
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public List<Pelicula> getPeliculas() {
        return peliculas;
    }

    public void setPeliculas(List<Pelicula> peliculas) {
        this.peliculas = peliculas;
    }

    @Override
    public String toString() {
        return "Actor:\n" + "\tnombre:'" + nombre + '\'' + ", edad=" + edad + ", peliculas:" + peliculas;
    }
}