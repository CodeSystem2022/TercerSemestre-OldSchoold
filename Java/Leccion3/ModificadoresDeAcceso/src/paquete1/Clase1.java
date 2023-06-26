package paquete1;

public class Clase1 {
    public String atributoPublico = "Valor publico";

    protected String atributoProtected = "Valor protected";

    public Clase1(){
        System.out.println("Constructor Publico");
    }

    protected Clase1(String atributoPublico) {
        System.out.println("Constructor protected");
    }

    protected void metodoProtected(){
        System.out.println("Metodo proteced");
    }
    public void metodoPublico(){
        System.out.println("Metodo publico");
    }
}
