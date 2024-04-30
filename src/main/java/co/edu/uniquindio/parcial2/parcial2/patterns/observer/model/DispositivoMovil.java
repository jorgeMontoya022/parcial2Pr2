package co.edu.uniquindio.parcial2.parcial2.patterns.observer.model;

import co.edu.uniquindio.parcial2.parcial2.patterns.observer.services.IObservador;

public class DispositivoMovil implements IObservador {
    private boolean suscripcionTemperatura;
    private boolean suscripcionHumedad;
    private boolean suscripcionPresion;

    public void actualizarTemperatura(double temperatura) {
        if (suscripcionTemperatura) {
            System.out.println("Dispositivo Móvil: Temperatura = " + temperatura);
        }
    }

    public void actualizarHumedad(double humedad) {
        if (suscripcionHumedad) {
            System.out.println("Dispositivo Móvil: Humedad = " + humedad);
        }
    }

    public void actualizarPresion(double presion) {
        if (suscripcionPresion) {
            System.out.println("Dispositivo Móvil: Presión = " + presion);
        }
    }

    public boolean estaSuscriptoTemperatura() {
        return suscripcionTemperatura;
    }

    public boolean estaSuscriptoHumedad() {
        return suscripcionHumedad;
    }

    public boolean estaSuscriptoPresion() {
        return suscripcionPresion;
    }

    public void suscripcion(boolean interesaTemperatura, boolean interesaHumedad, boolean interesaPresion) {
        this.suscripcionTemperatura = interesaTemperatura;
        this.suscripcionHumedad = interesaHumedad;
        this.suscripcionPresion = interesaPresion;
    }
}