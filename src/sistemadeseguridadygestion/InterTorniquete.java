package sistemadeseguridadygestion;

public interface InterTorniquete {
    void registrarEntrada();
    void registrarSalida();
    boolean estaLlena();
    int getPersonasDentro();
    void resetContador();
    void cambiarEstado(String nuevoEstado);
    void setPersonasDentro(int personasDentro);
}
