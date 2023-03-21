package Clase6;

import java.util.Date;


public class Impresora {
    private String modelo;
    private String tipoConexion;
    private Date fechaFabricacion;
    private int hojasDisponible = 0;

    public Impresora (String modelo, String tipoConexion, Date fechaFabricacion){
        this.modelo=modelo;
        this.tipoConexion= tipoConexion;
        this.fechaFabricacion= fechaFabricacion;
    }
private boolean tienePapel(){
        return hojasDisponible>0;
        }


public Impresora (String modelo, String tipoConexion){
        this.modelo = modelo;
        this.tipoConexion= tipoConexion;


}

public void imprimir (String texto){
        if (this.tienePapel()){
            System.out.println(texto);
            this.hojasDisponible -= 1;

        } else {
            System.out.println("Insrte papel");
        }

}
public void ingresarHojas(int cantidadHojas){
        this.hojasDisponible += cantidadHojas;

}

    public String getModelo() {
        return modelo;
    }

    public String getTipoConexion() {
        return tipoConexion;
    }

    public Date getFechaFabricacion() {
        return fechaFabricacion;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setTipoConexion(String tipoConexion) {
        this.tipoConexion = tipoConexion;
    }

    public void setFechaFabricacion(Date fechaFabricacion) {
        this.fechaFabricacion = fechaFabricacion;
    }

    public void setHojasDisponible(int hojasDisponible) {
        this.hojasDisponible = hojasDisponible;
    }
}
