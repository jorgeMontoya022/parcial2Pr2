package co.edu.uniquindio.parcial2.parcial2.patterns.adapter.service;

public interface ISistemaAutenticacionMFA {
    void autenticarOTP(String nombreUsuario, String otp);

    void atenticarBiometria(String nombreUsuario);
}
