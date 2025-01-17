public class Artigo {
    private String tema;
    private String duracion;

    public Artigo() {
    }

    public Artigo(String duracion, String tema) {
        this.duracion = duracion;
        this.tema = tema;
    }

    public String getDuracion() {
        return duracion;
    }

    public void setDuracion(String duracion) {
        this.duracion = duracion;
    }

    public String getTema() {
        return tema;
    }

    public void setTema(String tema) {
        this.tema = tema;
    }

    @Override
    public String toString() {
        return "Artigo{" +
                "duracion='" + duracion + '\'' +
                ", tema='" + tema + '\'' +
                '}';
    }
}
