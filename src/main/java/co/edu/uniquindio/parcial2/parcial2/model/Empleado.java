package co.edu.uniquindio.parcial2.parcial2.model;

import co.edu.uniquindio.parcial2.parcial2.model.builder.EmpleadoBuilder;

public class Empleado extends Persona{
    public Empleado(String nombre, String apellido, String cedula, int edad) {
        super(nombre, apellido, cedula, edad);
    }

    public static EmpleadoBuilder builder(){
        return new EmpleadoBuilder();
    }




}
