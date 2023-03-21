package Banco;

public abstract class Cuenta {
    private double saldo;
    private Cliente cliente;

    public Cuenta(double saldo, Cliente cliente) {
        this.saldo = saldo;
        this.cliente = cliente;
    }

    public void depositarDinero() {

    }

    public void extraerDinero() {

    }

    public void verSaldo() {

    }


    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public Cliente getCliente() {
        return cliente;
    }


}
