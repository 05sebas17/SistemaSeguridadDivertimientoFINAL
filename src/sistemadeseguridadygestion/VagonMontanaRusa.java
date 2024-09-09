package sistemadeseguridadygestion;

public class VagonMontanaRusa extends Vehiculo {
    public VagonMontanaRusa(String idVagon) {
        super(idVagon);
    }

    @Override
    public void notificarAveria(CRA cra, InterAtraccion atraccion) {
        if (!verificarAnclaje()) {
            Averia averia = new Averia(getIdVehiculo(), "El vagón ha perdido el anclaje con el vagón posterior");
            cra.gestionarAveria(averia, atraccion);
        }
    }
}
