package Excepciones;

public class OperacionExcepcion extends RuntimeException{
    //CONSTRUCTOR
    public OperacionExcepcion(String mensaje) {
        super (mensaje);
    }
}
