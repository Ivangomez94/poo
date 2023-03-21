package pracexam;

public class Persona {
    private String nombre;
    private String apellido;
    private String direccion;
    private Mascota mascota;

    public Persona(String nombre, String apellido, String direccion, Mascota mascota) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.direccion = direccion;
        this.mascota = mascota;


    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String verRaza(){
        return mascota.getRaza();
    }

}
