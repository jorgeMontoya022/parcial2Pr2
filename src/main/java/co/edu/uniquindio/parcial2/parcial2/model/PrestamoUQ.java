package co.edu.uniquindio.parcial2.parcial2.model;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/*
 * esto vale la plata
 *
 *
 *
 */
public class PrestamoUQ {

    private List<Cliente> listaClientes = new ArrayList<>();
    private List<Prestamo> listaPrestamos = new ArrayList<>();
    private List<Empleado> listaEmpleados = new ArrayList<>();
    private List<Objeto> listaObjetos = new ArrayList<>();

    public PrestamoUQ() {

    }

    public List<Cliente> getListaClientes() {
        return listaClientes;
    }

    public void setListaClientes(List<Cliente> listaClientes) {
        this.listaClientes = listaClientes;
    }

    public List<Prestamo> getListaPrestamos() {
        return listaPrestamos;
    }

    public void setListaPrestamos(List<Prestamo> listaPrestamos) {
        this.listaPrestamos = listaPrestamos;
    }

    public List<Empleado> getListaEmpleados() {
        return listaEmpleados;
    }

    public void setListaEmpleados(List<Empleado> listaEmpleados) {
        this.listaEmpleados = listaEmpleados;
    }

    public List<Objeto> getListaObjetos() {
        return listaObjetos;
    }

    public void setListaObjetos(List<Objeto> listaObjetos) {
        this.listaObjetos = listaObjetos;
    }

    public String obtenerObjetosPrestados(String rango) {
        String reporte = "";
        int rangoEntero = Integer.parseInt(rango);
        List<Objeto> objetoList = getListaObjetos();
        for (Objeto objeto : objetoList) {
            int contador = 0;
            for (Prestamo prestamo : getListaPrestamos()) {
                for (Objeto objetoPrestado : prestamo.getListaObjetosAsociados()) {
                    if (objeto.getIdObjeto().equals(objetoPrestado.getIdObjeto())) {
                        contador++;
                    }
                }
            }
            if (contador >= rangoEntero) {
                reporte = reporte + objeto.toString() + "\n";
            }
        }
        return reporte;
    }

    public String obtenerObjetoPorCodigo(String codigoObjeto) {
        for (Objeto objeto : getListaObjetos()) {
            if (objeto.getIdObjeto().equals(codigoObjeto)) {
                return objeto.toString();
            }
        }
        return "No se pudo encontrar el objeto con ese código, intente nuevamente";
    }


    public String obtenerClientesConMasPrestamos(String rango) {
        String reporte = "";
        int rangoEntero = Integer.parseInt(rango);
        List<Cliente> todosLosClientes = new ArrayList<>();
        List<Integer> contadorPrestamos = new ArrayList<>();

        for (Prestamo prestamo : getListaPrestamos()) {
            Cliente cliente = prestamo.getClienteAsociado();
            if (!todosLosClientes.contains(cliente)) {
                todosLosClientes.add(cliente);
                contadorPrestamos.add(1);
            } else {
                int indice = todosLosClientes.indexOf(cliente);
                contadorPrestamos.set(indice, contadorPrestamos.get(indice) + 1);
            }
        }
        // Iteración a través de todos los clientes y sus contadores de préstamos utilizando un bucle foreach
        for (Cliente cliente : todosLosClientes) {
            int indice = todosLosClientes.indexOf(cliente);
            int contador = contadorPrestamos.get(indice);

            // Verificamos si el contador de préstamos del cliente actual es mayor o igual al rango especificado
            if (contador >= rangoEntero) {
                // Si es así, agregamos el cliente y el número de préstamos al informe
                reporte += cliente.toString() + " - Préstamos: " + contador + "\n";
            }
        }

        return reporte;
    }


    public String mostrarObjetosDisponibles() {
        String objetosDisponibles = "";

        boolean hayObjetosDisponibles = false;

        for (Objeto objeto : getListaObjetos()) {
            int contador = 0;
            for (Prestamo prestamo : getListaPrestamos()) {
                for (Objeto objetoPrestado : prestamo.getListaObjetosAsociados()) {
                    if (objeto.getIdObjeto().equalsIgnoreCase(objetoPrestado.getIdObjeto())) {
                        contador++;
                        break; // No es necesario seguir verificando el mismo objeto en otros préstamos
                    }
                }
            }
            // Si el contador es cero, significa que el objeto no está prestado
            if (contador == 0) {
                objetosDisponibles += objeto.toString() + "\n";
                hayObjetosDisponibles = true;
            }
        }
        // Verificar si no se encontraron objetos disponibles
        if (!hayObjetosDisponibles) {
            return "no hay objetos disponibles";
        }
        return objetosDisponibles;


    }

