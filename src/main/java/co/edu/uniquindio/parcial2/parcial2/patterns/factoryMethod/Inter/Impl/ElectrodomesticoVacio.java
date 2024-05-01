package co.edu.uniquindio.parcial2.parcial2.patterns.factoryMethod.Inter.Impl;

public class ElectrodomesticoVacio extends Electrodomestico {
    @Override
    public void alquilar() {
        System.out.println("No se especificó un electrodomestico.");
    }

    @Override
    public void devolver() {
        System.out.println("No se especificó un electrodomestico.");
    }
}
