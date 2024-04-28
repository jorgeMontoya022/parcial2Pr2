package co.edu.uniquindio.parcial2.parcial2.model.builder;

import co.edu.uniquindio.parcial2.parcial2.model.Empleado;

public class EmpleadoBuilder extends  PersonaBuilder<EmpleadoBuilder>{


    public Empleado build(){
        return new Empleado(nombre, apellido, cedula, edad);
    }
    @Override
    protected EmpleadoBuilder self(){
       return this;
    }
}
