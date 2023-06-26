package domain;

public abstract class FiguraGeometrica {
    protected String tipoFigura;

    protected FiguraGeometrica(String tipoFigura) {
        this.tipoFigura = tipoFigura;
    }

    //METODO ABSTRACTO
    public abstract void dibujar();

    //AGREGAMOS GET Y SET
    public String getTipoFigura() {
        return tipoFigura;
    }

    public void setTipoFigura(String tipoFigura) {
        this.tipoFigura = tipoFigura;
    }

    @Override
    public String toString() {
        return "FiguraGeometrica{" +
                "tipoFigura='" + tipoFigura + '\'' +
                '}';
    }
}
