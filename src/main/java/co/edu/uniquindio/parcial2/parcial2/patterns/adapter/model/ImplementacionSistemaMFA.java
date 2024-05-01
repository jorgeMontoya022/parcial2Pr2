package co.edu.uniquindio.parcial2.parcial2.patterns.adapter.model;

import co.edu.uniquindio.parcial2.parcial2.patterns.adapter.service.ISistemaAutenticacionMFA;

public class ImplementacionSistemaMFA implements ISistemaAutenticacionMFA {


    @Override
    public void autenticarOTP(String nombreUsuario, String otp) {
        System.out.println("Autoenticación avanzada con OTP para el usuario" +" "+  nombreUsuario);
        System.out.println("Finalizando autoenticación avanzada con OPT para el usuario"+" "+ nombreUsuario);
    }

    @Override
    public void atenticarBiometria(String nombreUsuario) {
        System.out.println("Autenticando de forma biometrica al usuario "+ " "+ nombreUsuario);
        System.out.println("Finalizando la autoenticación  de forma biometrica para el usuario"+ " "+ nombreUsuario);

    }
}
