package Banco;

public class Cliente {
    private int numero;
    private String apellido;
    private String nombre;
    private int dni;
    private int cuit;
    private Cuenta cuentasBancarias;

    public Cliente(int numero, String apellido, String nombre, int dni, int cuit) {
        this.numero = numero;
        this.apellido = apellido;
        this.nombre = nombre;
        this.dni = dni;
        this.cuit = cuit;
    }


    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public int getCuit() {
        return cuit;
    }

    public void setCuit(int cuit) {
        this.cuit = cuit;
    }
}
