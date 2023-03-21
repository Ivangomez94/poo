package Clase6;

import org.w3c.dom.ls.LSOutput;

import java.util.Date;

public class Main {
    public static void main(String[] args) {


Impresora ImpresoraUno = new Impresora("Hp","Inalambrica",new Date());
Impresora ImpresoraDos = new Impresora("Samung","inalambrica",new Date());

        System.out.println(ImpresoraUno.getFechaFabricacion());
ImpresoraUno.ingresarHojas(5);
ImpresoraUno.imprimir("Hola Mundo");
    }
}


