package Clase3;

import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {
        Scanner scanner;
        scanner=new Scanner(System.in);

        int num1;
        int num2;
        System.out.println("Ingrese primer valor");
        num1=scanner.nextInt();
        System.out.println("Ingrese segundo valor");
        num2=scanner.nextInt();

        System.out.println(num1+num2);

    }

}
