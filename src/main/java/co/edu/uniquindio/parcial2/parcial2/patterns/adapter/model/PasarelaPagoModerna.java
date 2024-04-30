package co.edu.uniquindio.parcial2.parcial2.patterns.adapter.model;

import co.edu.uniquindio.parcial2.parcial2.patterns.adapter.service.PasarelaPagos;

public class PasarelaPagoModerna implements PasarelaPagos {
    @Override
    public void procesarPago(double monto) {
        System.out.println("Procesando pago de $" + monto + " mediante la pasarela de pagos moderna.");
    }
}
