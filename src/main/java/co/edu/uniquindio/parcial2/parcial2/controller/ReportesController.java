package co.edu.uniquindio.parcial2.parcial2.controller;

import co.edu.uniquindio.parcial2.parcial2.modelFactory.ModelFactory;

import java.time.LocalDate;

public class ReportesController {
    ModelFactory modelFactory;

    public ReportesController() {
        modelFactory = ModelFactory.getInstance();
    }

    public String obtenerObjetosPrestados(String rango) {
        return modelFactory.obtenerObjetosPrestados(rango);
    }

    public String obtenerObjetoPorCodigo(String codigoObjeto) {
        return modelFactory.obtenerObjetoPorCodigo(codigoObjeto);
    }

    public String obtenerClientesConMasPrestamos(String rango) {
        return modelFactory.obtenerClientesConMasPrestamos(rango);
    }

    public String mostrarObjetosDisponibles() {
        return modelFactory.mostrarObjetosDisponibles();
    }

    public String mostrarObjetosNoDisponibles() {
        return modelFactory.mostrarObjetosNoDisponibles();
    }

    public String buscarClienteCedula(String cedula) {
        return  modelFactory.buscarClienteCedula(cedula);
    }

    public String obtenerObjetosMenosPrestados(String rango) {
        return modelFactory.obtenerObjetosMenosPrestados(rango);
    }

    public String obtenerPrestamosFechaEspecifica(LocalDate fechaEspecifica) {
        return modelFactory.obtenerPrestamosFechaEspecifica(fechaEspecifica);
    }

    public String obtenerPrestamosEntreFechas(LocalDate fechaInicial, LocalDate fechaFinal) {
        return modelFactory.obtenerPrestamosEntreFechas(fechaInicial, fechaFinal);
    }

    public String obtenerPrestamosMenoresFecha(LocalDate fechaEspecifica) {
        return modelFactory.obtenerPrestamosMenoresFecha(fechaEspecifica);
    }



    public String BuscarEmpleadosConMasPrestamos(String rango) {
        return modelFactory.BuscarEmpleadosConMasPrestamos(rango);
    }
}
