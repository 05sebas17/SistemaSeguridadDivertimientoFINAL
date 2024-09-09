package sistemadeseguridadygestion;

public abstract class Vehiculo implements InterVehiculo {
    private boolean anclado;
    private String idVehiculo;

    public Vehiculo(String idVehiculo) {
        this.idVehiculo = idVehiculo;
        this.anclado = true; //inicia anclado por defecto 
    }

    @Override
    public boolean verificarAnclaje() {
        return anclado;
    }

    @Override
    public void perderAnclaje() {
        this.anclado = false;
    }

    @Override
    public abstract void notificarAveria(CRA cra, InterAtraccion atraccion);

    public String getIdVehiculo() {
        return idVehiculo;
    }
}
