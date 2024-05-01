package co.edu.uniquindio.parcial2.parcial2.patterns.adapter.model;

import co.edu.uniquindio.parcial2.parcial2.patterns.adapter.service.ISistemaBiblioteca;

public class ImplementacionSistemaBiblioteca implements ISistemaBiblioteca {

    @Override
    public void autenticar(String nombreUsuario, String contraseña) {
        System.out.println("Autoenticación basica para el usuario " + nombreUsuario);
    }
}
