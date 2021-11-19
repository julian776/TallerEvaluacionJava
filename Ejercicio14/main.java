package Ejercicio14;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Ingrese el numero de inicio: ");
        int num = scan.nextInt();
        for(int inicio =num; inicio<=1000;inicio+=2){
            System.out.println(inicio);
        }
    }
}
