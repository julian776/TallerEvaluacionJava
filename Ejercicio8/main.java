package Ejercicio8;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Ingrese un dia de la semana, sin tildes ni mayusculas: ");
        String day = scan.nextLine();
        switch (day){
            case "lunes":
            case "martes":
            case "miercoles":
            case "jueves":
            case "viernes": {
                System.out.println("-----------------");
                System.out.println("Es un dia laboral");
                break;
            }
            case "sabado":
            case "domingo": {
                System.out.println("--------------------");
                System.out.println("No es un dia laboral");
                break;
            }
        }
    }
}
