package co.edu.uniquindio.parcial2.parcial2.patterns.factoryMethod.Inter.Impl;

public class EmpleadoTemporal extends Empleado {
    public EmpleadoTemporal() {
        super();
    }

    @Override
    public void conectar() {
        System.out.println("Trabajando empleado temporal");
    }

    @Override
    public void desconectar() {
        System.out.println("Terminando de trabajar empleado temporal");
    }
}