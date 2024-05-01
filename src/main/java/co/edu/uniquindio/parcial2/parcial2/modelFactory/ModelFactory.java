package co.edu.uniquindio.parcial2.parcial2.modelFactory;

import co.edu.uniquindio.parcial2.parcial2.model.*;

import java.time.LocalDate;

public class ModelFactory {
    private static ModelFactory modelFactory;
    PrestamoUQ prestamoUQ;

    private ModelFactory() {
        prestamoUQ = new PrestamoUQ();
        inicializarDatos();
    }

    public static ModelFactory getInstance() {
        if (modelFactory == null) {
            modelFactory = new ModelFactory();
        }
        return modelFactory;
    }

    private void inicializarDatos() {
        initClientes();
        initEmpleados();
        initObjetos();
        initPrestamos();
    }


    private void initClientes() {
        Cliente cliente1 = Cliente.builder()
                .nombre("Jorge")
                .apellido("Montoya")
                .cedula("123456")
                .edad(19)
                .build();

        Cliente cliente2 = Cliente.builder()
                .nombre("Diego")
                .apellido("Flores")
                .cedula("2343212")
                .edad(21)
                .build();

        Cliente cliente3 = Cliente.builder()
                .nombre("Camila")
                .apellido("Henao")
                .cedula("3431543")
                .edad(22)
                .build();

        Cliente cliente4 = Cliente.builder()
                .nombre("Susana")
                .apellido("Herrera")
                .cedula("5432789")
                .edad(31)
                .build();

        Cliente cliente5 = Cliente.builder()
                .nombre("Alberto")
                .apellido("Suarez")
                .cedula("9234952")
                .edad(42)
                .build();

        prestamoUQ.getListaClientes().add(cliente1);
        prestamoUQ.getListaClientes().add(cliente2);
        prestamoUQ.getListaClientes().add(cliente3);
        prestamoUQ.getListaClientes().add(cliente4);
        prestamoUQ.getListaClientes().add(cliente5);
    }

    private void initEmpleados() {
        Empleado empleado1 = Empleado.builder()
                .nombre("Juan")
                .apellido("Carvajal")
                .cedula("67454643")
                .edad(37)
                .build();

        Empleado empleado2 = Empleado.builder()
                .nombre("Tatiana")
                .apellido("maldonado")
                .cedula("8732684")
                .edad(25)
                .build();

        Empleado empleado3 = Empleado.builder()
                .nombre("Isabell")
                .apellido("Suñiga")
                .cedula("54365424")
                .edad(27)
                .build();

        prestamoUQ.getListaEmpleados().add(empleado1);
        prestamoUQ.getListaEmpleados().add(empleado2);
        prestamoUQ.getListaEmpleados().add(empleado3);

    }

    private void initObjetos() {
        Objeto objeto1 = new Objeto();
        objeto1.setNombreObjeto("Guitarra");
        objeto1.setIdObjeto("001");

        Objeto objeto2 = new Objeto();
        objeto2.setNombreObjeto("Piano");
        objeto2.setIdObjeto("002");

        Objeto objeto3 = new Objeto();
        objeto3.setNombreObjeto("Ukelele");
        objeto3.setIdObjeto("003");

        Objeto objeto4 = new Objeto();
        objeto4.setNombreObjeto("Saxofón");
        objeto4.setIdObjeto("004");


        Objeto objeto5 = new Objeto();
        objeto5.setNombreObjeto("Bajo");
        objeto5.setIdObjeto("005");

        prestamoUQ.getListaObjetos().add(objeto1);
        prestamoUQ.getListaObjetos().add(objeto2);
        prestamoUQ.getListaObjetos().add(objeto3);
        prestamoUQ.getListaObjetos().add(objeto4);
        prestamoUQ.getListaObjetos().add(objeto5);
    }

