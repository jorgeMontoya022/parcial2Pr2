package co.edu.uniquindio.parcial2.parcial2.patterns.factoryMethod.Inter.Impl;

public class ConexionEmpleadoPermanente extends Empleado {
    public ConexionEmpleadoPermanente() {
        super();
    }

    @Override
    public void conectar() {
        System.out.println("Conectando empleado permanente");
    }

    @Override
    public void desconectar() {
        System.out.println("Desconectando empleado permanente");
    }
}