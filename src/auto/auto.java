package auto;

public class auto {
    private String marca;
    private double precioVenta;
    private int velocidad;
    private int velocidadActual;
    static private double valorCompbustible;

    public auto (String marca,double precioVenta,int velocidad,int velocidadActual, double valorCompbustible){

    }
    public void acelerar(){

    }

    public void frenar(){

    }
    public void cambiarValorCombustible(){

    }

    public String getMarca() {
        return marca;
    }

    public double getPrecioVenta() {
        return precioVenta;
    }

    public int getVelocidad() {
        return velocidad;
    }

    public int getVelocidadActual() {
        return velocidadActual;
    }

    public static double getValorCompbustible() {
        return valorCompbustible;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setPrecioVenta(double precioVenta) {
        this.precioVenta = precioVenta;
    }

    public void setVelocidad(int velocidad) {
        this.velocidad = velocidad;
    }

    public void setVelocidadActual(int velocidadActual) {
        this.velocidadActual = velocidadActual;
    }

    public static void setValorCompbustible(double valorCompbustible) {
        auto.valorCompbustible = valorCompbustible;
    }
}
