package Ejercicio9;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Ingrese un texto cualquiera: ");
        String text = scan.nextLine();
        String remplazar = "La sonrisa sera la mejor arma contra la tristeza";

        System.out.println(remplazar.replace("a", "e")+" "+text);
    }
}
