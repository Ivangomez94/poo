package pracexam;

public class pajaro extends Mascota {

    private boolean comeAlpiste;

    public pajaro(String raza, Persona persona) {
        super(raza);
    }

    public pajaro(String raza, boolean comeAlpiste) {
        super(raza);
        this.comeAlpiste = comeAlpiste;
    }

    public void volar(){

    }

    public boolean getComeAlpiste() {
        return comeAlpiste;
    }

    public void setComeAlpiste(boolean comeAlpiste) {
        this.comeAlpiste = comeAlpiste;
    }
}
