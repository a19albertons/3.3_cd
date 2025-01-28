import java.util.List;

public class Conferencia {
    private Integer sala;
    private String lugar;
    private List<Sesion> sesiones;
    private List<Inscripcion> inscripcions;

    public Conferencia() {
    }

    public Conferencia(Integer sala, String lugar, List<Sesion> sesiones, List<Inscripcion> inscripcions) {
        this.sala = sala;
        this.lugar = lugar;
        this.sesiones = sesiones;
        this.inscripcions = inscripcions;
    }

    public Integer getSala() {
        return sala;
    }

    public void setSala(Integer sala) {
        this.sala = sala;
    }

    public String getLugar() {
        return lugar;
    }

    public void setLugar(String lugar) {
        this.lugar = lugar;
    }

    public List<Sesion> getSesiones() {
        return sesiones;
    }

    public void setSesiones(List<Sesion> sesiones) {
        this.sesiones = sesiones;
    }

    public List<Inscripcion> getInscripcions() {
        return inscripcions;
    }

    public void setInscripcions(List<Inscripcion> inscripcions) {
        this.inscripcions = inscripcions;
    }

    @Override
    public String toString() {
        return "Conferencia{" +
                "sala=" + sala +
                ", lugar='" + lugar + '\'' +
                ", sesiones=" + sesiones +
                ", inscripcions=" + inscripcions +
                '}';
    }
}
