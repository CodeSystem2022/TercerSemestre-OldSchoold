package test;

import domain.Empleado;
import domain.Escritor;
import domain.TipoEscritura;

public class TestConversionObjetos {
    public static void main(String[] args) {
        Empleado empleado;
        empleado = new Escritor("Juan", 5000, TipoEscritura.CLASICO);
        //System.out.println("empleado = " + empleado);
        System.out.println(empleado.obtenerDetalles());
        //empleado.getTipoEscritura(); ACA NO SE PUEDE HACER

        //DOWNCASTING PARA PODER ACCCEDER A METODOS QUE ESTAN SOLO EN LA CLASE HIJA
        //((Escritor)empleado).getTipoEscritura(); ESTA ES UNA FORMA

        Escritor escritor = (Escritor)empleado;
        escritor.getTipoEscritura();

        //UPCASTING

        Empleado empleado2 = escritor;
        System.out.println(empleado2.obtenerDetalles());



    }
}
