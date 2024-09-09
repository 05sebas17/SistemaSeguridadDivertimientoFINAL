package sistemadeseguridadygestion;

public abstract class Atraccion implements InterAtraccion {
    private String nombre;
    private int averiasPendientes = 0;

    public Atraccion(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public void incrementarAverias() {
        averiasPendientes++;
    }

    @Override
    public void resolverAveria() {
        if (averiasPendientes > 0) {
            averiasPendientes--;
        }
    }

    @Override
    public boolean tieneAveriasPendientes() {
        return averiasPendientes > 0;
    }

    @Override
    public String getNombre() {
        return nombre;
    }
}
