package test;

import enumeraciones.Continentes;
import enumeraciones.Dias;

public class TestEnumeraciones {
    public static void main(String[] args) {
        //System.out.println("Dia 1: "+ Dias.LUNES);
        //indicarDiaSemana(Dias.JUEVES);

        System.out.println("El continente 4: " +Continentes.AMERICA
                +", la cantidad de paises que tiene es de: " +Continentes.AMERICA.getPaises()
                +", y su cantidad de habitantes es: "+Continentes.AMERICA.getHabitantes() );

        System.out.println("");
        System.out.println("El continente 1: " +Continentes.AFRICA
                +", la cantidad de paises que tiene es de: " +Continentes.AFRICA.getPaises()
                +", y su cantidad de habitantes es: "+Continentes.AFRICA.getHabitantes() );
    }

    private static void indicarDiaSemana(Dias dias) {
        switch(dias){
            case LUNES:
                System.out.println("Primer dia de la semana");
                break;
            case MARTES:
                System.out.println("Segundo dia de la semana");
                break;
            case MIERCOLES:
                System.out.println("Tercer dia de la semana");
                break;
            case JUEVES:
                System.out.println("Cuarto dia de la semana");
                break;
            case VIERNES:
                System.out.println("Quinto dia de la semana");
                break;
            case SABADO:
                System.out.println("Sexto dia de la semana");
                break;
            case DOMINGO:
                System.out.println("Ultimo dia de la semana");
                break;
            default:
                System.out.println("No existe ese dia de la semana");
        }
    }
}
