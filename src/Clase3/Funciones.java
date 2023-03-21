package Clase3;// Se necesita desarrollar un programa que calcule el margen de ganancia entre
       // el valor de compra y la reventa. Se debe mostrar por consola las siguientes líneas:
       // Ingresa el valor de compra
        //-> 1000
        //Ingresa el valor de reventa
        //-> 1500
        //El margen de ganancia es $500
        //El margen de ganancia porcentual es %50

        //Nota: Emplear dos funciones

import javax.swing.text.StringContent;
import java.util.Scanner;

public class Funciones {
    public static void main(String[] args) {
        Scanner valor = new Scanner(System.in);
        valor.nextDouble();

        System.out.println("ingrese valor");
        double valorDeCompra =valor.nextDouble();

        System.out.println("ingrese valor");
        double valorDeReventa =valor.nextDouble();

        System.out.println(valorDeCompra);

    }
}
