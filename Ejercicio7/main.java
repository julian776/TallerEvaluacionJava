package Ejercicio7;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        float num;
        do{
            System.out.print("Ingrese un numero mayor o igual a cero: ");
            num = scan.nextFloat();
        }while(num<0);
        System.out.println("El numero ingresado es: "+num);
    }
}
