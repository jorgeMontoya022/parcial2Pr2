package co.edu.uniquindio.parcial2.parcial2.patterns.adapter.model;

import co.edu.uniquindio.parcial2.parcial2.patterns.adapter.service.SistemaPagoHeredado;

public class SistemaPagoHeredadoImplementacion implements SistemaPagoHeredado {

    @Override
    public void cobrar(double cantidad) {
        System.out.println("Cobrando $" + cantidad + " utilizando el sistema de pago heredado.");
    }

}
