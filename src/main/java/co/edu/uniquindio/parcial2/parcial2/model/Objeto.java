package co.edu.uniquindio.parcial2.parcial2.model;

public class Objeto {
    private String nombreObjeto;
    private String idObjeto;


    public Objeto() {

    }

    public String getNombreObjeto() {
        return nombreObjeto;
    }

    public void setNombreObjeto(String nombreObjeto) {
        this.nombreObjeto = nombreObjeto;
    }

    public String getIdObjeto() {
        return idObjeto;
    }

    public void setIdObjeto(String idObjeto) {
        this.idObjeto = idObjeto;
    }

    @Override
    public String toString() {
        return "Objeto{" +
                "nombreObjeto='" + nombreObjeto + '\'' +
                ", idObjeto='" + idObjeto + '\'' +
                '}';
    }
}
