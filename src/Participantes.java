import java.util.List;

public class Participantes {
    private String nombre;
    private String apellidos;
    private String tipo;
    private List<Inscripcion> inscripcions;

    public Participantes() {
    }

    public Participantes(String nombre, String apellidos, String tipo, List<Inscripcion> inscripcions) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.tipo = tipo;
        this.inscripcions = inscripcions;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public List<Inscripcion> getInscripcions() {
        return inscripcions;
    }

    public void setInscripcions(List<Inscripcion> inscripcions) {
        this.inscripcions = inscripcions;
    }

    @Override
    public String toString() {
        return "Participantes{" +
                "nombre='" + nombre + '\'' +
                ", apellidos='" + apellidos + '\'' +
                ", tipo='" + tipo + '\'' +
                ", inscripcions=" + inscripcions +
                '}';
    }

    public void inscribirse(){

    }
}
