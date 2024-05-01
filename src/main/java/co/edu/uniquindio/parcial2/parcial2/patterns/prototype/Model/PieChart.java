package co.edu.uniquindio.parcial2.parcial2.patterns.prototype.Model;

import co.edu.uniquindio.parcial2.parcial2.patterns.prototype.Services.IGraphPrototype;

public class PieChart implements IGraphPrototype {
    private String nombreGrafico;
    private String nombreVariableX;
    private String nombreVariableY;
    private String porcentajeVariableX;
    private String porcentajeVariableY;

    public PieChart() {
        this.nombreGrafico = nombreGrafico;
        this.nombreVariableX = nombreVariableX;
        this.nombreVariableY = nombreVariableY;
        this.porcentajeVariableX = porcentajeVariableX;
        this.porcentajeVariableY = porcentajeVariableY;
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

    public String getPorcentajeVariableX() {
        return porcentajeVariableX;
    }

    public void setPorcentajeVariableX(String porcentajeVariableX) {
        this.porcentajeVariableX = porcentajeVariableX;
    }

    public String getPorcentajeVariableY() {
        return porcentajeVariableY;
    }

    public void setPorcentajeVariableY(String porcentajeVariableY) {
        this.porcentajeVariableY = porcentajeVariableY;
    }

    @Override
    public IGraphPrototype clonar() {
        PieChart pieChart = null;

        try {
            pieChart = (PieChart) clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }

        return pieChart;
    }

    @Override
    public String toString() {
        return "PieChart{" +
                "nombreGrafico='" + nombreGrafico + '\'' +
                ", nombreVariableX='" + nombreVariableX + '\'' +
                ", nombreVariableY='" + nombreVariableY + '\'' +
                ", porcentajeVariableX='" + porcentajeVariableX + '\'' +
                ", porcentajeVariableY='" + porcentajeVariableY + '\'' +
                '}';
    }
}