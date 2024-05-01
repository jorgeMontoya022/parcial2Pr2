package co.edu.uniquindio.parcial2.parcial2.patterns.factoryMethod.Inter.Impl;

public class Lavadora extends Electrodomestico {
    @Override
    public void alquilar() {
        System.out.println("Lavadora alquilada para clientes en rentas de vivienda a largo plazo.");
    }

    @Override
    public void devolver() {
        System.out.println("Lavadora devuelta.");
    }
}
