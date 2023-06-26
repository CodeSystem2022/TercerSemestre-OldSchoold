package enumeraciones;

public enum Continentes {
    AFRICA(53, "1M"),
    EUROPA(46,"2M"),
    ASIA(44, "4B"),
    AMERICA(34, "1B"),
    OCEANIA(14,"5M");

    private final int paises;
    private final String habitantes;

    //Aca creamos un atributo para la enumeracion
    Continentes(int paises, String habitantes){
        this.paises = paises;
        this.habitantes = habitantes;
    }

    //METODO GET

    public int getPaises() {
        return this.paises;
    }

    public String getHabitantes() {
        return this.habitantes;
    }
}
