package domain;

public class Gerente extends Empleado {
    private String departamento;

    public Gerente(String nombre, double sueldo, String departamento) {
        super(nombre, sueldo);
        this.departamento = departamento;
    }

    public String obtenerDetalles() {
        String var10000 = super.obtenerDetalles();
        return var10000 + ", Departamento: " + this.departamento;
    }
}
