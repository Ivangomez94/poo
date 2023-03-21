package JuegoNave;

public class Nave<direccion, vida> extends Objeto {
    private double velocidad;
    private int vida;


    public Nave(int posx, int posy, char direccion) {
        super(posx, posy, direccion);
    }

    public void girar (char dirreccion) {

    }
    public void restaVida (int vida){

    }

    public double getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(double velocidad) {
        this.velocidad = velocidad;
    }

    public int getVida() {
        return vida;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }
}
