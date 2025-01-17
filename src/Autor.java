import java.util.List;

public class Autor {
    private String nombre;
    private String apellidos;
    private List<Artigo> artigo;

    public Autor() {
    }

    public Autor(String apellidos, List<Artigo> artigo, String nombre) {
        this.apellidos = apellidos;
        this.artigo = artigo;
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public List<Artigo> getArtigo() {
        return artigo;
    }

    public void setArtigo(List<Artigo> artigo) {
        this.artigo = artigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Autor{" +
                "apellidos='" + apellidos + '\'' +
                ", nombre='" + nombre + '\'' +
                ", artigo=" + artigo +
                '}';
    }
}

