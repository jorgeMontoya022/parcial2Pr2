package co.edu.uniquindio.parcial2.parcial2.patterns.adapter.model.adapter;

import co.edu.uniquindio.parcial2.parcial2.patterns.adapter.service.ISistemaAutenticacionMFA;
import co.edu.uniquindio.parcial2.parcial2.patterns.adapter.service.ISistemaBiblioteca;

public class AuthenticationAdapter implements ISistemaBiblioteca {
    ISistemaAutenticacionMFA sistemaMFA;

    public AuthenticationAdapter(ISistemaAutenticacionMFA sistemaMFA) {
        this.sistemaMFA = sistemaMFA;
    }

    @Override
    public void autenticar(String nombreUsuario, String contraseña) {
        String opt = "12343";
        sistemaMFA.autenticarOTP(nombreUsuario, opt);
        sistemaMFA.atenticarBiometria(nombreUsuario);

    }
}
