package co.edu.uniquindio.parcial2.parcial2.patterns.factoryMethod.Inter.Impl;

public class EmpleadoPermanente extends Empleado {
    public EmpleadoPermanente() {
        super();
    }

    @Override
    public void conectar() {
        System.out.println("Trabajando empleado permanente");
    }

    @Override
    public void desconectar() {
        System.out.println("Terminando de trabajar empleado permanente");
    }
}