package co.edu.uniquindio.parcial2.parcial2.patterns;

import co.edu.uniquindio.parcial2.parcial2.patterns.prototype.Model.Vehiculo;

public class Main {

    public static void main(String[] args) {
        ejemplo1();
    }

    private static void ejemplo1() {
        Vehiculo vehiculo1 = new Vehiculo();
        vehiculo1.setModelo("Rio");
        vehiculo1.setColor("Beige");
        vehiculo1.setPlaca("KDL931");
        vehiculo1.setMarca("KIA");

        Vehiculo vehiculo2 = new Vehiculo();
        vehiculo2.setModelo("Serie 3 3.0");
        vehiculo2.setColor("Azul");
        vehiculo2.setPlaca("BLD027");
        vehiculo2.setMarca("BMW");

        Vehiculo vehiculoClonado = (Vehiculo) vehiculo1.clonar();

        System.out.println(vehiculo1);
        System.out.println(vehiculo2);
        System.out.println(vehiculoClonado);
    }
}