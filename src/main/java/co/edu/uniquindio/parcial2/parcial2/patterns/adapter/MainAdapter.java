package co.edu.uniquindio.parcial2.parcial2.patterns.adapter;

import co.edu.uniquindio.parcial2.parcial2.patterns.adapter.model.PasarelaPagoModerna;
import co.edu.uniquindio.parcial2.parcial2.patterns.adapter.model.adapter.AdaptadorPago;
import co.edu.uniquindio.parcial2.parcial2.patterns.adapter.service.PasarelaPagos;
import co.edu.uniquindio.parcial2.parcial2.patterns.adapter.service.SistemaPagoHeredado;

public class MainAdapter {
    public static void main(String[] args) {
        ejercicioAdapter();

    }

    private static void ejercicioAdapter() {
        PasarelaPagos pasarelaPagosModerna = new PasarelaPagoModerna();

        SistemaPagoHeredado adaptador = new AdaptadorPago(pasarelaPagosModerna);

        adaptador.cobrar(50.000);

    }
}
