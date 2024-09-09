package sistemadeseguridadygestion;

public class Operario {
    private String nombre;
    private boolean ocupado;

    public Operario(String nombre) {
        this.nombre = nombre;
        this.ocupado = false;
    }

    public void atenderAveria(Averia averia, Atraccion atraccion) {
        if (!ocupado) {
            ocupado = true;
            System.out.println(nombre + " está atendiendo la avería en " + averia.getComponenteAveriado() + " de la atracción " + atraccion.getNombre());
         
            //simulamos que la avería se resuelve
            atraccion.resolverAveria();
            ocupado = false;
            System.out.println(nombre + " ha resuelto la avería.");
        } else {
            System.out.println(nombre + " está ocupado y no puede atender la avería en este momento.");
        }
    }

    public boolean estaOcupado() {
        return ocupado;
    }

    public String getNombre() {
        return nombre;
    }
}
