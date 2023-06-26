package mundoPc;

import ar.com.system2023.mundopc.*;

public class MundoPc {
    public static void main(String[] args) {
        Monitor monitorHP = new Monitor("HP", 13.0);
        Teclado tecladoHP = new Teclado("Bluetooth", "HP");
        Raton ratonHP = new Raton("Bluetooth", "HP");
        Computadora computadoraHP = new Computadora("Computadora HP", monitorHP, tecladoHP, ratonHP);

        Monitor monitorGamer = new Monitor("Zowie", 24.0);
        Teclado tecladoGamer = new Teclado("USB", "HyperX");
        Raton ratonGamer = new Raton("USB", "Logitech");
        Computadora computadoraGamer = new Computadora("Computadora Gamer", monitorGamer, tecladoGamer, ratonGamer);

        Orden orden1 = new Orden();
        orden1.agregarComputadora(computadoraHP);
        orden1.agregarComputadora(computadoraGamer);
        orden1.mostrarOrden();

        Monitor monitorGamer2 = new Monitor("Zowie", 24.0);
        Teclado tecladoGamer2 = new Teclado("USB", "HyperX");
        Raton ratonGamer2 = new Raton("USB", "Logitech");
        Computadora computadoraGamer2 = new Computadora("Computadora Gamer", monitorGamer2, tecladoGamer2, ratonGamer2);

        Orden orden2 = new Orden();
        orden2.agregarComputadora(computadoraGamer2);
        orden2.mostrarOrden();
    }
}
