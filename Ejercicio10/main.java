package Ejercicio10;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Ingrese un texto cualquiera: ");
        String text = scan.nextLine();
        System.out.println(text.replace(" ", ""));
    }
}
