package co.edu.uniquindio.parcial2.parcial2.model;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Prestamo {

    private Empleado empleadoAsociado;
    private Cliente clienteAsociado;
    private String numeroPrestamo;
    private LocalDate fechaPrestamo;
    private LocalDate fechaEntrega;
    private String descripcion;
    private List<Objeto> listaObjetosAsociados = new ArrayList<>();


    public Prestamo() {

    }

    public Cliente getClienteAsociado() {
        return clienteAsociado;
    }

    public void setClienteAsociado(Cliente clienteAsociado) {
        this.clienteAsociado = clienteAsociado;
    }

    public String getNumeroPrestamo() {
        return numeroPrestamo;
    }

    public void setNumeroPrestamo(String numeroPrestamo) {
        this.numeroPrestamo = numeroPrestamo;
    }

    public LocalDate getFechaPrestamo() {
        return fechaPrestamo;
    }

    public void setFechaPrestamo(LocalDate fechaPrestamo) {
        this.fechaPrestamo = fechaPrestamo;
    }

    public LocalDate getFechaEntrega() {
        return fechaEntrega;
    }

    public void setFechaEntrega(LocalDate fechaEntrega) {
        this.fechaEntrega = fechaEntrega;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Empleado getEmpleadoAsociado() {
        return empleadoAsociado;
    }

    public void setEmpleadoAsociado(Empleado empleadoAsociado) {
        this.empleadoAsociado = empleadoAsociado;
    }

    public List<Objeto> getListaObjetosAsociados() {
        return listaObjetosAsociados;
    }

    public void setListaObjetosAsociados(List<Objeto> listaObjetosAsociados) {
        this.listaObjetosAsociados = listaObjetosAsociados;
    }

    @Override
    public String toString() {
        return "Prestamo{" +
                "empleadoAsociado=" + empleadoAsociado +
                ", numeroPrestamo='" + numeroPrestamo + '\'' +
                ", fechaPrestamo=" + fechaPrestamo +
                ", fechaEntrega=" + fechaEntrega +
                ", descripcion='" + descripcion + '\'' +
                '}';
    }
}

