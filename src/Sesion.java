import java.sql.Time;
import java.util.Date;
import java.util.List;

public class Sesion {
    private Date inicio_dia;
    private Time inicio_hora;
    private List<Artigo> artigo;

    public Sesion() {
    }

    public Sesion(Date inicio_dia, Time inicio_hora, List<Artigo> artigo) {
        this.inicio_dia = inicio_dia;
        this.inicio_hora = inicio_hora;
        this.artigo = artigo;
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

    public List<Artigo> getArtigo() {
        return artigo;
    }

    public void setArtigo(List<Artigo> artigo) {
        this.artigo = artigo;
    }

    @Override
    public String toString() {
        return "Sesion{" +
                "inicio_dia=" + inicio_dia +
                ", inicio_hora=" + inicio_hora +
                ", artigo=" + artigo +
                '}';
    }


}
