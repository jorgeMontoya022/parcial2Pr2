package co.edu.uniquindio.parcial2.parcial2.patterns.factoryMethod.Inter;

public class TrabajoVacio implements ITrabajo {
    @Override
    public void conectar() {
        System.out.println("No especifico empleado");
    }

    @Override
    public void desconectar() {
        System.out.println("No especifico empleado");
    }
}
