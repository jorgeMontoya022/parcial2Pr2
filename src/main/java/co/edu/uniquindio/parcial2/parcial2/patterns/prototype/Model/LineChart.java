package co.edu.uniquindio.parcial2.parcial2.patterns.prototype.Model;

import co.edu.uniquindio.parcial2.parcial2.patterns.prototype.Services.IGraphPrototype;

public class LineChart implements IGraphPrototype {
    private String nombreGrafico;
    private String nombreVariableX;
    private String nombreVariableY;
    private String valorVariableX;
    private String valorVariableY;
    private String cantidadVariables;

    public LineChart() {
        this.nombreGrafico = nombreGrafico;
        this.nombreVariableX = nombreVariableX;
        this.nombreVariableY = nombreVariableY;
        this.valorVariableX = valorVariableX;
        this.valorVariableY = valorVariableY;
        this.cantidadVariables = cantidadVariables;
    }

    public String getNombreGrafico() {
        return nombreGrafico;
    }

    public void setNombreGrafico(String nombreGrafico) {
        this.nombreGrafico = nombreGrafico;
    }

    public String getNombreVariableX() {
        return nombreVariableX;
    }

    public void setNombreVariableX(String nombreVariableX) {
        this.nombreVariableX = nombreVariableX;
    }

    public String getNombreVariableY() {
        return nombreVariableY;
    }

    public void setNombreVariableY(String nombreVariableY) {
        this.nombreVariableY = nombreVariableY;
    }


    public String getValorVariableX() {
        return valorVariableX;
    }

    public void setValorVariableX(String valorVariableX) {
        valorVariableX = valorVariableX;
    }


    public String getValorVariableY() {
        return valorVariableY;
    }

    public void setValorVariableY(String valorVariableY) {
        valorVariableY = valorVariableY;
    }

    public String getCantidadVariables(String s) {
        return cantidadVariables;
    }

    public void setCantidadVariables(String cantidadVariables) {
        this.cantidadVariables = cantidadVariables;
    }

    @Override
    public IGraphPrototype clonar() {
        LineChart lineChart = null;

        try {
            lineChart = (LineChart) clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }

        return lineChart;
    }

    @Override
    public String toString() {
        return "LineChart{" +
                "nombreGrafico='" + nombreGrafico + '\'' +
                ", nombreVariableX='" + nombreVariableX + '\'' +
                ", nombreVariableY='" + nombreVariableY + '\'' +
                ", valorVariableX='" + valorVariableX + '\'' +
                ", valorVariableY='" + valorVariableY + '\'' +
                ", cantidadVariables='" + cantidadVariables + '\'' +
                '}';
    }
}