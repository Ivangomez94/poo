package practicaP;

import java.time.LocalDate;

public class Yate extends Embarcacion implements Comparable<Yate> {

    private int cantidadDeMastiles;

    public Yate(int cantidadDeMastiles) {
        this.cantidadDeMastiles = cantidadDeMastiles;
    }


    @Override
    public void alquiler() {
        double alquilerDeYate = 0;
        if (this.getAnioDeFabricacion() > 2020) {
            alquilerDeYate = this.getPrecioBase() * this.getValorAdicional();
        } else {
            alquilerDeYate = this.getPrecioBase();
        }
    }

    @Override
    public int compareTo(Yate yate) {
        if (this.cantidadDeMastiles > yate.getCantidadDeMastiles()) {
            return 1;
        } else if (this.cantidadDeMastiles < yate.getCantidadDeMastiles()) {
            return -1;
        }

        return 0;
    }


    public int getCantidadDeMastiles() {
        return cantidadDeMastiles;
    }

    public void setCantidadDeMastiles(int cantidadDeMastiles) {
        this.cantidadDeMastiles = cantidadDeMastiles;
    }


}





