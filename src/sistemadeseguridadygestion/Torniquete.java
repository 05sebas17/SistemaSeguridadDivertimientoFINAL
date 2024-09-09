package sistemadeseguridadygestion;

public class Torniquete implements InterTorniquete {
    private int capacidadMaxima;
    private int personasDentro;
    private String estado;

    public Torniquete(int capacidadMaxima) {
        this.capacidadMaxima = capacidadMaxima;
        this.personasDentro = 0;
        this.estado = "verde"; // SIEMPRE EMPEZARA EN VERDE
    }

    @Override
    public void registrarEntrada() {
        if (estado.equals("verde")) {
            if (personasDentro < capacidadMaxima) {
                personasDentro++;
                System.out.println("Persona ha entrado. Personas dentro: " + personasDentro);
            } else {
                System.out.println("Capacidad máxima alcanzada. No se puede permitir más entradas.");
            }
        }
    }

    @Override
    public void registrarSalida() {
        if (personasDentro > 0) {
            personasDentro--;
            System.out.println("Persona ha salido. Personas dentro: " + personasDentro);
        } else {
            System.out.println("No se puede registrar la salida. No hay personas dentro.");
        }
    }

    @Override
    public boolean estaLlena() {
        return personasDentro == capacidadMaxima;
    }

    @Override
    public int getPersonasDentro() {
        return personasDentro;
    }

    @Override
    public void resetContador() {
        personasDentro = 0;
        System.out.println("Contador de personas reiniciado.");
    }

    @Override
    public void cambiarEstado(String nuevoEstado) {
        this.estado = nuevoEstado;
        System.out.println("El torniquete ahora está en estado: " + estado);
    }

    @Override
    public void setPersonasDentro(int personasDentro) {
        this.personasDentro = personasDentro;
    }
}

