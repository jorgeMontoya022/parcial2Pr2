package co.edu.uniquindio.parcial2.parcial2.patterns.adapter.model.adapter;

import co.edu.uniquindio.parcial2.parcial2.patterns.adapter.service.PasarelaPagos;
import co.edu.uniquindio.parcial2.parcial2.patterns.adapter.service.SistemaPagoHeredado;

public class AdaptadorPago implements SistemaPagoHeredado {

    private PasarelaPagos pasarelaPagos;

    public AdaptadorPago(PasarelaPagos pasarelaPagos){
        this.pasarelaPagos = pasarelaPagos;
    }
    @Override
    public void cobrar(double cantidad) {
        pasarelaPagos.procesarPago(cantidad);

    }
}
