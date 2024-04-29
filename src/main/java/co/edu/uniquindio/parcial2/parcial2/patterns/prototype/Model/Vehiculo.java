package co.edu.uniquindio.parcial2.parcial2.patterns.prototype.Model;

import co.edu.uniquindio.parcial2.parcial2.patterns.prototype.Services.IVehiculo;

public class Vehiculo implements IVehiculo{
    private String modelo;
    private String color;
    private String placa;
    private String marca;

    public Vehiculo(){
        this.modelo = modelo;
        this.color = color;
        this.placa = placa;
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

   @Override
    public IVehiculo clonar() {
        Vehiculo vehiculo = null;

        try {
            vehiculo = (Vehiculo) clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }

        return vehiculo;
    }

    @Override
    public String toString() {
        return "Vehiculo{" +
                "modelo='" + modelo + '\'' +
                ", color='" + color + '\'' +
                ", placa='" + placa + '\'' +
                ", marca='" + marca + '\'' +
                '}';
    }
}