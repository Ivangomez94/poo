package pracexam;

public class gato extends Mascota {

    private boolean vacunado;

    public gato(String raza,boolean vacunado) {
        super(raza);
        this.vacunado = vacunado;
    }

    public gato(String raza, Persona persona) {
        super(raza);


    }
    private void mauyar(){

    }

    public boolean getVacunado() {
        return vacunado;
    }

    public void setVacunado(boolean vacunado) {
        this.vacunado = vacunado;
    }
}
