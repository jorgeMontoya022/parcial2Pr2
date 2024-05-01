package co.edu.uniquindio.parcial2.parcial2.patterns;

import co.edu.uniquindio.parcial2.parcial2.patterns.prototype.Model.BarChart;
import co.edu.uniquindio.parcial2.parcial2.patterns.prototype.Model.LineChart;
import co.edu.uniquindio.parcial2.parcial2.patterns.prototype.Model.PieChart;

public class Main {

    public static void main(String[] args) {
        generarDiagramas();
    }

    private static void generarDiagramas() {
        BarChart barchart1 = new BarChart();
        barchart1.setNombreGrafico("Grafico de barras");
        barchart1.setNombreVariableX("Carros");
        barchart1.setNombreVariableY("Motos");
        barchart1.setValorVariableX("15");
        barchart1.setValorVariableY("12");

        LineChart lineChart1 = new LineChart();
        lineChart1.setNombreGrafico("Grafico de lineas");
        lineChart1.setNombreVariableX("Galletas");
        lineChart1.setNombreVariableY("Bombones");
        lineChart1.setValorVariableX("13");
        lineChart1.setValorVariableY("20");
        lineChart1.getCantidadVariables("2");

        PieChart pieChart1 = new PieChart();
        pieChart1.setNombreGrafico("Grafico de pastel");
        pieChart1.setNombreVariableX("Pastel");
        pieChart1.setNombreVariableY("Cupcakes");
        pieChart1.setPorcentajeVariableX("30%");
        pieChart1.setPorcentajeVariableY("70%");


        BarChart barChartClonado = (BarChart) barchart1.clonar();

        System.out.println(barchart1);
        System.out.println(lineChart1);
        System.out.println(pieChart1);
        System.out.println(barChartClonado);
    }
}