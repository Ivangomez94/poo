package practicaP;

public class Velero extends Embarcacion{

    private int cantidadDeCamarotes;

    public Velero(int cantidadDeCamarotes) {
        this.cantidadDeCamarotes = cantidadDeCamarotes;
    }



    @Override
    public void alquiler() {

    }

    public int getCantidadDeCamarotes() {
        return cantidadDeCamarotes;
    }

    public void setCantidadDeCamarotes(int cantidadDeCamarotes) {
        this.cantidadDeCamarotes = cantidadDeCamarotes;
    }
}





