package co.edu.uniquindio.parcial2.parcial2.patterns.factoryMethod;

import co.edu.uniquindio.parcial2.parcial2.patterns.factoryMethod.Inter.IConexion;

public class Main {

    public static void main(String[] args) {
        ConexionFabrica fabrica = new ConexionFabrica();

        IConexion cx1 = fabrica.getConexion("EMPPER");
        cx1.conectar();
        cx1.desconectar();

        IConexion cx2 = fabrica.getConexion("EMPTEM");
        cx2.conectar();
        cx2.desconectar();
    }
}