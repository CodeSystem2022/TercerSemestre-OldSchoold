import java.util.Scanner;

public class CalculadoraUTN {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        while(true) {
            System.out.println("****** Aplicacion Calculadora *******");
            mostrarMenu();

            try {
                var operacion = Integer.parseInt(entrada.nextLine());
                if (operacion >= 1 && operacion <= 4) {
                    ejecutarOperacion(operacion, entrada);
                } //FIN DEL IF
                else if (operacion == 5) {
                    System.out.println("Hasta pronto");
                    break; //ROMPE EL CICLO
                } else {
                    System.out.println("Operacion erronea " + operacion);
                }
                //Imprimimos un salto de linea antes de repetir el menu
                System.out.println("");
            } catch (Exception e){ //FIN TRY, COMIENZO CATCH
                System.out.println("Ocurrio un error: "+e.getMessage());
                System.out.println("");
            }
        }//Fin While
    }//FIN MAIN

    private static void mostrarMenu(){
        //Mostramos el menu
        System.out.println("""
                    1. Suma
                    2. Resta
                    3. Multiplicacion
                    4. Divison
                    5. Salir
                    """);
        System.out.print("Operacion a realizar: ");
    }

    private static void ejecutarOperacion(int operacion, Scanner entrada){
        double resultado;
        System.out.print("Digite el valor para el operando 1: ");
        var operando1 = Double.parseDouble(entrada.nextLine());
        System.out.print("Digite el valor para el operando 2: ");
        var operando2 = Double.parseDouble(entrada.nextLine());

        switch (operacion) {
            case 1 -> {
                resultado = operando1 + operando2;
                System.out.println("resultado de la suma = " + resultado);
            }
            case 2 -> {
                resultado = operando1 - operando2;
                System.out.println("resultado de la resta = " + resultado);
            }
            case 3 -> {
                resultado = operando1 * operando2;
                System.out.println("resultado de la multiplicacion = " + resultado);
            }
            case 4 -> {
                resultado = operando1 / operando2;
                System.out.println("resultado de la division = " + resultado);
            }
            default -> System.out.println("Opcion erronea: " + operacion);
        }//FIN SWITCH
    }//FIN METODO EJECUTAR
}//FIN CLASE
