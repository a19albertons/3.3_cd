import java.util.Date;

public class Inscripcion {
    private Boolean estado;
    private Date fechaInscripcion;
    private Integer prezo;
    private Participantes participantes;
    private Conferencia conferencia;

    public Inscripcion() {
    }

    public Inscripcion(Conferencia conferencia, Boolean estado, Date fechaInscripcion, Participantes participantes, Integer prezo) {
        this.conferencia = conferencia;
        this.estado = estado;
        this.fechaInscripcion = fechaInscripcion;
        this.participantes = participantes;
        this.prezo = prezo;
    }

    public Conferencia getConferencia() {
        return conferencia;
    }

    public void setConferencia(Conferencia conferencia) {
        this.conferencia = conferencia;
    }

    public Boolean getEstado() {
        return estado;
    }

    public void setEstado(Boolean estado) {
        this.estado = estado;
    }

    public Date getFechaInscripcion() {
        return fechaInscripcion;
    }

    public void setFechaInscripcion(Date fechaInscripcion) {
        this.fechaInscripcion = fechaInscripcion;
    }

    public Participantes getParticipantes() {
        return participantes;
    }

    public void setParticipantes(Participantes participantes) {
        this.participantes = participantes;
    }

    public Integer getPrezo() {
        return prezo;
    }

    public void setPrezo(Integer prezo) {
        this.prezo = prezo;
    }

    @Override
    public String toString() {
        return "Inscripcion{" +
                "conferencia=" + conferencia +
                ", estado=" + estado +
                ", fechaInscripcion=" + fechaInscripcion +
                ", prezo=" + prezo +
                ", participantes=" + participantes +
                '}';
    }
}
