package co.edu.uniquindio.parcial2.parcial2.patterns.factoryMethod.Inter.Impl;

import co.edu.uniquindio.parcial2.parcial2.patterns.factoryMethod.Inter.IConexion;

public abstract class Empleado implements IConexion {
    private String nombre;
    private String apellido;
    private String cedula;
    private String telefono;

    public Empleado(){
        this.nombre = nombre;
        this.apellido = apellido;
        this.cedula = cedula;
        this.telefono = telefono;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
}