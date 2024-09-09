package sistemadeseguridadygestion;

public class Averia {
    private String componenteAveriado;
    private String descripcion;

    public Averia(String componenteAveriado, String descripcion) {
        this.componenteAveriado = componenteAveriado;
        this.descripcion = descripcion;
    }

    public String getComponenteAveriado() {
        return componenteAveriado;
    }

    public String getDescripcion() {
        return descripcion;
    }
}
