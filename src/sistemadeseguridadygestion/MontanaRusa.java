package sistemadeseguridadygestion;

import java.util.ArrayList;

public class MontanaRusa extends Atraccion {
    private ArrayList<VagonMontanaRusa> vagones = new ArrayList<>();
    private Torniquete torniqueteEntrada;

    public MontanaRusa(String nombre) {
        super(nombre);
    }

    public void agregarVagon(VagonMontanaRusa vagon) {
        vagones.add(vagon);
    }

    public void verificarAnclajes(CRA cra) {
        for (VagonMontanaRusa vagon : vagones) {
            vagon.notificarAveria(cra, this);
        }
    }

    public void setTorniqueteEntrada(Torniquete torniqueteEntrada) {
        this.torniqueteEntrada = torniqueteEntrada;
    }

    public Torniquete getTorniqueteEntrada() {
        return torniqueteEntrada;
    }
}
