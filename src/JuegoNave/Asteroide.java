package JuegoNave;

public class Asteroide extends Objeto {
    private int lesion;


    public Asteroide(int posx, int posy, char direccion) {
        super(posx, posy, direccion);
    }

    public int getLesion() {
        return lesion;
    }

    public void setLesion(int lesion) {
        this.lesion = lesion;
    }
}
