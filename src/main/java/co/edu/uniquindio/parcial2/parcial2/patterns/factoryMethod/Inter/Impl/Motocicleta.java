package co.edu.uniquindio.parcial2.parcial2.patterns.factoryMethod.Inter.Impl;

public class Motocicleta extends Vehiculo {
    @Override
    public void alquilar() {
        System.out.println("Motocicleta alquilada para transporte ágil.");
    }

    @Override
    public void devolver() {
        System.out.println("Motocicleta devuelta.");
    }
}
