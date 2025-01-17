import java.sql.Time;
import java.util.Date;
import java.util.List;

public class Sesion {
    private Date inicio_dia;
    private Time inicio_hora;
    private Conferencia conferencia;
    private List<Artigo> artigo;

    public Sesion() {
    }

    public Sesion(List<Artigo> artigo, Conferencia conferencia, Date inicio_dia, Time inicio_hora) {
        this.artigo = artigo;
        this.conferencia = conferencia;
        this.inicio_dia = inicio_dia;
        this.inicio_hora = inicio_hora;
    }

    public List<Artigo> getArtigo() {
        return artigo;
    }

    public void setArtigo(List<Artigo> artigo) {
        this.artigo = artigo;
    }

    public Conferencia getConferencia() {
        return conferencia;
    }

    public void setConferencia(Conferencia conferencia) {
        this.conferencia = conferencia;
    }

    public Date getInicio_dia() {
        return inicio_dia;
    }

    public void setInicio_dia(Date inicio_dia) {
        this.inicio_dia = inicio_dia;
    }

    public Time getInicio_hora() {
        return inicio_hora;
    }

    public void setInicio_hora(Time inicio_hora) {
        this.inicio_hora = inicio_hora;
    }

    @Override
    public String toString() {
        return "Sesion{" +
                "artigo=" + artigo +
                ", inicio_dia=" + inicio_dia +
                ", inicio_hora=" + inicio_hora +
                ", conferencia=" + conferencia +
                '}';
    }
}
