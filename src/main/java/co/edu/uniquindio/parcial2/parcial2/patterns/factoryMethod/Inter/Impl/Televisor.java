package co.edu.uniquindio.parcial2.parcial2.patterns.factoryMethod.Inter.Impl;

public class Televisor extends Electrodomestico {
    @Override
    public void alquilar() {
        System.out.println("Televisor alquilado para ferias, exposiciones o entretenimiento doméstico.");
    }

    @Override
    public void devolver() {
        System.out.println("Televisor devuelto.");
    }
}
