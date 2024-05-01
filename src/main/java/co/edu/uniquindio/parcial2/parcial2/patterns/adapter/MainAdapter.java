package co.edu.uniquindio.parcial2.parcial2.patterns.adapter;

import co.edu.uniquindio.parcial2.parcial2.patterns.adapter.model.ImplementacionSistemaMFA;
import co.edu.uniquindio.parcial2.parcial2.patterns.adapter.model.adapter.AuthenticationAdapter;
import co.edu.uniquindio.parcial2.parcial2.patterns.adapter.service.ISistemaAutenticacionMFA;
import co.edu.uniquindio.parcial2.parcial2.patterns.adapter.service.ISistemaBiblioteca;

public class MainAdapter {
    public static void main(String[] args) {

        ISistemaAutenticacionMFA sistemaMFA = new ImplementacionSistemaMFA();
        ISistemaBiblioteca sistemaBiblioteca = new AuthenticationAdapter(sistemaMFA);

        sistemaBiblioteca.autenticar("Jorge", "contraseña");


    }
}
