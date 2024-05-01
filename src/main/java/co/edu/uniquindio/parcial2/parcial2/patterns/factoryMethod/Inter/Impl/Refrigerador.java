package co.edu.uniquindio.parcial2.parcial2.patterns.factoryMethod.Inter.Impl;

public class Refrigerador extends Electrodomestico {
    @Override
    public void alquilar() {
        System.out.println("Refrigerador alquilado para eventos o uso doméstico temporal.");
    }

    @Override
    public void devolver() {
        System.out.println("Refrigerador devuelto.");
    }
}
