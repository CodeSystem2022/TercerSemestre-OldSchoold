package test;

import accesodatos.IAccesoDatos;
import accesodatos.ImplementacionMySql;
import accesodatos.ImplementacionOracle;

public class TestInterface {
    public static void main(String[] args) {
        IAccesoDatos datos = new ImplementacionMySql();
        //datos.listar();
        imprimir(datos);
        datos = new ImplementacionOracle();
        datos.listar();
    }

    public static void imprimir(IAccesoDatos datos){
        datos.listar();
    }
}
