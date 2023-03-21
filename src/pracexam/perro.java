package pracexam;

public class perro extends Mascota {
    private boolean vacunado;

    public perro(String raza, Persona persona, boolean vacunado) {
        super(raza);
        this.vacunado = vacunado;
    }

    public perro(String raza, Persona persona) {
        super(raza);

    }

    public void ladrar(){

    }

    public boolean getVacunado() {
        return vacunado;
    }

    public void setVacunado(boolean vacunado) {
        this.vacunado = vacunado;
    }
}
