package co.edu.uniquindio.parcial2.parcial2.model.builder;

import co.edu.uniquindio.parcial2.parcial2.model.Cliente;

public class ClienteBuilder extends PersonaBuilder<ClienteBuilder> {

    public Cliente build(){
        return new Cliente(nombre, apellido, cedula, edad);
    }

    @Override
    protected ClienteBuilder self() {
        return super.self();
    }
}
