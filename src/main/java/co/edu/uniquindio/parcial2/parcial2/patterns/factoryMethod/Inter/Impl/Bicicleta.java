package co.edu.uniquindio.parcial2.parcial2.patterns.factoryMethod.Inter.Impl;

public class Bicicleta extends Vehiculo {
    @Override
    public void alquilar() {
        System.out.println("Bicicleta alquilada para uso ecológico o urbano.");
    }

    @Override
    public void devolver() {
        System.out.println("Bicicleta devuelta.");
    }
}