    private void initPrestamos() {
        Prestamo prestamo1 = new Prestamo();
        prestamo1.setNumeroPrestamo("PR-1");
        prestamo1.setFechaPrestamo(LocalDate.of(2024, 02, 2));
        prestamo1.setFechaEntrega(LocalDate.of(2025, 04, 9));
        prestamo1.setDescripcion("Se realizó prestamo");
        prestamo1.setClienteAsociado(prestamoUQ.getListaClientes().get(0));
        prestamo1.setEmpleadoAsociado(prestamoUQ.getListaEmpleados().get(0));
        prestamo1.getListaObjetosAsociados().add(prestamoUQ.getListaObjetos().get(0));
        prestamo1.getListaObjetosAsociados().add(prestamoUQ.getListaObjetos().get(1));

        Prestamo prestamo2 = new Prestamo();
        prestamo2.setNumeroPrestamo("PR-2");
        prestamo2.setFechaPrestamo(LocalDate.of(2024, 6, 2));
        prestamo2.setFechaEntrega(LocalDate.of(2024, 10, 10));
        prestamo2.setDescripcion("Se realizó prestamo");
        prestamo2.setClienteAsociado(prestamoUQ.getListaClientes().get(1));
        prestamo2.setEmpleadoAsociado(prestamoUQ.getListaEmpleados().get(1));
        prestamo2.getListaObjetosAsociados().add(prestamoUQ.getListaObjetos().get(1));
        prestamo2.getListaObjetosAsociados().add(prestamoUQ.getListaObjetos().get(2));

        Prestamo prestamo3 = new Prestamo();
        prestamo3.setNumeroPrestamo("PR-3");
        prestamo3.setFechaPrestamo(LocalDate.of(2023, 6, 2));
        prestamo3.setFechaEntrega(LocalDate.of(2024, 10, 8));
        prestamo3.setDescripcion("Se realizó prestamo");
        prestamo3.setClienteAsociado(prestamoUQ.getListaClientes().get(1));
        prestamo3.setEmpleadoAsociado(prestamoUQ.getListaEmpleados().get(2));
        prestamo3.getListaObjetosAsociados().add(prestamoUQ.getListaObjetos().get(1));
        prestamo3.getListaObjetosAsociados().add(prestamoUQ.getListaObjetos().get(2));


        Prestamo prestamo4 = new Prestamo();
        prestamo4.setNumeroPrestamo("PR-4");
        prestamo4.setFechaPrestamo(LocalDate.of(2023, 8, 2));
        prestamo4.setFechaEntrega(LocalDate.of(2024, 11, 8));
        prestamo4.setDescripcion("Se realizó prestamo");
        prestamo4.setClienteAsociado(prestamoUQ.getListaClientes().get(2));
        prestamo4.setEmpleadoAsociado(prestamoUQ.getListaEmpleados().get(2));
        prestamo4.getListaObjetosAsociados().add(prestamoUQ.getListaObjetos().get(3));
        prestamo4.getListaObjetosAsociados().add(prestamoUQ.getListaObjetos().get(1));





        prestamoUQ.getListaPrestamos().add(prestamo1);
        prestamoUQ.getListaPrestamos().add(prestamo2);
        prestamoUQ.getListaPrestamos().add(prestamo3);
        prestamoUQ.getListaPrestamos().add(prestamo4);


    }


    public String obtenerObjetosPrestados(String rango) {
        return prestamoUQ.obtenerObjetosPrestados(rango);
    }

    public String obtenerObjetoPorCodigo(String codigoObjeto) {
        return prestamoUQ.obtenerObjetoPorCodigo(codigoObjeto);
    }

    public String obtenerClientesConMasPrestamos(String rango) {
        return prestamoUQ.obtenerClientesConMasPrestamos(rango);
    }

    public String mostrarObjetosDisponibles() {
        return prestamoUQ.mostrarObjetosDisponibles();
    }

    public String mostrarObjetosNoDisponibles() {
        return prestamoUQ.mostrarObjetosNoDisponibles();
    }

    public String buscarClienteCedula(String cedula) {
        return prestamoUQ.buscarClienteCedula(cedula);
    }

    public String obtenerObjetosMenosPrestados(String rango) {
        return  prestamoUQ.obtenerObjetosMenosPrestados(rango);
    }

    public String obtenerPrestamosFechaEspecifica(LocalDate fechaEspecifica) {
        return prestamoUQ.obtenerPrestamosFechaEspecifica(fechaEspecifica);
    }

    public String obtenerPrestamosEntreFechas(LocalDate fechaInicial, LocalDate fechaFinal) {
        return prestamoUQ.obtenerPrestamosEntreFechas(fechaInicial, fechaFinal);
    }

    public String obtenerPrestamosMenoresFecha(LocalDate fechaEspecifica) {
        return prestamoUQ.obtenerPrestamosMenoresFecha(fechaEspecifica);
    }

    public String BuscarEmpleadosConMasPrestamos(String rango) {
        return prestamoUQ.BuscarEmpleadosConMasPrestamos(rango);
    }
}
