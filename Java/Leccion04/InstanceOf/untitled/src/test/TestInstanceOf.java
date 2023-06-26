package test;

import domain.ClaseGerente;
import domain.Empleado;

public class TestInstanceOf {
    public static void main(String[] args) {
        Empleado empleado1 = new Empleado("Juan", 10000);
        determinarTipo(empleado1);
        empleado1 = new ClaseGerente("Jose", 5000, "Sistemas");

    }

    public static void determinarTipo(Empleado empleado){
        if(empleado instanceof ClaseGerente) {
            System.out.println("Es de tipo gerente");
            ((ClaseGerente) empleado).getDepartamento();
        } else if (empleado instanceof Empleado) {
            System.out.println("Es de tipo Empleado");
        } else if (empleado instanceof Object) {
            System.out.println("Es de clase objeto");
        }
    }
}
