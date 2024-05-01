package co.edu.uniquindio.parcial2.parcial2.patterns.factoryMethod;

import co.edu.uniquindio.parcial2.parcial2.patterns.factoryMethod.Inter.IProducto;

public class Main {

    public static void main(String[] args) {
        ejemploVehiculo();
        ejemploElectrodomestico();

    }

    private static void ejemploVehiculo() {
        VehiculoFabrica fabrica = new VehiculoFabrica();

        IProducto vehiculo1 = fabrica.getVehiculo("COCHE");
        vehiculo1.alquilar();
        vehiculo1.devolver();

        IProducto vehiculo2 = fabrica.getVehiculo("MOTOCICLETA");
        vehiculo2.alquilar();
        vehiculo2.devolver();

        IProducto vehiculo3 = fabrica.getVehiculo("BICICLETA");
        vehiculo3.alquilar();
        vehiculo3.devolver();

        IProducto vehiculo4 = fabrica.getVehiculo("OTRO");
        vehiculo4.alquilar();
        vehiculo4.devolver();
    }

    private static void ejemploElectrodomestico() {
        ElectrodomesticoFabrica fabrica = new ElectrodomesticoFabrica();

        IProducto electrodomestico1 = fabrica.getElectrodomestico("LAVADORA");
        electrodomestico1.alquilar();
        electrodomestico1.devolver();

        IProducto electrodomestico2 = fabrica.getElectrodomestico("REFRIGERADOR");
        electrodomestico2.alquilar();
        electrodomestico2.devolver();

        IProducto electrodomestico3 = fabrica.getElectrodomestico("TELEVISOR");
        electrodomestico3.alquilar();
        electrodomestico3.devolver();

        IProducto electrodomestico4 = fabrica.getElectrodomestico("OTRO");
        electrodomestico4.alquilar();
        electrodomestico4.devolver();
    }
}