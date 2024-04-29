package co.edu.uniquindio.parcial2.parcial2.patterns.factoryMethod;

import co.edu.uniquindio.parcial2.parcial2.patterns.factoryMethod.Inter.TrabajoVacio;
import co.edu.uniquindio.parcial2.parcial2.patterns.factoryMethod.Inter.ITrabajo;
import co.edu.uniquindio.parcial2.parcial2.patterns.factoryMethod.Inter.Impl.EmpleadoPermanente;
import co.edu.uniquindio.parcial2.parcial2.patterns.factoryMethod.Inter.Impl.EmpleadoTemporal;

public class ConexionFabrica {
    public ITrabajo getConexion(String motor) {
        if (motor == null) {
            return new TrabajoVacio();
        }
        if (motor.equalsIgnoreCase("EMPPER")) {
            return new EmpleadoPermanente();
        } else if (motor.equalsIgnoreCase("EMPTEM")) {
            return new EmpleadoTemporal();
        }
        return new TrabajoVacio();
    }
}