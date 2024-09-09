package sistemadeseguridadygestion;

public class Main {

    public static void main(String[] args) {
        // CRA y operarios
        CRA cra = new CRA();
        Operario operario1 = new Operario("Luis Suarez");
        Operario operario2 = new Operario("Sebastian Martin");
        cra.agregarOperario(operario1);
        cra.agregarOperario(operario2);

        // noria y vehiculos
        InterAtraccion noria = new Noria("Noria");
        InterVehiculo vehiculo1 = new VehiculoNoria("Vehiculo 1", "Noria");
        InterVehiculo vehiculo2 = new VehiculoNoria("Vehiculo 2", "Noria");
        ((Noria) noria).agregarVehiculo((VehiculoNoria) vehiculo1);
        ((Noria) noria).agregarVehiculo((VehiculoNoria) vehiculo2);

        // montana rusa y vagones
        InterAtraccion montanaRusa = new MontanaRusa("Montana Rusa");
        InterVehiculo vagon1 = new VagonMontanaRusa("Vagon 1");
        InterVehiculo vagon2 = new VagonMontanaRusa("Vagon 2");
        ((MontanaRusa) montanaRusa).agregarVagon((VagonMontanaRusa) vagon1);
        ((MontanaRusa) montanaRusa).agregarVagon((VagonMontanaRusa) vagon2);

        // torniquetes para la montana rusa
        Torniquete torniqueteEntradaMontanaRusa = new Torniquete(5);
        Torniquete torniqueteSalidaMontanaRusa = new Torniquete(5);

        torniqueteEntradaMontanaRusa.setPersonasDentro(0);

        // asignar el torniquete de entrada 
        ((MontanaRusa) montanaRusa).setTorniqueteEntrada(torniqueteEntradaMontanaRusa); 

        // controlador de la montana rusa
        ControladorDeAtraccion controladorMontanaRusa = new ControladorDeAtraccion(montanaRusa, torniqueteEntradaMontanaRusa, torniqueteSalidaMontanaRusa);
        
        // simulacion de averia 
        vagon1.perderAnclaje(); 
        ((MontanaRusa) montanaRusa).verificarAnclajes(cra); 

        // verificar el estado del torniquete de entrada tras la averia
        controladorMontanaRusa.verificarEstadoTorniqueteEntrada(); 

        // entrada de personas en la montana rusa
        torniqueteEntradaMontanaRusa.registrarEntrada(); 
        torniqueteEntradaMontanaRusa.registrarEntrada(); 
        torniqueteEntradaMontanaRusa.registrarEntrada();
        torniqueteEntradaMontanaRusa.registrarEntrada(); 
        torniqueteEntradaMontanaRusa.registrarEntrada(); 
        
        // registrar salida de una persona
        torniqueteEntradaMontanaRusa.registrarSalida();
        
        // intentar iniciar la montana rusa
        controladorMontanaRusa.iniciarAtraccion();
        
        torniqueteEntradaMontanaRusa.registrarEntrada(); 
        
        System.out.println("Personas dentro de la Montana Rusa: " + torniqueteEntradaMontanaRusa.getPersonasDentro());
        
        controladorMontanaRusa.iniciarAtraccion();
  
        // detener la montana rusa
        controladorMontanaRusa.detenerAtraccion();
        
        torniqueteEntradaMontanaRusa.registrarSalida();
        torniqueteEntradaMontanaRusa.registrarSalida();
        torniqueteEntradaMontanaRusa.registrarSalida();
        torniqueteEntradaMontanaRusa.registrarSalida();
        torniqueteEntradaMontanaRusa.registrarSalida();

        System.out.println("Personas dentro de la Montana Rusa: " + torniqueteEntradaMontanaRusa.getPersonasDentro());
        
        // verificar que todos han salido
        controladorMontanaRusa.verificarSalida();
        
        // torniquetes de la noria
        Torniquete torniqueteEntradaNoria = new Torniquete(3);
        Torniquete torniqueteSalidaNoria = new Torniquete(3);
        
        torniqueteEntradaNoria.setPersonasDentro(0);

        // asignar el torniquete de entrada a la noria
        ((Noria) noria).setTorniqueteEntrada(torniqueteEntradaNoria);

        // controlador de la noria
        ControladorDeAtraccion controladorNoria = new ControladorDeAtraccion(noria, torniqueteEntradaNoria, torniqueteSalidaNoria);
        
        // simulacion de entrada de personas
        torniqueteEntradaNoria.registrarEntrada(); 
        torniqueteEntradaNoria.registrarEntrada(); 
        torniqueteEntradaNoria.registrarEntrada(); 
        torniqueteEntradaNoria.registrarEntrada(); 
        torniqueteEntradaNoria.registrarEntrada(); 
        
        System.out.println("Personas dentro de la Noria: " + torniqueteEntradaNoria.getPersonasDentro());
  
        // iniciar la noria
        controladorNoria.iniciarAtraccion();

        // detener la noria
        controladorNoria.detenerAtraccion();
        
        torniqueteEntradaNoria.registrarSalida();
        torniqueteEntradaNoria.registrarSalida();
        torniqueteEntradaNoria.registrarSalida();
        
        System.out.println("Personas dentro de la Noria: " + torniqueteEntradaNoria.getPersonasDentro());

        controladorNoria.verificarSalida();
        
        // simulacion de averia 
        vehiculo1.perderAnclaje();
        ((Noria) noria).verificarAnclajes(cra);
        
        controladorNoria.verificarEstadoTorniqueteEntrada();
        
        
        vagon1.perderAnclaje();
        ((MontanaRusa) montanaRusa).verificarAnclajes(cra);
        
        controladorNoria.verificarEstadoTorniqueteEntrada();
    }
}


