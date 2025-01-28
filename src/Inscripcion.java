import java.util.Date;

public class Inscripcion {
    private Boolean estado;
    private Date fechaInscripcion;
    private Integer prezo;

    public Inscripcion() {
    }

    public Inscripcion(Boolean estado, Date fechaInscripcion, Integer prezo) {
        this.estado = estado;
        this.fechaInscripcion = fechaInscripcion;
        this.prezo = prezo;
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

    public Integer getPrezo() {
        return prezo;
    }

    public void setPrezo(Integer prezo) {
        this.prezo = prezo;
    }

    @Override
    public String toString() {
        return "Inscripcion{" +
                "estado=" + estado +
                ", fechaInscripcion=" + fechaInscripcion +
                ", prezo=" + prezo +
                '}';
    }
    public void cambioEstado(){

    }
}
