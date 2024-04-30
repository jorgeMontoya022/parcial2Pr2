package co.edu.uniquindio.parcial2.parcial2.patterns.observer.model;

import co.edu.uniquindio.parcial2.parcial2.patterns.observer.services.IObservador;

import java.util.ArrayList;
import java.util.List;

public class EstacionMeteorologica {
    private double temperatura;
    private double humedad;
    private double presion;
    private List<IObservador> observadores;

    public EstacionMeteorologica() {
        observadores = new ArrayList<>();
    }

    public void agregarObservador(IObservador IObservador) {
        observadores.add(IObservador);
    }

    public void eliminarObservador(IObservador IObservador) {
        observadores.remove(IObservador);
    }

    public void notificarObservadoresTemperatura() {
        for (IObservador IObservador : observadores) {
            if (IObservador.estaSuscriptoTemperatura()) {
                IObservador.actualizarTemperatura(temperatura);
            }
        }
    }

    public void notificarObservadoresHumedad() {
        for (IObservador IObservador : observadores) {
            if (IObservador.estaSuscriptoHumedad()) {
                IObservador.actualizarHumedad(humedad);
            }
        }
    }

    public void notificarObservadoresPresion() {
        for (IObservador IObservador : observadores) {
            if (IObservador.estaSuscriptoPresion()) {
                IObservador.actualizarPresion(presion);
            }
        }
    }

    public void setTemperatura(double temperatura) {
        this.temperatura = temperatura;
        notificarObservadoresTemperatura();
    }

    public void setHumedad(double humedad) {
        this.humedad = humedad;
        notificarObservadoresHumedad();
    }

    public void setPresion(double presion) {
        this.presion = presion;
        notificarObservadoresPresion();
    }
}