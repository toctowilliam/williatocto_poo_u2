package uni1a;

public class Investigador {
    private String nombre;
    private String especialidad;

    public Investigador(String nombre, String especialidad) {
        this.nombre = nombre;
        this.especialidad = especialidad;
    }

    // Getters y Setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCampoEstudio() {
        return especialidad;
    }

    public void setCampoEstudio(String campoEstudio) {
        this.especialidad = campoEstudio;
    }

    @Override
    public String toString() {
        return "\t" + "nombre:'" + nombre + '\'' + ", Especialidad='" + especialidad + '\'';
    }
}
