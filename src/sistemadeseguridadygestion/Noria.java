package sistemadeseguridadygestion;

import java.util.ArrayList;

public class Noria extends Atraccion {
    private ArrayList<VehiculoNoria> vehiculos = new ArrayList<>();
    private Torniquete torniqueteEntrada;

    public Noria(String nombre) {
        super(nombre);
    }

    public void agregarVehiculo(VehiculoNoria vehiculo) {
        vehiculos.add(vehiculo);
    }

    public void verificarAnclajes(CRA cra) {
        for (VehiculoNoria vehiculo : vehiculos) {
            vehiculo.notificarAveria(cra, this);
        }
    }

    public void setTorniqueteEntrada(Torniquete torniqueteEntrada) {
        this.torniqueteEntrada = torniqueteEntrada;
    }

    public Torniquete getTorniqueteEntrada() {
        return torniqueteEntrada;
    }
}
