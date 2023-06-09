package test;

public class TestAutoboxingUnboxing {
    public static void main(String[] args) {
        //Clases envolventes o Wrapper
        /*
            Clases envolventes de tipos primitivos
            int = Integer
            long = Long
            float = Float
            double = Double
            boolean = Boolean
            byte = Byte
            char = Character
            short = Short
         */
        
        int enteroPrim = 10; //Tipo primitivo
        System.out.println("enteroPrim = " + enteroPrim);
        Integer entero = 10; //Tipo object con la clase Integer
        System.out.println("entero = " + entero.doubleValue()); //Esto es el Autoboxing, es decir volver a un dato primitivo
    
        int entero2 = entero; //UNBOXING
        System.out.println("entero2 = " + entero2);
    }
}
