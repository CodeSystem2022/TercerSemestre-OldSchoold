package domain;

public class ClaseGerente extends Empleado{
    private String departamento;

    public ClaseGerente(String nombre, double sueldo, String departamento) {
        super(nombre, sueldo);
        this.departamento = departamento;
    }

    @Override //Anotacion Sobreescribir
    public String obtenerDetalles(){
        return super.obtenerDetalles()+", Departamento: "+this.departamento;

        }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }
}
