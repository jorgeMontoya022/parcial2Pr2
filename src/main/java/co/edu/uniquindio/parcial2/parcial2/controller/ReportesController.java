package co.edu.uniquindio.parcial2.parcial2.controller;

import co.edu.uniquindio.parcial2.parcial2.modelFactory.ModelFactory;

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
}
