package domain;

public class Persona {
    private final int idPersona;
    private static int contadorPersonas;

    static{ //BLOQUE DE INICIALIZACION ESTATICO, SOLO SE EJECUTA UNA VEZ
        System.out.println("BLOQUE ESTATICO");
        ++Persona.contadorPersonas;
    }

    { //Bloque de inicializacion NO estatico, SE EJECUTA CADA VEZ QUE LLAMAMOS LA CLASE
        System.out.println("Ejecucion de bloque NO estatico");
        this.idPersona = Persona.contadorPersonas++;
    }

    //LOS BLOQUES DE INICIALIZACION SE EJECUTAN ANTES DEL CONSTRUCTOR

    public Persona() {
        System.out.println("Ejecucion del constructor");
    }

    public int getIdPersona(){
        return this.idPersona;
    }

    @Override
    public String toString() {
        return "Persona{" +
                "idPersona=" + idPersona +
                '}';
    }
}
