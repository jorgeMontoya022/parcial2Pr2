package co.edu.uniquindio.parcial2.parcial2.model;

import co.edu.uniquindio.parcial2.parcial2.model.builder.ClienteBuilder;

public class Cliente extends  Persona{


    public Cliente(String nombre, String apellido, String cedula, int edad) {
        super(nombre, apellido, cedula, edad);
    }

    public static ClienteBuilder builder(){
        return new ClienteBuilder();
    }
}
