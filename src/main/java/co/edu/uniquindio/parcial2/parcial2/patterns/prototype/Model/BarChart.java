package co.edu.uniquindio.parcial2.parcial2.patterns.prototype.Model;

import co.edu.uniquindio.parcial2.parcial2.patterns.prototype.Services.IGraphPrototype;

public class BarChart implements IGraphPrototype {
    private String nombreGrafico;
    private String nombreVariableX;
    private String nombreVariableY;
    private String valorVariableX;
    private String valorVariableY;

    public BarChart(){
        this.nombreGrafico = nombreGrafico;
        this.nombreVariableX = nombreVariableX;
        this.nombreVariableY = nombreVariableY;
        this.valorVariableX = valorVariableX;
        this.valorVariableY = valorVariableY;
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

    @Override
    public IGraphPrototype clonar() {
        BarChart barChart = null;

        try {
            barChart = (BarChart) clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }

        return barChart;
    }

    @Override
    public String toString() {
        return "BarChart{" +
                "nombreGrafico='" + nombreGrafico + '\'' +
                ", nombreVariableX='" + nombreVariableX + '\'' +
                ", nombreVariableY='" + nombreVariableY + '\'' +
                ", valorVariableX='" + valorVariableX + '\'' +
                ", valorVariableY='" + valorVariableY + '\'' +
                '}';
    }
}