/**
 * Class SerieDeTV
 */
package uni1a;
import java.util.ArrayList;
import java.util.List;

// Subclase SerieDeTV que extiende de ContenidoAudiovisual
public class SerieDeTV extends ContenidoAudiovisual {
    private int temporadas;
    private List<Temporada> listaTemporadas; // Relacion de  composicion ya que una temporada no puede existir sin una SerieDeTv

    public SerieDeTV(String titulo, int duracionEnMinutos, String genero, int temporadas) {
        super(titulo, duracionEnMinutos, genero);
        if (temporadas < 0) {
            throw new IllegalArgumentException("El número de temporadas no puede ser negativo.");
        }
        this.temporadas = temporadas;
        this.listaTemporadas = new ArrayList<>();
    }

    public int getTemporadas() {
        return temporadas;
    }

    public void setTemporadas(int temporadas) {
        this.temporadas = temporadas;
    }
    // Clase SerieDeTV
    public void agregarTemporada(Temporada temporada) {
        if (listaTemporadas.size() < temporadas) {
            listaTemporadas.add(temporada);
        }
    }
    public void eliminarSerie() {
        listaTemporadas.clear(); // Elimina todas las temporadas asociadas
    }
    @Override
    public void mostrarDetalles() {
        System.out.println("Detalles de la Serie TV:");
        System.out.println("ID: " + getId());
        System.out.println("Título: " + getTitulo());
        System.out.println("Duración en minutos: " + getDuracionEnMinutos());
        System.out.println("Género: " + getGenero());
        System.out.println("Temporadas: " + this.temporadas);
        System.out.println("Temporadas:");
        for (Temporada temporada : listaTemporadas) {
            System.out.println(temporada);
        }
        System.out.println("================================================================");
    }
}