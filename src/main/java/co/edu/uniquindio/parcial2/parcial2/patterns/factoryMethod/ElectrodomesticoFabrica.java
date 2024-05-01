package co.edu.uniquindio.parcial2.parcial2.patterns.factoryMethod;

import co.edu.uniquindio.parcial2.parcial2.patterns.factoryMethod.Inter.Impl.*;

public class ElectrodomesticoFabrica {
    public Electrodomestico getElectrodomestico(String tipo) {
        if (tipo == null) {
            return new ElectrodomesticoVacio();
        }
        if (tipo.equalsIgnoreCase("TELEVISOR")) {
            return new Televisor();
        }
        if (tipo.equalsIgnoreCase("LAVADORA")) {
            return new Lavadora();
        }
        if (tipo.equalsIgnoreCase("REFRIGERADOR")) {
            return new Refrigerador();
        }
        return new ElectrodomesticoVacio();
    }
}
