package co.edu.uniquindio.parcial2.parcial2.patterns.factoryMethod;

import co.edu.uniquindio.parcial2.parcial2.patterns.factoryMethod.Inter.ConexionVacia;
import co.edu.uniquindio.parcial2.parcial2.patterns.factoryMethod.Inter.IConexion;
import co.edu.uniquindio.parcial2.parcial2.patterns.factoryMethod.Inter.Impl.ConexionEmpleadoPermanente;
import co.edu.uniquindio.parcial2.parcial2.patterns.factoryMethod.Inter.Impl.ConexionEmpleadoTemporal;

public class ConexionFabrica {
    public IConexion getConexion(String motor) {
        if (motor == null) {
            return new ConexionVacia();
        }
        if (motor.equalsIgnoreCase("EMPPER")) {
            return new ConexionEmpleadoPermanente();
        } else if (motor.equalsIgnoreCase("EMPTEM")) {
            return new ConexionEmpleadoTemporal();
        }
        return new ConexionVacia();
    }
}