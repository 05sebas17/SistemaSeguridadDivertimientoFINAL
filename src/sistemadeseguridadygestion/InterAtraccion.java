package sistemadeseguridadygestion;

public interface InterAtraccion {
    String getNombre();
    void incrementarAverias();
    void resolverAveria();
    boolean tieneAveriasPendientes();
}
