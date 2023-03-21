package Banco;

public class CuentaCorriente extends Cuenta {

    private double montoAutorizadoDescubierto;

    public CuentaCorriente(double saldo, Cliente cliente,double montoAutorizadoDescubierto) {
        super(saldo, cliente);
        this.montoAutorizadoDescubierto=montoAutorizadoDescubierto;
    }


}
