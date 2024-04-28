package co.edu.uniquindio.parcial2.parcial2.model.builder;

import co.edu.uniquindio.parcial2.parcial2.model.Persona;

public class PersonaBuilder <T extends PersonaBuilder<T>>{
    protected String nombre;
    protected String apellido;
    protected String cedula;
    protected int edad;

    public T nombre( String nombre){
        this.nombre = nombre;
        return self();
    }

    public T apellido(String apellido){
        this.apellido = apellido;
        return self();
    }

    public T cedula(String cedula){
        this.cedula = cedula;
        return  self();
    }

    public T edad(int edad){
        this.edad = edad;
        return self();
    }

    @SuppressWarnings("unchecked")
    protected T self() {
        return (T) this;
    }

    public Persona build(){
        return  new Persona(nombre, apellido, cedula, edad);
    }



}
