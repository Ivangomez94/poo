package Practica6;

import java.util.Date;

public class Perro {
    private String nombre;
    private Date ano;
    private String raza;
    private double peso;
    private boolean chip;
    private boolean estadoDeSalud;

    public Perro (String nombre,Date ano, String raza, double peso,boolean chip, boolean estadoDeSalud ){
        this.nombre=nombre;
        this.ano=ano;
        this.raza=raza;
        this.peso= peso;
    }
    public Perro (String nombre,Date ano, String raza){

    }
    public boolean estaEnAdopcion(){
        return peso>5.45 && estadoSalud();

        }
    public boolean chip(){
        if (this.chip){
            System.out.println("No se puede perder");
            return true;

            }else {
            System.out.println("Se puede perder");
            return false;
        }
        }







    public boolean estadoSalud(){
        return this.estadoDeSalud=true;



    }

    public String getNombre() {
        return nombre;
    }

    public Date getAno() {
        return ano;
    }

    public String getRaza() {
        return raza;
    }

    public double getPeso() {
        return peso;
    }

    public boolean isChip() {
        return chip;
    }

    public boolean isEstadoDeSalud() {
        return estadoDeSalud;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setAno(Date ano) {
        this.ano = ano;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public void setChip(boolean chip) {
        this.chip = chip;
    }

    public void setEstadoDeSalud(boolean estadoDeSalud) {
        this.estadoDeSalud = estadoDeSalud;
    }
}
