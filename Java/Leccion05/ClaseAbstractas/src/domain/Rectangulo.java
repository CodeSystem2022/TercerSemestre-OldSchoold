package domain;

public class Rectangulo extends FiguraGeometrica{
    //CONSTRUCTOR
    public Rectangulo(String tipoFigura){
        super(tipoFigura);
    }

    @Override
    public void dibujar(){ //IMPLEMENTAMOS EL METODO ABSTRACTO DE LA CLASE PADRE
        System.out.println("Se imprime un: "+this.getClass().getSimpleName());
    }
}
