public class Conferencia {
    private Integer sala;
    private String lugar;

    public Conferencia() {
    }

    public Conferencia(String lugar, Integer sala) {
        this.lugar = lugar;
        this.sala = sala;
    }

    public String getLugar() {
        return lugar;
    }

    public void setLugar(String lugar) {
        this.lugar = lugar;
    }

    public Integer getSala() {
        return sala;
    }

    public void setSala(Integer sala) {
        this.sala = sala;
    }

    @Override
    public String toString() {
        return "Conferencia{" +
                "lugar='" + lugar + '\'' +
                ", sala=" + sala +
                '}';
    }
}
