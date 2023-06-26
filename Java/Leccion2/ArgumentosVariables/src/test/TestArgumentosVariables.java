package test;

public class TestArgumentosVariables {
    public static void main(String[] args) {
        imprimirNumeros(3,4,5);
        imprimirNumeros(1,2);
        variosParametros("Francisco", 7,8,9);
    }

    private static void variosParametros(String nombre, int...numeros){
        System.out.println("Aca empieza el VARIOSPARA");
        System.out.println("Nombre: "+nombre);
        imprimirNumeros(numeros);
        System.out.println("ACA TERMINA");
    }
    private static void imprimirNumeros(int ...numeros) {
        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Elementos: "+numeros[i]);
        }
    }
}
