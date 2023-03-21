package Banco;

public class CajaDeAhorro extends Cuenta {

    private double tasaDeInteres;

    public CajaDeAhorro(double saldo, Cliente cliente,double tasaDeInteres) {
        super(saldo, cliente);
        this.tasaDeInteres=tasaDeInteres;
    }
    public void cobrarInteres(double monto){

    }



    public double getTasaDeInteres() {
        return tasaDeInteres;
    }

    public void setTasaDeInteres(double tasaDeInteres) {
        this.tasaDeInteres = tasaDeInteres;
    }
}
