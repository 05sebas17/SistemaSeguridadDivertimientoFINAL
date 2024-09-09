package sistemadeseguridadygestion;

import java.util.ArrayList;

public class CRA {
    private ArrayList<Operario> operarios = new ArrayList<>();

    public void agregarOperario(Operario operario) {
        operarios.add(operario);
    }

    public void gestionarAveria(Averia averia, InterAtraccion atraccion) {
        System.out.println("..AVERIA ENCONTRADA.. Gestionando avería en " + averia.getComponenteAveriado() + " de la atracción " + atraccion.getNombre());

        if (atraccion instanceof Noria) {
            Noria noria = (Noria) atraccion;
            noria.getTorniqueteEntrada().cambiarEstado("amarillo");
        } else if (atraccion instanceof MontanaRusa) {
            MontanaRusa montañaRusa = (MontanaRusa) atraccion;
            montañaRusa.getTorniqueteEntrada().cambiarEstado("amarillo"); 
        }

        for (Operario operario : operarios) {
            if (!operario.estaOcupado()) {
                operario.atenderAveria(averia, (Atraccion) atraccion);
                return;
            }
        }

        System.out.println("No hay operarios disponibles en este momento.");
    }

}
