package Practica6;

import java.util.Date;

public class main {
    public static void main(String[] args) {

        Perro perroUno = new Perro ("Pepe",new Date(),"caniche",5.50,true,true);
        Perro perroDos = new Perro ("Fa",new Date(),"bull dog",5.45,false,true);



        System.out.println(perroDos.getNombre());
    }

}
