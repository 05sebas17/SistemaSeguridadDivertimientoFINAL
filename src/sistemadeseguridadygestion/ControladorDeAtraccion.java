package sistemadeseguridadygestion;

public class ControladorDeAtraccion {
    private InterAtraccion atraccion;
    private Torniquete torniqueteEntrada;
    private Torniquete torniqueteSalida;

    public ControladorDeAtraccion(InterAtraccion atraccion, Torniquete torniqueteEntrada, Torniquete torniqueteSalida) {
        this.atraccion = atraccion;
        this.torniqueteEntrada = torniqueteEntrada;
        this.torniqueteSalida = torniqueteSalida;
    }

    public void iniciarAtraccion() {
        if (!atraccion.tieneAveriasPendientes() && torniqueteEntrada.estaLlena()) {
            System.out.println("La atracción " + atraccion.getNombre() + " se está iniciando.");
        } else {
            System.out.println("La atracción " + atraccion.getNombre() + " no puede iniciarse. Averías pendientes o no está llena.");
        }
    }

    public void detenerAtraccion() {
        System.out.println("La atracción " + atraccion.getNombre() + " se ha detenido. Esperando a que todos los pasajeros salgan.");
    }

    public void verificarSalida() {
        if (torniqueteSalida.getPersonasDentro() == 0) {
            System.out.println("Todos los pasajeros han salido de la atracción " + atraccion.getNombre() + ".");
            torniqueteEntrada.resetContador();
        } else {
            System.out.println("Quedan " + torniqueteSalida.getPersonasDentro() + " pasajeros dentro de la atracción " + atraccion.getNombre() + ", deben salir.");
        }
    }

    public void verificarEstadoTorniqueteEntrada() {
        if (atraccion.tieneAveriasPendientes()) {
            torniqueteEntrada.cambiarEstado("amarillo");
        } else {
            torniqueteEntrada.cambiarEstado("verde");
        }
    }

    public void averiaResuelta() {
        System.out.println("Avería resuelta. Cambiando estado del torniquete a verde.");
        torniqueteEntrada.cambiarEstado("verde");
    }
}



