package Ejercicio3;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Ingrese el radio: ");
        double radius = Double.parseDouble(scan.nextLine());

        System.out.println("El area del circulo es: "+(Math.PI*Math.pow(radius, 2)));
    }
}
