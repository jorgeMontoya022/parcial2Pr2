package co.edu.uniquindio.parcial2.parcial2.patterns.factoryMethod.Inter.Impl;

public class ConexionEmpleadoTemporal extends Empleado {
    public ConexionEmpleadoTemporal() {
        super();
    }

    @Override
    public void conectar() {
        System.out.println("Conectando empleado temporal");
    }

    @Override
    public void desconectar() {
        System.out.println("Desconectando empleado temporal");
    }
}