package co.edu.uniquindio.parcial2.parcial2.patterns.factoryMethod.Inter.Impl;

public class Coche extends Vehiculo {
    @Override
    public void alquilar() {
        System.out.println("Coche alquilado para uso personal o de negocios.");
    }

    @Override
    public void devolver() {
        System.out.println("Coche devuelto.");
    }
}
