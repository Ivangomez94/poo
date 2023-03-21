package Clase3;

import java.util.Scanner;

//Definir dos números enteros. Asignarles un valor a cada uno. Comprobar si un número es
        //divisible por el segundo e indicar mediante un mensaje el resultado obtenido.
public class practica {
    public static void main(String[] args) {
        int valor1= 5;
        int valor2=8;

        if ((valor1 % valor2)==0){
            System.out.println("El numero"+""+ valor1 +""+""+"es divisible en");
        } else {
            System.out.println("El numero"+valor1+"no es divisible en");
        }

    }




}


