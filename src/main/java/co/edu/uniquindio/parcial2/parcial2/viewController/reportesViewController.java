package co.edu.uniquindio.parcial2.parcial2.viewController;

import java.net.URL;
import java.time.LocalDate;
import java.util.ResourceBundle;

import co.edu.uniquindio.parcial2.parcial2.controller.ReportesController;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;


/*
 * esto vale la plata
 *
 * */
public class reportesViewController {
    ReportesController prestamoObjetoController;

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button btnMostrarClientesMasPrestamos;

    @FXML
    private Button btnMostrarObjetoPorCodigo;

    @FXML
    private AnchorPane btnMostrarObjetosMasPrestado;

    @FXML
    private Button btnMostrarObjetosMasPrestados;

    @FXML
    private Button btnObjetosDisponibles;

    @FXML
    private Button btnObjetosNoDisponibles;

    @FXML
    private TextField txtCodigoObjeto;

    @FXML
    private TextField txtRangoObjetosMasPrestados;

    @FXML
    private TextField txtRangoClienteMasPrestamos;

    @FXML
    private TextField txtCedulaCliente;

    @FXML
    private TextField txtRangoEmpleadosConMasPrestamos;


    @FXML
    private TextField txtRangoObjetosMenosPrestados;


    @FXML
    private DatePicker dateFechaFinalPrestamo;

    @FXML
    private DatePicker dateFechaInicialPrestamo;

    @FXML
    private DatePicker dateFechaPrestamo;

    @FXML
    private DatePicker datePrestamosMenorALaFecha;


    @FXML
    private TextArea txtResultadoClientesMasPrestamos;

    @FXML
    private TextArea txtResultadoEstadoObjeto;

    @FXML
    private TextArea txtResultadoObjetoPorCodigo;

    @FXML
    private TextArea txtResultadoObjetosMasPrestados;

    @FXML
    private TextArea txtResultadoClientePorCedula;

    @FXML
    private TextArea txtResultadoEmpleadoConMasPrestamos;

    @FXML
    private TextArea txtResultadoObjetosMenosPrestados;

    @FXML
    private TextArea txtResultadoPrestamoEntreDosFechas;

    @FXML
    private TextArea txtResultadoPrestamoMenorA_LaFecha;

    @FXML
    private TextArea txtResultadoPrestamoPorFecha;


    @FXML
    void onBuscarClientePorCedula(ActionEvent event) {
        buscarClienteCedula();

    }


    @FXML
    void onBuscarEmpleadosConMasPrestamos(ActionEvent event) {
        String empleadosConMasPrestamos = prestamoObjetoController.BuscarEmpleadosConMasPrestamos(txtRangoEmpleadosConMasPrestamos.getText());
        txtResultadoEmpleadoConMasPrestamos.setText(empleadosConMasPrestamos);


    }

    @FXML
    void onBuscarObjetosMenosPrestados(ActionEvent event) {
        obtenerObjetosMenosPrestados();

    }


    @FXML
    void onBuscarPrestamoConFecha(ActionEvent event) {
        LocalDate fechaEspecifica = dateFechaPrestamo.getValue();
        if (fechaEspecifica != null) {
            String prestamosFechaEspecifica = prestamoObjetoController.obtenerPrestamosFechaEspecifica(fechaEspecifica);
            txtResultadoPrestamoPorFecha.setText(prestamosFechaEspecifica);
        }


    }

    @FXML
    void onBuscarPrestamoEntreDosFechas(ActionEvent event) {
        LocalDate fechaInicial = dateFechaInicialPrestamo.getValue();
        LocalDate fechaFinal = dateFechaFinalPrestamo.getValue();
        if (fechaInicial != null && fechaFinal != null) {
            String prestamosEntreFechas = prestamoObjetoController.obtenerPrestamosEntreFechas(fechaInicial, fechaFinal);
            txtResultadoPrestamoEntreDosFechas.setText(prestamosEntreFechas);
        }


    }

    @FXML
    void onMostrarPrestamosMenorA_LaFecha(ActionEvent event) {
        LocalDate fechaEspecifica = datePrestamosMenorALaFecha.getValue();
        if (fechaEspecifica != null) {
            String prestamosMenoresFecha = prestamoObjetoController.obtenerPrestamosMenoresFecha(fechaEspecifica);
            txtResultadoPrestamoMenorA_LaFecha.setText(prestamosMenoresFecha);
}



    }


    @FXML
    void onMostrarClientesMasPrestamos(ActionEvent event) {
        mostrarClientesConMasPrestamos();

    }


    @FXML
    void onMostrarObjetoPorCodigo(ActionEvent event) {
        mostrarObjetoPorCodigo();


    }


    @FXML
    void onMostrarObjetosMasPrestados(ActionEvent event) {
        MostrarObjetosMasPrestado();


    }


    @FXML
    void onObjetosDisponibles(ActionEvent event) {
        mostrarObjetosDisponibles();


    }


    @FXML
    void onObjetosNoDisponibles(ActionEvent event) {
        mostrarObjetosNoDisponibles();

    }


    @FXML
    void initialize() {
        prestamoObjetoController = new ReportesController();


    }

    private void mostrarClientesConMasPrestamos() {
        if (!txtRangoClienteMasPrestamos.getText().isEmpty()) {
            String clientesConMasPrestamos = prestamoObjetoController.obtenerClientesConMasPrestamos(txtRangoClienteMasPrestamos.getText());
            txtResultadoClientesMasPrestamos.setText(clientesConMasPrestamos);
        }

    }

    private void mostrarObjetoPorCodigo() {
        if (!txtCodigoObjeto.getText().isEmpty()) {
            String objetoPorCodigo = prestamoObjetoController.obtenerObjetoPorCodigo(txtCodigoObjeto.getText());
            txtResultadoObjetoPorCodigo.setText(objetoPorCodigo);
        }
    }

    private void MostrarObjetosMasPrestado() {
        if (!txtRangoObjetosMasPrestados.getText().isEmpty()) {
            String objetosMasPrestados = prestamoObjetoController.obtenerObjetosPrestados(txtRangoObjetosMasPrestados.getText());
            txtResultadoObjetosMasPrestados.setText(objetosMasPrestados);
        }
    }

    private void mostrarObjetosDisponibles() {
        String objetosDisponibles = prestamoObjetoController.mostrarObjetosDisponibles();
        txtResultadoEstadoObjeto.setText(objetosDisponibles);
    }

    private void mostrarObjetosNoDisponibles() {
        String objetosNoDisponibles = prestamoObjetoController.mostrarObjetosNoDisponibles();
        txtResultadoEstadoObjeto.setText(objetosNoDisponibles);
    }

    private void buscarClienteCedula() {
        String clientePorCedula = prestamoObjetoController.buscarClienteCedula(txtCedulaCliente.getText());
        txtResultadoClientePorCedula.setText(clientePorCedula);
    }

    private void obtenerObjetosMenosPrestados() {
        String ObjetosMenosPrestados = prestamoObjetoController.obtenerObjetosMenosPrestados(txtRangoObjetosMenosPrestados.getText());
        txtResultadoObjetosMenosPrestados.setText(ObjetosMenosPrestados);
    }
}







