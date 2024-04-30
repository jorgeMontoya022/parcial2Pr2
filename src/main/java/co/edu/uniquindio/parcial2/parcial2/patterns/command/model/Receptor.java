package co.edu.uniquindio.parcial2.parcial2.patterns.command.model;

public class Receptor {
    public void realizarEntregaLocal() {
        System.out.println("Realizando entrega local.");
    }

    public void deshacerEntregaLocal() {
        System.out.println("Deshaciendo entrega local.");
    }

    public void realizarEntregaNacional() {
        System.out.println("Realizando entrega nacional.");
    }

    public void deshacerEntregaNacional() {
        System.out.println("Deshaciendo entrega nacional.");
    }

    public void realizarEntregaInternacional() {
        System.out.println("Realizando entrega internacional.");
    }

    public void deshacerEntregaInternacional() {
        System.out.println("Deshaciendo entrega internacional.");
    }
}

