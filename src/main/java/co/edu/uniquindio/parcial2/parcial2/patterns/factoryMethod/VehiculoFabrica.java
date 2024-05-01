package co.edu.uniquindio.parcial2.parcial2.patterns.factoryMethod;

import co.edu.uniquindio.parcial2.parcial2.patterns.factoryMethod.Inter.Impl.*;

public class VehiculoFabrica {
    public Vehiculo getVehiculo(String tipo) {
        if (tipo == null) {
            return new VehiculoVacio();
        }
        if (tipo.equalsIgnoreCase("COCHE")) {
            return new Coche();
        }
        if (tipo.equalsIgnoreCase("MOTOCICLETA")) {
            return new Motocicleta();
        }
        if (tipo.equalsIgnoreCase("BICICLETA")) {
            return new Bicicleta();
        }
        return new VehiculoVacio();
    }
}
