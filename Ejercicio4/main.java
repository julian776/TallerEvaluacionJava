package Ejercicio4;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Ingrese el precio del articulo: ");
        double price = Double.parseDouble(scan.nextLine());

        price = price+(price*0.21);
        System.out.println("El precio con IVA es "+price);
    }
}
