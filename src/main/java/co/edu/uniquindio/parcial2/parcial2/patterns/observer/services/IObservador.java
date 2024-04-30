package co.edu.uniquindio.parcial2.parcial2.patterns.observer.services;

public interface IObservador {
    void actualizarTemperatura(double temperatura);
    void actualizarHumedad(double humedad);
    void actualizarPresion(double presion);
    boolean estaSuscriptoTemperatura();
    boolean estaSuscriptoHumedad();
    boolean estaSuscriptoPresion();
}
