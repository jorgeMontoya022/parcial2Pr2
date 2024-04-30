package co.edu.uniquindio.parcial2.parcial2.patterns.observer;

import co.edu.uniquindio.parcial2.parcial2.patterns.observer.model.DispositivoMovil;
import co.edu.uniquindio.parcial2.parcial2.patterns.observer.model.EstacionCentral;
import co.edu.uniquindio.parcial2.parcial2.patterns.observer.model.EstacionMeteorologica;
import co.edu.uniquindio.parcial2.parcial2.patterns.observer.model.Pantalla;

public class MainObserver {
    public static void main(String[] args) {
        EstacionMeteorologica estacion = new EstacionMeteorologica();
        Pantalla pantalla = new Pantalla();
        DispositivoMovil movil = new DispositivoMovil();
        EstacionCentral central = new EstacionCentral();

        pantalla.suscripcion(true, true, true);
        movil.suscripcion(false, true, true);
        central.suscripcion(false, false, true);

        estacion.agregarObservador(pantalla);
        estacion.agregarObservador(movil);
        estacion.agregarObservador(central);

        estacion.setTemperatura(22.5);
        estacion.setHumedad(55.0);
        estacion.setPresion(1012.0);
    }
}
