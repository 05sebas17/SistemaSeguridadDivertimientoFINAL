package sistemadeseguridadygestion;

public interface InterVehiculo {
    boolean verificarAnclaje();
    void perderAnclaje();
    void notificarAveria(CRA cra, InterAtraccion atraccion);
}
