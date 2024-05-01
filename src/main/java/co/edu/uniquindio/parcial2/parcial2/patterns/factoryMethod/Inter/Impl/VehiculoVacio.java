package co.edu.uniquindio.parcial2.parcial2.patterns.factoryMethod.Inter.Impl;

public class VehiculoVacio extends Vehiculo {
    @Override
    public void alquilar() {
        System.out.println("No se especificó un vehículo");
    }

    @Override
    public void devolver() {
        System.out.println("No se especificó un vehículo");
    }

}
