package sistemadeseguridadygestion;

public class VehiculoNoria extends Vehiculo {
    private String tipo;

    public VehiculoNoria(String idVehiculo, String tipo) {
        super(idVehiculo);
        this.tipo = tipo;
    }

    @Override
    public void notificarAveria(CRA cra, InterAtraccion atraccion) {
        if (!verificarAnclaje()) {
            String descripcionAveria = "El vehículo de tipo " + tipo + " ha perdido el anclaje a la estructura";
            Averia averia = new Averia(getIdVehiculo(), descripcionAveria);
            cra.gestionarAveria(averia, atraccion);
        }
    }
}