    public String mostrarObjetosNoDisponibles() {
        String objetosNoDisponibles = "";

        for (Objeto objeto : getListaObjetos()) {
            int contador = 0;

            for (Prestamo prestamo : getListaPrestamos()) {
                for (Objeto objetoPrestado : prestamo.getListaObjetosAsociados()) {
                    if (objeto.getIdObjeto().equalsIgnoreCase(objetoPrestado.getIdObjeto())) {
                        contador++;

                    }
                }
            }
            if (contador > 0) {
                objetosNoDisponibles += objeto.toString() + "\n";
            }

        }
        return objetosNoDisponibles; // retorna los objetos no disponibles
    }

    public String buscarClienteCedula(String cedula) {
        for (Cliente cliente : getListaClientes()) {
            if (cliente.getCedula().equalsIgnoreCase(cedula)) {
                return cliente.toString();
            }
        }
        return null;
    }

    public String obtenerObjetosMenosPrestados(String rango) {
        String reporte = "";
        int rangoEntero = Integer.parseInt(rango);
        List<Objeto> objetoList = getListaObjetos();
        for (Objeto objeto : objetoList) {
            int contador = 0;
            for (Prestamo prestamo : getListaPrestamos()) {
                for (Objeto objetoPrestado : prestamo.getListaObjetosAsociados()) {
                    if (objeto.getIdObjeto().equals(objetoPrestado.getIdObjeto())) {
                        contador++;
                    }
                }
            }
            if (contador <= rangoEntero) {
                reporte = reporte + objeto.toString() + "\n";
            }
        }
        return reporte;

    }

    public String obtenerPrestamosFechaEspecifica(LocalDate fechaEspecifica) {
        String reporte = "";
        for (Prestamo prestamo : getListaPrestamos()) {
            if (prestamo.getFechaPrestamo().equals(fechaEspecifica)) {
                reporte += prestamo.toString() + "\n";
            }
        }
        return reporte;

    }

    public String obtenerPrestamosEntreFechas(LocalDate fechaInicial, LocalDate fechaFinal) {
        String reporte = "";

        for (Prestamo prestamo : getListaPrestamos()) {
            if ((prestamo.getFechaPrestamo().isEqual(fechaInicial) || prestamo.getFechaPrestamo().isAfter(fechaInicial))
                    && (prestamo.getFechaEntrega().isEqual(fechaFinal) || prestamo.getFechaEntrega().isBefore(fechaFinal))) {
                reporte += prestamo.toString() + "\n";
            }
        }
        return reporte;
    }



    public String obtenerPrestamosMenoresFecha(LocalDate fechaEspecifica) {
        String reporte = "";
        for (Prestamo prestamo : getListaPrestamos()) {
            if (prestamo.getFechaPrestamo().isBefore(fechaEspecifica)) {
                reporte += prestamo.toString() + "\n";
            }
        }
        return reporte;

    }

    public String BuscarEmpleadosConMasPrestamos(String rango) {
        String reporte = "";
        int rangoEntero = Integer.parseInt(rango);
        List<Empleado> todosLosEmpleados = new ArrayList<>();
        List<Integer> contadorPrestamos = new ArrayList<>();

        for (Prestamo prestamo : getListaPrestamos()) {
            Empleado empleado = prestamo.getEmpleadoAsociado();
            if (!todosLosEmpleados.contains(empleado)) {
                todosLosEmpleados.add(empleado);
                contadorPrestamos.add(1);
            } else {
                int indice = todosLosEmpleados.indexOf(empleado);
                contadorPrestamos.set(indice, contadorPrestamos.get(indice) + 1);
            }
        }

        for (Empleado empleado : todosLosEmpleados) {
            int indice = todosLosEmpleados.indexOf(empleado);
            int contador = contadorPrestamos.get(indice);
            if (contador >= rangoEntero) {
                reporte += empleado.toString() + " - Préstamos: " + contador + "\n";
            }
        }

        return reporte;
}




}


